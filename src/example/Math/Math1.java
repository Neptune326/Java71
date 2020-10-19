package example.Math;
/*
java.util.Math类是数学相关的工具类

public static double abs(double num)：获取绝对值
public static double ceil(double num)：向上取整
public static double floor(double num)：向下取整
public static long round(double nm)：四舍五入

Math.PI代表近似的圆周率常量（double）
 */
public class Math1 {
    public static void main(String[] args) {

        //获取绝对值
        System.out.println(Math.abs(20.1));//20.1
        System.out.println(Math.abs(0));   //0
        System.out.println(Math.abs(-20.0));//20.0
        System.out.println("================");
        //向上取整
        System.out.println(Math.ceil(30.1));//31.0
        System.out.println(Math.ceil(30.0));//30.0
        System.out.println(Math.ceil(30.9));//31.0
        System.out.println("================");
        //向下取整
        System.out.println(Math.floor(10.2));//10.0
        System.out.println(Math.floor(10.0));//10.0
        System.out.println(Math.floor(10.9));//10.0
        System.out.println("================");
        //四舍五入
        System.out.println(Math.round(4.4));//4
        System.out.println(Math.round(4.5));//5
        System.out.println("================");
    }
}
