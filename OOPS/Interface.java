public class Interface {
    
    public static void main(String[] args) {

        Deer d = new Deer();
        d.Eatsmeat();
        d.Eatsplant();

        // Queen q = new Queen();
        // q.move();
    }
    
    // interface ChessPlayer{
    //     void move();
    // }

    // static class Queen implements  ChessPlayer{
    //     public void move(){
    //         System.out.println("up, down, right, left, diagonal (in all 4 dirs)");
    //     }
    // }

    interface Herbivore{
        void Eatsplant();
    }

    interface Carnivores{
        void Eatsmeat();
    }

    static class Deer implements Herbivore, Carnivores{
        
        public void Eatsmeat(){
            System.out.println("Eats meat &");
        }

        public void Eatsplant(){
            System.out.println("Eats plant");
        }
    }
}
