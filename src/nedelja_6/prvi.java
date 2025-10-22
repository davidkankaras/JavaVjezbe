package nedelja_6;

import java.util.Scanner;

//Unijeti recenicu koja sadrzi vise rijeci odvojenih prazninama i oderediti broj rijeci
public class prvi {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	int brojRijeci = 0;
	String recenica = sc.nextLine();
	String regex = "[\s+]"; // jedan ili vise spejsova
	
	String[] rezultat = recenica.trim().split(regex);
	
	for(String s : rezultat) {
		brojRijeci++;
		System.out.print(s);
	}
		System.out.printf("%nBroj rijeci: %d", brojRijeci);
		
		sc.close();
	
}
}
//mozemo ovako ; int brojRijeci = line.trim().isEmpty ? 0 : rijeci.lenght;