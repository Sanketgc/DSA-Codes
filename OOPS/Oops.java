public class Oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.Setcolor("Blue");
        // System.out.println(p1.getColor());
        // p1.Settip(5);
        // System.out.println(p1.getTip());

        Student s1 = new Student("Sanket");
        System.out.println(s1.name);
    }

}

class Pen{
    private String color;
    private int tip;

      String getColor(){
        return this.color;
      }

    void Setcolor(String newColor){
        color = newColor;
    }

    int getTip(){
        return this.tip;
    }

    void Settip(int newtip){
        tip = newtip;
    }

}


// CONSTRUCTOR
class Student{
    String name;
    // int rollno;

    Student(String name){
        this.name = name;
    }
}