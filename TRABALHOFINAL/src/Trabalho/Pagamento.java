package Trabalho;

import java.util.ArrayList;


public class Pagamento {

	ArrayList<Produtos> pagamento = new ArrayList<Produtos>();

	
	public ArrayList<Produtos> getPagamento() {
		return pagamento;
	}

	public void setLista(ArrayList<Produtos> lista) {
		this.pagamento = pagamento ;
	}
	public Produtos getPagamnto(int index) {
		return pagamento.get(index);
	}

	public void setLista(Produtos pedido, int index) {
		pagamento.set(index, pedido);
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
	
}
	

