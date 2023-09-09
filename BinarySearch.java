package practice_programs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 21, 34, 56, 89, 123, 452, 474};
        int num = 22;
        System.out.println(search_Binary(arr, num));
    }

    static int search_Binary(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
