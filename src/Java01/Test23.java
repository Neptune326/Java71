package Java01;

//数组反转
public class Test23 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("==================");
        /*for (int i = 0; i < array.length; i++) {
            if (i >= array.length - 1 - i) {
                break;
            }
            int num = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = num;
        }*/
        for (int min = 0,max = array.length - 1; min <= max; min++,max--){
            int num = array[min];
            array[min] = array[max];
            array[max] = num;
        }
        for (int b : array) {
            System.out.println(b);
        }
    }
}
