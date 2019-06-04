package Trabalho;

import java.util.ArrayList;

public class Tabuleiro{

	protected Pagamento pagamento;
	
	
	ArrayList<Produtos> pedido = new ArrayList<Produtos>();
	
	
	public void add(Produtos produto) {
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
	
	
}
