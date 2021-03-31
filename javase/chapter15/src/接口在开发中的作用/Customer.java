package src.接口在开发中的作用;

public class Customer {
    // 实例化对象 菜单 ，将其变成顾客的实例变量。面向抽象编程，面向接口编程，降低耦合度，增强扩展性。
    // 养成封装的好习惯private
    private FoodMenu foodMenu;

    public Customer() {

    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    // 实例化顾客点菜的方法
    public void order() {
        // foodMenu是本类中的私有属性，故可以直接调用
        // 也可以用this.的方式调用，结果一样
        FoodMenu fm = this.foodMenu;
        fm.西红柿炒鸡蛋();
        foodMenu.宫保鸡丁();
        foodMenu.西红柿炒鸡蛋();
    }
//    public static void main(String[] args) {
//        FoodMenu food = new ChineseCooker();
//        Customer cs = new Customer(food);
//        cs.getFoodMenu().宫保鸡丁();
//    }
}
