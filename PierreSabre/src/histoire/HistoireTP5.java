package histoire;

import personnages.Humain;

public class HistoireTP5 {
	public static void main(String[] args) {
//		(Marco) - Bonjour ! Je m�appelle Marco et j�aime boire du th�.
//		(Roro) - Bonjour ! Je m�appelle Roro et j�aime boire du shochu.
//		(Marco) - Bonjour ! Je m�appelle Marco et j�aime boire du th�.
//		(Yaku Le Noir) - Bonjour ! Je m�appelle Yaku Le Noir et j�aime boire du whisky.
//		(Marco) - Bonjour ! Je m�appelle Marco et j�aime boire du th�.
//		3
//		TP5 : UML, h�ritage - surcharge, red�finition, polymorphisme
//		(Chonin) - Bonjour ! Je m�appelle Chonin et j�aime boire du th�.
//		(Marco) - Bonjour ! Je m�appelle Marco et j�aime boire du th�.
//		(Kumi) - Bonjour ! Je m�appelle Kumi et j�aime boire du th�.
//		(Marco) - Je connais beaucoup de monde dont : Roro, Yaku Le Noir, Chonin, Kumi
//		(Roro) - Je connais beaucoup de monde dont : Marco
//		(Yaku Le Noir) - Je connais beaucoup de monde dont : Marco
		Humain marco = new Humain("Marco","th�",0);
		Humain roro = new Humain("Roro","shochu",0);
		Humain yaku = new Humain("Yaku Le Noir","whisky",0);
		Humain chonin = new Humain("Chonin","th�",0);
		Humain kumi = new Humain("Kumi","th�",0);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
	}
}
