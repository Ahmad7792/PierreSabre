package personnages;

public class Commer�ant extends Humain {
	
	public Commer�ant(String nom,int capital) {
		super(nom, "th�", capital);
		
		// TODO Auto-generated constructor stub
	}
	public void recevoirArgent(int argent) {
		this.parler(argent + " sous ! Je te remercie g�n�reux donateur !");
		this.gagnerArgent(argent);
	}
	public int seFaireEstorquer() {
		int ArgentPerdu = this.getCapital();
		this.perdreArgent(ArgentPerdu);
		this.parler("J�ai tout perdu! Le monde est trop injuste...");
		return ArgentPerdu;
	}
}
