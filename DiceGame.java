import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
     Random rand = new Random();
     Scanner sc = new Scanner(System.in);

     System.out.println("What is your name ?");
     String name = sc.nextLine();
     System.out.println("Hello," + name + "!");
       
     
     System.out.println("Rolling Dice...");

     int die1 = rand.nextInt(6)+1;
     int die2 = rand.nextInt(6)+1;
     int sum = die1+die2;

     System.out.println("Die 1: " + die1);
     System.out.println("Die 2: " + die2);
     System.out.println("Total Value: " + sum);
    }
}