package example.Extends.Extends1;
/*
在继承关系中，“子类就是一个父类”，就是说，子类可以被当做父类看待

定义父类的格式：（一个普通的类定义）
public class 父类名称{
    //...
}
定义子类的格式：
public class 子类名称 extends 父类名称{
    //...
}
 */
public class Extends1 {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.method();
        Assistant a = new Assistant();
        a.method();
    }
}
