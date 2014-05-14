import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
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
		
		//création d'un panneau que l'on placera en haut
		JPanel panneauHaut = new JPanel();
		fenetre.getContentPane().add(panneauHaut);
		fenetre.add(panneauHaut, BorderLayout.NORTH);
		panneauHaut.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauHaut.setPreferredSize(new Dimension(0,75));
		
		//création d'un panneau que l'on placera à droite
		JPanel panneauDroite = new JPanel();
		fenetre.getContentPane().add(panneauDroite);
		fenetre.add(panneauDroite, BorderLayout.EAST);
		panneauDroite.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//création d'un panneau que l'on placera à gauche
		JPanel panneauGauche = new JPanel();
		fenetre.getContentPane().add(panneauGauche);
		fenetre.add(panneauGauche, BorderLayout.WEST);
		panneauGauche.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauGauche.setPreferredSize(new Dimension(200,200));
		
		//création d'un panneau que l'on placera en bas
		JPanel panneauBas = new JPanel();
		fenetre.getContentPane().add(panneauBas);
		fenetre.add(panneauBas, BorderLayout.SOUTH);
		panneauBas.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauBas.setPreferredSize(new Dimension(0,75));
		
		//création de la colonne n°1 du puissance 4
		JPanel colonne1 = new JPanel();
		colonne1.setLayout(new BoxLayout(colonne1, BoxLayout.PAGE_AXIS));
		colonne1.add(panneauDroite);
		
		//création de la colonne de bouton non clickable
		JButton bouton = new JButton();
		bouton.add(colonne1);
		bouton.setSize(75, 75);
	
	}
}
