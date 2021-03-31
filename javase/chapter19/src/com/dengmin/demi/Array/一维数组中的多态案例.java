package com.dengmin.demi.Array;

public class 一维数组中的多态案例 {
    public static void main(String[] args) {

        // 创建一个一维数组对象
        Animal[] animals = {new Cat(), new Bird()};
        for (int i = 0; i < animals.length; i++) {
            // 多态的应用：不确定数组中的对象是Cat还是Bird，所以不能直接赋值给其中一种Animal，需要向下转型
            if(animals[i] instanceof Cat) {
                Cat c = (Cat)animals[i];
                c.move();
                c.catchMouse();
            }else if(animals[i] instanceof Bird) {
                Bird b = (Bird)animals[i];
                b.move();
                b.fly();
            }
        }

    }
}

// 可以移动的接口。
interface Move {
    void move();
}

class Animal implements Move{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("动物在移动...");
    }
}
// 可以飞行的接口。接口是完全抽象的类，所以其中的方法和属性都是抽象的。可以省略abstract
interface Flyable {
    void fly();
}

// 鸟类动物
class Bird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("鸟儿会飞翔！！！");
    }
    @Override
    public void move() {
        System.out.println("鸟儿在移动...");
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在走猫步...");
    }
    public void catchMouse() {
        System.out.println("猫会抓老鼠");
    }
}
