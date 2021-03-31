package src.com.dengmin.demi.Homework.酒店管理系统;

import java.util.Scanner;

/*
* 模拟一个酒店管理系统。模拟订房、退房、打印所有房间状态等功能。
* 1.该系统的用户是：酒店前台；
* 2.酒店使用一个二位数组来模拟；
* 3.酒店中的每一个房间应该是一个Java对象；
* 4.每一个房间应该有：房间编号、房间类型俩属性，以及房间是否空闲。
* 5.系统应该对外提供的功能：
*   （1）可以预订房间：用户输入房间编号，订房；
*   （2）可以退房：用户输入房间编号，退房；
*   （3）可以查看所有房间的状态；
* */
public class TestCode {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("Welcome to my Hotel!");
        System.out.println("请查看您可以选择的功能列表：[1] 查看房间列表。[2] 订房。[3] 退房。[0] 退出系统。");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入您要选择的功能编号：");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    // 查看列表
                    hotel.print();
                    break;
                case 2:
                    // 订房
                    System.out.print("请输入您想要预定的房间编号：");
                    int roomNum = sc.nextInt();
                    hotel.order(roomNum);
                    break;
                case 3:
                    // 退房
                    System.out.print("请输入您要退订的房间编号：");
                    int roomNo = sc.nextInt();
                    hotel.exit(roomNo);
                    break;
                case 0:
                    // 退系统
                    System.out.println("谢谢惠顾，欢迎下次光临！！！");
                    return;
                default:
                    System.out.println("您的建议将是我们宝贵的财富！功能待完善，请重新输入。");
            }
        }
    }
}
