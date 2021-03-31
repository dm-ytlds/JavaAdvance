package src.接口在开发中的作用;

public class Order {
    public static void main(String[] args) {
        // 创建厨师对象
        FoodMenu cc = new ChineseCooker();
        FoodMenu ac = new AmericanCooker();
        // 创建顾客对象
        Customer c = new Customer(ac);
        // 顾客点菜
        c.order();
    }
}
