package novi;

public class AnalizaNiza {
											
	    public static double PPP(int[] niz) {
	        int suma = 0;
	        int broj = 0;

	        for (int el : niz) {
	            if (el > 0 && el % 2 == 0) {				
	                suma += el;
	                broj++;
	            }
	        }

	        if (broj == 0) {
	            System.out.println("U nizu nema pozitivnih parnih brojeva.");
	            return 0;
	        }

	        return (double) suma / broj;
	    }
	

	public static double nadjiParniPozitivniProsjek(int[] niz) {
		// TODO Auto-generated method stub
		return 0;
	}

}
