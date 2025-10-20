package novi;
import java.util.Scanner;

public class javavjezbe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        												// Unos dužine niza
        System.out.print("Unesite duzinu niza: ");
        int n = scanner.nextInt();

        double[] bodovi = new double[n];

        									// Unos elemenata niza 
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj bodova za studenta " + (i + 1) + ": ");
            bodovi[i] = scanner.nextDouble();
        }
							// Izračun prosjeka
        double suma = 0;
        for (double b : bodovi) {
            suma += b;
        }
        double prosjek = suma / n;
        
        								// Pronalaženje najmanjeg elementa i indeksa
        double najmanji = bodovi[0];
        int indeksNajmanjeg = 0;
        for (int i = 1; i < n; i++) {
            if (bodovi[i] < najmanji) {
                najmanji = bodovi[i];
                indeksNajmanjeg = i;
            }
        }

        System.out.println("\nRezultati:");
        System.out.printf("Prosjecan broj bodova: %.2f\n", prosjek);
        System.out.println("Najmanji broj bodova: " + najmanji + " (indeks: " + indeksNajmanjeg + ")");

        scanner.close();

        
    }
}
