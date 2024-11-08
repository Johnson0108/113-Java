import java.util.Scanner;

public class SalesDepartment {
    public  static void main(String args[]) {
        SalesPerson[] salesTeam = new SalesPerson[3];
        SalesPerson sales1 = new SalesPerson("SE111", "林俊傑");
        SalesPerson sales2 = new SalesPerson("SE222", "張佳豪");
        SalesPerson sales3 = new SalesPerson("SE333", "劉威廷");
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
                    // 选择1：设置销售金额
                    case 1:
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("请输入销售金额：");
                            double salesAmount = input.nextDouble();
                            targetSales.setGrossSales(salesAmount);  // 调用 setGrossSales 设置销售金额
                        }
                        break;

                    // 选择2：设置奖金比例
                    case 2:
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("请输入奖金比例（0~1）：");
                            double commissionRate = input.nextDouble();

                            // 检查奖金比例是否在0~1之间
                            if (commissionRate < 0 || commissionRate > 1) {
                                System.out.println("奖金比例必须在 0~1 之间！");
                            } else {
                                targetSales.setCommissionRate(commissionRate);  // 调用 setCommissionRate 设置奖金比例
                            }
                        }
                        break;

                    // 选择3：薪资查询
                    case 3:
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.println(targetSales);  // 输出该销售员的详细信息
                        }
                        break;

                    // 处理非法输入
                    default:
                        throw new IllegalArgumentException("无效的选项");
                }
            }
            catch (IllegalArgumentException ex) {
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

        //?????????????????????????????
        //從salesTeam陣列中，搜尋與輸入salesID
        //相同的sales物件，並回傳該物件
        //?????????????????????????????
        // 遍历销售团队，查找对应编号的销售员
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
        System.out.print("1.設定銷售金額\n2.設定獎金比例\n3.薪資查詢\n請輸入： ");
    }
}
