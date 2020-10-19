package example;
//1到100之间的偶数和
public class Test01 {
    public static void main(String[] args) {
        int sum = 0;
        /*for (int i = 1; i <=100 ; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }*/

       /* int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        }*/

        int i = 1;
        do {
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        }while (i <= 100);

        System.out.println("1到100之间的偶数和位：" + sum);


        int a=10;
        int b=5;
        if(++a>=b++&& a--<=b--)
        { //11   5       11   6
            a++;
            b--;
        }
        System.out.println(a+b);//15

        int a1=10;
        int b1=5;
        if(++a1>=b1++ & a1++<=--b1)
        { //11   5       11   5
            a1++;
            b1--;
        }
        System.out.println(a1+b1);//17

        int w = (int)999.9;
        byte x1 = (byte)10000L;
        long x2 = (byte)100;
        byte x3 = (byte)100L;
        short x4 = (int)100;


    }
}
