public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        //需修改
        this.id = id;               // 设置编号
        this.name = name;           // 设置姓名
        this.grossSales = 0;        // 默认销售额为 0
        this.commissionRate = 0.0;  // 默认佣金比例为 0
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
            return this.grossSales * this.commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.1f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
