package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.desconto.CalculadoraDescontos;

public class TesteDescontos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("2000"), 1);
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		
		System.out.println(calculadora.calcular(orcamento));
	}
	
}
