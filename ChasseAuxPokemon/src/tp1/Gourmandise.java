package tp1;

public class Gourmandise extends Nourriture {
	private static int APPORTLOYAUTE;
	private static int APPORTSATISFACTION;
	
	public Gourmandise(int apport, String nomIngredient , String[] compatiblite, int frequence, int APPORTLOYAUTE, int APPORTSATISFACTION){
		super(apport,nomIngredient,compatiblite,frequence);
		this.APPORTLOYAUTE = APPORTLOYAUTE;
		this.APPORTSATISFACTION = APPORTSATISFACTION;
	}
	public String toString(){
		return ("");
	}

}
