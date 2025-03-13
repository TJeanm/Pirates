package jeu;

import affichage.Affichage;

public class Jeu {
	private Joueur joueur1;
	private Joueur joueur2;
	private Pioche pioche = new Pioche();
	private Joueur joueurActif;
	private Joueur adversaire;
	private Carte zoneAttaque;

	private static Affichage affichage;

	public static Affichage getAffichage() {
		return affichage;
	}

	public Joueur getJoueur1() {
		return joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}

	public Pioche getPioche() {
		return pioche;
	}

	public Joueur getJoueurActif() {
		return joueurActif;
	}

	public Joueur getAdversaire() {
		return adversaire;
	}

	public Carte getZoneAttaque() {
		return zoneAttaque;
	}

	public void initialiserJoueurs(String nomJoueur1, String nomJoueur2) {
		joueur1 = new Joueur(nomJoueur1);
		joueur2 = new Joueur(nomJoueur2);
		distribuerCartes();
		joueurActif = joueur1;
		adversaire = joueur2;
	}

	private void distribuerCartes() {
		for (int i = 0; i < 5; i++) {
			joueur1.ajouterCarteMain(i, pioche.piocherCarte());
			joueur2.ajouterCarteMain(i, pioche.piocherCarte());
		}
	}

	public void jouerCarte(int indice, Joueur joueurActif, Joueur adversaire) {
		Carte carte = joueurActif.getCarteMain(indice);
		if (carte.getType() == TypeCarte.ATTAQUE) {
			zoneAttaque = carte;
		} else {
			joueurActif.ajouterCarteZonePop(carte);
		}
	}

	public void piocherCarte(Joueur joueur, int indice) {
		joueur.ajouterCarteMain(indice, pioche.piocherCarte());
	}

	public void inverserJoueurs() {
		Joueur tmp = joueurActif;
		joueurActif = adversaire;
		adversaire = tmp;
	}

	public boolean partieTerminee() {
		return joueur1.getPopularite() >= 5 || joueur2.getPopularite() >= 5 || joueur1.getVie() <= 0
				|| joueur2.getVie() <= 0;
	}

	public Joueur vainqueur() {
		if (joueur1.getPopularite() >= 5) {
			return joueur1;
		} else if (joueur2.getPopularite() >= 5) {
			return joueur2;
		}
		if (joueur1.getVie() <= 0) {
			return joueur2;
		} else if (joueur2.getVie() <= 0) {
			return joueur1;
		}
		return null;
	}

}
