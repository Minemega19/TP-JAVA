package tp1;

public class Pokemon {
	private String nom;
	private String type; 
	private int niveau;
	private Boolean diurne = true;
	private String nomDonne;
	private Joueur monJoueur;

	//Constructeur Pokemon a l etat sauvage
	public Pokemon(String monNom,String montype,int monNiveau, Boolean typeDiurne){
		this.nom = monNom;
		this.type = montype;
		this.niveau = monNiveau;
		this.diurne = typeDiurne;
		this.nomDonne = null;
		this.monJoueur = null;
	}
	//Constructeur Pokemon une fois Capture
	public Pokemon(String monNom,String montype,int monNiveau, Boolean typeDiurne, String monNomDonne, Joueur monJoueur ){

		this.nom = monNom;
		this.type = montype;
		this.niveau = monNiveau;
		this.diurne = typeDiurne;
		this.nomDonne = monNomDonne;
		this.monJoueur = monJoueur;
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
		if(this.nomDonne == null && this.monJoueur != null) {
			return("Voici un Pokemon du genre " + this.nom + "du type "+ this.type + " qui a le niveau " + this.niveau + "Ce Pokemon appartient à " +  this.monJoueur);
		}
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