import java.util.Arrays;

public class LeetCode121 {

    /*121. 买卖股票的最佳时机
    记录【今天之前买入的最小值】
    计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
    比较【每天的最大获利】，取最大值即可
     */
    public int maxProfit(int[] prices) {

        if(prices.length <= 1)
            return 0;

        int minvalue = prices[0];
        int profitmax = 0;


        for (int i = 0; i < prices.length; i++) {

            profitmax = Math.max(profitmax,prices[i]- minvalue);
            minvalue  = Math.min(minvalue, prices[i]);

        }

        return profitmax;

    }
    // Math.min 和 Math.max方法返回给定数字中最小的，或者最大的，通过其math.apply方法还能实现
    //对数组中最小或最大的实现

}
