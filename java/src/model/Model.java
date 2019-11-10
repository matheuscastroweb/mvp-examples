package model;

import persistency.ProdutoDAO;

public class Model {
	private ProdutoDAO pd = new ProdutoDAO();

	public Produto pesquisarNome(Produto p) {
		p = pd.selectPorNome(p);
		return p;
	}

	public Boolean cadastarProduto(Produto produto) {
		return pd.inserir(produto);

	}
}
