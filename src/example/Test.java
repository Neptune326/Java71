package example;

public class Test {
    public static void main(String[] args){
        int[] arr = {1,4,7,3,5,2,8};
        for(int i=0; i<arr.length - 1; i++){		//循环多少次
            //每次循环比较多少个数
            for(int j=0; j<arr.length - 1 - i; j++){
                if(arr[j] >arr[j + 1]){		//如果前者大于后者，则交换两者
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.println(num);
        }
    }

}
