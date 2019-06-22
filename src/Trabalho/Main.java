package Trabalho;

public class Main {
	
	public static void main(String[] args) {
		
		Tabuleiro t = new Tabuleiro();
		Mc mc = new Mc();
		BigTasty bigtasty = new BigTasty(4.00);
		Batata batata = new Batata(1.00);
		Bebida bebida = new Bebida(1.00);
		Menu menu = new Menu(bigtasty, bebida, batata, 5.00);
		Produtos produtos = new Produtos();
		
		
		t.add(bigtasty);
		t.add(bebida);
		t.add(batata);
		t.add(menu);
		t.pedidos();
		
		
		
	}
	
}
