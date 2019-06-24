package Trabalho;

public class Main {
	
	public static void main(String[] args) {

        Mc mc = new Mc();

        Produto bigtasty = new BigTasty("Hamburger BigTasty", 3.00);
        Produto natura = new Natura("Hamburger Natura", 2.00);
        Produto batata = new Batata("Batatoide", 1.00);
        Produto bebida = new Bebida("Coca-cola", 1.00);
        Produto menu = new MenuBigTasty("MenuBigTasty", 5.00, bigtasty, bebida, batata);

        int pedido = mc.newTab();
        mc.getTabuleiro(pedido).adicionar(menu);
        mc.getTabuleiro(pedido).adicionar(bebida);
        mc.getTabuleiro(pedido).adicionar(batata);
        mc.getTabuleiro(pedido).adicionar(bigtasty);
        mc.getTabuleiro(pedido).adicionar(natura);
        mc.getTabuleiro(pedido).pedidos();
        System.out.println("Total a pagar: " + mc.getTabuleiro(pedido).finalizarPedido() + "");
        mc.getTabuleiro(pedido).pagar(true);
        
        pedido = mc.newTab();
        mc.getTabuleiro(pedido).adicionar(menu);
        mc.getTabuleiro(pedido).adicionar(bebida);
        mc.getTabuleiro(pedido).adicionar(batata);
        mc.getTabuleiro(pedido).adicionar(bigtasty);
        mc.getTabuleiro(pedido).pedidos();
        System.out.println("Total a pagar: " + mc.getTabuleiro(pedido).finalizarPedido() + "");
        mc.getTabuleiro(pedido).pagar(true);

        
        
        
		
	}

}