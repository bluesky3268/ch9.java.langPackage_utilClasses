class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x= " + x + ", y= " + y;
    }

    public Object Clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return obj;
    }
}

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.Clone(); // Clone메소드를 통해 새로운 객체 생성
        System.out.println(original);
        System.out.println(copy);
    }

}
// Object클래스에 정의된 clone()은 단순 값만 복사하는 것
// (그렇기때문에 참조타입의 인스턴스변수가 있는 경우 완전한 복제가 이루어지지 않음.)
// 예_ 배열의 경우 복사를 하게 되면 복사된 배열이 기존 배열과 같은 주소값을 가지기 때문에 복사된 배열의 값을 변경하면 기존 인스턴스에
// 영향을 미치게 됨. 이럴 경우 clone메소드를 오버라이딩하여 새로운 배열을 생성, 내용을 복사해야함.