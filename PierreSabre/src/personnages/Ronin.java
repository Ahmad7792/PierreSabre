package personnages;

public class Ronin extends Humain {

	int honneur = 1;
	public Ronin(String nom, String boissonFavorite, int capital) {
		super(nom, boissonFavorite, capital);
		// TODO Auto-generated constructor stub
	}
	public void donner(Commerçant beneficiaire) {
		int ArgentDonne = this.getCapital()/10;
		this.parler(beneficiaire.getNom() + " prends ces "+ ArgentDonne + " sous !");
		this.perdreArgent(ArgentDonne);
		beneficiaire.recevoirArgent(ArgentDonne);
	}
	public void provoquer(Yakuza adversaire) {
		int forceRonin = 2*this.honneur;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (forceRonin >= adversaire.reputation) {
			this.parler("Je t'ai eu petit yakuza !");
			int Gain = adversaire.perdre();
			this.gagnerArgent(Gain);
			this.honneur++;
		}
		else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			this.honneur--;
			int ArgentPerdu = this.getCapital();
			this.perdreArgent(ArgentPerdu);
			adversaire.gagner(ArgentPerdu);
		}
	}

}
