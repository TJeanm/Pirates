package jeu;

public class Joueur {
	private String nom;
	private int popularite = 0;
	private int vie = 5;
	private Main main;
	private Carte[] zonePopularite=new Carte[20];
	private int tailleZonePopularite=0;

	public Joueur(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public int getPopularite() {
		return popularite;
	}

	public void augmenterPopularite(int popularite) {
		this.popularite += popularite;
	}

	public int getVie() {
		return vie;
	}

	public void diminuerVie(int vie) {
		this.vie -= vie;
		if (this.vie<0) {
			this.vie=0;
		}
	}

	public Main getMain() {
		return main;
	}
	
	public Carte getCarteMain(int indice) {
		return main.getCarte(indice);
	}
	
	public String getNomCarteMain(int indice) {
		Carte carte= main.getCarte(indice);
		return carte.getNom();
	}

	public Carte[] getZonePopularite() {
		return zonePopularite;
	}

	public int getTailleZonePopularite() {
		return tailleZonePopularite;
	}

	public void ajouterCarteMain(int indice, Carte carte) {
		main.setCarte(carte,indice);
	}
	
	public void ajouterCarteZonePop(Carte carte) {
		zonePopularite[getTailleZonePopularite()]=carte;
		tailleZonePopularite++;
	}

	public Boolean estVivant() {
		return this.getVie() <= 0;
	}
	
	public Boolean estPopulaire() {
		return this.getPopularite() > 5;
	}
	
	

}
