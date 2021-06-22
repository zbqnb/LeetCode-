package WeekGames;
/*
   如果是2
   cur = 2;
   next 2 dp[1][4]

 */
public class LeetCode0411_03 {
    public int minSideJumps(int[] obstacles) {
        //当前位置的数组
        //二维数组
        int len = obstacles.length;
        int[][]dp = new int[2][len];
        // 0 1 2
        for (int i = 0; i < len; i++) {
            if (obstacles[i] == 1) {
                dp[1][1]++;
            } else if (obstacles[i] == 2) {
                dp[1][2]++;
            } else {
                dp[1][3]++;
            }
        }
        int resCount = 0;
        int curIndex = 0;
        int line = 2;
        while(curIndex < len){
            if (obstacles[curIndex + 1] == line){

            }
        }
        return 1;
    }
}
