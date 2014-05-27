
public class Artikel {
	private String artikelbeschreibung;
	private double einzelpreis;
	
	public Artikel(String artBeschreibung, double einzelpreis){
		this.artikelbeschreibung=artBeschreibung;
		this.einzelpreis = einzelpreis;
	}
	
	public String getArtikelbeschreibung() {
		return artikelbeschreibung;
	}
	
	public double getEinzelpreis() {
		return einzelpreis;
	}

}
