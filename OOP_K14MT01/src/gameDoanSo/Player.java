package gameDoanSo;

public class Player {

     int Number = 0;

    public void guess() {
        Number = (int) (Math.random()*10);
        System.out.println("I'm guessing" +Number);
    }


    
}