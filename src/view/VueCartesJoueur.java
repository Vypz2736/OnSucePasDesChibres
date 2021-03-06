/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controleur.Controleur;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.*;

/**
 *
 * @author Vypz
 */
public class VueCartesJoueur extends JPanel {
    
    private Joueur j;
    private ArrayList<Joueur> aj;
    private HashMap<Joueur,VueCartes> panels = new HashMap();
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private Controleur c;
    private ArrayList<JPanel> pvide = new ArrayList();
    private ArrayList<JLabel> labels = new ArrayList();
    
    public VueCartesJoueur(Joueur joueur, ArrayList<Joueur> joueurs, Controleur controleur) {
        j = joueur;
        aj = joueurs;
        c = controleur;
        setLayout(new GridLayout(2*aj.size(),1));
        images();
    }
    
    public void images() {
        this.removeAll();
        panels.clear();
        pvide.clear();
        labels.clear();
        for (int i = 0; i < aj.size(); i++) {
            pvide.add(new JPanel(new BorderLayout()));
            this.add(pvide.get(i));
            setForeground(Color.white);
            labels.add(new JLabel("Cartes de " + aj.get((aj.indexOf(j)+i) % aj.size()).getNom()));
            labels.get(i).setForeground(Color.white);
            pvide.get(i).add(labels.get(i));
            labels.get(i).setBorder(BorderFactory.createEmptyBorder((int)dim.getWidth()/100, (int)dim.getWidth()/150, 0, 0));
            pvide.get(i).setBackground(new Color(0,0,0,0));
            panels.put(aj.get((aj.indexOf(j)+i) % aj.size()),new VueCartes(aj,aj.get((aj.indexOf(j)+i) % aj.size()),aj.get((aj.indexOf(j)+i) % aj.size()).getAventurier().getCartes(), c));
            panels.get(aj.get((aj.indexOf(j)+i) % aj.size())).setBackground(new Color(0,0,0,0));
            this.add(panels.get(aj.get((aj.indexOf(j)+i) % aj.size())));
        }
    }
    
    public void fintour() {
        j = aj.get(((aj.indexOf(j)+1) % aj.size()));
        images();
    }
    
    public void setCliquable(Joueur joueur, ArrayList<Carte> cartes,boolean etat) {
        panels.get(joueur).setCliquable(cartes,etat);
    }
    
}
