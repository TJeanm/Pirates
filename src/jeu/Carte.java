package jeu;

//xixhoj-3Botsi-xekjeg

public class Carte {
	private String nom;
	private String description;
	private int modif_popularite;
	private int modif_vie;
	
	public Carte(String nom,String description, int modif_popularite, int modif_vie) {
		this.nom=nom;
		this.description=description;
		this.modif_popularite=modif_popularite;
		this.modif_vie=modif_vie;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getModif_popularite() {
		return modif_popularite;
	}

	public void setModif_popularite(int modif_popularite) {
		this.modif_popularite = modif_popularite;
	}

	public int getModif_vie() {
		return modif_vie;
	}

	public void setModif_vie(int modif_vie) {
		this.modif_vie = modif_vie;
	}
	
	
}
