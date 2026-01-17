package Inheritance.Hybrid;

public class MediaSystem {
    void play(){
        System.out.println("Play Media");
    }
}
class video extends MediaSystem{
    void quality(){
        System.out.println("HD quality");
    }
}
class movie extends video{
    public static void main(String[]args){
        movie m=new movie();
        m.play();
        m.quality();
        System.out.println("Movie is Playing");

    }
}
class music extends video{
    void musicplay(){
        System.out.println("Play Music");
    }
}
