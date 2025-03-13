package lanceur;

import affichage.IAffichage;
import jeu.Carte;
import jeu.Jeu;
import jeu.Joueur;
import jeu.TypeCarte;

public class Lanceur {
	private final IAffichage affichage;
	private final Jeu jeu;

	public Lanceur(IAffichage affichage, Jeu jeu) {
		this.affichage = affichage;
		this.jeu = jeu;
	}

	public void debut() {
		affichage.afficherBienvenue();
		String nomJoueur1 = affichage.demanderNomJoueur("1");
		String nomJoueur2 = affichage.demanderNomJoueur("2");
		jeu.initialiserJoueurs(nomJoueur1, nomJoueur2);
		affichage.debutJeu();

		while (!jeu.partieTerminee()) {

			Joueur actif = jeu.getJoueurActif();
			Joueur adversaire = jeu.getAdversaire();

			affichage.afficherTour(actif.getNom());
			affichage.afficherMainJoueur(actif);

			int indice = affichage.choisirCarte();
			Carte carte = actif.getCarteMain(indice);

			if (carte.getType() == TypeCarte.ATTAQUE) {
				affichage.carteAttaque(carte);
			} else {
				affichage.cartePopularite(carte);
			}
			jeu.jouerCarte(indice, actif, adversaire);
			carte.appliquerEffet(actif, adversaire);

			jeu.piocherCarte(actif, indice);
			affichage.afficherCarte(actif.getCarteMain(indice));

			affichage.afficherEtatJeu(actif, adversaire);

			if (jeu.partieTerminee()) {
				break;
			} else {
				jeu.inverserJoueurs();
			}
		}
		affichage.vainqueur(jeu.vainqueur());
	}
}
