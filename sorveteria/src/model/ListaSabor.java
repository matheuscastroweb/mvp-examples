package model;

import java.util.ArrayList;
import java.util.List;

public class ListaSabor {
	private List<String> sabores = new ArrayList<String>();

	public ListaSabor() {
		sabores.add("Morango");
		sabores.add("Chocolate");
		sabores.add("Flocos");
		sabores.add("Creme");
		sabores.add("Napolitano");

	}

	public List<String> getSabores() {

		return sabores;
	}

	public void setSabor(String nome) {
		sabores.add(nome);
	}

	public int total() {
		return sabores.size();
	}

	public String getSabor(int i) {
		return sabores.get(i);
	}

}
