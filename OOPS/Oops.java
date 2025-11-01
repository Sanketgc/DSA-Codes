public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("Blue");
        System.out.println(p1.color);
    }

}

class Pen{
    String color;
    int tip;

    void Setcolor(String newColor){
        color = newColor;
    }

    void Settip(int newtip){
        tip = newtip;
    }

}