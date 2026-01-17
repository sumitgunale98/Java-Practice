package Inheritance;

public class Room {
    int length=20;
    int width=18;

    int area(){
        return length*width;


    }
}
class classRoom extends Room{
    int benches=30;
    int students=60;
    public static void main(String[]args){
        classRoom cr=new classRoom();
        System.out.println("Room Area "+cr.area()+"Sq.feet");
        System.out.println("Number of benches: "+cr.benches);
        System.out.println("Number of Students: "+cr.students);



    }
}


