public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";
        // '.'의 위치찾기
        int index = fullName.indexOf('.');
        // '.' 앞까지 자르기
        String fileName = fullName.substring(0, index);
        String ext = fullName.substring(index + 1);
        System.out.println(fullName + "의 확장자는 " + ext + "입니다.");
        System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName + "입니다.");
    }

}
