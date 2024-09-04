// Question Link    https://leetcode.com/problems/spiral-matrix/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix_54 {
    public static List<Integer> spiralPrint(int[][] arr) {
        List<Integer> list = new ArrayList<>();

        int startRow = 0, endRow = arr.length - 1;
        int startColumn = 0, endColumn = arr[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            for (int i = startColumn; i <= endColumn; i++) 
                list.add(arr[startRow][i]);
            
            for (int i = startRow+1; i <= endRow; i++) 
                list.add(arr[i][endColumn]);
            
            for (int i = endColumn-1; i >= startColumn; i--) {
                if(startRow == endRow)
                    break;
                list.add(arr[endRow][i]);

            }
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startColumn == endColumn)
                    break;
                list.add(arr[i][startColumn]);
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
        return list;

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
        System.out.println();
        List<Integer> brr = spiralPrint(arr);
        System.out.println(brr);
        sc.close();
    }
}
