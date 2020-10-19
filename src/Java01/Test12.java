package Java01;

public class Test12 {
    public static void main(String[] args) {
        int a = 63;
        int b = 18;
        int c = 45;
        int max = 0;

        if (a > b){
            max = a;
        }else {
            max = b;
        }
        if (max < c){
            max = c;
        }
        System.out.println("三个数中的最大数为：" + max);


    }
}
