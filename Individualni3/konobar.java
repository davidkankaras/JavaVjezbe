package individalni_3;

class Konobar extends Zaposleni {
    private int prekovremeniSati;

    public Konobar(int id, String ime, String prezime, double satnica, int ukupanBrojSati, int prekovremeniSati) {
        super(id, ime, prezime, satnica, ukupanBrojSati);
        this.prekovremeniSati = prekovremeniSati;
    }

    
    
    public int getPrekovremeniSati() {return prekovremeniSati;	}
    public void setPrekovremeniSati(int prekovremeniSati) {this.prekovremeniSati = prekovremeniSati;}



	@Override
    public double izracunajPlatu() {
        double osnovnaSedmicna = getUkupanBrojSati() * getSatnica();
        double prekovremenaSedmicna = prekovremeniSati * getSatnica() * 1.2;
       
        
        return 4 * (osnovnaSedmicna + prekovremenaSedmicna);// plata za 4
}}



