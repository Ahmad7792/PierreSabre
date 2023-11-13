package personnages;

public class Humain {
	private static int MAX_MEMOIRE = 30;
	protected String nom;
	protected String boissonFavorite;
	private int capital;
	protected int nbConnaissances = 0;
	protected Humain[] memoire;
	public Humain(String nom, String boissonFavorite, int capital) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.capital = capital;
		this.memoire = new Humain[MAX_MEMOIRE];
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
	
	private void memoriser(Humain autreHumain) {
		if (this.nbConnaissances == MAX_MEMOIRE) {
			for(int i=0;i<MAX_MEMOIRE-1;i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[MAX_MEMOIRE - 1] = autreHumain;
		}
		else {
			this.memoire[nbConnaissances] = autreHumain;
			nbConnaissances++;
		}
	}
	
	private void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);		
	}
	
	public void listerConnaissances() {
		if (nbConnaissances > 0) {
			System.out.print("(" +this.nom+ ") -" + "Je connais beaucoup de monde dont : ");
			System.out.print(memoire[0].getNom());
			for (int i=1;i<nbConnaissances;i++) {
				System.out.print(", " + memoire[i].getNom());
			}
			System.out.println(".");
		}
		else {
			this.parler("Je ne connais malheureusement personne.");
		}
	}

}
