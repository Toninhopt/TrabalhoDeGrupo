package Trabalho;

import java.util.ArrayList;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class Pagamento {
	
	ArrayList<Produto> pagamento = new ArrayList<>();
	/**
	 *  
	 * @param index 
	 * Vai buscar o valor da ArrayList pagamento 
	 * @return 
	 */
	public Produto getPagamento(int index) {
		return pagamento.get(index);
	}	
	/**
	 * Construtor que permite adicionar pedido na classe Tabuleiro
	 * @param pagamento
	 */
	public Pagamento(ArrayList<Produto> pagamento) {
		this.pagamento = pagamento;
	}
	/**
	 * Soma o preço do produto sempre que é adicionado
	 * @return
	 */
	public double conta() {
		
		double soma = 0;
		for (int i = 0; i < pagamento.size(); i++) {
			Produto a = getPagamento(i);
				soma += Math.abs(a.getPreco());	
		}
		return soma;
	}
	/**
	 * Booleano para dizer se pagou ou nao pagou
	 * @param pagar
	 * @return
	 */
	public boolean pagar(boolean pagar) {
		System.out.println("Está pago?");
		if (pagar == false) {
			System.out.println("Tem que pagar");	
		} else {
			System.out.println("Está pago!");
		}
		return pagar;
		
	}
	
}
