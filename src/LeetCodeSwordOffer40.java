/*
输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

 

示例 1：

输入：arr = [3,2,1], k = 2
输出：[1,2] 或者 [2,1]
示例 2：

输入：arr = [0,1,2,1], k = 1
输出：[0]
 */

import java.util.Arrays;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {

        Arrays.sort(arr);
        int[] intArray4 = new int[k];

        for (int i = 0; i < k; i++) {

            intArray4[i] = arr[i];
        }
        return intArray4;
    }
    // Arrays.sort大法好啊！

    //下面写一个快速排序
    public static void main(String[] args) {
        // 检查
        int[] intArray4 = new int[7];
        intArray4[0] = 5;
        intArray4[1] = 10;
        intArray4[2] = 9;
        intArray4[3] = 2;
        intArray4[4] = 1;
        intArray4[5] = 4;
        intArray4[6] = 0;


        quickSort(intArray4,0,6);

        System.out.println(Arrays.toString(intArray4));


    }

    public static void quickSort(int arr[], int _left, int _right) {
        int left = _left;
        int right = _right;
        int temp = 0;
        /* 待排序的元素至少有两个的情况 */
        if (left <= right) {
            /* 待排序的第一个元素作为基准元素 */
            temp = arr[left];        //
            /* 从左右两边交替扫描，直到left = right */
            while (left != right) {
                /* 从右往左扫描，找到第一个比基准元素小的元素 */
                while (right > left && arr[right] >= temp) {
                    right--;
                }
                /* 找到这种元素arr[right]后与arr[left]交换 */
                arr[left] = arr[right];

                /* 从左往右扫描，找到第一个比基准元素大的元素 */
                while (left < right && arr[left] <= temp) {
                    left++;
                }
                /* 找到这种元素arr[left]后，与arr[right]交换 */
                arr[right] = arr[left];

            }
            /* 基准元素归位 */
            arr[right] = temp;
            /* 对基准元素左边的元素进行递归排序 */
            quickSort(arr, _left, left - 1);
            /* 对基准元素右边的进行递归排序 */
            quickSort(arr, right + 1, _right);
        }
    }


    public static void quickSort2(int arr[], int leftIn, int rightIn) {

        int left = leftIn;
        int right = rightIn;
        int temp = 0;

        if (left < right) {

            temp = arr[left];//将基准设置为左边，也是把坑挖出来

            while (left != right) {

                while (left < right && arr[right] >= temp) {
                    right--;
                }//找到最右边第一个小于temp的数替换

                arr[left] = arr[right];

                while (left < right && arr[left] >= temp) {//找到左边第一个大于temp的数
                    left++;
                }

                arr[right] = arr[left];//这里把了left替换为右边，因为right地方挖了坑，直接放进去
            }

            //57814376
            //temp = 5 ,37814376
            // left = 37814776
            //right 7位置 34814776
            // left位置是 34818776
            // 34118776
            // 34158776


        }
    }

    public static int FindIndexPosition(int[] arr, int low, int high) {

        int mid = (low + high) / 2;

        if (arr[mid] == mid) {
            return mid;
        } else if (arr[mid] < mid) {
            low = mid + 1;
            return FindIndexPosition(arr, low, high);
        } else if (arr[mid] > mid) {
            high = mid - 1;
            return FindIndexPosition(arr, low, high);
        }
        return 0;
    }

    public static int[] Findsource(int[][] arr, int x, int y, int[] source){

        int[] resultvalue = new int[2];
        boolean lineChange = false;

        while( y < arr[0].length){
            if (x == source[0] && y == source[1]){
                resultvalue[0] = x;
                resultvalue[1] = y;
                return resultvalue;
            } else if (x == source[0]) {

                y = y + 1;
                x = 0;

                resultvalue[0] = x;
                lineChange = true;
            }

            x++;
            y++;

            if (lineChange && y == source[1]){
                 resultvalue[1] = y;
                 return resultvalue;
            }


        }
        return resultvalue;
    }
    static int quaternarySearch(int[] a, int start, int end, int x) {


        if (end >= start) {
            int mid1 = start + (end - start) / 4;
            int mid2 = mid1 + (end - start) / 4;
            int mid3 = mid2 + (end - start) / 4;

            // If x is present at the mid1
            if (a[mid1] == x)
                return mid1;

            // If x is present at the mid2
            if (a[mid2] == x)
                return mid2;

            // If x is present at the mid3
            if (a[mid3] == x)
                return mid3;

            // If x is present in (first dividend)left one-third
            if (a[mid1] > x)
                return quaternarySearch(a, start, mid1 - 1, x);

            // If x is present in (second dividend)right one-third
            if (a[mid2] > x)
                return quaternarySearch(a, mid1 + 1, mid2 - 1, x);

            // If x is present in (fourth dividend) right one-third
            if (a[mid3] < x)
                return quaternarySearch(a, mid3 + 1, end, x);

            // If x is present in (third dividend) middle one-third
            return quaternarySearch(a, mid2 + 1, mid3 - 1, x);
        }

        // We reach here when element is
        // not present in array
        return -1;
    }

//    public static void main(String[] args) {
//
//        int[] intArray4 = new int[9];
//        intArray4[0] = -1;
//        intArray4[1] = 0;
//        intArray4[2] = 2;
//        intArray4[3] = 3;
//        intArray4[4] = 10;
//        intArray4[5] = 11;
//        intArray4[6] = 23;
//        intArray4[7] = 24;
//        intArray4[8] = 102;
//
//        Solution solution = new Solution();
//        System.out.println(Solution.FindIndexPosition(intArray4, 0, 9));
//
//    }
}




