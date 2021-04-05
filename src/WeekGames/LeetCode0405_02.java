package WeekGames;

import java.util.HashMap;

public class LeetCode0405_02 {
    public int orchestraLayout(int num, int xPos, int yPos) {

        int maxNum = num * num;
        int curNum = 1;
        int[][] matrix = new int[num][num];
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右下左上
        int directionIndex = 0;
//        HashMap<>
        while (curNum <= maxNum) {
            matrix[row][column] = curNum;
            if (curNum++ > 9) {
                curNum = 1;
            }
            int nextRow = yPos + directions[directionIndex][0], nextColumn = xPos + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= num || nextColumn < 0 || nextColumn >= num || matrix[nextRow][nextColumn] != 0) {
                directionIndex = (directionIndex + 1) % 4; // 顺时针旋转至下一个方向
            }
            yPos = yPos + directions[directionIndex][0];
            xPos = xPos + directions[directionIndex][1];
        }
        return 1;

    }

    public int[][] generateMatrix(int n) {
        int maxNum = n * n;
        int curNum = 1;
        int[][] matrix = new int[n][n];
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右下左上
        int directionIndex = 0;
        while (curNum <= maxNum) {
            matrix[row][column] = curNum;
            if (curNum++ > 9) {
                curNum = 1;
            }
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= n || nextColumn < 0 || nextColumn >= n || matrix[nextRow][nextColumn] != 0) {
                directionIndex = (directionIndex + 1) % 4; // 顺时针旋转至下一个方向
            }
            row = row + directions[directionIndex][0];
            column = column + directions[directionIndex][1];
        }
        return matrix;
    }

}
