package view;

import model.Produto;
import presenter.Presenter;

public class View implements IView {
	
	
	Presenter presenter = new Presenter(this);

	public void mostrarTelaDeConsulta(Produto p) {
		System.out.println("Tela de consulta:");
		System.out.println("-------------------------------------");
		System.out.println("Voc� est� consultado o pre�o do produto: " + p.getNome());
		System.out.println("");
		System.out.println("-------------------------------------");
		
		presenter.consultar(p);
		
		
	}

	@Override
	public void mostrar(Produto p) {
		System.out.println("Tela de apresenta��o: ");
		System.out.println("-------------------------------------");
		System.out.println("Dados do Produto: ");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Pre�o: " + p.getPreco());
		System.out.println("-------------------------------------");

	}

}
