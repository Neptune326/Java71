package Java01;

public class Test05 {
    public static void main(String[] args) {

        int a = 3;
        int b = 8;
        int c = 5;

        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        int min = (a < b ? a : b) < c ? (a < b ? a : b) : c;

        System.out.println("三个数中的最大数为：" + max);
        System.out.println("三个数中的最小数为：" + min);

    }
}
