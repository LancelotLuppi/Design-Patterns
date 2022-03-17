package br.com.alura.loja.pedido.service;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Email enviado");
	}
	
}
