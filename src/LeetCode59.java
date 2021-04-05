import java.util.ArrayList;

public class LeetCode59 {
    //给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，
    // 且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
    public int[][] generateMatrix(int n) {
        //
        int [][] array = new int[n][n];
        int [][] direction = {{0,1},{1,0},{0,-1},{-1,0}}; //右下左上
        int curNum = 1;
        int Max = n * n;
        int row = 0,col = 0;
        int directionIndex = 0;

        while (curNum <= Max) { //不等于max不进最后一次循环
            array[row][col] = curNum;
            curNum++;
            int nextRow = row + direction[directionIndex][0];
            int nextCol = col + direction[directionIndex][1];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || array[nextRow][nextCol] != 0
            ) {
              directionIndex = (directionIndex + 1) % 4;
            }
            row = row + direction[directionIndex][0];
            col = col + direction[directionIndex][1];
        }
        return  array;
    }
}
