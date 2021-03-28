package 接口在开发中的作用;

public class ChineseCooker implements FoodMenu {
    @Override
    public void 宫保鸡丁() {
        System.out.println("宫保鸡丁来了，您吃好！");
    }

    @Override
    public void 西红柿炒鸡蛋() {
        System.out.println("西红柿炒鸡蛋来了，您吃好！");
    }

    @Override
    public void 鱼香茄子() {
        System.out.println("鱼香茄子来了，您吃好！");
    }
}
