package Neuedu_20191205_链表;

public class Circle {

    private double radius = 0;

    public static int count = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 内部类
    class Draw {
        public void drawSahpe() {
            System.out.println(radius);
            System.out.println(count);
        }
    }

    public static void main(String[] args) {

        // 成员内部类是依附外部类而存在的，也就是说，如果要创建成员内部类的对象，前提是必须存在一个外部类的对象。

        // 成员内部类可以无条件地访问外部类的成员

        // 在外部类中如果要访问成员内部类的成员，必须先创建一个成员内部类的对象，再通过指向这个对象的引用来访问

        Circle c = new Circle(3.14);

        Circle.Draw draw = c.new Draw();

        draw.drawSahpe();
    }

}

