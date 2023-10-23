package personnages;

public class Commerçant extends Humain {
	
	public Commerçant(String nom,int capital) {
		super(nom, "thé", capital);
		
		// TODO Auto-generated constructor stub
	}
	public void recevoirArgent(int argent) {
		this.parler(argent + " sous ! Je te remercie généreux donateur !");
		this.gagnerArgent(argent);
	}
	public int seFaireEstorquer() {
		int ArgentPerdu = this.getCapital();
		this.perdreArgent(ArgentPerdu);
		this.parler("J’ai tout perdu! Le monde est trop injuste...");
		return ArgentPerdu;
	}
}
