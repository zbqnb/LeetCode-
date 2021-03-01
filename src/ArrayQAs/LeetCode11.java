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
    //显然on2的时间满足不了
    //优化 -> 双指针
    //  cur = short * index
    // 面积取决于短板。①因此即使长板往内移动时遇到更长的板，矩形的面积也不会改变；遇到更短的板时，面积会变小。
    // ②因此想要面积变大，只能让短板往内移动(因为移动方向固定了)，当然也有可能让面积变得更小，但只有这样才存在让面积变大的可能性
    public int maxArea2(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;

        while (j - i > 0) {

            res =  height[i] < height[j]  ?
                    Math.max(res,(j - i)* height[i++]) : Math.max(res,(j - i)* height[j++]);

        }
        return res;
    }
}
