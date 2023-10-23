package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int capital;
	public Humain(String nom, String boissonFavorite, int capital) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.capital = capital;
	}
	public String getNom() {
		return nom;
	}
	public int getCapital() {
		return capital;
	}
	protected void gagnerArgent(int gain) {
		this.capital+=gain;
	}
	protected void perdreArgent(int perte) {
		this.capital-=perte;
	}
	public void parler(String texte) {
		System.out.println("("+this.nom+") -" + texte);
	}
	public void direBonjour() {
		parler("Bonjour, je m'appelle " + this.nom +" et j'aime boire du " + this.boissonFavorite +".");
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+ this.boissonFavorite + " ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (this.capital >= prix) {
			parler("J'ai " + this.capital + " sous en poche, je vais pouvoir m'offrir " + bien + " à " + prix + " sous."  );
			this.capital-=prix;
		}
		else {
			parler("Je n'ai plus que " + this.capital + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous...");
		}
	}
}
