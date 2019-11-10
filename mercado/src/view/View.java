package view;

import model.Produto;
import presenter.Presenter;

public class View implements IView {

	private Presenter presenter = new Presenter(this);

	public void mostrarTelaDeConsulta(String nome) {
		System.out.println("Tela de consulta:");
		System.out.println("-------------------------------------");
		System.out.println("Você está consultado o preço do produto: " + nome);
		System.out.println("");
		System.out.println("-------------------------------------");

		presenter.consultar(nome);

	}

	public void telaDeCadastro(String nome, double valor) {
		System.out.println("Tela de cadastro:");
		System.out.println("-------------------------------------");
		System.out.println("Você está cadastrando o produto: " + nome);
		System.out.println("Com preço:" + valor);
		System.out.println("");
		System.out.println("-------------------------------------");
		presenter.cadastrar(nome, valor);
	}

	@Override
	public void mostrar(Produto p) {
		System.out.println("Tela de apresentação: ");
		System.out.println("-------------------------------------");
		System.out.println("Dados do Produto: ");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Preço: " + p.getPreco());
		System.out.println("-------------------------------------");

	}

	@Override
	public void mostrarCadastro(String msg) {
		System.out.println(msg);

	}

}
