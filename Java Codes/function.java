// import java.util.*;

import java.util.Scanner;

public class function {
    // public static void swap(int a,int b) {
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println("a is:" + a);
    //     System.out.println("b is:" + b);
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     swap(a,b);
    // }

//    public static int factorial(int n){
//     int f=1;
//     for(int i=1; i<=n; i++){
//         f=f*i;
//     }
    
//      return f;
//    }
//    public static void main(String[] args) {
//     System.out.println(factorial(4));
//    }

//    public static int bincoeff(int n, int r){
//     int fact_n=factorial(n);
//     int fact_r=factorial(r);
//     int fact_nmr=factorial(n-r);

//     int bincoeff= fact_n/(fact_r*fact_nmr);
//     return bincoeff;

//    }
   
//    public static void main(String[] args) {
//     System.out.println(bincoeff(5,2));
//    }


// public static boolean isprime(int n) {
//     boolean isprime=true;
//     for(int i=2; i<=n-1; i++){
//         if(n%i==0){
//             isprime=false;
//             break;
//         }
//     }
//     return isprime;
    
// }

// PRIMES IN RANGE

// public static boolean isprime(int n) {
//     if(n==2){
//         return true;
//     }
//     boolean isprime=true;
//     for(int i=2; i<=Math.sqrt(n); i++){
//         if(n%i==0){
//             isprime=false;
//             break;
//         }
//     }
//     return isprime;
    
// }
// public static void primeinrange(int n) {
//     for(int i=2; i<=n-1; i++){
//         if(isprime(i)){
//             System.out.print(i+ " ");
//         }
//     }
//     System.out.println();
    
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number: ");
//     int n=sc.nextInt();
//     primeinrange(n);
// }

// BINARY TO DECIMAL

// public static void bintodec(int binum){
//     int mynum=binum;
//     int dec=0;
//     int pow=0;
//     while (binum>0) {
//         int ld=binum%10;
//         dec=dec + (ld *(int) Math.pow(2, pow));

//         pow++;
//         binum=binum/10;
//     }
//     System.out.println("the decimal form of" +mynum+ " is:" +dec);
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter a bynary number");
//     int binum=sc.nextInt();
//     bintodec(binum);
    

// }

// DECIMAL TO BINARY

public static void dectobin(int n) {
    int mynum=n;
    int binum=0;
    int pow=0;

    while(n>0){
        int rem=n%2;
        binum=binum+(rem*(int)Math.pow(10, pow));
        pow++;
        n=n/2;
    }
    System.out.print("the binary form of " +mynum+ " = " +binum);
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a decimal number");
    int n =sc.nextInt();
    dectobin(n);
}

}
