package src.com.dengmin.demi.number;

import java.math.BigDecimal;

/*
 * BigDecimal，属于大数据，精度极高，不属于基本数据类型，属于引用数据类型（引用对象），专用于财务软件中。
 * */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(1);
        BigDecimal bd2 = new BigDecimal(2);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);
    }
}
