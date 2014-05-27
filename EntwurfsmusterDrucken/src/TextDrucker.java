import java.util.ArrayList;


public class TextDrucker implements Drucker {

	public void drucken(ArrayList<Artikel> artikelList) {
		for(Artikel artikel: artikelList){
			  System.out.println(artikel.getArtikelbeschreibung()+" "+artikel.getEinzelpreis());
			}

	}

}
