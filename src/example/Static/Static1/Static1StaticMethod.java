package example.Static.Static1;
/*
无论是成员变量还是成员方法，有了static修饰，都推荐使用类名称进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法

注意事项：
1.静态不能直接访问非静态
原因：内存中，先有的静态，后有的非静态
2.静态方法中不能使用this
原因：this代表当前对象
 */
public class Static1StaticMethod {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        my.method();//成员方法

        my.staticMethod();//静态方法，不推荐
        MyClass.staticMethod();//静态方法，推荐
    }

    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
