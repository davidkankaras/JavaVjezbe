package zadaci_rucno;

import java.util.Scanner;

//
public class Zadatak_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("petar je ubrao:");
		int p = sc.nextInt();
		System.out.print("Milos je ubrao:");
		int m = sc.nextInt();
		
		if (p > m) {
		System.out.println("petar je ubrao vise jabuka");
		
		} else {
			System.out.println("milos je ubrao vise jabuka");
		}}}