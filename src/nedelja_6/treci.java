package nedelja_6;

import java.util.Scanner;

public class treci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rijec = sc.nextLine().trim();
		 
		 for(int i = 0; i<rijec.length() - 1; i++) {
			 if (rijec.charAt(i) == rijec.charAt(i + 1)) {
				 System.out.print(rijec.charAt(i));
				 sc.close();
			 return;
		 }}
System.out.printf("Nema ponovljenih karaktera");

sc.close();
	}

}
// String rijec = sc.nextLine();
// boolean nadjeno = false;
//for (int = 0; i<rijec.lenght()-1; i++)) {
//if(rijec.charAt(i +1)) {
//SYtsem.out.println(" + rijec)
//nadjeno=true


// if(!nadjeno){
//System.out.println("Nema povezanih slova")