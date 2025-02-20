package jeu;

public class Joueur {
	private String nom;
	private int popularite=0;
	private int vie=5;
	
	public Joueur(String nom) {
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}

	public int getPopularite() {
		return popularite;
	}

	public void setPopularite(int popularite) {
		this.popularite = popularite;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}
	
	
}
