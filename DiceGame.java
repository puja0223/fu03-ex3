import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
     Random rand = new Random();

     System.out.println("Rolling Dice...");

     int die1 = rand.nextInt(6)+1;
     int die2 = rand.nextInt(6)+1;
     int sum = die1+die2;

     System.out.println("Die 1: " + die1);
     System.out.println("Die 2: " + die2);
     System.out.println("Total Value: " + sum);
        if(sum >=7){
        System.out.println("You won");
     }else {
           System.out.println("You lost");
     }
    }
}
