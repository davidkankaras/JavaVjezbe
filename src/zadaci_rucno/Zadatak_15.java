package zadaci_rucno;

import java.util.Scanner;

// napravi program koji za unijetu knjigu daje jos odredjeni popust
public class Zadatak_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cijena = sc.nextDouble();
		double popustprocenat= sc.nextDouble();
		double konacno = cijena * (1 - popustprocenat /100);
		
		System.out.printf("%.2f%n", konacno);
		

	}

}
