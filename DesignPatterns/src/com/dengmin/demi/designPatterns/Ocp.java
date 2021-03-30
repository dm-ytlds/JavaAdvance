package com.dengmin.demi.designPatterns;

public class Ocp {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        graphEditor.drawShape(circle);
    }
}

// 创建一个用于绘图的类
class GraphEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    private void drawCircle(Shape c) {
        System.out.println("圆形");
    }

    private void drawRectangle(Shape r) {
        System.out.println("矩形");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}