import tp1.Joueur;
import tp1.Nourriture;
import tp1.Pokemon;
import java.util.Scanner;

public class ChasseAuxPokemons {

	public static void main(String[] args) {
		
		//Elles ne compileront pas car il n'y a plus le booleen "diurne ou nocturne"
		
		final Pokemon p1 = new Pokemon("Piplup","EAU",5, true, 50,0,50);
		final Pokemon p2 = new Pokemon("Rowlet","PLANTE",10, false, 50,0,50);
		final Pokemon p3 = new Pokemon("Totodile","EAU",8, true, 50,0,50);
		final Pokemon p4 = new Pokemon("Aflamanoir","FEU",7, true, 50,0,50);
		final Pokemon p5 = new Pokemon("Bétochef","COMBAT",7, true, 50,0,50);
		final Pokemon p6 = new Pokemon("Elektek","ELECTRIQUE",7, true, 50,0,50);
		final Pokemon p7 = new Pokemon("Boumata","DRAGON",7, true, 50,0,50);

		
		//Les joueurs
		
		final Joueur joueur1 = new Joueur("Durant","Sachat",20,new Pokemon[5]);
		final Joueur joueur2 = new Joueur("Dupont","Pierre",20, new Pokemon[5]);
		// Jean capture un pokemon qu'il nomme "Rascal " et le donne à Gabrielle
		joueur1.capturer(p1);
		
		
		final Nourriture Nourriture1 = new Nourriture(35,"Tartiflette",new String[30]);
		final Nourriture Nourriture2 = new Nourriture(10,"Ratatouille",new String[30]);
		
		// A utiliser
		final String[] compatibilite = new String[30];
		compatibilite[0] = "EAU";
		compatibilite[1] = "FEU";
		compatibilite[2] = "COMBAT";
		compatibilite[3] = "DRAGON";
		compatibilite[4] = "PLANTE";
		compatibilite[5] = "NORMAL";
		compatibilite[6] = "VOL";
		compatibilite[7] = "ELECTRIQUE";
		compatibilite[8] = "NORMAL";
		
		System.out.println(p1.getNom() + " est compatible avec " + Nourriture1.estCompatible(p1)); // Est Compatible donc renvoi true
		System.out.println(p1.getNom() + " est compatible avec " + Nourriture1.estCompatible(p2)); // Est Compatible donc renvoi false
		
		System.out.println(p1.getNom() + " est compatible avec " + Nourriture2.estCompatible(p3)); // Est Compatible donc renvoi true
		System.out.println(p1.getNom() + " est compatible avec " + Nourriture2.estCompatible(p7)); // Est Compatible donc renvoi false
		
		System.out.println(p1.getNomDonne()); //Affiche : Rascal
		//System.out.println(Nourriture1.genAlea(Nourriture2));
		
		if (Nourriture1.genAlea(Nourriture2)<30) {
			//Creer les this
			//Nourriture ng = new Nourriture(this.apport, this.nom, this.compatibilities);
		}
		else {
			//Creer un objet null
		}
		//affichage des toString
		/*System.out.println(mp1);
		System.out.println(mp2);
		System.out.println(mp3);*/
	}
	

}
