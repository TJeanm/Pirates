package jeu;

//xixhoj-3Botsi-xekjeg
//cuggaN-7jigwu-wygwad

public class Carte {
	private String nom;
	private String description;
	private int modifPopularite;
	private int modifVie;
	
	public Carte(String nom,String description, int modifPopularite, int modifVie) {
		this.nom=nom;
		this.description=description;
		this.modifPopularite=modifPopularite;
		this.modifVie=modifVie;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public int getModifPopularite() {
		return modifPopularite;
	}

	public void setModifPopularite(int modifPopularite) {
		this.modifPopularite = modifPopularite;
	}

	public int getModifVie() {
		return modifVie;
	}

	public void setModifVie(int modifVie) {
		this.modifVie = modifVie;
	}
	
	
}