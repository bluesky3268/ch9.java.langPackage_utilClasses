import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.*;

public class ObjectTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
        String[][] str2D_2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

        System.out.println("str2D = {" + str2D);
        for (String[] tmp : str2D)
            System.out.println(Arrays.toString(tmp));
        System.out.println("}");
        System.out.println("str2D_2 = {");
        for (String[] tmp : str2D_2)
            System.out.println(Arrays.toString(tmp));
        System.out.println("}");

        System.out.println();
        System.out.println("equals(str2D, str2D_2) = " + Objects.equals(str2D, str2D_2));
        System.out.println("DeepEquals(str2D, str2D_2) = " + Objects.deepEquals(str2D, str2D_2)); // 2차원 문자배열을 비교할 때
                                                                                                  // deepEquals()를 사용

        System.out.println();
        System.out.println("isNull(null) = " + isNull(null));
        System.out.println("nonNull(null) = " + nonNull(null));
        System.out.println("hashCode(null) = " + Objects.hashCode(null));
        System.out.println("toString(null) = " + Objects.toString(null));
        System.out.println("toString(null, \"\") = " + Objects.toString(null, ""));

        System.out.println();
        // 비교 대상이 같으면 0 크면 양수, 작으면 음수.
        // Comparator 는 두 객체를 비교할 때 비교 기준이 있어야 하는데 그 역할을 함.
        Comparator c = String.CASE_INSENSITIVE_ORDER; // 대소문자를 구분하지 않는 비교.
        System.out.println("comparator(\"aa\", \"bb\") = " + compare("aa", "bb", c));
        System.out.println("comparator(\"bb\", \"aa\") = " + compare("bb", "aa", c));
        System.out.println("comparator(\"ab\", \"AB\") = " + compare("ab", "AB", c));

    }

}
