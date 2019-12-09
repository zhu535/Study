package Neuedu_20191205_链表;

/**
 * 节点类
 */
public class Link {

    //存放数据
    public int data;

    //存放下一个节点
    public Link next;

    public Link(int data) {
        this.data = data;
    }

    public Link(int data, Link next) {
        this.data = data;
        this.next = next;
    }

    public Link() {
    }

    public void display(){
        System.out.println(data + "");
    }
}
