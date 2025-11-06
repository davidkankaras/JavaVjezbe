package individalni_3;
	
	public class Zaposleni {
	    private int id;
	    private String ime;
	    private String prezime;
	    private double satnica; // plata po satu
	    private int ukupanBrojSati; // sedmično

	    public Zaposleni(int id, String ime, String prezime, double satnica, int ukupanBrojSati) {
	        this.id = id;
	        this.ime = ime;
	        this.prezime = prezime;
	        this.satnica = satnica;
	        this.ukupanBrojSati = ukupanBrojSati;
	    }

	    
	    public int getId() {return id;} 
	    public void setId(int id) {this.id = id;}

	    public String getIme() {return ime;}
	    public void setIme(String ime) {this.ime = ime;}

		public String getPrezime() {return prezime;}
		public void setPrezime(String prezime) {this.prezime = prezime;}

		public double getSatnica() {return satnica;}
		public void setSatnica(double satnica) {this.satnica = satnica;}

		public int getUkupanBrojSati() {return ukupanBrojSati;}
		public void setUkupanBrojSati(int ukupanBrojSati) {this.ukupanBrojSati = ukupanBrojSati;}


		
		public  double izracunajPlatu() {
			return 0;
		}

	    public void prikaziPodatke() {
	        System.out.println("ID: " + id + ", Ime: " + ime + " " + prezime);
	        System.out.println("Mjesečna plata: " + izracunajPlatu() + " €");
	        
	    }
	}

	




	
	
