package ArrayQAs;

public class LeetCode495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        // [1,5,6,7] 2
        int res = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] + duration < timeSeries[i+1]) {
                res += duration;
            }
            else {
                res += timeSeries[i+1] - timeSeries[i];
            }
        }
        return res;
    }
}
