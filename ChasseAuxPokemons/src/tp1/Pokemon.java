package tp1;

public class Pokemon {
	private String nom;
	private String type; 
	private int niveau;
	private Boolean diurne = true;
	private String nomDonne;
	
	//Constructeur
	public Pokemon(String monNom,String montype,int monNiveau, Boolean typeDiurne){
		this.nom = monNom;
		this.type = montype;
		this.niveau = monNiveau;
		this.diurne = typeDiurne;
	}
	
	//Methode toString
	public String toString(){
		String etat;
		if(diurne){
			etat = "diurne";
		}
		else{
			etat = "nocturne";
		}
		return(this.nom + " est un pokemon de type " + this.type + " et de niveau " + this.niveau + " Il est de type "+ etat);
	}
	
	//methode dire bonjour
	public void direBonjour(String periode){
		if (periode.equals("jour"))
			if(this.diurne){
				System.out.println(this.nom + " dit bonjour !");
			}
			else{
				System.out.println("zzZZ !");
			}
		else{
			if(!this.diurne){
				System.out.println(this.nom + " dit bonjour !");
			}
			else{
				System.out.println("zzZZ !");
			}		
		}
	}
}