package com.dengmin.demi.designPatterns;

/*
 * 开闭原则
 * */
public class OcpImprove {
    public static void main(String[] args) {
        GraphEditorPro graphEditorPro = new GraphEditorPro();
        graphEditorPro.drawShapePro(new CirclePro());
        graphEditorPro.drawShapePro(new RectanglePro());
        graphEditorPro.drawShapePro(new OtherGraph());
    }
}

// 创建一个用于绘图的类
class GraphEditorPro {
    public GraphEditorPro() {
    }

    public void drawShapePro(ShapePro s) {
        s.draw();
    }
}

// 创建抽象类实现基础的抽象方法
abstract class ShapePro {
    // 创建一个抽象方法draw
    public abstract void draw();

}

class RectanglePro extends ShapePro {

    public RectanglePro() {
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class CirclePro extends ShapePro {

    public CirclePro() {
    }

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

// 新增图形类，就会很方便
class OtherGraph extends ShapePro {
    @Override
    public void draw() {
        System.out.println("实现其他图形");
    }
}