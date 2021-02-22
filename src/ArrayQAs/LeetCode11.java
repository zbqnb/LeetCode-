package ArrayQAs;
/*
盛水最多的容器
 */
public class LeetCode11 {
    // 首先肯定是想到的o（n2）
    public int maxArea(int[] height) {
     int maxResult = 0;
     int cur = 0;
     int j = 0;
        while (j < height.length) {
            for (int i = j; i < height.length; i++) {
                cur = Math.min(height[j],height[i]) * (i-j);
                maxResult = Math.max(cur,maxResult);
                cur = 0;
            }
            j++;
        }
        return maxResult;
    }
    //显然
    public int maxArea2(int[] height) {

    }

}
