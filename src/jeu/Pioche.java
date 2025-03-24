package jeu;

public class Pioche {
	private Carte[] cartes = new Carte[18];
	private int indexe = 0;

	public Pioche() {
		initializePioche();
	}

	private void initializePioche() {
		cartes = new Carte[24];
		int indice = 0;
		cartes[indice++] = new CarteAttaque("Frappe de Sabre", "Inflige 1 de d�g�t � l'adversaire.", 1);
		cartes[indice++] = new CartePopularite("Discours Inspirant", "Gagne 1 de popularit�.", 1);
		cartes[indice++] = new CartePopularite("Mutinerie", "Gagne 1 de popularit�.", 1);
		cartes[indice++] = new CarteEchange("Echange de cartes", "Echange une carte aléatoire avec une carte de votre adversaire.");
		cartes[indice++] = new CarteRoulette("Jeu de la roulette", "Un revolver est chargé d'une munition, pour cinq espaces vides. Vous et votre adversaire jouent.");
		cartes[indice++] = new CarteAttaque("Explosion de Canon", "Inflige 2 de d�g�ts � l'adversaire.", 2);
		cartes[indice++] = new CarteAttaque("Duel au revolver", "Inflige 3 de d�g�ts � l'adversaire.", 3);
		cartes[indice++] = new CartePopularite("Abordage R�ussi", "Gagne 2 de popularit�.", 2);
		cartes[indice++] = new CartePopularite("Partager tr�sor", "Gagne 3 de popularit�.", 3);
		cartes[indice++] = new CarteEchange("Echange de cartes", "Echange une carte aléatoire avec une carte de votre adversaire.");
		cartes[indice++] = new CarteRoulette("Jeu de la roulette", "Un revolver est chargé d'une munition, pour cinq espaces vides. Vous et votre adversaire jouent.");
		cartes[indice++] = new CarteAttaque("Frappe de Sabre", "Inflige 1 de d�g�t � l'adversaire.", 1);
		cartes[indice++] = new CartePopularite("Mutinerie", "Gagne 1 de popularit�.", 1);
		cartes[indice++] = new CarteAttaque("Explosion de Canon", "Inflige 2 de d�g�ts � l'adversaire.", 2);
		cartes[indice++] = new CartePopularite("Abordage R�ussi", "Gagne 2 de popularit�.", 2);
		cartes[indice++] = new CarteEchange("Echange de cartes", "Echange une carte aléatoire avec une carte de votre adversaire.");
		cartes[indice++] = new CarteRoulette("Jeu de la roulette", "Un revolver est chargé d'une munition, pour cinq espaces vides. Vous et votre adversaire jouent.");
		cartes[indice++] = new CarteAttaque("Duel au revolver", "Inflige 3 de d�g�ts � l'adversaire.", 3);
		cartes[indice++] = new CartePopularite("Partager tr�sor", "Gagne 3 de popularit�.", 3);
		cartes[indice++] = new CarteAttaque("Explosion de Canon", "Inflige 2 de d�g�ts � l'adversaire.", 2);
		cartes[indice++] = new CarteAttaque("Frappe de Sabre", "Inflige 1 de d�g�t � l'adversaire.", 1);
		cartes[indice++] = new CartePopularite("Mutinerie", "Gagne 1 de popularit�.", 1);
		cartes[indice++] = new CartePopularite("Abordage R�ussi", "Gagne 2 de popularit�.", 2);
	}

	public Carte piocherCarte() {
		if (indexe < cartes.length) {
			return cartes[indexe++];
		}
		return null;
	}
}
