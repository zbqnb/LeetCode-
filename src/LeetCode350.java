import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode350 {

    public int[] intersect(int[] nums1, int[] nums2) {
//        if (nums1.length == 0 | nums2.length == 0) {
//            return
//        }

//        List<Integer> resultArray = new ArrayList<>();
//
//        if (nums1.length < nums2.length) {
//            for (int i = 0; i < nums1.length; i++) {
//                for (int j = 0; j < nums2.length; j++) {
//                    if (nums1[i] == nums2[j]) {
//                        resultArray.add(nums1[i]);
//                        break;
//                    }
//                }
//            }
//        } else {
//            for (int i = 0; i < nums2.length; i++) {
//                for (int j = 0; j < nums1.length; j++) {
//                    if (nums2[i] == nums1[j]) {
//                        resultArray.add(nums1[i]);
//                        break;
//                    }
//                }
//
//            }
//
//
//        }
//        int[] res = new int[resultArray.size()];
//        for(int k = 0;k < resultArray.size();k++){
//            res[k] = resultArray.get(k);
//        }
//        return res;
//
//    }上面这些是用的双循环来处理， 不能处理的用例子是（1,1）（1,2）
        //推荐使用的是映射也就是mapping还有双指针
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            List<Integer> list = new ArrayList<>();
            for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    list.add(nums1[i]);
                    i++;
                    j++;
                }
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }
    }

