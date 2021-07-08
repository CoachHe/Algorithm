package Section8_数组和矩阵问题.第36题_有效的数独;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i += 3){
            for (int j = 0; j < 9; j += 3){
                if (! TrianValid(board, i, j)){
                    return false;
                }
            }
        }
        return lineValid(board) && rowValid(board);
    }

    public boolean lineValid(char[][] board){
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.' && hashSet.contains(board[i][j])){
                    return false;
                } else if (board[i][j] != '.') {
                    hashSet.add(board[i][j]);
                }
            }
            hashSet.clear();
        }
        return true;
    }

    public boolean rowValid(char[][] board){
        HashSet<Character> hashSet = new HashSet<>();
        for (int j = 0; j < 9; j++){
            for (int i = 0; i < 9; i++){
                if (board[i][j] != '.' && hashSet.contains(board[i][j])){
                    return false;
                } else if (board[i][j] != '.'){
                    hashSet.add(board[i][j]);
                }
            }
            hashSet.clear();
        }
        return true;
    }


    public boolean TrianValid(char[][] board, int m, int n){
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = m; i < 3 + m; i++){
            for (int j = n; j < 3 + n; j++){
                if (board[i][j] != '.' && hashSet.contains(board[i][j])){
                    return false;
                } else if (board[i][j] != '.'){
                    hashSet.add(board[i][j]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /***
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
         ***/
        char[][] board = {
                 {'.','.','4','.','.','.','6','3','.'},{'.','.','.','.','.','.','.','.','.'},
                 {'5','.','.','.','.','.','.','9','.'},{'.','.','.','5','6','.','.','.','.'},
                 {'4','.','3','.','.','.','.','.','1'},{'.','.','.','7','.','.','.','.','.'},
                 {'.','.','.','5','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},
                 {'.','.','.','.','.','.','.','.','.'}
        };
        Solution s = new Solution();
        System.out.println(s.isValidSudoku(board));

    }

}
