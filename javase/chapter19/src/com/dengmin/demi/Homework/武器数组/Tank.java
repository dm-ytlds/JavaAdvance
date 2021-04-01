package src.com.dengmin.demi.Homework.武器数组;

/**
 * 坦克，是一种武器，可移动，可攻击
 */
public class Tank extends Weapon implements Moveable, Attackable{
    @Override
    public void attack() {
        System.out.println("坦克移动");
    }

    @Override
    public void move() {
        System.out.println("坦克射击");
    }
}
