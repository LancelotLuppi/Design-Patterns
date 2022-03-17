package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;


/*	Criação da Interface para
 * 	a regra de aplicar o método
 * 	calcular();
 */
public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
	
}
