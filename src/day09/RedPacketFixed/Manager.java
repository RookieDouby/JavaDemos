package day09.RedPacketFixed;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 一个集合，存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 查看群主余额
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList; // 空集合
        }

        // 扣钱
        super.setMoney(leftMoney - totalMoney);
        // 发红包, 平均拆分count分
        int avg = totalMoney / count;
        // 余数，零头
        int mod = totalMoney % count;
        // 一个一个放到集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
