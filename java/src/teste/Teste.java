package teste;

import model.Produto;
import view.View;

public class Teste {

public static void main(String[] args) {
	View v = new View();
	Produto p = new Produto();
	
	p.setNome("usb");
	
	v.mostrarTelaDeConsulta(p);
}
}
