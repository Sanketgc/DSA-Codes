
public class Abstraction {
    
    public static void main(String[] args) {
        Mustang myhorse = new Mustang();
    }
}

    abstract class Animal{
        Animal(){
            System.out.println("Animal Constructor called");
        }

        void eat(){
            System.out.println("Animal Eats");
        }
        abstract void walk();
    }

     class Horse extends Animal{
        Horse(){
            System.out.println("Horse Constructor called");
        }

        void walk(){
            System.out.println("Walks on 4 legs");
        }
    }

     class Mustang extends Horse{
        Mustang(){
             System.out.println("Mustang Constructor called");
        }

        void walk(){
            System.out.println("walks on 4 legs");
        }
    }

