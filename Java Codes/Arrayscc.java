// 1

// public class Arrayscc {
//     public static void update(int marks[], int unchangable){
//         unchangable =10;

//         for(int i=0; i< marks.length; i++){
//             marks[i]= marks[i]+1;

//         }
//     }
//     public static void main (String [] args){
//         int marks[]= {90, 95, 88};
//         int unchangable =5;
//         update(marks, unchangable);

//         System.out.println(unchangable);


//         for(int i=0; i<= marks.length; i++){
//             System.out.print(marks[i] + " ");

//         }
//         System.out.println();
//     }
// }


//2

// public class Arrayscc
// {
// public static void Getlargest(int numbers[]){
//     int largest = Integer.MIN_VALUE;
//     int smallest = Integer.MAX_VALUE;

//     for(int i=0; i<numbers.length; i++){                                                                                                                                                
//         if(largest < numbers[i]){
//             largest = numbers[i];
//         }
//         if(smallest> numbers[i]){
//             smallest = numbers[i];
//         }
//     }
//    System.out.println("The largest number is: " + largest);
//    System.out.println("The smallest number is: " + smallest);
// }

//     public static void main(String[] args) {
//         int numbers[] ={10, 5, 68, 4, 96,103, 13};

//         Getlargest(numbers);

//     }
// }


// 3

// public class Arrayscc{

//     public static int binarysearch(int numbers[], int key){
//         int start =0;
//         int end = numbers.length -1;

//         while(start <= end){
//             int mid = (start + end) /2;

//             if(numbers[mid] == key){
//                 return mid;
//             } 
//             if(numbers[mid] < key){
//                 start = mid+1;
//             } else{
//                 end = mid - 1;
//             }
            
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1, 2, 4, 5, 6, 8, 9, 10, 12};
//         int key = 5;

//         System.out.println("The key is at index: " + binarysearch(numbers, key));
//     }
// }


//PAIRS
// public class Arrayscc{

//     public static void printpairs(int numbers[]){
//         int tp =0;
//         for(int i=0; i<numbers.length; i++){
//             int curr = numbers[i];

//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("(" + curr + "," + numbers[j] + ")" );
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = " +tp);

        
//     }
//     public static void main(String[] args) {
//         int numbers[] ={ 1,2,3,4,5,6};

//         printpairs(numbers);
//     }
// }



// class Arrayscc{

//     public  static  void subarrays(int numbers[]){
//         int minSub = Integer.MIN_VALUE;
//         int maxSub = Integer.MAX_VALUE;
//         int sa=0;
//         for(int i=0; i< numbers.length; i++){
//             int start = i;

//             for(int j=i; j< numbers.length; j++){
//                 int end = j;
            
//                 int subSum=0;
//             for(int k= start; k<= end; k++){
//                 System.out.print(numbers[k]+" ");
//                 subSum += numbers[k];
//             }
//             System.out.println("=> Sum: " + subSum);
//             sa++;
//             System.out.println();

//             if(subSum < maxSub) maxSub= subSum;
//             if(subSum > minSub) minSub= subSum;

//         }
//         System.out.println();
//         }
//         System.out.println("total subarrays are : " +sa);
//         System.out.println("Maximum subarray sum is: " + maxSub);
//         System.out.println("Minimum subarray sum is: " + minSub);
        
//     }
//     public static void main(String[] args) {
//         int numbers[] ={2,5,9,11,36,3 };

//         subarrays(numbers);
//     }
// }


//REVERSE ARRAY

// class Arrayscc{

//     public  static  void revarray(int numbers[]){
//         int first =0, last =numbers.length-1;

//         while(first < last){
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first ++;
//             last --;
//         }
//     }

//      public static void main(String[] args) {
//         int numbers[] ={2,4,6,8,10};
//         revarray(numbers);

//         for(int i=0; i< numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//     }
        
//     }


// DUPLICATE ELEMENTS
//     class Arrayscc{

//     public  static  void duplicate(int numbers[]){

//         for(int i=0; i<numbers.length; i++){
//             for(int j=i+1; j<numbers.length; j++){
//                 if(numbers[j] == numbers[i]){
//                     System.out.println("Duplicate found: " + numbers[i]);
//                     return;
//                 }
//             }
//         }
//         System.out.println("No duplicates found.");
//     }
//      public static void main(String[] args) {
//         int numbers[] ={2,5, 6,1 };

//         duplicate(numbers);
//     }
// }



// TRAPPED WATER

class Arrayscc{
    public static int water(int heights[]){
        int n= heights.length;
       

        // LEFTMAX
        int leftmax[] = new int[n];
        leftmax[0] = heights[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(heights[i], leftmax[i-1]);
        }

        //RIGHT MAX

        int rightmax[] = new int[n];
        rightmax[n-1] = heights[n-1];

        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(heights[i], rightmax[i+1]);
        }

        //LOOP

         int trappedwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - heights[i];
        }
       return trappedwater;
    }


    public static void main(String[] args) {
        int heights[] ={1,3,0,4};

        System.out.print(water(heights));
    }
}


