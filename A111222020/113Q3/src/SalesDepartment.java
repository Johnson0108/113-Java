import java.util.Scanner;

public class SalesDepartment {
    public  static void main(String args[]) {
        SalesPerson[] salesTeam = new SalesPerson[3];
        SalesPerson sales1 = new SalesPerson("SE111", "周柏睿");
        SalesPerson sales2 = new SalesPerson("SE222", "黃敬宇");
        SalesPerson sales3 = new SalesPerson("SE333", "吳嘉文");
        salesTeam[0] = sales1;
        salesTeam[1] = sales2;
        salesTeam[2] = sales3;
        operation(salesTeam);
    }

    public static void operation(SalesPerson[] salesTeam) {
        SalesPerson targetSales;
        Scanner input = new Scanner(System.in);
        menu();

        while (input.hasNext()) {
            int choice = input.nextInt();
            try {
                switch (choice) {
                    case 1: // 设置奖金比例
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("请输入奖金比例（0~1之间）：");
                            double commissionRate = input.nextDouble();
                            targetSales.setCommissionRate(commissionRate);  // 设置奖金比例
                            System.out.println("奖金比例已设置为：" + commissionRate);
                        }
                        break;

                    case 2: // 新增订单
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("请输入产品名称：");
                            String itemName = input.next();
                            System.out.print("请输入单价：");
                            double itemPrice = input.nextDouble();
                            System.out.print("请输入购买数量：");
                            int amount = input.nextInt();

                            // 通过SalesPerson的setOrderArray方法新增订单
                            targetSales.setOrderArray(itemName, itemPrice, amount);  // 新增订单到订单数组

                            System.out.println("订单添加成功！");
                        }
                        break;

                    case 3: // 薪资查询
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.println("薪资: " + targetSales.salary());  // 输出薪资
                        }
                        break;

                    case 4: // 订单查询
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.println("所有订单：");
                            String orders = targetSales.getOrders();  // 获取所有订单的详细信息
                            System.out.println(orders);  // 输出所有订单
                        }
                        break;

                    default:
                        throw new IllegalArgumentException("无效的选项");
                }
            }
            catch (IllegalArgumentException ex) {
                System.out.print(ex.getMessage());
                menu();
                continue;
            }
            menu();
        }
        for (SalesPerson s : salesTeam)
            System.out.print(s.toString());
    }

    public static SalesPerson selectedSales(SalesPerson[] salesTeam) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入編號： ");
        String salesID = input.next();

        //從salesTeam陣列中，搜尋與輸入salesID
        //相同的sales物件，並回傳該物件
        for (SalesPerson sales : salesTeam) {
            if (sales.getId().equals(salesID)) {
                return sales;  // 返回找到的销售员
            }
        }


        System.out.println("編號輸入錯誤");
        return null;
    }

    public static void menu() {
        System.out.println("\n\nROC股份有限公司：");
        System.out.print("1.設定獎金比例\n2.新增訂單\n3.薪資查詢\n4.訂單查詢\n請輸入： ");
    }
}
