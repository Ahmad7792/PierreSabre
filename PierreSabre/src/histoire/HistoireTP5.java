package histoire;

import personnages.Humain;
import personnages.Yakuza;
import personnages.Commer�ant;
import personnages.Ronin;
import personnages.Samourai;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco",0);
		Ronin roro = new Ronin("Roro","shochu",0);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",0,"Warsong");
		Humain chonin = new Humain("Chonin","th�",0);
		Humain kumi = new Humain("Kumi","th�",0);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sak�", 80);
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissances();
		akimoto.boire("th�");
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissances();
//		roro.listerConnaissances();
//		yaku.listerConnaissances();
	}
}
