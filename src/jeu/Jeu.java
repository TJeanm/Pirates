package jeu;

import affichage.Affichage;

public class Jeu {
	private Joueur joueur1 = new Joueur("Bill Jambe de Bois");
	private Joueur joueur2 = new Joueur("Barbe noire");
	private Carte[]pioche=new Carte[20];
	private int tete=0;
	
	private static Affichage affichage;

	
	
	
	public static Affichage getAffichage() {
		return affichage;
	}



	public static void setAffichage(Affichage affichage) {
		Jeu.affichage = affichage;
	}



	private void distribuerCartes() {
		for (int i=0;i<5;i++) {
			joueur1.setMain(tete,pioche[i]);
			tete+=1;
			joueur2.setMain(tete,pioche[i]);
			tete+=1;
		}
	}
	
	private void jouerCarte(Joueur joueur1,Joueur joueur2,Carte[] main,int indice) {
		joueur1.setPopularite(main[indice].getModifPopularite());
		joueur2.setVie(main[indice].getModifVie());
		piocherCarte(joueur1,indice);
	}
	
	private void piocherCarte(Joueur joueur,int indice) {
		joueur.setMain(indice,pioche[tete]);
	}
	
	
	
}
