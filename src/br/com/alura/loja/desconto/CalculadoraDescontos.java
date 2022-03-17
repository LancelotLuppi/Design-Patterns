package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDescontos {

/*	Diferenças entre Strategy e Chain of Responsability:
 * 
 * 		Chain of Responsability:
 * 			Não sabemos qual tipo de desconto será aplicado,
 * 			então precisa-se de uma verificação para estes tipos.
 * 
 * 		Strategy:
 * 			Sabemos qual regra será aplicada (ICMS ou ISS),
 * 			então a verificação não é necessária;
 */
	
	
//	Método Chain of Responsability:
	public BigDecimal calcular(Orcamento orcamento) {
		
//		Cadeia de verificações de descontos:
		Desconto cadeiaDeDescontos = new DescontoQuantidadeItens(
				new DescontoOrcamento(
						new SemDesconto(null)));
		
		return cadeiaDeDescontos.calcular(orcamento);
		}
}
	

