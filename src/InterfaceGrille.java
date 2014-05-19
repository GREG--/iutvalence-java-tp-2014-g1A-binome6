import java.awt.*;
import javax.swing.*;


public class InterfaceGrille {
	private Grille grille;
	
	public InterfaceGrille() {
		grille = new Grille();
	}
	
	public void placerPion(int numColonne){
		grille.placerPion(numColonne, Puissance4.getJoueurCourant());
	}
	
}
