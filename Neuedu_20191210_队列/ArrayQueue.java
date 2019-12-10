package Neuedu_20191210_队列;

import java.util.Arrays;

public class ArrayQueue {

    // 使用数组实现的顺序队列
    private String[] items;

    // 数组大小
    private int n = 0;

    // head表示队头下标
    private int head = 0;

    // tail表示队尾下标
    private int tail = 0;

    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    /**
     * 入队操作
     * @param item 数组实现的队列
     * @return true:入队成功 false:入队失败
     * 缺点：tail指针会持续往后移动，当tail移动到最右边，即使数组还有空闲空间，也无法向队列里面添加数据

        public boolean enqueue(String item){
            if(tail == n)return false;
            items[tail] = item;
            ++tail;
            return true;
        }

     */

    public boolean enqueue(String item){
        if(tail == n){
            // 如果满足tail == n && head == 0,表示队列已满。若满足tail == n 但head != 0 表示队列未满，需要进行数据搬移操作
            if(head == 0)return false;
            // 接下来进行数据搬移操作
            for(int i = head; i<tail; i++){
                items[i-head] = items[i];
            }
            // 搬移操作后对头尾指针进行充值
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    /**
     * 出队操作
     * @return  出队的元素
     */
    public String dequeue(){
        // 如果队头下标等于队尾下标，表示队列为空
        if(head == tail)return null;
        String ret = items[head];
        ++head;
        return ret;
    }

    public void printAll(){
        if(n == 0)return;
        for(int i=head;i<tail;i++){
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}
