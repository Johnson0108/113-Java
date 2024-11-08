import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        //預設commissionRate = 0.01
        this.id = id;
        this.name = name;
        this.commissionRate = 0.01;  // 默认佣金比例为0.01
        this.grossSales = 0;  // 初始化总销售额为0
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;  // 使用set方法保证佣金比例合法
        this.grossSales = 0;  // 初始化总销售额为0
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setCommissionRate(double commissionRate) {
        //檢查獎金比例必須為0~1!
        if (commissionRate >= 0 && commissionRate <= 1) {  // 佣金比例必须在0和1之间
            this.commissionRate = commissionRate;
        } else {
            System.out.println("獎金比例必须在0到1之间！");
        }
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        // 如果订单数组已满，扩展数组容量
        if (orderCount == orderArray.length) {
            orderArray = Arrays.copyOf(orderArray, orderArray.length * 2);  // 数组长度扩展为原来的两倍
        }
        // 创建新的订单对象并添加到订单数组中
        Order newOrder = new Order(itemName, itemPrice, amount);
        orderArray[orderCount] = newOrder;
        orderCount++;  // 订单数量加1
    }

    public double getGrossSales() {
        double totalSales = 0;
        for (int i = 0; i < orderCount; i++) {
            totalSales += orderArray[i].totalSale();  // 累加每个订单的总金额
        }
        this.grossSales = totalSales;
        return totalSales;  // 返回总销售额
    }

    
    public String getOrders() {

        StringBuilder orderDetails = new StringBuilder();  // 使用StringBuilder更高效地拼接字符串
        // 拼接每个订单的字符串
        for (int i = 0; i < orderCount; i++) {
            orderDetails.append(orderArray[i].toString());
        }
        return orderDetails.toString();  // 返回所有订单的详细信息

    }
    
    public double salary() {
        return getGrossSales() * this.commissionRate;  // 总销售额 * 佣金比例
        //利用getGrossSales()計算薪資
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
