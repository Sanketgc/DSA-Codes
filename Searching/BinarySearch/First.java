
import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        int[] arr = {-12, 1, 5, 7, 8, 15, 22, 45};
        int target = -12;
        int x = binarysearch(arr, target);
        if (x < 0) {
            System.out.println("Target doesn't exist ");
        } else {
            System.out.println("Target index is : " + x);
        }
    }

    static int binarysearch(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
