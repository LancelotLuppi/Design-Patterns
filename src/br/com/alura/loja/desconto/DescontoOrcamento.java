package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

/*	A classe cuida da sua pr�pria
 * 	regra de neg�cio;
 */
public class DescontoOrcamento extends Desconto {
	
	public DescontoOrcamento(Desconto proximo) {
		super(proximo);
	}
	
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	
	// L�gica do if processada na classe filha:
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
