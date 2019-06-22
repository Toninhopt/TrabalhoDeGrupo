package Trabalho;

public class Main {
	
	public static void main(String[] args) {
			
		Tabuleiro t = new Tabuleiro();
		Mc mc = new Mc();
		
		Produto bigtasty = new BigTasty("Hamburger BigTasty", 3.00);
		Produto natura = new Natura("Hamburger Natura", 2.00);
		Produto batata = new Batata("Batatoide", 1.00);
		Produto bebida = new Bebida("Coca-cola", 1.00);
		Produto menu = new MenuBigTasty("MenuBigTasty", 5.00, bigtasty, bebida, batata);
		
		
		t.adicionar(menu);
		t.adicionar(bebida);
		t.adicionar(batata);
		t.adicionar(bigtasty);
		t.adicionar(natura);
		t.adicionar(natura);
		t.adicionar(bigtasty);
		t.adicionar(natura);
		t.pedidos();
		
		System.out.println("Total a pagar: " + t.finalizarPedido() + "€");
		t.pagar(false);
		
	
	}
	
}
