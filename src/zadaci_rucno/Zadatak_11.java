package zadaci_rucno;

import java.util.Scanner;

// Napisati program za euclide_distance((x1, x2), (y1, y2)) kojom se računa i vraća euklidsko rastojanje izmedju dvije tacke A i B. Tacka A par (x1, y1), dok je tačka B par (x2, y2).

public class Zadatak_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble(), y1 = sc.nextDouble();
		double x2 = sc.nextDouble(), y2 = sc.nextDouble();
		
		double d = Math.hypot(x2 - x1, y2 - y1);
		
		System.out.printf("%.6f%n", d);
		
	}

}
