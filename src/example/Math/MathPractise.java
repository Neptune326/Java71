package example.Math;
/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 */
public class MathPractise {
    public static void main(String[] args) {
       /* double a = -10.8;
        int count = 0;
        while (a <= 5.9){
            if (Math.abs(a) > 6 || Math.abs(a) < 2.1){
                count++;
            }
            a++;
        }
        System.out.println(count);*/
        double max = 5.9;
        double min = -10.8;
        int count = 0;
        for (int i = (int) min; i < max; i++){
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
