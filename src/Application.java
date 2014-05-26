import javax.swing.SwingUtilities;

/* TODO Package. */

/**
 * TODO.
 * 
 * @author Blanc-Partula
 * @version TODO
 */
public class Application {

	/** TODO. */
	public static void main(String[] args) {
		
		Puissance4 partie = new Puissance4();
		TacheDAffichagePuissance4 affichage = new TacheDAffichagePuissance4(partie);
		partie.associerUneVue(affichage);
		SwingUtilities.invokeLater(affichage);

		partie.jouer();
	}
}