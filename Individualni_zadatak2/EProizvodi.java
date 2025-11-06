package nedelja_7;

public class EProizvodi {
	private String opis_proizvoda;
	private String sifra_proizvoda;
	private double uvozna_cijena;
	
	//Konstruktor
	public EProizvodi (String opis_proizvoda, String sifra_proizvoda, double uvozna_cijena) {
		this.opis_proizvoda = opis_proizvoda;
		this.sifra_proizvoda = sifra_proizvoda;
		this.uvozna_cijena = uvozna_cijena;
		
	}
		//geteri/seteri
		
		
	

	public String getOpis_proizvoda() {return opis_proizvoda;}
	public void setOpis_proizvoda(String opis_proizvoda) {this.opis_proizvoda = opis_proizvoda;}

	public String getSifra_proizvoda() {return sifra_proizvoda;}
	public void setSifra_proizvoda(String sifra_proizvoda) {this.sifra_proizvoda = sifra_proizvoda;}

	public double getUvozna_cijena() {return uvozna_cijena;}
	public void setUvozna_cijena(double uvozna_cijena) {this.uvozna_cijena = uvozna_cijena;}




	@Override
	public String toString() {
		return "EProizvodi [opis_proizvoda=" + opis_proizvoda + ", sifra_proizvoda=" + sifra_proizvoda
				+ ", uvozna_cijena=" + uvozna_cijena + "]";
	}
	
	public Double MaloprodajnaCijena() {
	return uvozna_cijena;


}}
