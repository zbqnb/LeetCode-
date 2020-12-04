import java.util.Deque;
import java.util.LinkedList;

public class LeetCode402 {
    /**
     * 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
     *
     * 注意:
     *
     * num 的长度小于 10002 且 ≥ k。
     * num 不会包含任何前导零。

     */
    public String removeKdigits(String num, int k) {
        //维护一个双端队列用于存放结果？
        Deque<Character> deque = new LinkedList<>();
        //单调栈
        //什么时候加入deque呢
        //1.后一位的比现在的小，那就得把栈顶的元素摘出去，把现在的加进去
        //这是贪心算法的表现形式,局部最优表现为，如果不把这个位上较大的拿走
        //比如 425，去掉什么都是十位是4,42,45
        //2.目前的队列为空也可以直接加上去
        //
        deque.pop();
        deque.pollFirst();
        deque.peek();
        char[] charArray = num.toCharArray();
        for (int i = 0; i < num.length(); i++) {
            while (deque.size() != 0 && k > 0 && charArray[i] < deque.getLast()) {
                deque.pollLast();
                k--;
            }
            deque.offer(charArray[i]);
        }
        //这里是为什么呢，因为之前的操作已经把原数组变成顺序增高的了
        //假如k还没用完，这时只需要把剩下的k的数量的数字从队尾删去就行了
        for (int i = 0; i < k; i++) {
            deque.pollLast(); //pollLast函数查看队尾元素并删除
        }

        boolean isZero = true;

        StringBuilder res = new StringBuilder();
        //从队列头部取出所有元素
        while (!deque.isEmpty()){
            Character character = deque.pollFirst();
            //防止前导0 也就是队头第一个元素==0 则需要跳过。
            //[4,0,0,1]
            if(isZero && character=='0'){
                continue;
            }
            //存疑？？
            isZero = false;
            res.append(character);
        }
        //返回结果
        return res.length()==0?  "0" :res.toString();
    }
}
