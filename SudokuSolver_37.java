// Question Link https://leetcode.com/problems/sudoku-solver/description/

public class SudokuSolver_37 {

    public static boolean sudokuSolver(char[][] sudoku, int row, int col) {

        if (row == 9) {
            return true;
        }

        if (col == 9) {
            return sudokuSolver(sudoku, row + 1, 0);
        }

        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != '.') {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (char dig = '1'; dig <= '9'; dig++) {
            if (isSafe(sudoku, row, col, dig)) {
                sudoku[row][col] = dig;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = '.';
            }
        }

        return false;

    }

    public static boolean isSafe(char[][] sudoku, int row, int col, char dig) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == dig || sudoku[i][col] == dig) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void print(char[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] sudoku = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            print(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }
}
