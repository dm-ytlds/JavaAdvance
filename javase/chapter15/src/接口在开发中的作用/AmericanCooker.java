package src.接口在开发中的作用;

public class AmericanCooker implements FoodMenu {
    @Override
    public void 鱼香茄子() {
        System.out.println("鱼香茄子到了, Have a good time!");
    }

    @Override
    public void 西红柿炒鸡蛋() {
        System.out.println("西红柿炒鸡蛋到了, Have a good time!");
    }

    @Override
    public void 宫保鸡丁() {
        System.out.println("宫保鸡丁到了, Have a good time!");
    }
}
