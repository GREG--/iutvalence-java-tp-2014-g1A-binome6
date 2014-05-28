import java.awt.*;

import javax.swing.*;

public class TacheDAffichagePuissance4 implements Runnable, ControlePuissance4 {
	private JButton[][] bouton;
    private Grille grille = new Grille();
	private JFrame fenetre = new JFrame();
	private JLabel etiquette = new JLabel();
	
	public TacheDAffichagePuissance4() {
		// TODO Auto-generated constructor stub
	}
	
    private void initialiserIHM()
    {
		// création des JPanel
    	JSplitPane panneauJoueur = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JSplitPane panneauGrille = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		JPanel ligneBouton = new JPanel();
		JPanel tableau =new JPanel();
		
		etiquette.setBackground(Etat.JOUEUR_1.caseCouleur());
		etiquette.setText(Etat.JOUEUR_1.toString());
		etiquette.setOpaque(true);
		//
        tableau.setLayout(new GridLayout(Grille.NOMBRE_DE_LIGNES,Grille.NOMBRE_DE_COLONNES));
        
        bouton = new JButton[Grille.NOMBRE_DE_LIGNES][Grille.NOMBRE_DE_COLONNES];
        
        for(int i=0; i<Grille.NOMBRE_DE_LIGNES; i++)
        for(int j=0; j<Grille.NOMBRE_DE_COLONNES; j++)
        {
            tableau.add(bouton[i][j]=new JButton());
        	bouton[i][j].setEnabled(false);
        	bouton[i][j].setBackground(Color.WHITE);
        }

        
		// création d'un bouton
		JButtonPlacerPion bouton1 = new JButtonPlacerPion(0,"colonne 1", grille, this);
		JButtonPlacerPion bouton2 = new JButtonPlacerPion(1,"colonne 2", grille, this);
		JButtonPlacerPion bouton3 = new JButtonPlacerPion(2,"colonne 3", grille, this);
		JButtonPlacerPion bouton4 = new JButtonPlacerPion(3,"colonne 4", grille, this);
		JButtonPlacerPion bouton5 = new JButtonPlacerPion(4,"colonne 5", grille, this);
		JButtonPlacerPion bouton6 = new JButtonPlacerPion(5,"colonne 6", grille, this);
		JButtonPlacerPion bouton7 = new JButtonPlacerPion(6,"colonne 7", grille, this);
		
		panneauJoueur.add(etiquette);
		panneauJoueur.add(panneauGrille);
		panneauJoueur.setEnabled(false);
		panneauJoueur.setBorder(null);
		panneauJoueur.setDividerSize(0);
		panneauJoueur.setResizeWeight(0.0);
		//création et réglage du panel 
    	panneauGrille.add(ligneBouton);
    	panneauGrille.add(tableau);
    	
		// réglage de la JFrame
		fenetre.setResizable(false);
		fenetre.setSize(new Dimension(630, 700));
		fenetre.setTitle("Puissance 4");
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// réglage du panneau droite
		fenetre.getContentPane().add(panneauJoueur);
		fenetre.add(panneauJoueur);
		// Désactivation de la séparation (elle restera figée)
		panneauGrille.setEnabled(false);
		// Désactivation de la bordure
		panneauGrille.setBorder(null);
		// Réduction de la taille du séparateur (il devient invisible)
		panneauGrille.setDividerSize(0);
		// Maximisation relative de la partie haute
		// (la partie basse prend la place minimale)
		panneauGrille.setResizeWeight(0.0);

		// réglage de la colonne
		ligneBouton.setLayout(new BoxLayout(ligneBouton, BoxLayout.X_AXIS));
		ligneBouton.add(bouton1);
		ligneBouton.add(bouton2);
		ligneBouton.add(bouton3);
		ligneBouton.add(bouton4);
		ligneBouton.add(bouton5);
		ligneBouton.add(bouton6);
		ligneBouton.add(bouton7);
	}   
    
    @Override
    public void run(){
    	initialiserIHM();
    }

	@Override
	public void placerPion(int ligneNum, int colonneNum, Etat pion) {
		this.bouton[ligneNum][colonneNum].setBackground(pion.caseCouleur());
	}

	@Override
	public void changerDeJoueur(Etat joueur) 
		{
		if(joueur==Etat.JOUEUR_1){
			grille.setJoueurCourant(Etat.JOUEUR_2);
			etiquette.setBackground(Etat.JOUEUR_2.caseCouleur());
			etiquette.setText(Etat.JOUEUR_2.toString());
		}
		else
		{
			grille.setJoueurCourant(Etat.JOUEUR_1);
			etiquette.setBackground(Etat.JOUEUR_1.caseCouleur());
			etiquette.setText(Etat.JOUEUR_1.toString());
		}
	}

	@Override
	public void victoire() {
		// TODO Auto-generated method stub
		int rejouer = JOptionPane.showConfirmDialog(fenetre, "Felicitation "+grille.getJoueurCourant()+", vous avez gagné! \nVoulez vous rejouer ?", "Félicitation !", JOptionPane.YES_NO_OPTION);
		if (rejouer== JOptionPane.OK_OPTION)
		{
		fenetre.dispose();
		Application.main(null);

		}

		else
		{
		fenetre.dispose();	
		}
	}

	@Override
	public void matchNul() {
		int rejouer = JOptionPane.showConfirmDialog(fenetre, "Vous avez bien joué, mais vous avez fait match nuls \nVoulez vous rejouer ?", "Match Nul", JOptionPane.YES_NO_OPTION);
		if (rejouer== JOptionPane.OK_OPTION)
		{
		fenetre.dispose();
		Application.main(null);

		}

		else
		{
		fenetre.dispose();	
		}
	}

	@Override
	public void fatalError() {
		fenetre.dispose();
		
	}
	

}
