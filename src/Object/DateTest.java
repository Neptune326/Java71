package Object;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//计算一个人活了多少天
public class DateTest {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期，格式为：yyyy年MM月dd日");
        String str = sc.next();

        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = format.parse(str);
        Date date2 = new Date();

        long num = date2.getTime() - date1.getTime();
        if (num < 0 ){
                System.out.println("您还没出生呢");

        }else {
              System.out.println("您活了" + num/(24*60*60*1000) +"天");
        }



    }
}
