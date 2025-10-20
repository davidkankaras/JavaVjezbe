package zadaci_rucno;

import java.util.Scanner;

// Napisati program koji računa razliku kvadrata za zadate vrijednosti a i b.
public class zadatak_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble();
		
		System.out.println(a*a - b*b);

	}

}
