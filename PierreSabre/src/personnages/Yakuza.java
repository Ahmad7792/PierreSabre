package personnages;


public class Yakuza extends Humain {
	String clan;
	int reputation = 0;
	public Yakuza(String nom, String boissonFavorite, int capital,String clan) {
		super(nom, boissonFavorite, capital);
		this.clan = clan;
		// TODO Auto-generated constructor stub
	}
	public void extorquer(Commer�ant victime) {
		int ArgentVole = victime.seFaireEstorquer();
		this.gagnerArgent(ArgentVole);
		this.parler("J�ai piqu� les "+ArgentVole +" sous de "+ victime.getNom() + ", ce qui me fait " +this.getCapital() +" sous dans ma poche. Hi ! Hi !");
	}
}
