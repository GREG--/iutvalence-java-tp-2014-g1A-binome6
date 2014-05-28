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

	private final String representation;
	public Color couleur;
	
	Etat(String repr, Color couleur) {
		representation = repr;
		this.couleur = couleur;
	}

	public Color caseCouleur(){
		return this.couleur;
	}
	
	@Override
	public String toString() {
		return this.representation;
	}
}