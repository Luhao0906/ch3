import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
	public static void main(String[] args){
		Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("Can you guess what it is?");
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number:");
        int number2 = in.nextInt();
        System.out.print("Your guess is");
        System.out.println(number2);
        System.out.print("The number I was thinking of is:");
		System.out.println(number);
		int number3 = number-number2;
		System.out.print("You were off by:");
		System.out.println(Math.abs(number3));
		
		
	}
}
