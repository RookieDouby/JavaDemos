package day09.RedPacketFixed;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("Sam", 100);
        Member member1 = new Member("Nick", 100);
        Member member2 = new Member("Lily", 100);

        manager.show();
        member1.show();
        member2.show();


//        manager.send(12, 2);
////        member1.receive();
    }
}
