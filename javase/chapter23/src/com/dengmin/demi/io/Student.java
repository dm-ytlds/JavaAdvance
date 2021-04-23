package com.dengmin.demi.io;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String no;
    private transient String name;    // 加上transient关键字，该属性将不参加序列化过程。

    // 手动规定序列化版本号，如果不写，会自动生成，但不建议自动生成。
    public static final long serialVersionUID = 1L;
    public Student() {
    }

    public Student(String no) {
        this.no = no;
    }

    public Student(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(no, student.no) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
