package histoire;

import personnages.Commer�ant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String args[]) {
//		Humain prof = new Humain("Prof","Coca-cola",200);
//		prof.acheter("une pizza",12);
//		prof.acheter("un coca", 1);
//		prof.boire();
//		prof.acheter("une PS5", 500);
//		Commer�ant marco = new Commer�ant("Marco",20);
//		marco.direBonjour();
//		marco.seFaireEstorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
//		(Yaku Le Noir) - Bonjour ! Je m�appelle Yaku Le Noir et j�aime boire du whisky.
//		(Yaku Le Noir) - Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?
//		(Yaku Le Noir) - Marco, si tu tiens � la vie donne moi ta bourse !
//		(Marco) - J�ai tout perdu! Le monde est trop injuste...
//		(Yaku Le Noir) - J�ai piqu� les 15 sous de Marco, ce qui me fait 45 sous dans ma
//		poche. Hi ! Hi !
		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky",30,"Clan des Yakuza");
		yakuza.direBonjour();
		Commer�ant victime = new Commer�ant("Marco",15);
		yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		yakuza.parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		yakuza.extorquer(victime);
	}
}
