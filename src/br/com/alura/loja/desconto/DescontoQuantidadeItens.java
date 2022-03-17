package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/*	A classe cuida da sua própria
 * 	regra de negócio;
 */
public class DescontoQuantidadeItens extends Desconto {
	
	public DescontoQuantidadeItens(Desconto proximo) {
		super(proximo);
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}	


	// Lógica do if processada na classe filha:
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
}
