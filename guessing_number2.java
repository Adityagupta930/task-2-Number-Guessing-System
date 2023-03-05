import java.util.Scanner;
import java.util.random.*;
public class guessing_number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min_number = 1;
        int max_number= 100;
        int number =  min_number +(int)(max_number*Math.random());
        int attempt  = 5;
        int guess,i;
        System.out.println("A number is chosen between 1 to 100 guess the number within 5 attempt");
       // System.out.println("Guess the number");
        while (attempt >0){
            System.out.println("Guess the number :");
            guess = Integer.parseInt(sc.next());
            if (number == guess) {
                System.out.println("congrats you guess the number \n you win this game ");
                break;
            }
            else if (number > guess) {
                System.out.println("the number is greater than " + guess +"\nyou have "+ (attempt-1)+" left \n Guess the number Again!");
                attempt--;

            } else if (number < guess) {
                System.out.println("the number is less than " + guess +"\nyou have "+ (attempt-1) +" left \n Guess the number Again!");
                attempt--;
            }
            else{

                System.out.println("you cannot guess the number \nyou loose this game "  );
            }
        }
    }
}
