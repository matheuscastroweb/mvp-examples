package presenter;

import model.Model;
import model.Produto;
import view.IView;


public class Presenter {
	IView view;
	Model model;
	Produto produto;

	
	public Presenter(IView view) {
		this.view = view;
		this.model = new Model();
		this.produto = new Produto();
	}

	public void consultar(Produto p) {
		produto = model.selectPorNome(p);

		view.mostrar(produto);

	}

}
