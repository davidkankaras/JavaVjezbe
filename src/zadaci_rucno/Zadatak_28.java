package zadaci_rucno;

import java.util.Scanner;



public class Zadatak_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Unesite bodove iz programiranja (student 1): ");
        int p = sc.nextInt();
        System.out.print("Unesite bodove iz matematike (student 1): ");
        int m = sc.nextInt();

        System.out.print("Unesite bodove iz programiranja (student 2): ");
        int p1 = sc.nextInt();
        System.out.print("Unesite bodove iz matematike (student 2): ");
        int m2 = sc.nextInt();

      
        if ((p < 0 || p > 50) || (m < 0 || m > 50) || (p1 < 0 || p1 > 50) || (m2 < 0 || m2 > 50)) {
            System.out.println("Greška: Svi brojevi moraju biti između 0 i 50!");
            return;
        }

      
        int ukupno1 = p + m;
        int ukupno2 = p1 + m2;

       
        if (ukupno1 > ukupno2) {
            System.out.println("Pobjednik je student 1!");
        } else if (ukupno2 > ukupno1) {
            System.out.println("Pobjednik je student 2!");
        } else {
           
            if (p > p1) {
                System.out.println("Pobjednik je student 1 (više poena iz programiranja)!");
            } else if (p1 > p) {
                System.out.println("Pobjednik je student 2 (više poena iz programiranja)!");
            } else {
                System.out.println("Rezultat je neriješen!");
            }
        }

        sc.close();
    }
}


