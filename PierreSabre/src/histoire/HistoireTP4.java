package histoire;

import personnages.Commerçant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String args[]) {
//		Humain prof = new Humain("Prof","Coca-cola",200);
//		prof.acheter("une pizza",12);
//		prof.acheter("un coca", 1);
//		prof.boire();
//		prof.acheter("une PS5", 500);
		Commerçant marco = new Commerçant("Marco",20);
		marco.direBonjour();
		marco.seFaireEstorquer();
		marco.recevoirArgent(15);
		marco.boire();
	}
}
