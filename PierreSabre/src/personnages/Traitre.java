package personnages;

public class Traitre extends Samourai {
	private int niveauDeTraitrise = 0;
	public Traitre(String seigneur, String nom, String boissonFavorite, int capital) {
		super(seigneur, nom, boissonFavorite, capital);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traitre et mon niveau de traitrise est de " + this.niveauDeTraitrise + ". Mais chut...");
	}
	public void ranconner(Commerçant commercant) {
		if(this.niveauDeTraitrise <3) {
			int perte = commercant.getCapital() / 5;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + perte + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.nom + " !");
			commercant.perdreArgent(perte);
			this.gagnerArgent(perte);
			this.niveauDeTraitrise++;
		}
		else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	public void faireLeGentil(Humain ami) {
		if (this.nbConnaissances < 1) {
			this.parler("Je ne peux faire ami-ami avec personne car je n'ai aucune connaissance.. snif :'(");
		} else {
			int don = this.getCapital() /20;
			this.parler("Il faut absolument remonter ma note de confiance. Je vais faire ami ami avec " + ami.getNom());
			this.parler("Bonjour l'ami. Je voudrais vous aider en vous donnant " + don + " sous !");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			ami.parler("Merci " + this.nom +", vous etes quelqu'un de bien !");
		}
		if (this.niveauDeTraitrise > 1) {
			this.niveauDeTraitrise--;
		}
	}

}
