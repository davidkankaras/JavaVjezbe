package zadaci_rucno;
// Napisati program koji računa površinu i obim pravougaonika na osnovu zadatih dimenzija
import java.util.Scanner;

public class zadatak_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		double P = a * b,  O = 2 * (a + b);
		
		System.out.printf("P=%.2f 0=%.2f%n", P, O);
	}
}
