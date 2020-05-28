import java.lang.reflect.Array;
import java.util.*;

/**
 * @author HanChao
 * @date 2020-05-08 22:51
 * 描述信息：
 */
public class text {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int s = solution.thirdMax(new int[]{3,2,1});
        System.out.println(s);
    }
}


class Solution {
    public int thirdMax(int[] nums) {


        int max = 0;
        List list = new LinkedList();
        int j = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                list.add(nums[i]);
                max = nums[i];
                j++;
            }
        }

        System.out.println(list.size());
        System.out.println(max);
        if (list.size() == 2) {
            return max;
        } else {
            return (int) list.get(j - 1);
        }

    }

}


