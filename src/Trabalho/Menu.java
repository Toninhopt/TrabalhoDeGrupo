package Trabalho;

public class Menu extends Produtos {
	
	protected Hamburger hamburger;
	protected BigTasty BigTasty;
	protected Bebida bebida;
	protected Batata batata;
	protected double pre�o;


	public Menu(Hamburger hamburger, Bebida bebida, Batata batata, double pre�o) {
		super();
		this.hamburger = hamburger;
		this.bebida = bebida;
		this.batata = batata;
		this.pre�o = pre�o;
	}


	@Override
	public String toString() {
		return "Menu = " + "Bigtasty" + ", bebida" + ", batata"+ " | PRE�O = " + pre�o + "�" +"]";
	}







	
		
	
	
	}
	
	
	