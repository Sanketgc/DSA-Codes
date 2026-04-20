public class LargestElement {
    public static void main(String[] args) {

        // LARGEST 

        // int arr[] ={2,6,1,3,9,5};
        // int largest = arr[0];

        // for(int i=0; i<arr.length; i++){
        //     if(largest < arr[i]){
        //         largest = arr[i];
        //     }
        // }
        // System.out.println("The largest element in the array is: " + largest);


        //SLARGEST

        int arr[] ={2,6,1,3,9,5,11};
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i]>slargest) {
                slargest = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: " + slargest);

    
    }
}
