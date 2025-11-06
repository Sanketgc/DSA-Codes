public class Polymorphism{
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2,3));
        // System.out.println(calc.sum((float)2.4, (float)2.5));
        // System.out.println(calc.sum(8,3));

        Deer d = new Deer();
        d.eat();
    }

    //METHOD OVERRIDING

    static class Animal{
        void eat(){
            System.out.println("Eats anything");
        }
    }

    static  class Deer extends Animal{
        void eat(){
            System.out.println("eats grass");
        }
    }


    //Method Overloading
//    static  class Calculator{
//         int sum(int a, int b){
//             return a+b;
//         }
//         float sum(float a, float b){
//             return a+b;
//         }
//     }
}