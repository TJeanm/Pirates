package jeu;

public class Jeu {
	private Joueur joueur1;
	private Joueur joueur2;
	private Carte[]pioche=new Carte[20];
	private int tete=0;
	
	public Jeu(Joueur joueur1, Joueur joueur2){
		this.joueur1=joueur1;
		this.joueur2=joueur2;
	}
	
	public void distribuerCartes() {
		for (int i=0;i<5;i++) {
			joueur1.setMain(tete,pioche[i]);
			tete+=1;
			joueur2.setMain(tete,pioche[i]);
			tete+=1;
		}
	}
	
	public void jouerCarte(Joueur joueur1,Joueur joueur2,Carte[] main,int indice) {
		joueur1.setPopularite(main[indice].getModif_popularite());
		joueur2.setVie(main[indice].getModif_vie());
		piocherCarte(joueur1,indice);
	}
	
	public void piocherCarte(Joueur joueur,int indice) {
		joueur.setMain(indice,pioche[tete]);
	}
	
}
