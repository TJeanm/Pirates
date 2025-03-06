package jeu;

public class Joueur {
	private String nom;
	private int popularite = 0;
	private int vie = 5;
	private Carte[] main = new Carte[5];

	public Joueur(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public int getPopularite() {
		return popularite;
	}

	public void setPopularite(int popularite) {
		this.popularite += popularite;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie += vie;
	}

	public Carte[] getMain() {
		return main;
	}

	public void setMain(int indice, Carte carte) {
		this.main[indice] = carte;
	}

	public Boolean estVivant() {
		return this.getVie() <= 0;
	}

}
