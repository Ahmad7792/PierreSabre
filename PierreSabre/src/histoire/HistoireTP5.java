package histoire;

import personnages.Humain;

public class HistoireTP5 {
	public static void main(String[] args) {
//		(Marco) - Bonjour ! Je m’appelle Marco et j’aime boire du thé.
//		(Roro) - Bonjour ! Je m’appelle Roro et j’aime boire du shochu.
//		(Marco) - Bonjour ! Je m’appelle Marco et j’aime boire du thé.
//		(Yaku Le Noir) - Bonjour ! Je m’appelle Yaku Le Noir et j’aime boire du whisky.
//		(Marco) - Bonjour ! Je m’appelle Marco et j’aime boire du thé.
//		3
//		TP5 : UML, héritage - surcharge, redéfinition, polymorphisme
//		(Chonin) - Bonjour ! Je m’appelle Chonin et j’aime boire du thé.
//		(Marco) - Bonjour ! Je m’appelle Marco et j’aime boire du thé.
//		(Kumi) - Bonjour ! Je m’appelle Kumi et j’aime boire du thé.
//		(Marco) - Je connais beaucoup de monde dont : Roro, Yaku Le Noir, Chonin, Kumi
//		(Roro) - Je connais beaucoup de monde dont : Marco
//		(Yaku Le Noir) - Je connais beaucoup de monde dont : Marco
		Humain marco = new Humain("Marco","thé",0);
		Humain roro = new Humain("Roro","shochu",0);
		Humain yaku = new Humain("Yaku Le Noir","whisky",0);
		Humain chonin = new Humain("Chonin","thé",0);
		Humain kumi = new Humain("Kumi","thé",0);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
	}
}
