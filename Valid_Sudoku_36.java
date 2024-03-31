public class Valid_Sudoku_36 {
     public static boolean isValidSudoku(char[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] != '.' && !isSafe(sudoku, i, j, sudoku[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSafe(char[][] sudoku, int row, int col, char dig) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (i != col && sudoku[row][i] == dig) {
                return false;
            }
            if (i != row && sudoku[i][col] == dig) {
                return false;
            }
        }

        // Check 3x3 sub-box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (i != row && j != col && sudoku[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // char[][] sudoku = {
        //         { '.', '8', '7', '6', '5', '4', '3', '2', '1' },
        //         { '2', '.', '.', '.', '.', '.', '.', '.', '.' },
        //         { '3', '.', '.', '.', '.', '.', '.', '.', '.' },
        //         { '4', '.', '.', '.', '.', '.', '.', '.', '.' },
        //         { '5', '.', '.', '.', '.', '.', '.', '.', '.' },
        //         { '6', '.', '.', '.', '.', '.', '.', '.', '.' },
        //         { '7', '.', '.', '.', '.', '.', '.', '.', '.' },
        //         { '8', '.', '.', '.', '.', '.', '.', '.', '.' },
        //         { '9', '.', '.', '.', '.', '.', '.', '.', '.' }
        // };

        char[][] sudoku = {
                {'.', '8', '7', '6', '5', '4', '3', '2', '1'},
                {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        if (isValidSudoku(sudoku)) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is not valid.");
        }
    } 
}
