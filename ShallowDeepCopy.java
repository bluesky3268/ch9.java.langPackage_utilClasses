class Circle implements Cloneable {
    Point3 p;
    double r;

    Circle(Point3 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return (Circle) obj;
    }

    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {

        }
        Circle c = (Circle) obj;
        c.p = new Point3(this.p.x, this.p.y);
        return c;
        // 마지막 두 줄을 통해 복사된 객체 obj가 새로운 Point인스턴스를 참조해 기존인스턴스와 다른 주소값을 가지게 함으로써 깊은 복사가 됨.
    }

    public String toString() {
        return "[p = " + p + ", r = " + r + "]";
    }
}

class Point3 {
    int x, y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + ", " + y + ")";
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point3(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("==== 변경 후 ====");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }

}
