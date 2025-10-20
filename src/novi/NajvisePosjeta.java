package novi;

	import java.util.Scanner;

	public class NajvisePosjeta {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] posjete = new int[10];

	        // Unos broja posjeta za 10 utakmica
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Unesite broj posjeta za utakmicu " + (i + 1) + ": ");
	            posjete[i] = scanner.nextInt();
	        }

	        // Pronalaženje najvećeg broja posjeta
	        int najvise = posjete[0];
	        for (int i = 1; i < 10; i++) {
	            if (posjete[i] > najvise) {
	                najvise = posjete[i];
	            }
	        }

	        // Ispis rezultata
	        System.out.println("Najvise posjeta u jednom danu: " + najvise);

	        scanner.close();
	    }
	}
