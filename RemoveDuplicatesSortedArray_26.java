// Question Link    https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicatesSortedArray_26 {
    public static int removeDuplicate(int[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return len;
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[len - 1];
        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int res = removeDuplicate(arr);
        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println(res);
    }

}
