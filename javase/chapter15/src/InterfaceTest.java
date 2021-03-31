package src;

public class InterfaceTest {
    public static void main(String[] args) {
        // 实例化对象
        Math m = new MyMath();  // 向上转型，自动转换
        double x = m.add(1, 2);
        double y = m.subtraction(1, 2);
        System.out.println(x);
        System.out.println(y);
    }
}

interface Math {
    // 接口里面创建的变量都是自带public static final，可以省略，即都是常量，故变量的名字都要大写。
    // 最好一开始就手动赋值，当然也可以在构造方法中赋值，但只能赋值一次。
    double PI = 3.115926;

    // 接口中创建的方法都是抽象方法，自带public abstract，可以省略。抽象方法没有方法体。
    double add(int a, int b);

    double subtraction(int a, int b);
}

// 类可以类似继承接口中的属性和方法，称为“实现implements”
class MyMath implements Math {
    // 由于实现过来的抽象方法没有方法体，所以需要重写方法
    @Override
    public double add(int a, int b) {
        return a + b;
    }

    @Override
    public double subtraction(int a, int b) {
        return a - b;
    }
}