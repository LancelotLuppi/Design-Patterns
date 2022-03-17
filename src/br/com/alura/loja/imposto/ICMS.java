package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/*	A fun��o de calcular o imposto de acordo
 * 	com a tipagem fica em cargo de uma 
 * 	pr�pria classe do tipo de imposto (ICMS);
 */

public class ICMS implements Imposto {
	
		public BigDecimal calcular(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
}
