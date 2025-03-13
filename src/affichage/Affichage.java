package affichage;

import java.util.Scanner;

import jeu.Carte;
import jeu.Joueur;

public class Affichage implements IAffichage {

	private Scanner scanner = new Scanner(System.in);

	public void afficherBienvenue() {
		System.out.println("Bienvenue dans le jeu des pirates\n");
	}

	public String demanderNomJoueur(String numeroJoueur) {
		System.out.print("Entrez le nom du joueur " + numeroJoueur + " : ");
		return scanner.next();
	}

	public void distribuerCartes() {
		System.out.println("\nDistribution des cartes...");
	}

	public void debutJeu() {
		System.out.println("\nDébut du jeu !");
	}

	public void afficherMainJoueur(Joueur joueur) {
		System.out.println("\nMain de " + joueur.getNom() + " :");
		for (int i = 0; i < 5; i++) {
			System.out.println("\nCarte " + (i + 1) + " : " + joueur.getNomCarteMain(i) + " : "
					+ joueur.getDescriptionCarteMain(i));
		}
	}

	public void afficherTour(String joueur) {
		System.out.println("\nAu tour de " + joueur + "\n");
	}

	public int choisirCarte() {
		int choix = -1;
		while (choix < 1 || choix > 5) {
			System.out.print("\nChoisissez une carte (1-5) : ");
			if (scanner.hasNextInt()) {
				choix = scanner.nextInt();
				if (choix < 1 || choix > 5) {
					System.out.println("Choix invalide, veuillez entrer un nombre entre 1 et 5.");
				}
			} else {
				System.out.println("Entrée invalide, veuillez entrer un nombre.");
				scanner.next();
			}
		}
		return choix - 1;
	}

	public void cartePopularite(Carte carte) {
		System.out.println("Vous avez choisi la carte " + carte.getNom() + " : " + carte.getDescription()
				+ ". Votre popularité à  augmenté de " + carte.getEffet() + "\n");
	}

	public void carteAttaque(Carte carte) {
		System.out.println("Vous avez choisi la carte " + carte.getNom() + " : " + carte.getDescription()
				+ ". Votre popularité à  augmenté de ;" + carte.getEffet() + "\n");
	}

	public void afficherEtatJeu(Joueur joueur1, Joueur joueur2) {
		System.out.println("\nEtat acuel du jeu : \n");
		System.out.println(joueur1.getNom() + " : Vie : " + joueur1.getVie() + " points de vie, Popularite : "
				+ joueur1.getPopularite() + " points de popularite\n");
		System.out.println(joueur2.getNom() + " : Vie : " + joueur2.getVie() + " points de vie, Popularite : "
				+ joueur2.getPopularite() + " points de popularite\n");
	}

	public void vainqueur(Joueur joueur) {
		System.out.println("Fin du jeu, vainqueur : " + joueur.getNom());
	}

	public void afficherCarte(Carte carte) {
		System.out.println("Vous avez pioché la carte " + carte.getNom() + " : " + carte.getDescription());
	}

	public static void main(String[] args) {
		//
	}

}
