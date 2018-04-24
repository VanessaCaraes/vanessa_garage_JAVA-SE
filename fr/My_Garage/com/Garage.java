package fr.My_Garage.com;

import java.util.List;

public class Garage {
	
	protected List<Vehicule> voitures;
		
	/* GETTERS & SETTERS */
	public List<Vehicule> getVoitures() {
		return voitures;
	}

	public void setVoitures(List<Vehicule> voitures) {
		this.voitures = voitures;
	}	
	/* END GETTERS & SETTERS */


	@Override
	public  String toString() {
		
//		if (this.voitures == null)
//		{ 	
//			  return "Aucune voitue sauvegardée !";
//		}
//		
//		else 			
			return 
				"On est dans la page le  Garage "+" : "+
				"[voitures=" + voitures + " ," +
				"Moteur de la voiture" + " ," +
				"Nombre de chevaux" + "," +
				"Les option [ " + "]";
		
		
	}

	public void addVoiture(Vehicule lag1) {
		System.out.println("une voiture a été ajoutée");
		
	}


	
	
	
}
