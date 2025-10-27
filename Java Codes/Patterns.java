import java.util.Scanner;


 public class Patterns {
//     public static void hollow_rectangle(int totrow, int totcol){
//         for(int i=1; i<=totrow; i++){
//             for(int j=1; j<=totcol; j++){
//                 if(i==1 || i==totrow || j==1 || j==totcol){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the num of rows");
//         int totrow=sc.nextInt();
//         System.out.println("enter the num of columns");
//         int totcol=sc.nextInt();
//         hollow_rectangle(totrow, totcol);
//     }

    //INVERTED ROTATED HALF PYRAMID

    // public static void inpyr(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     inpyr(10);
    // }

    // USING NUMBERS

//     public class Patterns {

//     public static void numpyr(int n) {
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         numpyr(10);
//     }
// }
    
    //FLOYDS TRIANGLE

    // public static void tri(int n) {
    //     int counter=1;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(counter+" ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }
        
    // }
    // public static void main(String[] args) {
    //     tri(10);
    // }
    
    //0-1 TRIANGLE
    
    // public static void zero_one_triangle(int n) {
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1 ");
    //             } else{
    //                 System.out.print("0 ");
    //             }
    //         }
    //         System.out.println();
    //     }   
    // }
    // public static void main(String[] args) {
    //     zero_one_triangle(50);
    // }

    //BUTTERFLY

    public static void butterfly(int n) {
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        
         for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    

    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
        
    
    public static void main(String[] args) {
        butterfly(4);
    }

//HOLLOW RHOMBUS

// public static void hollrom(int n) {
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=n; j++){
//             if(i==1 || i==n || j==1 || j==n){
//                 System.out.print("*");
//             } else{
//                 System.out.print(" ");
//             }

//             // System.out.print("*");
//         }
//         System.out.println();
//     }
    
// }
// public static void main(String[] args) {
//     hollrom(7);
//}

//DIAMOND S PATTERN

// public static void diam(int n) {
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=(2*i)-1; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

//     for(int i=n; i<=1; i--){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=(2*i)-1; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

    
    
// }
// public static void main(String[] args) {
//     diam(4);
// }

}


