package jeu;

public class CarteAttaque extends Carte {
		private int degat;

		public CarteAttaque(String nom, String description, int degat) {
			super(nom, description, TypeCarte.ATTAQUE);
			this.degat = degat;
		}

		public int getdegat() {
			return degat;
		}

		@Override
		public void appliquerEffet(Joueur joueur, Joueur adversaire) {
			adversaire.setVie(-degat);
		}
}
