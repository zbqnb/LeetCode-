/*
输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
输出：[1,2,3,6,9,8,7,4,5]
示例 2：

输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
输出：[1,2,3,4,8,12,11,10,9,5,6,7]

顺时针打印矩阵，拿正方形搞个贪吃蛇那种感觉

本题等于剑指offer29
 */
public class LeetCode206 {


        public int[] spiralOrder(int[][] matrix) {

            if(matrix.length == 0 || matrix[0].length == 0 ||matrix == null){
                return  new int[0];
            }

            int index = 0;
            int rows  =  matrix[0].length;
            int columns = matrix.length;
            int[] order = new int[rows * columns];

            int left = 0;
            int right = columns - 1;
            int top = 0;
            int bottom = rows - 1;
//            while (left <= right && top <= bottom) {
//                for (int column = left; column <= right; column++) {
//                    order[index++] = matrix[top][column];
//                }
//                for (int row = top + 1; row <= bottom; row++) {
//                    order[index++] = matrix[row][right];
//                }
//                if (left < right && top < bottom) {
//                    for (int column = right - 1; column > left; column--) {
//                        order[index++] = matrix[bottom][column];
//                    }
//                    for (int row = bottom; row > top; row--) {
//                        order[index++] = matrix[row][left];
//                    }
//                }
//                left++;
//                right--;
//                top++;
//                bottom--;
//            }




                while(left <= right){
                    order[index] = matrix[left][top];
                    left++;
                    index++;


                }

                while (top <= bottom){
                    order[index] = matrix[left][top];
                    top++;
                    index++;

                };


                while (left == 0){
                    order[index] = matrix[left][top - 1];
                    top--;
                    index++;
                };
                right--;
                top++;
                bottom--;

                return order;
            }

        }


