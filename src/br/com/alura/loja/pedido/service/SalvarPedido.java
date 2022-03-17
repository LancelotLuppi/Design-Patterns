package br.com.alura.loja.pedido.service;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedido implements AcaoAposGerarPedido {

	public void executar(Pedido pedido) {
		System.out.println("O pedido foi salvo no banco de dados!");
	}
	
}
