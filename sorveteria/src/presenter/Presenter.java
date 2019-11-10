package presenter;

import java.util.List;

import model.ListaSabor;
import model.Sorvete;
import view.IView;

public class Presenter {
	private IView view;
	private Sorvete s;
	private ListaSabor ls;

	private double total;
	private String sorvetes = "";

	public Presenter(IView view) {
		this.view = view;
		ls = new ListaSabor();
	}

	public String prepararSabor(int numero) {
		if (numero >= 0 && numero < ls.total()) {
			s = new Sorvete(ls.getSabor(numero));
			total += s.getValor();
			String sabor = s.getSabor();
			sorvetes += sabor + "\n ";
			return sabor;
		} else {
			return "Número de sorvete inválido";
		}

	}

	public void total() {
		if (total > 0)
			view.exibirNota(sorvetes, total);

	}

	public String sabores() {
		List<String> sabores = ls.getSabores();
		String todos = " ";

		for (int i = 0; i < sabores.size(); i++) {
			todos += i + "-" + sabores.get(i) + "\n ";
		}

		return todos;

	}

}
