import java.util.ArrayList;


public class Rechnung {
	
	private ArrayList<Artikel> artikelList= new ArrayList<Artikel>();
	
	
	public void addArtikel(Artikel artikel){
		artikelList.add(artikel);
	}
	
	public void drucken(Drucker drucker){
		drucker.drucken(artikelList);
	}
 
	public static void main(String[] args) {
		Rechnung meineRechnung=new Rechnung();
		meineRechnung.addArtikel(new Artikel("Banane",0.39));
		meineRechnung.addArtikel(new Artikel("Gurke",0.49));
		meineRechnung.addArtikel(new Artikel("Toast",0.99));
		meineRechnung.addArtikel(new Artikel("Wasser",0.29));
		meineRechnung.addArtikel(new Artikel("Kaffe",3.49));
		
		meineRechnung.drucken(new HTMLDrucker());
		meineRechnung.drucken(new TextDrucker());
	}
}
