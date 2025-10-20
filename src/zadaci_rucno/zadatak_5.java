package zadaci_rucno;

import java.util.Scanner;

// Napisati program koji na osnovu zadate širine i visine lista papira (pravougaonog oblika) u milimetrima određuje njegovu površinu u kvadratnim centimetrima.
public class zadatak_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double SMM = sc.nextDouble(), DMM = sc.nextDouble();
		double PMM = SMM * DMM;
		double PCM = PMM / 100.0;
		
		System.out.printf("%.2f%n",PCM);
		
		
	}

}
