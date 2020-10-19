package example;

import java.util.Arrays;

public class Test05RemoveArrayElement {
    public static void main(String[] args) {
        //删除李四
        String[] array = {"张三","李四","王五","周六","赵七"};
        System.out.println(Arrays.toString(array));
        System.out.println("=====================");
        int index = -1;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i].equals("李四")){
                index = i;      //i = 1;
                break;
            }
        }
        if (index != -1){
            for (int i = index; i < array.length - 1; i++){
                array[i] = array[i + 1];
            }
            array[array.length - 1] = null;
            System.out.println(Arrays.toString(array));
        }else {
            System.out.println("没有需要删除的内容");
        }
    }
}
