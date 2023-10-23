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

}
