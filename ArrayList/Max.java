
public class Max {

    public static int maximum(int[] arr) {
        int maxint = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxint < arr[i]) {
                maxint = arr[i];
            }
        }
        return maxint;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 400, 50};
        System.out.println(maximum(arr));
    }

}
