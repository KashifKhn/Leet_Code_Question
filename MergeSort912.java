public class MergeSort912 {
    public static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void mergeSort(int[]arr, int si, int ei) {
        if(si >= ei)
            return;
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] tempArr = new int[ei-si + 1];
        int i = si; // for 1st sort
        int j = mid+1; // for second sort part
        int k = 0; // for temp
        while (i<=mid && j<= ei) {
            if(arr[i] < arr[j])
                tempArr[k++] = arr[i++];
            else
                tempArr[k++] = arr[j++];
        }
        while (i<=mid)
            tempArr[k++] = arr[i++];
        while (j<= ei)
            tempArr[k++] = arr[j++];
        for(k=0,i=si; k < tempArr.length; k++, i++)
            arr[i] = tempArr[k];

    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        printArray(arr);
        mergeSort(arr,0, arr.length-1);
        printArray(arr);
    }
}
