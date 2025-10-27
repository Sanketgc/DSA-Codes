
import java.util.Arrays;
import java.util.Collections;

public class Countingsort {
    
public static void printarr(Integer arr[]){
    for(Integer i=0; i<arr.length; i++){
        System.out.print(arr[i]+ "");
    }
    System.out.println();
}

    public static void Countingsrt(Integer arr[]){
        int largest = Integer.MIN_VALUE;
        for(Integer i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(Integer i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(Integer i=0; i<count.length; i++){
            while(count[i] >0){
                arr[j] =i;
                j++;
                count[i]--;
            }

        }

    }
    public static void main(String[] args) {
        Integer arr[] = {5,1,3,2,4};

        // Countingsrt(arr);
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        printarr(arr);
    }
}
