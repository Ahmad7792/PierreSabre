package histoire;

import personnages.Humain;
import personnages.Yakuza;
import personnages.Commer�ant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco",20);
		Ronin roro = new Ronin("Roro","shochu",0);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",0,"Warsong");
		Commer�ant chonin = new Commer�ant("Chonin",40);
		Commer�ant kumi = new Commer�ant("Kumi",10);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sak�", 80);
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissances();
//		akimoto.boire("th�");
////		marco.faireConnaissanceAvec(roro);
////		marco.faireConnaissanceAvec(yaku);
////		marco.faireConnaissanceAvec(chonin);
////		marco.faireConnaissanceAvec(kumi);
////		marco.listerConnaissances();
////		roro.listerConnaissances();
////		yaku.listerConnaissances();
		
//		(Masako) - Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.
//		(Masako) - Si tu veux ma protection contre les Yakuzas, il va falloir payer !
//		Donne-moi 2 sous ou gare � toi !
//		(Kumi) - Tout de suite grand Masako.
//		(Masako) - Si tu veux ma protection contre les Yakuzas, il va falloir payer !
//		Donne-moi 8 sous ou gare � toi !
//		(Chonin) - Tout de suite grand Masako.
//		(Masako) - Si tu veux ma protection contre les Yakuzas, il va falloir payer !
//		Donne-moi 4 sous ou gare � toi !
//		(Marco) - Tout de suite grand Masako.
//		(Akimoto) - Bonjour ! Je m�appelle Akimoto et j�aime boire du sak�.
//		(Akimoto) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Bonjour ! Je m�appelle Masako et j�aime boire du whisky.
//		(Masako) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Mais je suis un tra�tre et mon niveau de tra�trise est : 3. Chut !
//		(Masako) - Mince je ne peux plus ran�onner personne sinon un samoura� risque de
//		me d�masquer !
//		(Masako) - Bonjour ! Je m�appelle Masako et j�aime boire du whisky.
//		(Masako) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Mais je suis un tra�tre et mon niveau de tra�trise est : 3. Chut !
//		(Yaku Le Noir) - Bonjour ! Je m�appelle Yaku Le Noir et j�aime boire du whisky.
//		(Yaku Le Noir) - Mon clan est celui de Warsong.
//		(Masako) - Il faut absolument remonter ma cote de confiance. Je vais faire ami ami
//		avec Yaku Le Noir.
//		(Masako) - Bonjour l'ami ! Je voudrais vous aider en vous donnant 5 sous.
//		(Yaku Le Noir) - Merci Masako. Vous �tes quelqu'un de bien.
//		(Masako) - Bonjour ! Je m�appelle Masako et j�aime boire du whisky.
//		(Masako) - Je suis fier de servir le seigneur Miyamoto.
//		(Masako) - Mais je suis un tra�tre et mon niveau de tra�trise est : 2. Chut !
//		(Roro) - Bonjour ! Je m�appelle Roro et j�aime boire du shochu.
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
