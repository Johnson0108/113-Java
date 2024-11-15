public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        this(id, name, 0, 0.01);
        //呼叫下一個的建構子
    }

    public SalesPerson(String id, String name, double grossSales, double commissionRate) {

        // grossSales & commissionRate的設定須呼叫set方法
        this.id = id;
        this.name = name;
        setGrossSales(grossSales);  // 使用set方法设置grossSales
        setCommissionRate(commissionRate);  // 使用set方法设置commissionRate

    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setGrossSales(double grossSales) {
        //檢查銷售金額必須為正值!
        if (grossSales >= 0) {  // 销售额必须为正值
            this.grossSales = grossSales;
        } else {
            System.out.println("销售额必须为正值！");
        }
    }

    public void setCommissionRate(double commissionRate) {
        //檢查獎金比例必須為0~1!
        if (commissionRate >= 0 && commissionRate <= 1) {  // 佣金比例必须在0和1之间
            this.commissionRate = commissionRate;
        } else {
            System.out.println("獎金比例必须在0到1之间！");
        }
    }

    public double salary() {
        return grossSales * commissionRate;  // 薪资 = 销售额 * 佣金比例
        //薪資為銷售額乘上分紅比
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}