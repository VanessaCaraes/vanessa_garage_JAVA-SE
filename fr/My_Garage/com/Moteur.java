package fr.My_Garage.com;

public class Moteur{
	
protected TypeMoteur type;
protected String cylindre;
protected Double prix;

/*GETTER ET SETTERS*/

public void  Moteur(String cylindre, Double prix) {
	this.cylindre = cylindre;
	this.prix = prix;
}
public TypeMoteur getType() {
	return type;
}
public void setType(TypeMoteur type) {
	this.type = type;
}

public String getCylindre() {
	return cylindre;
}

public void setCylindre(String cylindre) {
	this.cylindre = cylindre;
}

public void setPrix(Double prix) {
	this.prix = prix;
}
/* END GETTERS & SETTERS */



/*METHODS*/







@Override
public String toString() {
	return "Moteur [type=" + type + ", cylindre=" + cylindre + ", prix=" + prix + "]";
}


public Double getPrix() {
	return prix;
	}

}
