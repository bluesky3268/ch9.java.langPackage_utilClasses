import jdk.internal.jshell.tool.resources.l10n;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        String s = sb.toString();
        String s2 = sb.toString();

        System.out.println("s.equals(s2) ? " + s.equals(s2));

        // StringBuffer 클래스는 equals()를 오버라이딩 하지 않아서 등가연산자 == 과 같은 값을 가진다.
    }

}
