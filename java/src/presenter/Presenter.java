package presenter;

import model.Model;
import model.Produto;
import view.IView;

public class Presenter {
	private IView view;
	private Model model;
	private Produto produto;

	public Presenter(IView view) {
		this.view = view;
		this.model = new Model();
		this.produto = new Produto();
	}

	public void consultar(String nome) {
		produto.setNome(nome);
		produto = model.pesquisarNome(produto);

		view.mostrar(produto);

	}

	public void cadastrar(String nome, double valor) {
		String msg = "";

		if (nome.length() < 60 && valor > 0) {
			produto.setNome(nome);
			produto.setPreco(valor);

			if (model.cadastarProduto(produto))
				msg = "Produto Cadastrado Com sucesso!";
			else
				msg = "Falha ao cadastrar";
		} else
			msg = "Erro ao cadastrar! Verifique os dados!";

		view.mostrarCadastro(msg);

	}

}
