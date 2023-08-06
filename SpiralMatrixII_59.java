

public class SpiralMatrixII_59 {

    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int startRow = 0, endRow = arr.length - 1;
        int startColumn = 0, endColumn = arr[0].length - 1;
        n= 1;
        while (startRow <= endRow && startColumn <= endColumn) {

            for (int i = startColumn; i <= endColumn; i++) {
                arr[startRow][i] = n;
                n++;
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                arr[i][endColumn] = n;
                n++;
            }
            for (int i = endColumn - 1; i >= startColumn; i--) {
                if (startRow == endRow)
                    break;
                arr[endRow][i] = n;
                n++;

            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn)
                    break;
                arr[i][startColumn] = n;
                n++;
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
        return arr;
    }

    public static void printArray(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= 3;
        int[][] arr =  generateMatrix(n);
        printArray(arr);
    }
}
