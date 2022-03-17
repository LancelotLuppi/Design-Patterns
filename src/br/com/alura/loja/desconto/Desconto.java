package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximoDesconto;
	
	public Desconto(Desconto proximo) {
		this.proximoDesconto = proximo;
	}
	
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximoDesconto.calcular(orcamento);
	}
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	// A lógica será atribuída nas classes filhas
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
