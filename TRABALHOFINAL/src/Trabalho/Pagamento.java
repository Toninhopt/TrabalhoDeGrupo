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
				soma += ((BigTasty) a).getPreço();
			}
			if (a instanceof Natura) {
				soma += ((Natura) a).getPreço();
			}
			if (a instanceof Bebida) {
				soma += ((Bebida) a).getPreço();
			}
			if (a instanceof Batata) {
				soma += ((Batata) a).getPreço();
			}
			if (a instanceof Menu) {
				soma += ((Menu) a).getPreço();
			}
			
		}
		return soma;
	}
	
	public double pagar(double valor) {
		int preço = 0;
		for (int i = 0; i < pagamento.size(); i++) {
			Produtos a = getPagamnto(i);
			if (a instanceof BigTasty) {
				preço += ((BigTasty) a).getPreço();
			}
			if (a instanceof Natura) {
				preço += ((Natura) a).getPreço();
			}
			if (a instanceof Bebida) {
				preço += ((Bebida) a).getPreço();
			}
			if (a instanceof Batata) {
				preço += ((Batata) a).getPreço();
			}
			if (a instanceof Menu) {
				preço += ((Menu) a).getPreço();
			}	
		}	
		return preço - valor;
	}

}

