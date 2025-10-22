package nedelja_6;

import java.util.Scanner;

//provjerite da li je uensena rijec palindrom
public class drugi {
	Scanner sc = new Scanner (System.in);
	
	    public static void main(String[] args) {
	        String rijec = "ana";
	        // mzoe drugacije ali moramo da koristimo stringbuilder
	        
	        
	        StringBuilder sb = new StringBuilder(rijec);
	        String obrnuto = sb.reverse().toString();

	        // Provjera da li su original i obrnuti string isti
	        if (rijec.equalsIgnoreCase(obrnuto)) { // ? "Palindrom : "Nista");
	            System.out.println("Riječ je palindrom.");
	        } else {
	            System.out.println("Riječ nije palindrom.");
	        }
	    }
	}

// String x = sc.nextLine().trim();
// String y = new StringBuilder(x.reverse().toString();
// if(x.equalsIgnoreCse(y)) {
// System.out.println(jeste palindrom)