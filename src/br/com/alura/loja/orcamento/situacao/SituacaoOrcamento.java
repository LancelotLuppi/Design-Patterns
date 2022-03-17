package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

/* Pattern State:
 * 	Parecido com o Strategy, por�m
 *  nele � permitido a mudan�a de estados
 *  do objeto (Aprovado, Reprovado, Finalizado);
 */

public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser finalizado!");
	}
	
}
