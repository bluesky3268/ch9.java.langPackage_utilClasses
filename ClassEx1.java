class Card3 {
    String kind;
    int number;

    Card3() {
        this("SPADE", 1);
    }

    Card3(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return kind + ": " + number;
    }
}

public class ClassEx1 {
    public static void main(String[] args) {
        Card3 c = new Card3("HEART", 3); // new 연산자를 통해서 객체 생성
        // Card3 c2 = Card3.class.newInstance(); // Class객체를 통해서 객체 생성
        Class cObj = c.getClass();

        System.out.println(c);
        // System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());

    }

    // Class객체에 대한 참조를 얻는 방법
    // 1. 생성된 객체로 부터 얻기 : Class cObj = new Card().getClass();
    // 2. 클래스 리터럴(*.class)로부터 얻기 : Class cObj = Card.class;
    // 3. 클래스 이름으로부터 얻기 : Class cObj = Class.forName("Card") -> 특정 클래스 파일, (예_데이터베이스
    // 드라이버를 메모리에 올릴 때)에 주로 사용.
    // Class객체를 이용하면 클래스에 정의된 멤버의이름이나 개수 등 모든 정보를 얻을 수 있어서 보다 동적인 코드 작성이 가능함.

}
