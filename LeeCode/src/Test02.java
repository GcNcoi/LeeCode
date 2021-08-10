import java.util.Scanner;
/*
*2. 整数反转
*/
/*
* 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
* 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
* */
public class Test02 {

    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Test02 te = new Test02();
        int j = te.reverse(i);
        System.out.println(j);
    }

    public int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int tmp = result;
            result = (result * 10) + (x % 10);
            x /= 10;
            if (result / 10 != tmp) {
                return 0;
            }
        }
        return result;
    }
}
