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
				soma += ((BigTasty) a).getPre�o();
			}
			if (a instanceof Natura) {
				soma += ((Natura) a).getPre�o();
			}
			if (a instanceof Bebida) {
				soma += ((Bebida) a).getPre�o();
			}
			if (a instanceof Batata) {
				soma += ((Batata) a).getPre�o();
			}
			if (a instanceof Menu) {
				soma += ((Menu) a).getPre�o();
			}
			
		}
		return soma;
	}
	
	public double pagar(double valor) {
		int pre�o = 0;
		for (int i = 0; i < pagamento.size(); i++) {
			Produtos a = getPagamnto(i);
			if (a instanceof BigTasty) {
				pre�o += ((BigTasty) a).getPre�o();
			}
			if (a instanceof Natura) {
				pre�o += ((Natura) a).getPre�o();
			}
			if (a instanceof Bebida) {
				pre�o += ((Bebida) a).getPre�o();
			}
			if (a instanceof Batata) {
				pre�o += ((Batata) a).getPre�o();
			}
			if (a instanceof Menu) {
				pre�o += ((Menu) a).getPre�o();
			}	
		}	
		return pre�o - valor;
	}

}

