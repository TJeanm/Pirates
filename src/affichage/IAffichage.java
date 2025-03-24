package affichage;

import jeu.Carte;

import jeu.Joueur;

public interface IAffichage {
	
	public void afficherBienvenue();

    public String demanderNomJoueur(String numeroJoueur);

    public void distribuerCartes();
    
    public void debutJeu();

    public void afficherMainJoueur(Joueur joueur);
    
    public void afficherTour(String joueur);

    public int choisirCarte();
    
    public void cartePopularite(Carte carte);
    
    public void carteAttaque(Carte carte);
    
    public void carteRoulette(Carte carte);
    
    public void carteRouletteTouchee(Joueur joueur);
    
	public void carteRouletteManquee();
    
    public void afficherCarte(Carte carte);
 
    public void carteEchange(int indice,Carte carte,Joueur actif,Joueur adversaire);
    
    public void afficherEtatJeu(Joueur joueur1,Joueur joueur2);
    
    public void vainqueur(Joueur joueur);
}
