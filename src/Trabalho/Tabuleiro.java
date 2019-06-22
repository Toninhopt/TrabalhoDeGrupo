package Trabalho;

import java.util.ArrayList;
/**
 * 
 * @author Hugo Duarte, André Ribeiro, Teresa Santos
 *
 *
 */
public class Tabuleiro {

	ArrayList<Produto> pedido = new ArrayList<>();
	/**
	 * Vai adicionar um novo produto
	 * @param produto
	 */
	public void adicionar(Produto produto) {
		pedido.add(produto);
	}
	/**
	 * Vai remover um produto que já foi inserido
	 * @param produto
	 */
	public void remove(Produto produto) {
		if (pedido.size() == 0) {
			System.out.println("Nao existe produtos para remover");
		} else {
		pedido.remove(produto);
		}
	}
	/**
	 * Finaliza um pedido de um determinado tabulerio
	 * @return
	 */
	public double finalizarPedido() {
		if (pedido.size() == 0) {
			System.out.println("Nao possui pedido algum");
		} else {
			Pagamento p = new Pagamento(pedido);
			return p.conta();	
		}
		return 0;
	}
	/**
	 * Metodo que vai receber metodo pagar() da classe pagamento
	 * @param valor
	 * @return
	 */
	public boolean pagar(boolean valor) {
		Pagamento p = new Pagamento(pedido);
		return p.pagar(valor);
	}
	/**
	 * Metodo que vai correr toda a ArrayList e mostrar os pedidos
	 */
	public void pedidos() {
		for (Produto produtos : pedido) {
			System.out.println(produtos);
		}
	}
}