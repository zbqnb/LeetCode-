import java.util.*;

public class LeetCode659 {
    /**
     * 给你一个按升序排序的整数数组 num（可能包含重复数字）， 请你将它们分割成一个或多个子序列， 其中每个子序列都由连续整数组成且长度至少为 3
     * 。
     * <p>
     * 如果可以完成上述分割，则返回 true ；否则，返回 false 。
     * <p>
     * 输入: [1,2,3,3,4,5] 输出: True 解释: 你可以分割出这样两个连续子序列 : 1, 2, 3 3, 4, 5
     */
    public boolean isPossible(int[] nums) {
        //需要有两个重复的数字，并且这个数字之后两位的数字不能有重复的
        //每个map里存的是什么呢，当前的x和因为他构筑的最小堆？
        ////www.cnblogs.com/CarpenterLee/p/5488070.html 这个pq讲的很详
        // key为子序列尾元素，value为子序列长度
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();

        for (int n : nums
        ) {
            //说明当前的还没有一个堆来存他的子串
            if (!map.containsKey(n)) {
                map.put(n, new PriorityQueue<Integer>()); //
            }
            //map里有他的堆，说明有子串，这时要把n加到最短子串上
            if (map.containsKey(n - 1)) {
                //这个length是当前最短的子串，要把目前的n加在这个子串上，这也是题目中的贪心算法的体现
                //.poll直接就能拿到最小值，因为用了priority Q
                //这里直接拿走了
                int prevLength = map.get(n - 1).poll();
                //假如拿走这个长度为空了，说明目前就一个子串，因此要把新的串在下面更新
                if (map.get(n - 1).isEmpty()) {
                    map.remove(n - 1);
                }
                //这里是把当前n的子串加上去
                map.get(n).offer(prevLength + 1);
            } else {
                map.get(n).offer(1);
            }
        }
        Set<Map.Entry<Integer, PriorityQueue<Integer>>> entrySet = map.entrySet();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : entrySet) {
            PriorityQueue<Integer> queue = entry.getValue();
            if (queue.peek() < 3) {
                return false;
            }
        }
        return true;
    }
}
