package jeu;

public class CartePopularite extends Carte {
	private int popularite;

	public CartePopularite(String nom, String description, int popularite) {
		super(nom, description, TypeCarte.POPULARITE);
		this.popularite = popularite;
	}

	@Override
	public int getEffet() {
		return popularite;
	}

	@Override
	public void appliquerEffet(Joueur joueur, Joueur adversaire) {
		joueur.augmenterPopularite(popularite);
	}
}
