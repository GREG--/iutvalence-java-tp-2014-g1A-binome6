/* TODO Package. */
import java.util.Scanner;

/**
 * TODO.
 * 
 * @author Blanc-Partula
 * @version TODO
 */
public class Puissance4 {
	/** TODO. */

	public Etat joueurCourant;
	/* TODO Change en cours de partie ? */
	/** TODO. */
	public Grille grille;

	public Puissance4() {
		this.joueurCourant = Etat.JOUEUR_1;
		this.grille = new Grille();
	}

	public void jouer() {
		int i = 0;
		while (i <= 0) {
			System.out.println("Veuillez saisir le numéro de colonne");
			Scanner sc = new Scanner(System.in);
			int numScan = sc.nextInt();
			grille.placerPion(numScan, joueurCourant);
			System.out.println(grille);
			if (joueurCourant == Etat.JOUEUR_1) {
				joueurCourant = Etat.JOUEUR_2;
			} else {
				joueurCourant = Etat.JOUEUR_1;
			}
			i = i - 1;
			/* Saisir */
			/* Tenter de poser. */
			/* Victoire. */
			/* Saisir mettre dans application */
			/* Tenter de poser. */
			/* Victoire ? */
		}
	}
}