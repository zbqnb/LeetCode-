package doublePointer;

public class Offer17_21_ {
    //直方图的水量
//    public int trap(int[] height) {
//        //
//        //dp 双指针
//        //双指针的话
//        //雨水的凉和
//        //
//        int res = 0;
//        //找到右侧第一个比他高的
//        int l = height.length;

//        for (int i = 1; i < height.length - 1; i++) {
//           int leftMax = findTall(height,0,i - 1);
//           int rightMax = findTall(height,i+1,l -1);
//           res += Math.max(leftMax,rightMax) - height[i];
//        }
//        return res;
//
//    }

//    private int findTall(int[] height ,int start,int end) {
//        int max = 0;
//
//        while (!(end == start) {
//            max = Math.max(height[start],height[end]);
//            start ++;
//            end++;
//        }
//        return max;
//    }
}
