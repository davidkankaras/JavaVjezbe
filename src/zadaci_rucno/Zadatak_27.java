package zadaci_rucno;
//Dat je šestocifreni broj n (n=abcdef). Provjeriti da li važi a* c + 2 + f = b + d*e

import java.util.Scanner;

public class Zadatak_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ubacite sestrocifreni broj");
		int n = sc.nextInt();
		if (n < 100000 || n > 999999) {
		System.out.print("Broj nije sestocifren");
		
		}else {
			int a = n / 100000;
			int b = (n/10000)%10;
			int c = (n/1000)%10;
			int d = (n/100)%10;
			int e = (n/10)%10;
			int f = n%10;
			
			if (a* c + 2 + f == b + d*e) {
				System.out.println("Vazi");
				
			} else {
				System.out.print("ne vazi");}}}}
			
			
