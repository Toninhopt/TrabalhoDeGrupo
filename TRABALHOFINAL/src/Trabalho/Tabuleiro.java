package Trabalho;

import java.util.ArrayList;

public class Tabuleiro extends Mc{

	@Override
	public void pedidos() {
		for (Produtos produtos : pedido) {
			System.out.println(produtos);
		}
	}
	
	ArrayList<Produtos> pagamento = new ArrayList<Produtos>();
	
}
