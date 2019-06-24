package Trabalho;

import java.util.ArrayList;
/**
 * 
 * @author Hugo Duarte
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
		try {
			if (!pedido.contains(produto)) {
				throw new IllegalArgumentException();
			} else {
			pedido.remove(produto);
			}
		} catch (Exception e) {
			System.out.println("Nao consegue apagar porque nao existe");
		}
		
	}
	/**
	 * Finaliza um pedido de um determinado tabulerio
	 * @return
	 */
	public double finalizarPedido() {
		try {
			if (pedido.size() == 0) {
				throw new IllegalArgumentException();
			} else {
				Pagamento p = new Pagamento(pedido);	
				return p.conta();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Para finalizar o pedido deve adicionar algum produto");
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