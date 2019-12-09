package Neuedu_20191205_链表;

public class LinkList {

    // 头结点
    private Link header;

    // 尾结点
    private Link tail;

    // 节点的位置
    private int size = 0;

    /**
     * 创建一个新的空链表
     */
    public LinkList() {
        header = null;
        tail = null;
    }

    /**
     * 判断链表是否为空
     * @return  true:空  false:不为空
     */
    public boolean isNull(){
        return size == 0;
    }

    /**
     * 获取链表长度
     */
    public int displayAllLink(){

        return size;
    }

}
