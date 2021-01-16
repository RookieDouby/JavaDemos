package day09.RedPacketFixed;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("Sam", 100);
        Member member1 = new Member("Nick", 100);
        Member member2 = new Member("Lily", 100);
        Member member3 = new Member("Will", 100);

        ArrayList<Integer> redList = manager.send(40, 3);
        System.out.println(redList);

        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);

        manager.show();
        member1.show();
        member2.show();
        member3.show();


//        manager.send(12, 2);
////        member1.receive();
    }
}
