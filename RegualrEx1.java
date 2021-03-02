import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Pattern과 Matcher가 속한 패키지 : regex

public class RegualrEx1 {
    public static void main(String[] args) {

        // 정규식이란 텍스트 데이터 중에서 원하는 조건/패턴과 일치하는 문자열을 찾아내기 위해 사용하는 것.(미리 정의된 기호와 문자를 이용해서
        // 작성한 문자열)
        // 1. Pattern클래스의 Pattern complie()을 호출하여 pattern인스턴스를 얻는다.
        // 2. 비교할 대상을 매개변수로 Matcher()를 호출해서 matcher인스턴스를 얻는다.
        // 3. matcher인스턴스에 boolean matches()를 호출해서 정규식에 부합하는지 확인한다.

        String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
                "disc" };
        // 1.
        Pattern p = Pattern.compile("c[a-z]*");
        for (int i = 0; i < data.length; i++) {
            // 2.
            Matcher m = p.matcher(data[i]);
            // 3.
            if (m.matches())
                System.out.print(data[i] + ", ");
        }
    }

}
