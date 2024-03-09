import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int x= rand.nextInt(100)+1;
        boolean num=false;
        int i=5;
        System.out.println("Welcome to the number guessing game "+ "\n" +"Guess a number between 1 and 100. You have 5 tries to guess the number.");
        while(i>0) {
            System.out.println("enter the number : ");
            int usernum = sc.nextInt();
            if (usernum == x) {
                System.out.println("you've guessed the number " + x);
                num=true;
                break;
            } else if (usernum > x) {
                System.out.println("the number you've guessed is too high " + (i - 1) + " tries left");
                i--;
            } else {
                System.out.println("the number you've guessed is too low " + (i - 1) + " tries left");
                i--;
            }

        }
            if(num== false) {
                System.out.println("you're run out of tries");
            }
        System.out.println(x+" was the correct Answer");



    }
}
