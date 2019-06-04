package Trabalho;

public class Menu extends Produtos {
	
	protected Hamburger hamburger;
	protected BigTasty BigTasty;
	protected Bebida bebida;
	protected Batata batata;
	protected double preço;


	public Menu(Hamburger hamburger, Bebida bebida, Batata batata, double preço) {
		super();
		this.hamburger = hamburger;
		this.bebida = bebida;
		this.batata = batata;
		this.preço = preço;
	}


	@Override
	public String toString() {
		return "Menu = " + "Bigtasty" + ", bebida" + ", batata"+ " | PREÇO = " + preço + "€" +"]";
	}







	
		
	
	
	}
	
	
	