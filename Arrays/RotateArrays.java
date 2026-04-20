
class RotateArrays {

    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if (k > l) {
            k = k % l;
        }

        reverseArray(nums, 0, l - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, l - 1);
    }

    private static void reverseArray(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
