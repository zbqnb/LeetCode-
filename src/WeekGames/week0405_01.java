package WeekGames;

import java.util.Arrays;

public class week0405_01 {
    //Dfs

    public int purchasePlans(int[] nums, int target) {

        Arrays.sort(nums);
        //应该用二分
        //

        int i = 0;
        int j = nums.length - 1;
        int count  = 0;

        while (i < nums.length && j > 0) {
            int s = nums[i] + nums[j];

            if (s <= target) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }
        return count % 1000000007;
    }

    public static void main(String[] args) {
        week0405_01 test = new week0405_01();
        int[] array = {2,2,1,9};
        System.out.println(test.purchasePlans(array,10));
    }

}


