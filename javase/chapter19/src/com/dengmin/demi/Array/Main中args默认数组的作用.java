package src.com.dengmin.demi.Array;
// 注意：在Run-->Edit Configurations-->Program Arguments可以设置软件参数，以空格隔开。
// 模拟一个系统，假设需要使用，必须提供用户名和密码。
public class Main中args默认数组的作用 {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("请提供用户名和密码。例如：zhangsan, 123");
            return;
        }
        // if(args[0].equals("Demi") && args[1].equals("1016")) {} ,这样写容易出现空指针异常。换个顺序就可以避免
        if("Demi".equals(args[0]) && "1016".equals(args[1])) {
            System.out.println(args[0] + ", Welcome to use it !!!");
        }else {

            System.out.println("用户名" + args[0] + "或密码" + args[1] + "错误，请重新输入！");
            return;
        }
        int[] a = {1, 2};
        System.out.println(a[1]);
    }
}
