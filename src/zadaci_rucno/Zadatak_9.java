package zadaci_rucno;

import java.util.Scanner;

// predug, fudbalski teren
public class Zadatak_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), s = sc.nextInt(), r = sc.nextInt();
		int D = d + 2*r, S = s + 2*r;
		int duzina= 2*(D+S);
		
System.out.println(duzina);
	}

}
