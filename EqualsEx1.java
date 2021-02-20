/**
 * EqualsEx1
 */
public class EqualsEx1 {

    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }
        v2 = v1;
        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");

    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}
// Object 클래스의 equals메소드는 객체의 주소값을 비교함.
// String 클래스의 equals()는 Object클래스의 equals()를 오버라이드 한 것.