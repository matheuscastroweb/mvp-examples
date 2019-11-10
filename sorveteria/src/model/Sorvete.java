package model;

public class Sorvete {

	private String sabor;
	private double valor = 3.0;

	public Sorvete(String nome) {
		this.sabor = nome;
	}

	public String getSabor() {
		return sabor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
