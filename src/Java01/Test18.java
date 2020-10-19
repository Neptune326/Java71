package Java01;
//九九乘法表
public class Test18 {
    public static void main(String[] args) {
        System.out.println("乘法表:");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
               /* System.out.print(String.format("%d*%d=%d\t",j, i, i * j));*/
            }
            System.out.println();
        }
    }
}
