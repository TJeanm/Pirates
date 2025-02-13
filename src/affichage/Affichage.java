package affichage;
import java.util.Scanner;


public class Affichage {
	private Scanner sca=new Scanner(System.in);
	public void afficherBienvenue() {
		System.out.println("Bienvenue dans le jeu des pirates");
	}
	
	public String recupererNomJoueur(int numeroJoueur) {
		System.out.println("Entrez le nom du joueur "+numeroJoueur+" : ");
		return sca.next();
	}
	
	public void main(String[] args) {
		
	}
}
