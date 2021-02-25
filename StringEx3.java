public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
    // 변수를 선언할 때, 각 타입의 기본값으로 초기화 하지만 String은 null보다는 빈문자열 ""로, char형은 기본값은 '\u0000'
    // 대신 공백(' ')으로 초기화 하는 것이 보통임.

}
