package tp1;

public class PotionMagique extends Nourriture {//pas une potion mais un super bonbon
	private static String[] TYPE = {"feu","eau","plante","terre","tenebre","normal","vol","DRAGON","ELECTRIQUE","COMBAT","GLACE","INSECT","POISON","PSY"};

	public PotionMagique(String nomIngredient, int frequence) {		
		super(0, nomIngredient,PotionMagique.TYPE , frequence);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String toStringSuper = super.toString();
		return "ceci est une potion Magique "+toStringSuper;
	}

	@Override
	public void estMangee(Pokemon mangeur) {
		if (mangeur.getNiveau()<100)
			mangeur.miseANiveau();
		else
			System.out.println("vous etes deja niveau max");
	}
	public PotionMagique genAlea(){
		if (Math.round(100*Math.random())< this.frequence)
			return new PotionMagique(super.getIngredient(), this.frequence);
		else
			return null;
	}

	
	
	
	

}
