package teste;

import view.View;

public class Main {

	public static void main(String[] args) {

		View view = new View();

		view.listarSabor();
		view.escolherSabor(2);
		view.escolherSabor(4);
		view.fecharPedido();

	}
}
