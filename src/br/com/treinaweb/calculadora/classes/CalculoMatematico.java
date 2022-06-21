package br.com.treinaweb.calculadora.classes;

import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public abstract class CalculoMatematico implements CalculadorMatematico {

	private int numero1;
	private int numero2;
	
	public CalculoMatematico(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	@Override
	public Boolean validar() {		
		return numero1 >= 0 && numero2 >=0 ;
	}

	@Override
	public final int Calcular() {
		if(validar()) {
			return doCalclular();
		}else {
			return -1;	
		}
		;
	}
	
	protected abstract int doCalclular();

}