package individualni_zadatak;

public class Kombi extends Vozilo {
    private int kapacitetPutnika;

  public Kombi(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, int kapacitetPutnika){
  super(proizvodjac, godinaProizvodnje, kubikaza, boja);
  this.kapacitetPutnika = kapacitetPutnika;
    }

    public int getKapacitetPutnika() {return kapacitetPutnika; }

    @Override
    public String toString() {
        return String.format("%sKapacitet putnika: %d\n", super.toString(), kapacitetPutnika);
    }

  
 public double CijenaRegistracije() {
  double cijena = super.CijenaRegistracije();
if (kapacitetPutnika > 8) {cijena += 30;}
return cijena;
    }}
