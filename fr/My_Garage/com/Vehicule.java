package fr.My_Garage.com;

import java.util.List;

public abstract class Vehicule {
	
	protected Double prix;
	protected String nom;	
	protected List<Option> options;
	protected Marque marque;

	/* Une instance de l'objet moteur est présent dans véhicule, 
	 * only one car motor in a car */
	
	protected Moteur moteurun = new Moteur();
	public Moteur getMoteur() {return moteurun; }
	
	
	/*GETTER ET SETTERS*/
	
	public void setMoteur(Moteur moteur) {
		this.moteurun = moteur;
		
	}

	public Moteur getMoteurun() {
		return moteurun;
	}


	public void setMoteurun(Moteur moteurun) {
		this.moteurun = moteurun;
	}
	
	public Marque getMarque() {
		return marque;
	}
	
	public List<Option> getOptions() {
		return options;
	}
	
	public Double getPrix() {
		return prix;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	
	/*END GETTER ET SETTERS*/
	
	
	/* METHODS */
	
	@Override
	public String toString() {
		return "Vehicules [prix=" + prix + ", nom=" + nom + ", options=" + options + ", marque=" + marque + "]";
	}
	
	public void addOption(List<Option> Options) {
		System.out.println("méthode qui ajoute une option");
	}

}
