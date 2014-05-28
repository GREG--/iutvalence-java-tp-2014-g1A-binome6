import java.awt.Color;

/* TODO Package. */

/**
 * TODO.
 * 
 * @author Blanc-Partula
 * @version TODO
 */
public enum Etat {
	VIDE(".",Color.WHITE), JOUEUR_1("Joueur jaune",Color.YELLOW), JOUEUR_2("Joueur rouge", Color.RED);

	private final String nom;
	public Color couleur;
	
	Etat(String nom, Color couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}

	public Color caseCouleur(){
		return this.couleur;
	}
	
	public String toString(){
		return nom;
		
	}
}