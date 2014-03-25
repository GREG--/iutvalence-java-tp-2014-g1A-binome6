import java.util.Scanner;

/* TODO Package. */
/* TODO Javadoc. */
/**
 * @Author : Blanc-Partula
 */
import java.util.Scanner;
public class Grille {
	public Etat joueurCourant;
	public Case grille;

	public void Tour(Etat joueur) {
		this.joueurCourant = joueur;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez indiquer la colonne où vous souhaitez placer votre pion:");
		String numColonneJouer = sc.nextLine();
		System.out.println(numColonneJouer);
	}

	public void jouer() {
		System.out.println(new Case());
		/* Affiche mettre dans application */
		/* Saisir mettre dans application */
		/* Tenter de poser. */
		/* Victoire ? */
	}
	

}
