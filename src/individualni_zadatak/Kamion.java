package individualni_zadatak;

public class Kamion extends Vozilo {
    private double kapacitetTereta;
    private boolean imaPrikolicu;

 public Kamion(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, double kapacitetTereta, boolean imaPrikolicu) {
 super(proizvodjac, godinaProizvodnje, kubikaza, boja);
 this.kapacitetTereta = kapacitetTereta;
 this.imaPrikolicu = imaPrikolicu;
    }

 public double getKapacitetTereta() {return kapacitetTereta;}

 public boolean getImaPrikolicu() {return imaPrikolicu; }

    @Override
    public String toString() {
        return String.format("%sKapacitet tereta: %.1f t\nPrikolica: %s\n",
                super.toString(), kapacitetTereta, (imaPrikolicu ? "Da" : "Ne"));
    }


//ovo je kao sa proslog casa sot je pavle uradio sa znakom lakse je tako


public double CijenaRegistracije() {
    double cijena = super.CijenaRegistracije();
 if (imaPrikolicu) {cijena += 50;}
return cijena;
}}
