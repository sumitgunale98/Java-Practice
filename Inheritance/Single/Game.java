package Inheritance;

public class Game {
   void play(){
       System.out.println("Playing Cricket");

    }
}
class Cricket extends Game{
    int players = 11;
    int overs =20;
    int totalPlayers(){

        return players*2;

    }
    int totalballs(){
        return overs*6;

    }
    public static void main(String[]args){
        Cricket C1=new Cricket();
        C1.play();
        System.out.println("Total Playing Players in cricket Game are: "+C1.totalPlayers());
        System.out.println("Total overs in Game are: "+C1.totalballs());
        C1.totalballs();
    }

}
