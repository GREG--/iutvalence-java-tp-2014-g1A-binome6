import java.awt.*;

import javax.swing.*;


public class Interface implements Runnable {
	
	public void run()
	{
		//création de la fenêtre principale
		JFrame fenetre = new JFrame();
		
		//création des JPanel
		JPanel panneauDroite = new JPanel();
		JPanel panneauGauche = new JPanel();
		JPanel panneauHaut = new JPanel();
		JPanel panneauBas = new JPanel();
		JPanel grille = new JPanel();
		JPanel colonne1 = new JPanel();
		
		//création d'un bouton
		JButton bouton= new JButton("boutton 1");
		JButton bouton1= new JButton("boutton 2");

		//réglage des bouttons
		bouton.setEnabled(false);
		bouton1.setEnabled(false);
		bouton.setSize(new Dimension(100,100));
		bouton1.setSize(new Dimension(100,100));
		
		//réglage de la JFrame
		fenetre.setMinimumSize(new Dimension(800,600));
		fenetre.setMaximumSize(new Dimension(800,600));
		fenetre.setTitle("Puissance 4");
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//réglage du panneau haut
		fenetre.getContentPane().add(panneauHaut);
		fenetre.add(panneauHaut, BorderLayout.NORTH);
		panneauHaut.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauHaut.setPreferredSize(new Dimension(0,75));
		panneauHaut.setBackground(Color.darkGray);
		
		//réglage du panneau droite

		fenetre.getContentPane().add(panneauDroite);
		fenetre.add(panneauDroite, BorderLayout.EAST);
		panneauDroite.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauDroite.setPreferredSize(new Dimension(600,425));
		panneauDroite.add(grille);
		
		//réglage du panneau gauche

		fenetre.getContentPane().add(panneauGauche);
		fenetre.add(panneauGauche, BorderLayout.WEST);
		panneauGauche.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauGauche.setPreferredSize(new Dimension(200,200));
		panneauGauche.setBackground(Color.darkGray);
		
		//réglage du panneau bas
		
		fenetre.getContentPane().add(panneauBas);
		fenetre.add(panneauBas, BorderLayout.SOUTH);
		panneauBas.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauBas.setPreferredSize(new Dimension(0,75));
		panneauBas.setBackground(Color.darkGray);

		//réglage de la grille
		grille.add(colonne1);
		
		//réglage de la colonne
		colonne1.setLayout(new BoxLayout(colonne1, BoxLayout.Y_AXIS));
		colonne1.add(bouton);
		colonne1.add(bouton1);
		
	}
}
