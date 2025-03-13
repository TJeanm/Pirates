package jeu;

public class Pioche {
	private Carte[] cartes = new Carte[22];
	private int indexe = 0;
	public Pioche() {
		initializePioche();
	}

	private void initializePioche() {
		cartes = new Carte[22];
		int idx = 0;
		cartes[idx++] = new CartePopularite("Discours Inspirant", "Gagne en popularité.", 1);
		cartes[idx++] = new CartePopularite("Révolte Organisée", "Gagne en popularité.", 1);
		cartes[idx++] = new CartePopularite("Abordage Réussi", "Gagne beaucoup de popularité.", 2);
		cartes[idx++] = new CartePopularite("Poing de Fer", "Gagne en popularité.", 2);
		for (int i = 0; i < 3; i++) {
			cartes[idx++] = new CartePopularite("Discours Inspirant", "Gagne en popularité.", 1);
			cartes[idx++] = new CartePopularite("Révolte Organisée", "Gagne en popularité.", 1);
			cartes[idx++] = new CartePopularite("Abordage Réussi", "Gagne beaucoup de popularité.", 2);
			cartes[idx++] = new CartePopularite("Poing de Fer", "Gagne en popularité.", 2);
		}
		cartes[idx++] = new CarteAttaque("Frappe de Sabre", "Inflige des dégâts à l'adversaire.", 2);
		cartes[idx++] = new CarteAttaque("Explosion de Canon", "Inflige de lourds dégâts à l'adversaire.", 3);
		for (int i = 0; i < 2; i++) {
			cartes[idx++] = new CarteAttaque("Frappe de Sabre", "Inflige des dégâts à l'adversaire.", 2);
			cartes[idx++] = new CarteAttaque("Explosion de Canon", "Inflige de lourds dégâts à l'adversaire.", 3);
		}

	}

	public Carte piocherCarte() {
		if (indexe < cartes.length) {
			return cartes[indexe++];
		}
		return null;
	}
}
