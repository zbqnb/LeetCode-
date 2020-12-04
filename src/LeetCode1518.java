public class LeetCode1518 {
    /*
    小学数学题换瓶子那个，就是每次喝一个就直接换了到最后能换多少
     */
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int sum = numBottles;


            while (numBottles <= numExchange){
                numBottles = numBottles - numExchange;
                sum++;
                numBottles++;

              }
            return sum;
        }

        public int numWaterBottles2(int numBottles, int numExchange) {
            //这个就是把传入提取出来，就减小了内存消耗？？？为啥

            int bottle = numBottles, ans = numBottles;
            while (bottle >= numExchange) {
                bottle -= numExchange;//减等于内存小了0.1mb
                ++ans;
                ++bottle;
            }
            return ans;
        }


    }
}
