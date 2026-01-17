package Inheritance;

public class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class circle extends Shape{
    void radius(){
        System.out.println("Circle radius");
    }
    public static void main(String[]args){
        circle r=new circle();
        r.draw();
        r.radius();

    }
}
