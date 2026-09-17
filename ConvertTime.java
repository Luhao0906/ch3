import java.util.Scanner;

public class ConvertTime{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("enter how many seconds:");
		int seconds = in.nextInt();
		int hours = seconds/3600;
		int minutes = seconds%3600/60;
		int seconds2 = seconds-(hours*3600)-(minutes*60);
		System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, seconds2);
		
		
		
		}
	}
