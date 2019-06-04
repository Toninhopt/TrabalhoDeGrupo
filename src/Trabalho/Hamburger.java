package Trabalho;

public abstract class Hamburger extends Produtos {
	
	protected double preço;
	protected BigTasty nome;

	public Hamburger(double preço) {
		super();
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "Hamburger [preço=" + preço + "]";
	}
	
	
	
	
	
}
