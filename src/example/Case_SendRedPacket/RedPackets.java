package example.Case_SendRedPacket;

import java.util.ArrayList;

public class RedPackets {
    public static void main(String[] args) {

        Manager manager = new Manager("群主" ,100);

        Member one = new Member("群员A",0);
        Member two = new Member("群员B",0);
        Member three = new Member("群员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=============================");

        ArrayList<Integer> list = manager.send(20, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
