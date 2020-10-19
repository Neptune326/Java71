package Object;

public class SystemTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 1000 ; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("一共用时" + (end - start) + "毫秒");
    }
}
