import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class JButtonPlacerPion extends JButton implements ActionListener {
	
	private Grille grille;
	
	private VuePuissance4 ihm;
	
	private int colonneNum;
	
	private String nomBoutton;
	
	public JButtonPlacerPion(int num,String nom, Grille grille,VuePuissance4 ihm){
		super(nom);
		this.colonneNum = num;
		this.grille = grille;
		this.ihm = ihm;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int ligne = grille.placerPion(colonneNum);
		ihm.notifierChangement(ligne, colonneNum, grille.getPion());
	}
}
