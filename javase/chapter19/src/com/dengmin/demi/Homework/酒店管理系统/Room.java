package src.com.dengmin.demi.Homework.酒店管理系统;

import java.util.Objects;

public class Room extends Object{
    // 房间编号
    private int no;
    // 房间类型：标准间、大床房、尊享套房
    private String type;
    // 房间状态：已入住false、未入住True
    private boolean status;

    public Room() {
        status = false;
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    // 重写toString()方法
    @Override
    public String toString() {
        return "Room{" +
                "房间编号：" + no +
                "，房间类型：'" + type + '\'' +
                "，房间状态：" + (status ? "空闲" : "占用") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Room)) return false;
        Room room = (Room) o;
        return no == room.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, type, status);
    }

//    // 临时测试程序
//    public static void main(String[] args) {
//        Room room = new Room(102, "标准间", true);
//        System.out.println(room.toString());
//        Room room1 = new Room(102, "标准间", true);
//        System.out.println(room.equals(room1));
//    }
}
