package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDescontos {

/*	Diferen�as entre Strategy e Chain of Responsability:
 * 
 * 		Chain of Responsability:
 * 			N�o sabemos qual tipo de desconto ser� aplicado,
 * 			ent�o precisa-se de uma verifica��o para estes tipos.
 * 
 * 		Strategy:
 * 			Sabemos qual regra ser� aplicada (ICMS ou ISS),
 * 			ent�o a verifica��o n�o � necess�ria;
 */
	
	
//	M�todo Chain of Responsability:
	public BigDecimal calcular(Orcamento orcamento) {
		
//		Cadeia de verifica��es de descontos:
		Desconto cadeiaDeDescontos = new DescontoQuantidadeItens(
				new DescontoOrcamento(
						new SemDesconto(null)));
		
		return cadeiaDeDescontos.calcular(orcamento);
		}
}
	

