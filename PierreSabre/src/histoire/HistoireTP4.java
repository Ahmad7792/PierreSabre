package histoire;

import personnages.Commer�ant;
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
		
//		Commer�ant marco = new Commer�ant("Marco",20);
//		marco.direBonjour();
//		marco.seFaireEstorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
//		yakuza.direBonjour();
//		Commer�ant victime = new Commer�ant("Marco",15);
//		yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
//		yakuza.parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
//		yakuza.extorquer(victime);
//		(Roro) - Bonjour ! Je m�appelle Roro et j�aime boire du shochu.
//		(Roro) - Marco prend ces 6 sous.
//		(Marco) - 6 sous ! Je te remercie g�n�reux donateur!
//		
//		Ronin roro = new Ronin("Roro","shochu",60);
//		Commer�ant marco = new Commer�ant("Marco",10);
//		roro.direBonjour();
//		roro.donner(marco);
//		(Roro) - Je t'ai retrouv� vermine, tu vas payer pour ce que tu as fait � ce pauvre
//		marchand!
//		(Roro) - Je t�ai eu petit yakusa!
//		(Yaku Le Noir) - J�ai perdu mon duel et mes 45 sous, snif... J'ai d�shonor� le clan de
//		Warsong.
		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky",45,"Warsong");
		Ronin roro = new Ronin("Roro","shochu",54);
		roro.provoquer(yakuza);
	}
}
