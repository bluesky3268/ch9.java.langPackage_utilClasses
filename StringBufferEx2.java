public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append("23");

        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);
        System.out.println();
        System.out.println("sb = " + sb.deleteCharAt(10));
        System.out.println("sb = " + sb.delete(3, 6));
        System.out.println("sb = " + sb.insert(3, "abc"));
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

        System.out.println("capacity = " + sb.capacity());
        System.out.println("length = " + sb.length());

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb2 == sb3 ? " + (sb2 == sb3));
        System.out.println("sb == sb3 ? " + (sb == sb3));

    }
    // StringBuilder는 멀티쓰레드에 안전하도록 동기화 되어있는 StringBuffer를 대신해 동기화기능만 뺀 것.
    // 성능향상이 필요한 경우를 제외하고는 굳이 StringBuilder로 바꿀 필요는 없음.
    // 비동기, 네트워크 등에서는 주로 StringBuffer를 사용하고
    // 평소 일반코드에선느 StringBuilder를 사용함.
}
