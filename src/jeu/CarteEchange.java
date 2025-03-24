package jeu;

import java.util.Random;

public class CarteEchange extends Carte{
	
	Random aleatoire = new Random();
	private int indice=aleatoire.nextInt(5)+1;
	
	public CarteEchange (String nom, String description) {
		super(nom, description, TypeCarte.ECHANGE);
	}
	
	@Override
	public void appliquerEffet(Joueur actuel, Joueur adversaire) {
		Carte tmp =adversaire.getCarteMain(indice);
		adversaire.ajouterCarteMain(indice, actuel.getCarteMain(indice));
		actuel.ajouterCarteMain(indice, tmp);
	}
	
	@Override
	public int getEffet() {
		return indice;
	}


}
