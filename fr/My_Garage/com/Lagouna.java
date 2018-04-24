package fr.My_Garage.com;

import java.util.List;

public class Lagouna extends Vehicule{

	public Lagouna()
	{}
	
	public Lagouna(List<Vehicule> voitures, String nom, Double prix, List<Option> options, Marque marque) {
		this.voitures = voitures;
		this.nom = nom;
		this.prix = prix;
		this.options = options;
		this.marque = marque;
		
		
	}
	
	
	@Override
	public String toString() {
		return " on est dans la page Lagouna [prix=" + prix + ", nom=" + nom + ", options=" + options + ", marque=" + marque + "]";
	}
	
	
}
