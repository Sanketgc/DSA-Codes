public class Inheritance {
    
    public static void main(String[] args) {
       Dog dobby = new Dog();
       dobby.legs = 4;
       System.out.println(dobby.legs);
       dobby.eat();
       dobby.breathe();
    }

    static  class Animal{
        String color;

        void eat() {
            System.out.println("Eating...");
        }

        void breathe() {
            System.out.println("breathing...");
        }
    }

    static class Mamal extends Animal{
        int legs;
    }

    static class Dog extends  Mamal{
        String breed;
    }
}
