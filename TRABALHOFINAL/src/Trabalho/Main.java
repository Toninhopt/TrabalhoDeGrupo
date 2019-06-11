package Trabalho;

public class Main {
	
	public static void main(String[] args) {
		
		Produtos p = new Produtos();
		Mc mc = new Mc();
		
		//UP
		
		Produtos bigtasty = new BigTasty();
		Produtos natura = new Natura();
		Produtos batata = new Batata();
		Produtos bebida = new Bebida();
		Produtos menu = new Menu();
		
		//DOWN
		
		BigTasty bigTasty = (BigTasty) bigtasty;
		Natura Natura = (Natura) natura;
		Batata Batata = (Batata) batata;
		Bebida Bebida = (Bebida) bebida;
		Menu Menu = (Menu) menu;
		
	
		
		mc.adicionar(Menu);
		mc.adicionar(bigtasty);
		mc.adicionar(natura);
		System.out.println(mc.finalizarPedido() + "€");
		
		
		mc.pedidos();

		
		
		
	}
	
}
