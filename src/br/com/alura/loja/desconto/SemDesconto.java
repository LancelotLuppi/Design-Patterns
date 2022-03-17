package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//	Fim da verifica��o de descontos

public class SemDesconto extends Desconto {

	public SemDesconto(Desconto proximo) {
		super(null);
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	// L�gica do if processada na classe filha:
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
}
