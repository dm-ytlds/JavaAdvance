package src.com.dengmin.demi.Homework.武器数组;

public class Test {
    public static void main(String[] args) {
        // 创建一个Army对象，并给其中的构造方法赋值（即确定武器库数组的大小）
        Army army = new Army(2);
        // 创建武器对象，并给武器命名，方便addWeapon()方法的调用
        Weapon weapon1 = new Airplane();
        weapon1.setName("飞机");
        Weapon weapon2 = new Tank();
        weapon2.setName("坦克");
//        Weapon weapon3 = new Airplane();
        // 添加武器，并异常处理
        try {
//            army.addWeapon(new Airplane());
//            army.addWeapon(new Tank());
//            army.addWeapon(new Airplane());
            army.addWeapon(weapon1);
            army.addWeapon(weapon2);
            army.addWeapon(weapon2);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }
        // 调用武器功能
        army.attackAll();
        army.moveAll();
    }
}
