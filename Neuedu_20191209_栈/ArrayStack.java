package Neuedu_20191209_栈;

public class ArrayStack {

    private String[] items; // 数组(用数组实现的栈,成为顺序栈)

    private int count;  // 栈中元素个数

    private int n;  // 栈的大小

    // 初始化一个栈，申请一个大小为n的数组空间
    public ArrayStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }

    // 入栈操作
    public boolean push(String item){
        if(count == n)return false;   // 栈的空间不足(元素个数等于栈的大小)
        items[count] = item;
        ++count;
        return true;
    }

    // 出栈操作
    public String pop(){
        if(count == 0)return null;  // 栈为空
        String tmp = items[count-1];    // 弹出顶端的元素
        --count;
        return tmp;
    }

}
