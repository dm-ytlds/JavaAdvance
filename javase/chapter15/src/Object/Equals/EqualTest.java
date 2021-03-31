package Object.Equals;

import java.util.Objects;

public class EqualTest {

    public static void main(String[] args) {
        MyTime m1 = new MyTime(2021, 03, 25);
        MyTime m2 = new MyTime(2021, 03, 26);
        System.out.println(m1.equals(m2));
        System.out.println(m1.toString());
    }
}
class MyTime {
    private int year;
    private int month;
    private int day;
    public MyTime() {

    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // obj对象是一个空引用，obj不是MyTime类型
        if(obj == null || !(obj instanceof MyTime)) {
            return false;
        }
        // obj调用的本身
        if(this == obj) {
            return true;
        }
        // 向下转型，引用MyTime的私有变量
        MyTime mt = (MyTime)obj;
        int newYear = mt.getYear();
        int newMonth = mt.getMonth();
        int newDay = mt.getDay();
        // if(this.year == year && this.month == month && this.day == day) {
        //     return true;
        // }
        return this.year == newYear && this.month == newMonth && this.day == newDay;

    }
}