package Trabalho;

import java.util.ArrayList;


public class Pagamento extends Tabuleiro {

	

	public Produtos getPagamnto(int index) {
		return pagamento.get(index);
	}	

	public Pagamento(ArrayList<Produtos> pagamento) {
		super();
		this.pagamento = pagamento;
	}

	public double conta() {
		double soma = 0;
		for (int i = 0; i < pagamento.size(); i++) {
			Produtos a = getPagamnto(i);
			if (a instanceof BigTasty) {
				soma += ((BigTasty) a).getpreco();
			}
			if (a instanceof Natura) {
				soma += ((Natura) a).getpreco();
			}
			if (a instanceof Bebida) {
				soma += ((Bebida) a).getpreco();
			}
			if (a instanceof Batata) {
				soma += ((Batata) a).getpreco();
			}
			if (a instanceof Menu) {
				soma += ((Menu) a).getpreco();
			}
			
		}
		return soma;
	}
	
	public double pagar(double valor) {
		int preco = 0;
		for (int i = 0; i < pagamento.size(); i++) {
			Produtos a = getPagamnto(i);
			if (a instanceof BigTasty) {
				preco += ((BigTasty) a).getpreco();
			}
			if (a instanceof Natura) {
				preco += ((Natura) a).getpreco();
			}
			if (a instanceof Bebida) {
				preco += ((Bebida) a).getpreco();
			}
			if (a instanceof Batata) {
				preco += ((Batata) a).getpreco();
			}
			if (a instanceof Menu) {
				preco += ((Menu) a).getpreco();
			}	
		}	
		return preco - valor;
	}

}

