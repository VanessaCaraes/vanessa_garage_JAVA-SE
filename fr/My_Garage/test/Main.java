package fr.My_Garage.test;

import fr.My_Garage.com.Garage;
import fr.My_Garage.com.Lagouna;
import fr.My_Garage.com.Marque;
import fr.My_Garage.com.MoteurEssence;
import fr.My_Garage.com.Vehicule;

public class Main {

	public static void main(String[] args) {

		Garage garage = new Garage();		
		System.out.println(garage);
		
		Vehicule lag1 = new Lagouna();
		
	 for( Marque mar : Marque.values()) {
			System.out.println(mar);
	 };
	 
		
		lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
		

	
		
	}

}
