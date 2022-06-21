package br.com.treinaweb.calculadora.classes;

public class Multiplicacao extends CalculoMatematico{

	public Multiplicacao(int numero1, int numero2) {
		super(numero1, numero2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int doCalclular() {
		return numero1 * numero2;
	}
		

}
