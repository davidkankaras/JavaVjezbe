package zadaci_rucno;

import java.util.Scanner;

// dug zadatak 
public class Zadatak_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int k = sc.nextInt();

		double p1 = sc.nextDouble(), p2 = sc.nextDouble();
		
		int n1 = n - k;
		double ukupno = n1 * p1 + p2 * k;
		double prosjek = ukupno / n;
		
		System.out.printf("%.2f%n", prosjek);
	} 

}
