package nedelja_7;


public class Racunari extends EProizvodi {
	private String procesor;
	private String memorija;
	
	//Kon
	
	public Racunari(String opis_proizvoda, String sifra_proizvoda, double uvozna_cijena) {
		super(opis_proizvoda, sifra_proizvoda, uvozna_cijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}

	// get/set
	public String getProcesor() {return procesor;}
	public void setProcesor(String procesor) {this.procesor = procesor;}

	public String getMemorija() {return memorija;}
	public void setMemorija(String memorija) {this.memorija = memorija;}

	@Override
	public String toString() {
		return "Racunari [procesor=" + procesor + ", memorija=" + memorija + "]";
	}
	
	

}
