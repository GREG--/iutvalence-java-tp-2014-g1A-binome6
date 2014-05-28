
public interface ControlePuissance4 {

	public void placerPion(int ligne, int colonne, Etat pion);
	
	public void changerDeJoueur (Etat joueur);
	
	public void victoire();

	public void matchNul();

	public void fatalError();
	
}
