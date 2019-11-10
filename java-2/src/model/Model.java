package model;

public class Model {
	
	public String retornarSabor(int numero) {
		Sorvete s = new Sorvete(numero);
		return s.getSabor();
	}
}
