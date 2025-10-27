// // import java.util.*;

// //  public class Arr {
// //     public static void update(int marks[]){
// //         for(int i=0; i<marks.length; i++){
// //             marks[i]=marks[i]+1;
// //         }
       
// //     }
// //     public static void main(String[] args) {
// //         int marks[]={90,45,58};
// //         update(marks);
// //         for(int i=0; i<marks.length; i++){
// //             System.out.print(marks[i] +" ");
// //         }
// //         System.out.println();
       
// //     }
    
// // }



// //LINEAR SEARCH FINDING KEY

// // public class Arr {
// public static int linsearch(int numbers[], int key){
//     for(int i=0; i<numbers.length; i++){
//         if(numbers[i]==key){
//             return i;
//         } 
//     }
//     return -1;
   
// }

// public static void main(String[] args){
//     int numbers[]={2, 4, 8, 10, 12, 14, 16 };
//     int key=11;

//     int index=linsearch(numbers, key);
//     if(index== -1){
//         System.out.println("not found");
//     } else{
//         System.out.println("the key is at the index: "+index);
//     }
// }
//  }



// MAX NUMBER

// public class Arr {

//     public static void main(String[] args) {
//         int num[]={1,2,6,3,5};
//         int max=0;
//         for(int i=0; i<num.length; i++){
//             if(max<num[i]){
//                 max = num[i];
//             }
//         }
//         System.out.println(max);
//     }
// }



// BINARY SEARCH

// public class Arr {

//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10,12};
//         int key=7;
//         int start=0, end=numbers.length-1;
        
//         while (start<=end) {
//             int mid=(start+end)/2;

//             if(numbers[mid]==key){
//                 System.out.println(mid);
//             } if (numbers[mid]<key) {
//                 start=mid+1;
//             } else{
//                 end=mid-1;
//             }
//         }
//         System.out.println("key does not exist");
//     }
// }



// REVERSE AN ARRAY

public class Arr {



    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};

        int first=0, last=numbers.length-1;
        
        while(first<last){
            int temp=numbers[last];
           numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.err.println();       
    }
}