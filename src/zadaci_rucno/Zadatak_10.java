package zadaci_rucno;

import java.util.Scanner;

//Date su koordinate donje desne i gornje lijeve ivice zida (pravougaonik). Napisati program koji računa povrsinu i obim zida.
public class Zadatak_10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double xgl = sc.nextDouble(), ygl = sc.nextDouble();
	double xdd = sc.nextDouble(), ydd = sc.nextDouble();
	double w = Math.abs(xgl - xdd);
	double h = Math.abs(ygl - ydd);
	double P = w*h;
	double O = 2 * (w + h);
	
	System.out.printf("P = %.2f O=%.2f%n", P, O);
	}

}
