package src.com.dengmin.demi.Homework.武器数组;

public class Army {
    Weapon[] weapons;
    public Army(int n) {
        weapons = new Weapon[n];
    }
    // 添加武器到武器库中
    /**
     *
     * @param weapon 添加武器
     */
    public void addWeapon(Weapon weapon) throws AddWeaponException{
        for (int i = 0; i < weapons.length; i++) {
            // 如果武器库中的元素没有武器，才可以添加
            if(null == weapons[i]) {
                weapons[i] = weapon;
                // 需要重写toString()方法

                System.out.println(weapon.getName() + "添加成功！");
                return;
            }
        }
        throw new AddWeaponException("武器库已满！");
    }
    // 所有可攻击的武器攻击
    public void attackAll() {
        for (int i = 0; i < weapons.length; i++) {
            if(weapons[i] instanceof Attackable) {
                /*
                * 类在向下转型（强制转换）过程中，如果是类转换成接口类型，那么类和接口之间不需要存在继承关系，也可以进行转换，java语法允许。
                * */
                Attackable attackable = (Attackable)weapons[i];
                attackable.attack();
            }
        }
    }
    // 所有可移动的武器移动
    public void moveAll() {
        for (int i = 0; i < weapons.length; i++) {
            if(weapons[i] instanceof Moveable) {
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }
}
