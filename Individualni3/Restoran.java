import java.util.ArrayList;
package individalni_3;

public class Restoran {
	private String Naziv;
	private String Adresa;
	private int PIB;
	private ArrayList <Zaposleni> zaposeni;
	
	private Restoran(String naziv, String adresa, int pIB) {
		super();
		Naziv = naziv;
		Adresa = adresa;
		PIB = pIB;
	}

	public String getNaziv() {return Naziv;}
	public void setNaziv(String naziv) {Naziv = naziv;}

	public String getAdresa() {return Adresa;}
	public void setAdresa(String adresa) {Adresa = adresa;}

	public int getPIB() {return PIB;}
	public void setPIB(int pIB) {PIB = pIB;}

	@Override
	public String toString() {
		return "Restoran [Naziv=" + Naziv + ", Adresa=" + Adresa + ", PIB=" + PIB + ", zaposeni=" + zaposeni + "]";
	}
	
	
	
}
