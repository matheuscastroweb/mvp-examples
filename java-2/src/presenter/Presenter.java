package presenter;

import model.Model;
import view.IView;

public class Presenter {
	IView view;
	Model m = new Model();
	
	public Presenter(IView view) {
		this.view = view;
	}
	
	public void consultarSabor(int numero) {
		String sabor = m.retornarSabor(numero);
		System.out.println();
		System.out.println("Sabor escolhido: "+numero+" - "+sabor);
		view.exibirNota(sabor);
	}
}
