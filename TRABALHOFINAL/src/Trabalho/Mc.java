package Trabalho;

import java.util.ArrayList;

public class Mc {
	
	ArrayList<Produtos> pedido = new ArrayList<Produtos>();
	
	
	public void adicionar(Produtos produto) {
		pedido.add(produto);
	}
	
	public void remove(Produtos produto) {
		if (pedido.size() == 0) {
			System.out.println("Nao existe produtos para remover");
		} else {
		pedido.remove(produto);
		}
	}
	
	public double finalizarPedido() {
		
		Pagamento p = new Pagamento(pedido);
		return p.conta();	
	}
	
	public double pagamento(double valor) {
		Pagamento p = new Pagamento(pedido);
		return p.pagar(valor);
	}
	
	public void pedidos() {}
	
	
}
