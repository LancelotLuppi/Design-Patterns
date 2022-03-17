package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.service.EnviarEmailPedido;
import br.com.alura.loja.pedido.service.SalvarPedido;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Luppi";
		BigDecimal valorOrcamento = new BigDecimal("400");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedido(), 
				new EnviarEmailPedido()
				));
		handler.execute(gerador);
	}
	
}
