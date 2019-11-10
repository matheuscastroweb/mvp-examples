package view;

import model.Produto;

public interface IView {
	public void mostrar(Produto p);

	public void mostrarCadastro(String msg);
}
