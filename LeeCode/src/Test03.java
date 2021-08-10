/*
* 3 回文数
* */
/*
*给你一个整数 x ，如果 x 是一个回文整数，
*返回 true ；否则，返回 false
* */

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入一个数判断是否文正文数");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Test03 ts = new Test03();
        System.out.println(ts.isPalindrome(i));

    }

    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }else {
            int z = 0, c = 0;
            int x1 = x;
            while (x1 != 0) {
                z = x1 % 10;
                c = c * 10 + z;
                x1 = x1 / 10;
            }
            return c == x;
        }
    }
}


