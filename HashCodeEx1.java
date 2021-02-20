public class HashCodeEx1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
    /*
     * 해쉬함수 : 찾고자 하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해쉬코드를 반환함. String클래스는 문자열의 내용이 같으면,
     * 동일한 해쉬코드를 반환하도록 오버라이딩 되어 있음. 그래서 str1과 str2의 해쉬코드가 같음. 하지만
     * System.identityHashCode()는 Object클래스의 hashCode()처럼 객체의 주소값으로 해쉬코드를 생성하기 때문에
     * 모든 객체에 대해 항상 다른 해쉬코드값을 반환하는 것을 보장함.
     */
}
