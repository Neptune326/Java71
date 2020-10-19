package example.Extends.Extends2;
/*
在父子类的继承关系当中，如何成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。
 */
public class Extends2Field {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//20

        Zi zi = new Zi();
        System.out.println(zi.numFu);//20
        System.out.println(zi.numZi);//10
        System.out.println("===================");

        System.out.println(fu.num);//200
        System.out.println(zi.num);//100
        zi.methodFu();//200
        zi.mehtodZi();//100
    }
}
