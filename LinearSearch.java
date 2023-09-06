package practice_programs;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {22, 34, 12, 456, 2, 1, 5, 7};
        int result = search(arr, 12);
        System.out.println((result == -1) ? "item not found" : result);
    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
