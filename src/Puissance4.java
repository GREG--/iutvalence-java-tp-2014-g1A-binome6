/* TODO Package. */
import java.util.Scanner;

/**
 * TODO.
 * 
 * @author Blanc-Partula
 * @version TODO
 */
public class Puissance4{
	/** TODO. */
	
	private VuePuissance4 vue;

	public Grille grille;

	public Puissance4() {
		this.vue = null;
		this.grille = grille;
	}

	public void associerUneVue(VuePuissance4 vue)
	{
		this.vue = vue;
	}

	public void jouer() {
		int i = 0;
		while (i <= 0) {

			System.out.println("Veuillez saisir le numéro de colonne");
			Scanner sc = new Scanner(System.in);
			int numScan = sc.nextInt();
			int numLigne = grille.placerPion(numScan);
			System.out.println(grille);
			boolean victoire = grille.verifVictoire(numLigne,numScan,grille.joueurCourant);
			System.out.println(victoire);
			grille.changerJoueurCourant();
			i = i - 1;
			if (victoire==true){
				break;
			}
		}
		System.out.println("Bravo tu as gagné");
	}
}