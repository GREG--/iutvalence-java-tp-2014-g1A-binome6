import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class JButtonPlacerPion extends JButton implements ActionListener {
	
	private Grille grille;
	
	private final int colonneNum;
	
	private String nomBoutton;
	
	private ControlePuissance4 controleur;
	
	public JButtonPlacerPion(int num,String nom, Grille grille, ControlePuissance4 controleur){
		super(nom);
		this.controleur = controleur;
		this.colonneNum = num;
		this.grille = grille;
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int ligne = grille.placerPion(colonneNum);
		this.controleur.placerPion(ligne, colonneNum, grille.getJoueurCourant());
		
		if (ligne == -100) {
			//traitement à faire 
			}
			else {
			controleur.placerPion(ligne,colonneNum,grille.getJoueurCourant());
			controleur.changerDeJoueur(grille.getJoueurCourant());

			}
	}
}
