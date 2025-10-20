package zadaci_rucno;

import java.util.Scanner;

//
public class Zadatak_23 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("unesite prisustvo");
	int prisustvo = sc.nextInt();
	
	System.out.print("Unesite seminarske radove:");
	int seminarski = sc.nextInt();
	
	if (prisustvo > 75 && seminarski == 1) {
	System.out.println("mozete prisutpiti ispitu:");
	

	} else { 
		System.out.println("ne mzoete pristupiti ispitu");}}}
