import java.awt.event.*;
import javax.swing.*;


public class JButtonPlacerPion extends JButton implements ActionListener {
	private InterfaceGrille grille;
	private int colonneNum;
	private String nomBoutton;
	
	public JButtonPlacerPion(int num,String nom,InterfaceGrille grille){
		this.nomBoutton = nom;
		this.colonneNum = num;
		this.grille = grille;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		grille.placerPion(colonneNum);
		// XXX
	}
}
