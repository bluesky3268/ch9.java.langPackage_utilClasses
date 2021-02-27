import java.util.Random;

public class RandomEx1 {
    public static void main(String[] args) {
        Random rand = new Random(1);
        Random rand2 = new Random(1);

        System.out.println("= rand = ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " : " + rand.nextInt());
        }
        System.out.println();
        System.out.println("= rand2 = ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " : " + rand2.nextInt());
        }
    }
    // Random과 Math.Random()의 가장 큰 차이점은 종자값을 설정할 수 있다는 점.
    // 종자값이 같은 Random인스턴스들은 항상 같은 난수를 같은 순서대로 반환한다.

}
