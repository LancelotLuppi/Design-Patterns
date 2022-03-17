package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;


/*	Cria��o da Interface para
 * 	a regra de aplicar o m�todo
 * 	calcular();
 */
public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);
	
}
