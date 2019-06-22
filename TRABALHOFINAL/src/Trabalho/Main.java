package Trabalho;

public class Main {
	
	public static void main(String[] args) {
		
		Tabuleiro t = new Tabuleiro();
		Produtos p = new Produtos();
		Mc mc = (Mc) t;

		Produtos bigtasty = new BigTasty();
		Produtos natura = new Natura();
		Produtos batata = new Batata();
		Produtos bebida = new Bebida();
		Produtos menu = new Menu();
		
		
		
		
		
		mc.adicionar(menu);
		mc.adicionar(bebida);
		mc.adicionar(batata);
		t.pedidos();
		System.out.println("Total a pagar: " + mc.finalizarPedido() + "€");
		mc.pagamento(20);
		System.out.println("Pagamento: " + mc.pagamento(8.0) + "€");
		
		
	

		
		
		
	}
	
}
