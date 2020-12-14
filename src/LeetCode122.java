public class LeetCode122 {
    /**
     * 122. 买卖股票的最佳时机 II
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     *
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

     */
    public int maxProfit(int[] prices) {
        //计算假如今天买的话，最高利润是什么，然后卖出去。
        //想的复杂了。。。。
        //拿到所有的山顶，也就是把所有能得到的利润拿到
        //  0 7 4 8

        int curProfit = 0;
        int curDay = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[curDay] > 0) {
                curProfit += prices[i] - prices[curDay];
                 curDay = i;
            }
        }
        return curProfit;
        }






}
