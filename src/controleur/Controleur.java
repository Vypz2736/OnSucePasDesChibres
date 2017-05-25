package controleur;

import java.util.*;
import models.*;
import util.*;
import view.*;

public class Controleur {

	private NivEau nivEau;
	private Grille grille;
	private VueAventurier vueAventurier;
	private VueGrille vueGrille;
	Collection<Joueur> joueurs;
	private Collection<CarteTresor> deft;
	private Collection<CarteTresor> pilet;
	private Collection<CarteInondation> defi;
	private Collection<CarteInondation> pilei;
	private Collection<Tresor> tresors;

	/**
	 * 
	 * @param nomr
	 */
	public Aventurier getAventurier(String nomr) {
		// TODO - implement Controleur.getAventurier
		throw new UnsupportedOperationException();
	}

	public CarteTresor tirerCT() {
		// TODO - implement Controleur.tirerCT
		throw new UnsupportedOperationException();
	}

	public CarteInondation tirerCI() {
		// TODO - implement Controleur.tirerCI
		throw new UnsupportedOperationException();
	}

	public NivEau getNiv() {
		// TODO - implement Controleur.getNiv
		throw new UnsupportedOperationException();
	}
        
        public void initGrille() {
            int i;
            ArrayList<Tuile> at = new ArrayList();
            at.add(new Tuile("Le Pont des abimes",0));
            at.add(new Tuile("La Porte de bronze",1));
            i = at.size();
            //Rouge
            //at.get(i).ajouterAv(a);
            at.get(i).inonder();
            at.add(new Tuile("La Caverne des ombres",0));
            i = at.size();
            at.get(i).setTresor(Tresor.Cristal);
            at.add(new Tuile("La Porte de fer",0));
            i = at.size();
            //Violet
            //at.get(i).ajouterAv(a);
            at.add(new Tuile("La Porte d'or",0));
            i = at.size();
            //Jaune
            //at.get(i).ajouterAv(a);
            at.add(new Tuile("Les Falaises de l'oubli",0));
            at.add(new Tuile("Le Palais de corail",0));
            i = at.size();
            at.get(i).setTresor(Tresor.Calice);
            at.add(new Tuile("La Porte d'argent",0));
            i = at.size();
            //Orange
            //at.get(i).ajouterAv(a);
            at.add(new Tuile("Les Dunes de l'illusion",2));
            at.add(new Tuile("Heliport",0));
            i = at.size();
            //Bleu
            //at.get(i).ajouterAv(a);
            at.add(new Tuile("La Porte de cuivre",0));
            i = at.size();
            //Vert
            //at.get(i).ajouterAv(a);
            at.add(new Tuile("Le Jardin des hurlements",0));
            i = at.size();
            at.get(i).setTresor(Tresor.Statue);
            at.add(new Tuile("La Foret pourpre",0));
            at.add(new Tuile("Le Lagon perdu",1));
            at.add(new Tuile("Le Marais brumeux",2));
            at.add(new Tuile("Observatoire",1));
            at.add(new Tuile("Le Rocher fantôme",2));
            at.add(new Tuile("La Caverne du brasier",1));
            i = at.size();
            at.get(i).setTresor(Tresor.Cristal);
            at.add(new Tuile("Le Temple du soleil",0));
            i = at.size();
            at.get(i).setTresor(Tresor.Pierre);
            at.add(new Tuile("Le Temple de la lune",2));
            i = at.size();
            at.get(i).setTresor(Tresor.Pierre);
            at.add(new Tuile("Le Palais des marées",0));
            i = at.size();
            at.get(i).setTresor(Tresor.Calice);
            at.add(new Tuile("Le Val du crepuscule",0));
            at.add(new Tuile("La Tour du guet",0));
            at.add(new Tuile("Le Jardin des murmures",1));
            i = at.size();
            at.get(i).setTresor(Tresor.Statue);
            grille = new Grille(at);
        }

}