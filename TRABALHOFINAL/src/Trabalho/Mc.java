package Trabalho;

import java.util.ArrayList;

public class Mc {
	
	protected Tabuleiro pedir;
	protected ArrayList<String> pedidos = new ArrayList<>();
	
	
	
	ArrayList<Produtos> pedido = new ArrayList<Produtos>();
	
	
	public void adicionar(Produtos produto) {
		pedido.add(produto);
		
	}
	
	public void remove(Produtos produto) {
		pedido.remove(produto);
	}
	
	public void pedidos() {
		for (Produtos produtos : pedido) {
			System.out.println(produtos);
		}
	}
	
	public double finalizarPedido() {
		
		Pagamento p = new Pagamento(pedido);
		return p.conta();
		
	}
	
	
}
