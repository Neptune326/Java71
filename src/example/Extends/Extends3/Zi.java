package example.Extends.Extends3;

public class Zi extends Fu {
    int num = 100;

    public void mehtod(){
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
