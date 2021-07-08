package Section4_递归和动态规划.回溯法.第79题_单词搜索;

public class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] judge = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (part_judge(board, judge, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean part_judge(char[][] board, boolean[][] judge, String word, int x, int y, int index) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || judge[x][y] || board[x][y] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1 && board[x][y] == word.charAt(index)) {
            return true;
        }
        judge[x][y] = true;
        boolean res = part_judge(board, judge, word, x, y + 1, index + 1) || part_judge(board, judge, word, x, y - 1, index + 1)
                || part_judge(board, judge, word, x + 1, y, index + 1) || part_judge(board, judge, word, x - 1, y, index + 1);
        judge[x][y] = false;
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
        System.out.println(s.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE"));
        System.out.println(s.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB"));
    }

}
