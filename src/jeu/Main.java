package jeu;

import affichage.Affichage;

public class Main {
	
	private Carte [] cartes = new Carte [5];

	public static void main(String[] args) {
		Affichage affichage = Jeu.getAffichage();
	}

	public Carte getCartes(int indice) {
		return cartes[indice];
	}

	public void setCartes(Carte carte,int indice) {
		cartes[indice]=carte;
	}
	
	
}
