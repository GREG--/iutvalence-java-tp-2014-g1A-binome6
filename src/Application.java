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
		SwingUtilities.invokeLater(new Interface());
		Puissance4 partie = new Puissance4();
		partie.jouer();
	}
}