package tp1;

public class Joueur {
	//Tableau des pokemons possédés par le joueur
	private Pokemon[] tabPokemons;
	
	public Joueur (){
		this.tabPokemons = new Pokemon[5];
	}
	
	public void capturer(Pokemon pokemoncap){
		
		
	}
	public void afficherListePokemon(){
		int i;
		for (i=0;i<5;i++){
			System.out.println("Pokemon indice"+(i+1)+ tabPokemons[i]);
		}
	}
}