package tp1;

public class Pokemon {
	private String nom;
	private String type; 
	private int niveau;
	private Boolean diurne = true;
	private String nomDonne;//renommer le pokemon
	private Joueur monJoueur;
	private Joueur joueurNoman;// afin de savoir qui a renommer le pokemon
	private int appetit;
	private int loyaute;
	private int satisfaction;
	
	//Constructeur
	public Pokemon(String monNom,String montype,int monNiveau, Boolean typeDiurne, int appetit, int loyaute, int satisfaction){
		this.nom = monNom;
		this.type = montype;
		this.niveau = monNiveau;
		this.diurne = typeDiurne;
		this.joueurNoman = monJoueur;
		this.nomDonne=null;
		this.monJoueur=null;
		this.appetit = appetit;
		this.loyaute = loyaute;
		this.satisfaction = satisfaction;
	}
	
	//Constructeur Pokemon une fois Capture
	public Pokemon(String monNom,String montype,int monNiveau, Boolean typeDiurne, String monNomDonne, Joueur monJoueur , int appetit, int loyaute, int satisfaction){

		this.nom = monNom;
		this.type = montype;
		this.niveau = monNiveau;
		this.diurne = typeDiurne;
		this.nomDonne = monNomDonne;
		this.monJoueur = monJoueur;
		this.appetit = appetit;
		this.loyaute = loyaute;
		this.satisfaction = satisfaction;
	}
	//Getters and setters
		public String getNom() {
	        return this.nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getType() {
	        return this.type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public int getNiveau() {
	        return this.niveau;
	    }

	    public void setNiveau(int niveau) {
	        this.niveau = niveau;
	    }

	    public Boolean getDiurne() {
	        return diurne;
	    }

	    public void setDiurne(Boolean diurne) {
	        this.diurne = diurne;
	    }

	    public String getNomDonne() {
	        return nomDonne;
	    }

	    public void setNomDonne(String nomDonne) {
	        this.nomDonne = nomDonne;
	        this.joueurNoman = this.monJoueur;
	    }

	    public Joueur getMonJoueur() {
	        return this.monJoueur;
	    }

	    public void setMonJoueur(Joueur monJoueur) {
	        this.monJoueur = monJoueur;
	    }
	    public int getAppetit() {
	    	return this.appetit;
	    }
	    public int getLoyaute() {
	    	return this.loyaute;
	    }
	    public int getSatisfaction() {
	    	return this.satisfaction;
	    }
	    public void setAppetit(int appetit) {
	    	this.appetit = appetit;
	    }
	    public void setLoyaute(int loyaute) {
	    	this.loyaute = loyaute;
	    }
	    public void setSatisfaction(int satisfaction) {
	    	this.satisfaction = satisfaction;
	    }
	    
	//Methode toString
	public String toString(){
		if (this.monJoueur==null){
			//Si le pokemon n a pas de maitre
			if (this.nomDonne==null)
				//Le Pokemon n'a pas de maitre et n'a pas de nom
					return(this.nom + " est un pokemon de type " + this.type + " et de niveau " + this.niveau + "Ce pokemon n\' pas encore de maitre ");
			else
				//Le Pokemon n'a pas de maitre mais a un nom
					return("Voici un Pokemon du genre " + this.nom + "du type "+ this.type + " qui a le niveau " + this.niveau + "Ce Pokemon appartient a " +  this.monJoueur);
			}
		else
			//Le Pokemon n'a pas de maitre mais a un nom
		return("Voici un Pokemon du genre " + this.nom + "du type "+ this.type + " qui a le niveau " + this.niveau + "Ce Pokemon appartient a " +  this.monJoueur);
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