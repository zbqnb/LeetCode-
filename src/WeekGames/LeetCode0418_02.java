package WeekGames;

import java.net.BindException;
import java.util.Arrays;

public class LeetCode0418_02 {
    private int anInt;
    public  LeetCode0418_02(String s) {

    }
    Object i = 6;
    public int maxIceCream (int[] costs, int coins) throws BindException {
        Arrays.sort(costs);
        int count = 0;

        while (count < costs.length) {
            if (coins - costs[count] < 0) {
              break;
            } else {
                coins-=costs[count];
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        int[] intArray1 = new int[]{1,6,3,1,2,5};
        System. out. println(10 % 3 * 2);
    }
}
