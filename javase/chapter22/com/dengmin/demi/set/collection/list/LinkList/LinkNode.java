package com.dengmin.demi.set.collection.list.LinkList;

public class LinkNode {
    // 元素储存的数据
    Object element;

    @Override
    public String toString() {
        return "LinkNode{" +
                "element=" + element +
                '}';
    }

    // 下一个元素的内存地址
    LinkNode next;
    public LinkNode(){

    }
    public LinkNode(Object element) {
        this.element = element;
    }

    public LinkNode(Object element, LinkNode next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}
