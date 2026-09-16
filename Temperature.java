import java.util.Scanner;

public class Temperature{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius:");
		double C = in.nextDouble();
		double F = C*9/5+32;
		System.out.printf("%.1f c = %.1f f", C, F);
		
		}
	}
