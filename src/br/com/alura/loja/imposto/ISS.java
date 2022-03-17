package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/*	A função de calcular o imposto de acordo
 * 	com a tipagem fica em cargo de uma 
 * 	própria classe do tipo de imposto (ISS);
 */

public class ISS implements Imposto {
	
		public BigDecimal calcular(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.06"));
		}
}
