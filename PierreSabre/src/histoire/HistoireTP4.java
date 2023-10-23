package histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String args[]) {
//		Humain prof = new Humain("Prof","Coca-cola",200);
//		prof.acheter("une pizza",12);
//		prof.acheter("un coca", 1);
//		prof.boire();
//		prof.acheter("une PS5", 500);
		
//		Commerçant marco = new Commerçant("Marco",20);
//		marco.direBonjour();
//		marco.seFaireEstorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
//		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky",30,"Clan des Yakuza");
//		yakuza.direBonjour();
//		Commerçant victime = new Commerçant("Marco",15);
//		yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
//		yakuza.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
//		yakuza.extorquer(victime);
//		(Roro) - Bonjour ! Je m’appelle Roro et j’aime boire du shochu.
//		(Roro) - Marco prend ces 6 sous.
//		(Marco) - 6 sous ! Je te remercie généreux donateur!
//		
		Ronin roro = new Ronin("Roro","shochu",60);
		Commerçant marco = new Commerçant("Marco",10);
		roro.direBonjour();
		roro.donner(marco);
	}
}
