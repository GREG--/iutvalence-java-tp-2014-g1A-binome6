import java.awt.*;

import javax.swing.*;

public class Interface implements Runnable {

	public void run() {
		// création de la fenêtre principale
		JFrame fenetre = new JFrame();

		// création des JPanel
		JPanel panneauDroite = new JPanel();
		JPanel panneauGauche = new JPanel();
		JPanel panneauHaut = new JPanel();
		JPanel panneauBas = new JPanel();
		JPanel grille = new JPanel();
		JPanel ligneBouton = new JPanel();
		JPanel tableau =new JPanel();

		// création d'un bouton
		JButton bouton = new JButton("colonne 1");
		JButton bouton1 = new JButton("colonne 2");
		JButton bouton2 = new JButton("colonne 3");
		JButton bouton3 = new JButton("colonne 4");
		JButton bouton4 = new JButton("colonne 5");
		JButton bouton5 = new JButton("colonne 6");
		JButton bouton6 = new JButton("colonne 7");

		//création d'un JTable
		JTable puissance4 = new JTable();
		
		// réglage de la JFrame
		fenetre.setMinimumSize(new Dimension(800, 600));
		fenetre.setMaximumSize(new Dimension(800, 600));
		fenetre.setTitle("Puissance 4");
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// réglage du panneau haut
		fenetre.getContentPane().add(panneauHaut);
		fenetre.add(panneauHaut, BorderLayout.NORTH);
		panneauHaut.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauHaut.setPreferredSize(new Dimension(0, 75));
		panneauHaut.setBackground(Color.darkGray);

		// réglage du panneau droite

		fenetre.getContentPane().add(panneauDroite);
		fenetre.add(panneauDroite, BorderLayout.EAST);
		panneauDroite.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauDroite.setPreferredSize(new Dimension(650, 425));
		panneauDroite.add(grille);

		// réglage du panneau gauche

		fenetre.getContentPane().add(panneauGauche);
		fenetre.add(panneauGauche, BorderLayout.WEST);
		panneauGauche.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauGauche.setPreferredSize(new Dimension(150, 200));
		panneauGauche.setBackground(Color.darkGray);

		// réglage du panneau bas

		fenetre.getContentPane().add(panneauBas);
		fenetre.add(panneauBas, BorderLayout.SOUTH);
		panneauBas.setBorder(BorderFactory.createLineBorder(Color.black));
		panneauBas.setPreferredSize(new Dimension(0, 75));
		panneauBas.setBackground(Color.darkGray);

		// réglage de la grille
		grille.add(ligneBouton);
		grille.add(puissance4);

		// réglage de la colonne
		ligneBouton.setLayout(new BoxLayout(ligneBouton, BoxLayout.X_AXIS));
		ligneBouton.add(bouton);
		ligneBouton.add(bouton1);
		ligneBouton.add(bouton2);
		ligneBouton.add(bouton3);
		ligneBouton.add(bouton4);
		ligneBouton.add(bouton5);
		ligneBouton.add(bouton6);

	}
}
