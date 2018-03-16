package tp1;

public class Gourmandise extends Nourriture {
	private static int APPORTLOYAUTE;
	private static int APPORTSATISFACTION;
	
	public Gourmandise(int apport, String nomIngredient , String[] compatiblite, int frequence, int APPORTLOYAUTE, int APPORTSATISFACTION){
		super(apport,nomIngredient,compatiblite,frequence);
		this.APPORTLOYAUTE = APPORTLOYAUTE;
		this.APPORTSATISFACTION = APPORTSATISFACTION;
	}
	
	@Override
	public String toString(){
		String toStringSuper = super.toString();
		return ("Ceci est une gourmandise" + toStringSuper);
	}
	
	@Override
	public void estMangee(Pokemon mangeur) {
		if(mangeur.getSatisfaction()<50){
		mangeur.setSatisfaction(mangeur.getSatisfaction()+1);
		}
		if(mangeur.getLoyaute()<50){
		mangeur.setLoyaute(mangeur.getLoyaute()+1);
		}
	}

}