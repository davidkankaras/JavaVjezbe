package zadaci_rucno;

import java.time.LocalDate;
import java.util.Scanner;

// Napisati program koji računa koje godine je rođen Miloš ukoliko je poznato da danas ima N godina.
public class Zadatak_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int year = LocalDate.now().getYear();
		
		System.out.println(year - N);
		

	}

}
