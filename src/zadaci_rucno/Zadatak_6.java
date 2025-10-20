package zadaci_rucno;

import java.util.Scanner;

// Napisati program koji računa kvadrat trinoma(a, b, c) koja za unijete parametre a, b i c računa kvadrat trinoma za unešene parametre. Formula: 𝑎^2 + 𝑏^2 + 𝑐^2 + 2𝑎𝑏 + 2𝑎𝑐 + 2𝑏c.

public class Zadatak_6 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		Double KT = a*a + b*b + c+c + 2*(a*b) + 2*(a*c) + 2*(b*c);
		
		System.out.printf("%.2f%n", KT);
		
	}

}
