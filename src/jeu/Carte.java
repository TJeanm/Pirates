package jeu;


public abstract class Carte {
	private String nom;
	private String description;
	private TypeCarte type;
	
	protected Carte(String nom,String description, TypeCarte type) {
		this.nom=nom;
		this.description=description;
		this.type=type;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public TypeCarte getType() {
		return type;
	}
	
	public abstract void appliquerEffet(Joueur currentPlayer, Joueur opponent);

	public abstract int getEffet();

}