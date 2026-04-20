public class DividenConquer{

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    // public static void MergeSort(int arr[], int si, int ei){
    //     if (si >= ei) {
    //         return;
    //     }
    //     int mid = si +(ei-si)/2;
    //     MergeSort(arr, si, mid);
    //     MergeSort(arr, mid+1, ei);
    //     Merge(arr, si,mid, ei);
    // }
    // public static void Merge(int arr[], int si, int mid, int ei){
    //     int temp[] = new int[ei - si + 1];
    //     int i=si;
    //     int j= mid+1;
    //     int k=0;

    //     while( i <=mid && j<=ei){
    //         if(arr[i] < arr[j]){
    //             temp[k] = arr[i];
    //             i++;
    //         } else{
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     while(i <= mid){
    //         temp[k++]= arr[i++];
    //     }

    //     while(j <= ei){
    //         temp[k++] = arr[j++];
    //     }

    //     for(k=0, i=si; k<temp.length; k++, i++){
    //         arr[i] = temp[k];
    //     }
    // }
        
    
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;

        int temp= pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
        }

    public static void main(String[] args) {
        int arr[] ={10,3,9,5,2,8};

        // MergeSort(arr, 0, arr.length-1 );

        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}