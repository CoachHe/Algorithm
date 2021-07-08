package Section4_递归和动态规划.回溯法.第529题_扫雷游戏;

public class Solution_Mine {
    int[][] direction = new int[][]{{1, 1}, {1, -1}, {1, 0}, {0, 1}, {0, -1}, {-1, 1}, {-1, -1}, {-1, 0}, {0, -1}};
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        do_sth(board, click);
        return board;
    }

    public void search(char[][] board, int[] click) {
        int count = 0;
        for (int[] dir : direction) {
            int newx = click[0] + dir[0];
            int newy = click[1] + dir[1];
            if (newx >= board.length || newx < 0 || newy >= board[0].length || newy < 0) {
                continue;
            }
            if (board[newx][newy] == 'M'){
                ++count;
            }
        }
        if (count == 0) {
            board[click[0]][click[1]] = 'B';
        } else {
            board[click[0]][click[1]] = (char) (count + '0');
        }
    }

    public void do_sth(char[][] board, int[] click) {
        for (int[] dir : direction) {
            int newx = click[0] + dir[0];
            int newy = click[1] + dir[1];
            if (newx >= board.length || newx < 0 || newy >= board[0].length || newy < 0 || board[newx][newy] != 'E') {
                continue;
            }
            search(board, new int[]{newx,newy});
        }
    }


    public static void main(String[] args) {

    }
}
