package jeu;

public class Pioche {
	private Carte[] cartes = new Carte[18];
	private int indexe = 0;

	public Pioche() {
		initializePioche();
	}

	private void initializePioche() {
		cartes = new Carte[18];
		int indice = 0;
		cartes[indice++] = new CarteAttaque("Frappe de Sabre", "Inflige 1 de dégât à  l'adversaire.", 1);
		cartes[indice++] = new CartePopularite("Discours Inspirant", "Gagne 1 de popularité.", 1);
		cartes[indice++] = new CartePopularite("Mutinerie", "Gagne 1 de popularité.", 1);
		cartes[indice++] = new CarteAttaque("Explosion de Canon", "Inflige 2 de dégâts à  l'adversaire.", 2);
		cartes[indice++] = new CarteAttaque("Duel au revolver", "Inflige 3 de dégâts à  l'adversaire.", 3);
		cartes[indice++] = new CartePopularite("Abordage Réussi", "Gagne 2 de popularité.", 2);
		cartes[indice++] = new CartePopularite("Partager trésor", "Gagne 3 de popularité.", 3);
		cartes[indice++] = new CarteAttaque("Frappe de Sabre", "Inflige 1 de dégât à  l'adversaire.", 1);
		cartes[indice++] = new CartePopularite("Mutinerie", "Gagne 1 de popularité.", 1);
		cartes[indice++] = new CarteAttaque("Explosion de Canon", "Inflige 2 de dégâts à  l'adversaire.", 2);
		cartes[indice++] = new CartePopularite("Abordage Réussi", "Gagne 2 de popularité.", 2);
		cartes[indice++] = new CarteAttaque("Duel au revolver", "Inflige 3 de dégâts à  l'adversaire.", 3);
		cartes[indice++] = new CartePopularite("Partager trésor", "Gagne 3 de popularité.", 3);
		cartes[indice++] = new CarteAttaque("Explosion de Canon", "Inflige 2 de dégâts à  l'adversaire.", 2);
		cartes[indice++] = new CarteAttaque("Frappe de Sabre", "Inflige 1 de dégât à  l'adversaire.", 1);
		cartes[indice++] = new CartePopularite("Mutinerie", "Gagne 1 de popularité.", 1);
		cartes[indice++] = new CartePopularite("Abordage Réussi", "Gagne 2 de popularité.", 2);
	}

	public Carte piocherCarte() {
		if (indexe < cartes.length) {
			return cartes[indexe++];
		}
		return null;
	}
}
