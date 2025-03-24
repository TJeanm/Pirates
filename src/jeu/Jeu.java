package jeu;

import affichage.Affichage;
import affichage.IAffichage;

public class Jeu {
	private Joueur joueur1;
	private Joueur joueur2;
	private Pioche pioche = new Pioche();
	private Joueur joueurActif;
	private Joueur adversaire;
	private Carte zoneAttaque;
	private final IAffichage affichage;
	
	private static Affichage aff;

	
	public Jeu(IAffichage affichage) {
		this.affichage = affichage;
	}

	public static Affichage getAffichage() {
		return aff;
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
	
	public void jouer() {
		affichage.afficherBienvenue();
		String nomJoueur1 = affichage.demanderNomJoueur("1");
		String nomJoueur2 = affichage.demanderNomJoueur("2");
		initialiserJoueurs(nomJoueur1, nomJoueur2);
		affichage.debutJeu();

		while (!partieTerminee()) {

			Joueur actif = getJoueurActif();
			Joueur adversaire = getAdversaire();

			affichage.afficherTour(actif.getNom());
			affichage.afficherMainJoueur(actif);

			int indice = affichage.choisirCarte();
			Carte carte = actif.getCarteMain(indice);
			
			switch(carte.getType()) {
			case TypeCarte.ATTAQUE : 
				affichage.carteAttaque(carte);
				carte.appliquerEffet(actif, adversaire);
				jouerCarte(indice, actif, adversaire);
				piocherCarte(actif, indice);
				affichage.afficherCarte(actif.getCarteMain(indice));
				break;
			case TypeCarte.POPULARITE : 
				affichage.cartePopularite(carte);
				jouerCarte(indice, actif, adversaire);
				piocherCarte(actif, indice);
				affichage.afficherCarte(actif.getCarteMain(indice));
				break;
			case TypeCarte.ROULETTE : 
				affichage.carteRoulette(carte);
				carte.appliquerEffet(actif, adversaire);
				if (adversaire.getVie()<=0) {
					affichage.carteRouletteTouchee(adversaire);
				}
				else if (actif.getVie()<=0) {
					affichage.carteRouletteTouchee(actif);
				}
				else {
					affichage.carteRouletteManquee();
				}
				jouerCarte(indice, actif, adversaire);
				piocherCarte(actif, indice);
				affichage.afficherCarte(actif.getCarteMain(indice));
				break;
			
			case TypeCarte.ECHANGE : 
				int indiceEchange= carte.getEffet();
				jouerCarte(indice, actif, adversaire);
				piocherCarte(actif, indice);
				affichage.carteEchange(indiceEchange,carte,actif,adversaire);
				carte.appliquerEffet(actif, adversaire);
			default :
				break;
				
			}

			affichage.afficherEtatJeu(actif, adversaire);

			if (partieTerminee()) {
				break;
			} else {
				inverserJoueurs();
			}
		}
		affichage.vainqueur(vainqueur());
	}

}
