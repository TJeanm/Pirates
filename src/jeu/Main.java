package jeu;

public class Main {

	private Carte[] cartes = new Carte[5];

	public Carte getCarte(int indice) {
		return cartes[indice];
	}

	public void setCarte(Carte carte, int indice) {
		cartes[indice] = carte;
	}

}
