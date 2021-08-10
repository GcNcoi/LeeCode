import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
*1. 两数之和
*/

/*
* 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
* 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
*/
public class Test01 {

    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Test01 test = new Test01();
        int[] j = new int[]{5,6,7,9,1};
        int[] z = test.twoSum(j,i);
        for (int x = 0;x < z.length;x++){
            System.out.println(z[x]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0;i < nums.length;i++){
            for (int j = i+1;j < nums.length;j++){
                if (nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}

