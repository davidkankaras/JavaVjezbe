package zadaci_rucno;

import java.util.Scanner;

// . Cijena konzole za igre PlayStation 5 je prvo porasla 10%, pa je smanjena 10%. Ako je poznata početna cijena konzole, napisati program koji određuje cijenu nakon tih promjena
public class Zadatak_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	double cijena = sc.nextDouble();
	double cijenaprije = cijena + (cijena * 0.10);
	double cijenaposle = cijenaprije - (cijenaprije * 0.10);
	
	System.out.printf("%.2f%n", cijenaposle);
		
	}

}
