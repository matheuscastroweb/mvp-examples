package model;

public class Sorvete {
	
	String sabor;
	
	public Sorvete(int numero) {
			
		switch(numero) {
			case 1: sabor = "Morango"; break;
			case 2: sabor = "Chocolate"; break;
			case 3: sabor = "Flocos";break;
			case 4: sabor = "Creme";break;
			case 5: sabor = "Napolitano";break;
		}	
			
	}
	
	public String getSabor() {
		return sabor;
	}
	
	
}
