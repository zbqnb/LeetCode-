package WeekGames;

public class LeetCode0411_01 {
    public int arraySign(int[] nums) {

        int negCount = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                negCount++;
            }
            i++;
        }
        return (negCount%2==0) ? 1:-1;
    }
}
