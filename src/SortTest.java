public class SortTest {

    public static void main(String[] args) {
        int[] arr = {14, 12, 4, 6, 9, 16, 11, 8, 3, 1,18};
        quickSort(arr,0,arr.length-1);
        for (int x : arr){
            System.out.print(x+", ");
        }
    }
    /*
        快速排序（从小到大）
    */
    public static void quickSort(int arr[],int _left,int _right){
        int left = _left;
        int right = _right;
        int temp = 0;
        /* 待排序的元素至少有两个的情况 */
        if(left <= right){
            /* 待排序的第一个元素作为基准元素 */
            temp = arr[left];        //
            /* 从左右两边交替扫描，直到left = right */
            while(left != right){
                /* 从右往左扫描，找到第一个比基准元素小的元素 */
                while(right > left && arr[right] >= temp){
                    right --;
                }
                /* 找到这种元素arr[right]后与arr[left]交换 */
                arr[left] = arr[right];

                /* 从左往右扫描，找到第一个比基准元素大的元素 */
                while(left < right && arr[left] <= temp){
                    left ++;
                }
                /* 找到这种元素arr[left]后，与arr[right]交换 */
                arr[right] = arr[left];

            }
            /* 基准元素归位 */
            arr[right] = temp;
            /* 对基准元素左边的元素进行递归排序 */
            quickSort(arr,_left,left-1);
            /* 对基准元素右边的进行递归排序 */
            quickSort(arr, right+1,_right);
        }
    }

}