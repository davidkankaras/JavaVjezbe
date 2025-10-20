package novi;
import java.util.Scanner;
import java.util.Arrays;
public class zadatak_4 {
	//zadatak sortiranje niza ovaj nauci
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Unesite duzinu niza: ");
	        int n = scanner.nextInt();

	        int[] niz = new int[n];

	       
	        for (int i = 0; i < n; i++) {
	            System.out.print("Unesite element [" + i + "]: ");
	            niz[i] = scanner.nextInt();
	        }

	     
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	            	
	            	
	                
	            	
	            	if (niz[j] > niz[j + 1]) {
	              
	                	
	                	
	                    int temp = niz[j];
	                    niz[j] = niz[j + 1];
	                    niz[j + 1] = temp;
	                }}}

	  
	        System.out.println("\nSortiran niz (rastuće):");
	        for (int el : niz) {
	            System.out.print(el + " ");
	        }

	        scanner.close();
	    }
	}

	            
	        

	    

