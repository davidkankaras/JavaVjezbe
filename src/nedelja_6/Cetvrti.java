package nedelja_6;

import java.util.Scanner;

public class Cetvrti {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi riječ: ");
        StringBuilder rijec = new StringBuilder(sc.nextLine());

        String samoglasnici = "aeiouAEIOU";
        int brojSamoglasnika = 0;

        for (int i = 0; i < rijec.length(); i++)
            if (samoglasnici.indexOf(rijec.charAt(i)) != -1)
                brojSamoglasnika++;

        System.out.println("Broj samoglasnika: " + brojSamoglasnika);
        
    	sc.close();
    }


	}


