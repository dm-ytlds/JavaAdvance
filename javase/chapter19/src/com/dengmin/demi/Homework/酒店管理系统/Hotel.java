package src.com.dengmin.demi.Homework.酒店管理系统;

public class Hotel<print> {
    private Room[][] rooms;
    public Hotel() {
        // 造出酒店楼层和每层楼的房间数。三层楼，每层楼十个房间。
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(i == 0) {
                    // 一层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                }else if(i == 1) {
                    // 二层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", true);
                }else if(i == 2) {
                    // 三层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "VIP房", true);
                }
            }

        }
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    // 订房
    public void order(int roomNo) {
        // 订房最主要的：将status状态做修改
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(false);
        System.out.println("房间"+ roomNo +"已被订房。");
    }
    // 退房。退哪间房？退房过后房间的状态？
    public void exit(int roomNo) {
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(true);
        System.out.println("房间"+ roomNo +"已退房。");
    }
    // 打印房间状态
    public void print() {
        // 打印所有房间的状态，就是遍历二位数组
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.println(room);
            }
            // 换行
            System.out.println();
        }
    }
}
