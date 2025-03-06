package lanceur;

import affichage.Affichage;
import jeu.Jeu;

public class Lanceur {
	public static void main(String[] args) {
		Jeu.setAffichage(new Affichage());
		Jeu jeu = new Jeu();
	}
}
