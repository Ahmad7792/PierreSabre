package histoire;

import personnages.Humain;
import personnages.Yakuza;
import personnages.Commerçant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco",20);
		Ronin roro = new Ronin("Roro","shochu",0);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",0,"Warsong");
		Commerçant chonin = new Commerçant("Chonin",40);
		Commerçant kumi = new Commerçant("Kumi",10);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissances();
//		akimoto.boire("thé");
////		marco.faireConnaissanceAvec(roro);
////		marco.faireConnaissanceAvec(yaku);
////		marco.faireConnaissanceAvec(chonin);
////		marco.faireConnaissanceAvec(kumi);
////		marco.listerConnaissances();
////		roro.listerConnaissances();
////		yaku.listerConnaissances();
		
//		(Masako) - Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.
//		(Masako) - Si tu veux ma protection contre les Yakuzas, il va falloir payer !
//		Donne-moi 2 sous ou gare à toi !
//		(Kumi) - Tout de suite grand Masako.
//		(Masako) - Si tu veux ma protection contre les Yakuzas, il va falloir payer !
//		Donne-moi 8 sous ou gare à toi !
//		(Chonin) - Tout de suite grand Masako.
//		(Masako) - Si tu veux ma protection contre les Yakuzas, il va falloir payer !
//		Donne-moi 4 sous ou gare à toi !
//		(Marco) - Tout de suite grand Masako.
//		(Akimoto) - Bonjour ! Je m’appelle Akimoto et j’aime boire du saké.
//		(Akimoto) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Bonjour ! Je m’appelle Masako et j’aime boire du whisky.
//		(Masako) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Mais je suis un traître et mon niveau de traîtrise est : 3. Chut !
//		(Masako) - Mince je ne peux plus rançonner personne sinon un samouraï risque de
//		me démasquer !
//		(Masako) - Bonjour ! Je m’appelle Masako et j’aime boire du whisky.
//		(Masako) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Mais je suis un traître et mon niveau de traîtrise est : 3. Chut !
//		(Yaku Le Noir) - Bonjour ! Je m’appelle Yaku Le Noir et j’aime boire du whisky.
//		(Yaku Le Noir) - Mon clan est celui de Warsong.
//		(Masako) - Il faut absolument remonter ma cote de confiance. Je vais faire ami ami
//		avec Yaku Le Noir.
//		(Masako) - Bonjour l'ami ! Je voudrais vous aider en vous donnant 5 sous.
//		(Yaku Le Noir) - Merci Masako. Vous êtes quelqu'un de bien.
//		(Masako) - Bonjour ! Je m’appelle Masako et j’aime boire du whisky.
//		(Masako) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Mais je suis un traître et mon niveau de traîtrise est : 2. Chut !
//		(Roro) - Bonjour ! Je m’appelle Roro et j’aime boire du shochu.
		Traitre masoko = new Traitre("Miyamoto","Masoko","whisky",86);
		masoko.faireLeGentil(akimoto);
		masoko.ranconner(kumi);
		masoko.ranconner(chonin);
		masoko.ranconner(marco);
		akimoto.faireConnaissanceAvec(masoko);
		masoko.ranconner(chonin);
		masoko.faireConnaissanceAvec(yaku);
		masoko.faireLeGentil(yaku);
		masoko.faireConnaissanceAvec(roro);
	}
}
