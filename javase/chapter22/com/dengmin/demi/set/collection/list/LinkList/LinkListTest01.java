package com.dengmin.demi.set.collection.list.LinkList;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 单链表的实现
 * 单链表各个元素有两个属性：储存的数据和下一个节点的内存地址。
 * 优点：随机增删元素效率较高，因为不需要遍历整个列表，就不会涉及到大量的元素位移。
 * 缺点：查询元素的效率较低，因为每一次查找元素都需要从头节点开始遍历，直到找到为止。
 */
public class LinkListTest01 {
    LinkNode header;
    // 统计链表的长度
    int size = 0;
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        return "LinkListTest01{" +
                "header=" + header.element +
                '}';
    }

    public static void main(String[] args) {
        LinkListTest01 link = new LinkListTest01();
        link.addElement(1);
        link.addElement(2);
        link.addElement("hello");
        System.out.println();
        // 直接应用JDK自带的LinkedList来实现
        // JDK1.5之后有了泛型：使用方式如下：
        LinkedList<String> list = new LinkedList<>();
        list.add("1243");
        // 语法错误，泛型规定了只能增加String类型的元素。
        // list.add(1234);
        list.add("asdf");
        list.remove("12");
        Iterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }



    // 查找元素
    // 删除元素
//    public void deleteElement(Object obj) throws DeleteElementException {
//        // 如果节点已经是末尾节点，即是一个空链表，返回删除失败，可以用异常的方式处理
//        if(null == obj) {
//            throw new DeleteElementException("是一个空链表，删除失败！");
//        }else if(null == node.element){
//
//            // 说明链表中有元素。
//            // 假如
//            LinkNode tempNode = new LinkNode();
//            tempNode.next = node.next;
//
//        }
//    }
    // 增加元素
    public void addElement(Object data) {
        // 假如没有头节点，就需要创建一个头节点对象
        if(null == header) {
            header = new LinkNode(data, null);
        }else {
            // 如果有头结点，
            // 那么需要找到当前列表的末尾节点，让当前末尾节点的next是新节点。
            LinkNode currentLastNode = findLastNode(header);
            currentLastNode.next = new LinkNode(data, null);
        }
        size ++;
    }
    // 找当前链表的末尾节点的方法
    private LinkNode findLastNode(LinkNode node) {
        if(null == node.next) {
            return node;
        }
        // 递归方式 找末尾节点
        return findLastNode(node.next);
    }
}
