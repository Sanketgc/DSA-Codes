
import java.util.Arrays;

public class Min {

    public static int mini(int arr[]) {
        int ans = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }

    public static int[] searchin2d(int arr2[][], int target) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //MAXIMUM NUMBER
    public static int maxi(int arr2[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] > max) {
                    max = arr2[i][j];
                }
            }
        }
        return max;
    }

    //MINIMUN NUMBER
    public static int mini(int arr2[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] < min) {
                    min = arr2[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // int[] arr = {10, 8, 5, 3, -7};
        // System.out.println(mini(arr));

        int[][] arr2 = {
            {10, 5, 8},
            {4, 45, 87},
            {1, 98, 155, 24}
        };
        int target = -8;

        //To search an element in a 2D array
        if (Arrays.toString(searchin2d(arr2, target)).equals("[-1, -1]")) {
            System.out.println("Target not found");
        } else {
            System.out.println(Arrays.toString(searchin2d(arr2, target)));
        }

        //to find max element
        System.out.println(maxi(arr2));

        //to find min value
        System.out.println("The minimunm value is : " + mini(arr2));
    }
}
