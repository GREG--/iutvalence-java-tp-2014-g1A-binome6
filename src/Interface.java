import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Interface implements Runnable {
	
	public void run()
	{
		//création de la fenêtre principale
		JFrame fenetre = new JFrame();
		//titre de la fenêtre
		fenetre.setTitle("Puissance 4");
		//plein écran de la fenêtre
		fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fenetre.setVisible(true);
		
		//création d'un panneau que l'on placera à gauche
		JPanel panneauGauche = new JPanel();
		fenetre.getContentPane().add(panneauGauche);
		fenetre.add(panneauGauche, BorderLayout.LINE_START);
		panneauGauche.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauGauche.setSize(100, 50);
		
		//création d'un panneau que l'on placera à droite
		JPanel panneauDroit = new JPanel();
		fenetre.getContentPane().add(panneauGauche);
		fenetre.add(panneauDroit, BorderLayout.LINE_END);
		panneauDroit.setBorder(BorderFactory.createLineBorder(Color.black));
		
	}
}
