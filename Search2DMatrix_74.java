// Question Link   https://leetcode.com/problems/search-a-2d-matrix/description/

import java.util.Scanner;

public class Search2DMatrix_74 {

    public static void binarySearch(int[][] matrix, int target){
        int col = matrix[0].length;
        int st = 0;
        int end = matrix.length * col -1;
        while (st <= end)
        {
            int mid = (st + end)/2;
            if(matrix[mid/col][mid%col] == target)
            {
                System.out.println("Element found at " + mid/col + " " + mid%col);
                return;
            }
            else if(matrix[mid/col][mid%col] < target)
                st = mid + 1;
            else
                end = mid - 1;
        }
        System.out.println("Element not found");
    }

     public static void inputArray(int[][] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of row " + i);
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }
    }

    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) System.out.print(anInt + " ");
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
        System.out.println();
        System.out.println("Enter the key to search");
        int key = sc.nextInt();
        binarySearch(arr, key);
        sc.close();
    }
}
