package zadaci_rucno;

import java.util.Scanner;

//Otkrili ste algoritam kojim možete doći do šifre koja otvara sef. U sefu se nalazi knjiga koja krije tajne o nastanku univerzuma. Šifra se dobija kada se od kvadrata zbira prve i poslednje cifre četvorocifrenog broja oduzme razlika kvadrata druge i trece cifre.
public class Zadatak_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Math.abs(sc.nextInt());
		
		int a = n/1000, b = (n/100)%10, c = (n/10)%10, d = n%10;
		
		int rez = (int)Math.pow(a + d, 2) - ((int)Math.pow(b, 2) - (int)Math.pow(c, 2));
		
		System.out.println(rez);


	}

}
