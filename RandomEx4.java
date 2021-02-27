public class RandomEx4 {
    // 데이터 베이스에 넣을 테스트 데이터 만들기->불연속적인 값을 저장 후, 배열의 인덱스를 임의로 얻어서 배열에 저장된 값을 읽어오도록 함.

    // 생성할 레코드의 수
    final static int RECORD_NUM = 10;
    final static String TABLE_NAME = "TEST_TABLE";
    final static String[] CODE1 = { "010", "011", "017", "018", "019" };
    final static String[] CODE2 = { "남자", "여자" };
    final static String[] CODE3 = { "10대", "20대", "30대", "40대", "50대" };

    public static void main(String[] args) {
        for (int i = 0; i < RECORD_NUM; i++) {
            System.out.println("INSERT INTO " + TABLE_NAME + " VALUES (" + "'" + getRandArr(CODE1) + "'" + ", '"
                    + getRandArr(CODE2) + "'" + ", '" + getRandArr(CODE3) + "'" + ", '" + getRand(100, 200) + ");");
        }

    }

    public static String getRandArr(String[] arr) {
        return arr[getRand(arr.length - 1)];
    }

    public static int getRand(int n) {
        return getRand(0, n);
    }

    public static int getRand(int from, int to) {
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }
}
