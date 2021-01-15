package day09.RedPacketFixed;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 随机抽取list中的一个
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合中删除，并得到删除的红包，给我自己
        // 返回删除的元素
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
