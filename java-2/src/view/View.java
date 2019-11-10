package view;

import presenter.Presenter;

public class View implements IView {

	private Presenter presenter = new Presenter(this);

	public void escolherSabor(int numero) {
		System.out.println("----------------------------");
		System.out.println("Sabor escolhido:\n" + presenter.prepararSabor(numero));
		System.out.println("----------------------------");

	}

	@Override
	public void exibirNota(String sabor, double valor) {
		System.out.println("----------------------------");
		System.out.println("--------NOTA FISCAL---------");
		System.out.println("Sabor(es):\n " + sabor);
		System.out.println("Valor:" + valor);
		System.out.println("----------------------------");

	}

	public void listarSabor() {
		System.out.println("Sabores disponíveis:");
		String str = presenter.sabores();
		System.out.println(str);
		System.out.println("Escolha o Seu.");
	}

	public void fecharPedido() {
		presenter.total();
	}

}
