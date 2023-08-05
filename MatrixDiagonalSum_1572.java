// Question Link    https://leetcode.com/problems/matrix-diagonal-sum/description/

import java.util.Scanner;

public class MatrixDiagonalSum_1572 {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - i - 1)
                sum += mat[i][mat.length - i - 1];
        }
        return sum;
    }

    public static void inputArray(int[][] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of row " + i);
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        inputArray(arr, sc);
        printArray(arr);
        System.out.println("The sum of the diagonals is " + diagonalSum(arr));
        sc.close();
    }
}
