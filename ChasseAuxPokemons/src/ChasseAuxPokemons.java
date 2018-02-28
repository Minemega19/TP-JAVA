import tp1.Pokemon;

public class ChasseAuxPokemons {

	public static void main(String[] args) {
		String tempsDujour = args[0];
		//creation d'objet
		final String mp1;
		final String mp2;
		final String mp3;

		final Pokemon p1 = new Pokemon("Piplup","EAU",5, true);
		final Pokemon p2 = new Pokemon("Rowlet","PLANTE",10, false);
		final Pokemon p3 = new Pokemon("Totodile","EAU",8, true);
		
		//application de methode toString
		mp1=p1.toString();
		mp2=p2.toString();
		mp3=p3.toString();
		
		//affichage des toString		
		System.out.println(mp1);
		System.out.println(mp2);
		System.out.println(mp3);
		
		//affichage des bonjours
		System.out.println();
		
	/*	System.out.println("Piplup dis bonjour");
		System.out.println("Rowlet dis bonjour");
		System.out.println("Totodile dis bonjour");*/
		p1.direBonjour(args[0]);
		p2.direBonjour(args[0]);
		p3.direBonjour(args[0]);
	}
	

}
