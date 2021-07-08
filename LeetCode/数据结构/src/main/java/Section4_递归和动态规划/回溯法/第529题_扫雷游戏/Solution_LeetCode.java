package Section4_递归和动态规划.回溯法.第529题_扫雷游戏;

public class Solution_LeetCode {
    private int[][] direction = new int[][]{{0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}, {1, 0}, {-1, 0}};
    private int m, n;

    public char[][] updateBoard(char[][] board, int[] click) {
        m = board.length;
        n = board[0].length;
        char c = board[click[0]][click[1]];
        if (c == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        search(click[0], click[1], board);
        return board;
    }

    public void check(int x, int y, char[][] board) {
        int count = 0;
        for (int[] dir : direction) {
            int newx = x + dir[0];
            int newy = y + dir[1];
            if (newx < 0 || newx >= m || newy < 0 || newy >= n) {
                continue;
            }
            if (board[newx][newy] == 'M') {
                ++count;
            }
        }
        if (count == 0) {
            board[x][y] = 'B';
        } else {
            board[x][y] = (char) (count + '0');
        }
    }

    public void search(int x, int y, char[][] board) {
        check(x, y, board);
        if (board[x][y] == 'B') {
            for (int[] dir : direction) {
                int newx = x + dir[0];
                int newy = y + dir[1];
                if (newx < 0 || newx >= m || newy < 0 || newy >= n || board[newx][newy] != 'E') {
                    continue;
                }
                search(newx, newy, board);
            }
        }
    }


    public static void main (String[]args){
        char[][] chars = new char[][]{{'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}};
        Solution_LeetCode s = new Solution_LeetCode();
        char[][] res = s.updateBoard(chars, new int[]{3, 0});
        for (char[] tmp : res) {
            for (char tmp1 : tmp) {
                System.out.print(tmp1 + " ");
            }
            System.out.println();
        }
    }
}
