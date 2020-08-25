package day05;


//输入两个正整数m, n, 求出最大公约数和最小公倍数

import java.util.Scanner;
public class demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数:");
        int m = scanner.nextInt();

        System.out.println("请输入第二个正整数:");
        int n = scanner.nextInt();

//        获取较小值
        int min = (m <= n) ? m : n;
        for(int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为：" + i);
                break;
            }
        }


        // 获取较大值
        int max = (m > n) ? m : n;
        for (int i = max; i <= m * n; i ++ ) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数为: " + i);
                break;
            }
        }
    }
}
