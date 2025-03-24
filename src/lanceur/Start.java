package lanceur;

import affichage.IAffichage;
import affichage.Affichage;
import jeu.Jeu;

public class Start {
	public static void main(String[] args) {
		IAffichage affichage = new Affichage();
		Jeu jeu = new Jeu(affichage);
		jeu.jouer();
	}
}
