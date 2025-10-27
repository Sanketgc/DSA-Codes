// import java.util.*;
public class practice {
    // public static void bintodec(int binum){
    //     int mynum=binum;
    //     int dec=0;
    //     int pow=0;

    //     while(binum>0){
    //         int ld=binum%10;
    //         dec=dec+(ld * (int)Math.pow(2, pow));

    //         pow++;
    //         binum=binum/10;

    //     }
    //     System.out.print("the decimal form of " +mynum+ " is : " +dec);
    // }
    // public static void main(String[] args) {
    //     bintodec(101);
    // }

    // public static void rightt(int n) {
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
    //     rightt(4);
    // }
    
    // public static void num(int n) {
        
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i)+1; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     num(10);
    // }

    // public static void numb(int n) {
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
    //     numb(5);
    // }

    // public static void triangle(int n) {
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             if ((i+j)%2==0) {
    //                 System.out.print(1);
    //             } else {
    //                 System.out.print(0);
    //             }
    //         }
    //         System.out.println();
    //     }
        
    // }
    // public static void main(String[] args) {
    //     triangle(5);
    // }

    // public static void diam(int n) {
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=n; i>=1; i--){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        
    // }
    // public static void main(String[] args) {
    //     diam(4);
    // }


    public static void solidrhom(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        solidrhom(5);
    }
}


