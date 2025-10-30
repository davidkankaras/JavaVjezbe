package individualni_zadatak;

public class Automobil extends Vozilo {

 private int brojVrata;
 private String tipMotora;

 public Automobil(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja,int brojVrata, String tipMotora) {
 super(proizvodjac, godinaProizvodnje, kubikaza, boja); // nasledjivnaje sa superom ovdje
this.brojVrata = brojVrata;
this.tipMotora = tipMotora;
}

 public int getBrojVrata() {return brojVrata; }
public String getTipMotora() {return tipMotora;}

@Override
public String toString() {
    return String.format("%sBroj vrata: %d\nTip motora: %s\n",
            super.toString(), brojVrata, tipMotora);


}


public double izracunajCijenuRegistracije() {
    double cijena = super.CijenaRegistracije(); 
 if (tipMotora.equalsIgnoreCase("dizel")) {cijena += 20;}
 return cijena;
}}



	

	
	

