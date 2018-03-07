import tp1.Joueur;
import tp1.Pokemon;
import java.util.Scanner;
public class ChasseAuxPokemons {

	public static void main(String[] args) {

		//creation d'objet
		/*final String mp1;
		final String mp2;
		final String mp3;*/
		
		//Elles ne compileront pas car il n'y a plus le booleen "diurne ou nocturne"
		
		final Pokemon p1 = new Pokemon("Piplup","EAU",5, true, 50,0,50);
		final Pokemon p2 = new Pokemon("Rowlet","PLANTE",10, false, 50,0,50);
		final Pokemon p3 = new Pokemon("Totodile","EAU",8, true, 50,0,50);
		
		//Les joueurs
		
		final Joueur joueur1 = new Joueur("Durant","Sachat",20,new Pokemon[5]);
		final Joueur joueur2 = new Joueur("Dupont","Pierre",20, new Pokemon[5]);
		// Jean capture un pokemon qu'il nomme "Rascal " et le donne à Gabrielle
		joueur1.capturer(p1);

		System.out.println(p1.getNomDonne()); //Affiche : Rascal
		
		//affichage des toString		
		/*System.out.println(mp1);
		System.out.println(mp2);
		System.out.println(mp3);*/
	}
	

}
