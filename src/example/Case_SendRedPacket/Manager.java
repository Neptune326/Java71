package example.Case_SendRedPacket;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();
        if (totalmoney > this.getMoney()){
            System.out.println("余额不足！");
            return redList;
        }
        //将剩下的钱存入余额
        setMoney(getMoney() - totalmoney);
        int avg = totalmoney / count;
        int mod = totalmoney % count;
        //红包平均分配到redList
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        redList.add(avg + mod);
        return redList;
    }
}
