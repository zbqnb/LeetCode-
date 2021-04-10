package DFS;

public class LeetCodeSwordOffer12 {
    final static int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}}; //右下上左
    char[] charArray;
    int row;
    int col;
    int len;
    char[][] board;
    boolean[][]used;


    public boolean exist(char[][] board, String word) {
    this.board = board;
    this.row = board.length;

    this.charArray = word.toCharArray();
    len = word.length();

    if (row == 0) {
        return false;
    }
    this.col = board[0].length;
    boolean[][]used = new boolean[row][col];

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          if (Dfs(i,j,0)) {
              return true;
          }
        }
    }
    return false;
    }
    private Boolean Dfs(int i,int j,int curlength) {

         if (curlength == charArray.length - 1) {
             return board[i][j] == charArray[curlength];
         }

         if (board[i][j] == charArray[curlength]){
             used[i][j] = true;
             for (int[] move:direction
                  ) {
                 int newX = i + move[0];
                 int newY = j + move[1];
                 if(inBoard(newX,newY) && !used[newX][newY]) {
                     if (Dfs(newX,newY,curlength + 1)) {
                         return true;
                     }
                 }
             }
             used[i][j] = false;
         }
        return false;
    }
    private boolean inBoard(int x,int y)  {
        return  x >= 0 && x < row && y >= 0 && y < col;
    }
}
