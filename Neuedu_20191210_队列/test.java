package Neuedu_20191210_队列;

public class test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        // 五个数据入队,此时head=0,tail=5
        queue.enqueue("猪");
        queue.enqueue("哈哈");
        queue.enqueue("哈");
        queue.enqueue("嘻嘻");
        queue.enqueue("嘻");

        // 两个数据出队,此时head=2,tail=5
        queue.dequeue();
        queue.dequeue();

        // 一个数据入队,检测到tail=5,且head!=0,所以进行数据搬移操作,搬移后head=0,tail=4
        queue.enqueue("ddd");

        queue.printAll();
    }
}
