package nedelja_7;

public class Telefoni extends EProizvodi{
	
private String operativni_sistem;
private Double velicina_ekrana;

//kon

public Telefoni(String opis_proizvoda, String sifra_proizvoda, double uvozna_cijena) {
	super(opis_proizvoda, sifra_proizvoda, uvozna_cijena);
	this.operativni_sistem = operativni_sistem;
	this.velicina_ekrana = velicina_ekrana;
	
}

public String getOperativni_sistem() {return operativni_sistem;}
public void setOperativni_sistem(String operativni_sistem) {this.operativni_sistem = operativni_sistem;}

public Double getVelicina_ekrana() {return velicina_ekrana;}
public void setVelicina_ekrana(Double velicina_ekrana) {this.velicina_ekrana = velicina_ekrana;}



@Override
public String toString() {
	return "Telefoni [operativni_sistem=" + operativni_sistem + ", velicina_ekrana=" + velicina_ekrana + "]";
}

/*public Double MaloprodajnaCijena() {
	  double cijena = super.MaloprodajnaCijena();
	  if velicina_ekrana > 6 {
		  cijena = cijena + (cijena * 0.06)}
	  else{
		  return MaloprodajnaCijena;*/
	  
	  
	

}
