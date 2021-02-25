import java.util.StringJoiner;

public class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(","); // split(",") 문자열을 구분자 , 로 나눠서 배열에 저장
        System.out.println(String.join("-", arr)); // arr배열을 구분자 -로 결합해서 출력

        StringJoiner sj = new StringJoiner("/", "[", "]"); // StringJoiner 클래스 : 문자열 결합에 사용
        for (String s : arr)
            sj.add(s);
        System.out.println(sj.toString());
    }

}
