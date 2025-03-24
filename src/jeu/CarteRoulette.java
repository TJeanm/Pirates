package jeu;
import java.util.Random;

public class CarteRoulette extends Carte{
	Random aleatoire = new Random();
	
	private int munition1=aleatoire.nextInt(6)+1;
	private int munition2=aleatoire.nextInt(6)+1;
	
	public CarteRoulette(String nom, String description) {
		super(nom, description, TypeCarte.ROULETTE);
	}
	@Override
	public void appliquerEffet(Joueur currentPlayer, Joueur opponent) {
		if (munition1==3) {
			opponent.diminuerVie(5);
		}
		else if(munition2==3){
			opponent.diminuerVie(5);
		}
	}
	
	@Override
	public int getEffet() {
		return munition1;
	}

}
