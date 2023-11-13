package personnages;


public class Yakuza extends Humain {
	String clan;
	int reputation = 0;
	public Yakuza(String nom, String boissonFavorite, int capital,String clan) {
		super(nom, boissonFavorite, capital);
		this.clan = clan;
		// TODO Auto-generated constructor stub
	}
	public void extorquer(Commerçant victime) {
		int ArgentVole = victime.seFaireEstorquer();
		this.gagnerArgent(ArgentVole);
		this.parler("J’ai piqué les "+ArgentVole +" sous de "+ victime.getNom() + ", ce qui me fait " +this.getCapital() +" sous dans ma poche. Hi ! Hi !");
		this.reputation++;
	}
	
	protected int perdre() {
		int ArgentPerdu = this.getCapital();
		this.parler("J’ai perdu mon duel et mes "+ArgentPerdu+" sous, snif... J'ai déshonoré le clan "+ this.clan +"...");
		this.perdreArgent(ArgentPerdu);
		this.reputation-=4;
		return ArgentPerdu;
	}
	protected void gagner(int gain) {
		this.gagnerArgent(gain);;
		this.reputation+=4;
		this.parler("Ce ronin pensait vraiment battre"+this.getNom()+" du clan "+this.clan+ " ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de " + this.clan);
	}
}
