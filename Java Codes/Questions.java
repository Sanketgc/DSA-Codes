import java.util.*;
public class Questions {
    // public static double avg(double a,double b,double c) {
    //     return (a+b+c)/3;
        
    // }
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the 3 numbers");
    //     double a=sc.nextDouble();
    //     double b=sc.nextDouble();
    //     double c=sc.nextDouble();
    //     System.out.print(avg(a, b, c));
    // }

//     public static boolean isEven(int n){
//             if(n%2==0){
//             return true;
//         }
//          else{
//             return false;
//     }
// }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(isEven(n));
//         if(isEven(n)){
//             System.out.println("the num is even");
//         } else{
//             System.out.println("the num is not even");
//         }
//     }

public static boolean ispalindrome(int n){
    int palindrome=n;
    int reverse=0;

    while ((palindrome>0)) {
        int reminder=palindrome%10;
        reverse=reverse*10+reminder;
        palindrome=palindrome/10;

}
if (palindrome==reverse) {
    return true;
}
return false;
}

public static void main(String[] args) {
    System.out.println(ispalindrome(10));
    int palindrome=n;
    if (ispalindrome(palindrome)) {
        System.out.println("the number"+palindrome+"is palindrome");
    } else{
        System.out.println("the num "+palindrome+"is not a palindrome");
    }
    
}
}



