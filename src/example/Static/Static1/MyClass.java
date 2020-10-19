package example.Static.Static1;

public class MyClass {
    int num = 1;
    static int staticNum = 2;
    //成员方法
    public void method(){
        System.out.println("成员方法！");
        System.out.println(num);
        System.out.println(staticNum);
    }
    //静态方法
    public static void staticMethod(){
        //System.out.println(num);  静态不能直接访问非静态
        System.out.println(staticNum);
        System.out.println("静态方法！");
    }
}
