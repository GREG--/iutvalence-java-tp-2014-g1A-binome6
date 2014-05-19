import java.awt.Color;

/* TODO Package. */

/**
 * TODO.
 * 
 * @author Blanc-Partula
 * @version TODO
 */
public enum Etat {
	VIDE(".",Color.WHITE), JOUEUR_1("O",Color.YELLOW), JOUEUR_2("X", Color.RED);

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