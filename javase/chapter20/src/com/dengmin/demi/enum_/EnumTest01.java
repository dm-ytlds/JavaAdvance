package src.com.dengmin.demi.enum_;

// 枚举
/*
    枚举编译之后也是生成.class文件；
	枚举也是一种引用数据类型；
	枚举中的每一个值可以看做是常量。
 */
enum Result {
    SUCCESS, FAIL;
}

/*
枚举
 */
public class EnumTest01 {
    public static void main(String[] args) {
        Result r = divide(10, 0);
        System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");
    }

    /**
     * @param a 被除数
     * @param b 除数
     * @return 返回Result.SUCCESS表示计算成功，返回Result.FAIL表示计算失败。
     */
    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }

    }
}