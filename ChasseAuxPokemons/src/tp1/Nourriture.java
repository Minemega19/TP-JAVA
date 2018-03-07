package tp1;

public class Nourriture {
	
	private int apport;
	private String nomIngredient;
	private String[] compatibilite; //Devra être uniforme à 30
	
	
	public Nourriture(int apport, String nomIngredient, String[] compatibilite) {
		this.apport = apport;
		this.nomIngredient = nomIngredient;
		this.compatibilite = compatibilite;
	
	}
	public String toString(){
		return(apport + " " + nomIngredient + " " + compatibilite);
	}
	public boolean estCompatible(Pokemon pokemonCompatibilite) {
		
		boolean isCompatible = false;

		
		if(pokemonCompatibilite.getType().equals("DRAGON") || pokemonCompatibilite.getType().equals("FEU") || pokemonCompatibilite.getType().equals("COMBAT") || pokemonCompatibilite.getType().equals("NORMAL") || pokemonCompatibilite.getType().equals("EAU") || pokemonCompatibilite.getType().equals("ELECTRIQUE") && nomIngredient.equals("Tartiflette")){
			isCompatible = true;
		}
		if(pokemonCompatibilite.getType().equals("PLANTE") && nomIngredient.equals("Tartiflette")) {
			isCompatible = false;
		}
		if(pokemonCompatibilite.getType().equals("PLANTE") || pokemonCompatibilite.getType().equals("EAU") || pokemonCompatibilite.getType().equals("VOL") || pokemonCompatibilite.getType().equals("FEU") || pokemonCompatibilite.getType().equals("NORMAL") || pokemonCompatibilite.getType().equals("ELECTRIQUE") || pokemonCompatibilite.getType().equals("COMBAT") && nomIngredient.equals("Ratatouille")){
			isCompatible = true;
		}
		if(pokemonCompatibilite.getType().equals("DRAGON") && nomIngredient.equals("Ratatouille")){
			isCompatible = false;
		}
		return isCompatible;
	}
}
