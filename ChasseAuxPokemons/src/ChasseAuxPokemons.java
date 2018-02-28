import tp1.Pokemon;
import tp1.Joueur;

public class ChasseAuxPokemons {

	public static void main(String[] args) {

		//creation d'objet
		final String mp1;
		final String mp2;
		final String mp3;
		//Elles ne compileront pas car il n'y a plus le booleen "diurne ou nocturne"
		final Pokemon p1 = new Pokemon("Piplup","EAU",5, true);
		final Pokemon p2 = new Pokemon("Rowlet","PLANTE",10, false);
		final Pokemon p3 = new Pokemon("Totodile","EAU",8, true);
		final Joueur j1 = new Joueur();
		
		//application de methode toString
		mp1=p1.toString();
		mp2=p2.toString();
		mp3=p3.toString();
		
		j1.afficherListePokemon();
		
		//affichage des toString		
		System.out.println(mp1);
		System.out.println(mp2);
		System.out.println(mp3);
	}
	

}
