public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("KOREA");
        java.util.Date today = new java.util.Date();

        System.out.println(str);
        System.out.println(str.toString());
        System.out.println(today);
        System.out.println(today.toString());

        // String 클래스와 Date클래스에는 toString()가 이미 오버라이딩 되어 있어
        // 인스턴스가 갖고 있는 문자열과 날짜와 시간을 각각 문자열로 변환하여 반환함.
    }

}
