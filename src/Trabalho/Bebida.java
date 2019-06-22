package Trabalho;

public class Bebida extends Produtos {
	
	protected double preço = 1.00;

	@Override
	public String toString() {
		return "Bebida [preço=" + preço + "]";
	}

	public Bebida(double preço) {
		super();
		this.preço = preço;
	}
	
	
	
	
	
	
}
