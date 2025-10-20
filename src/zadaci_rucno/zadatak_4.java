package zadaci_rucno;

import java.util.Scanner;

//Sportista se na početku treninga zagrijeva tako što trči po ivicama pravougaonog terena dužine d i širine s. Napisati program kojim se određuje koliko metara pretrči sportista dok obiđe teren 4 puta.
public class zadatak_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		double O = 2 * (a + b);
		
		System.out.printf(" %.2f%n", 4 * O);

	}

}
