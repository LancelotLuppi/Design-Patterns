package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraImposto {

	
	/*	Utilização do pattern Strategy para
	 * 	evvitar algorismos com diversos if's
	 * 	ou case's;
	 */
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
	
}
