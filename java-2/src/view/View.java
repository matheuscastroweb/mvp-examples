package view;

import presenter.Presenter;

public class View implements IView {

	Presenter presenter = new Presenter(this);
	
	@Override
	public void escolherSabor(int numero) {
		System.out.println();
		System.out.println("Escolha o sabor desejado: ");
		presenter.consultarSabor(numero);
		
	}

	@Override
	public void exibirNota(String sabor) {
		System.out.println("----------------------------");
		System.out.println("--------NOTA FISCAL---------");
		System.out.println("Sabor: " + sabor);
		System.out.println("Valor R$3,00");
		System.out.println("----------------------------");
		
	}

	@Override
	public void listarSabor() {
		System.out.println("Sabores disponíveis");
		System.out.println("1: Morango"); 
		System.out.println("2: Chocolate");
		System.out.println("3: Flocos"); 
		System.out.println("4: Creme");
		System.out.println("5: Napolitano");
		
	}

}
