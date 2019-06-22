package Trabalho;

public class Batata extends Produtos {
	
	protected double preço = 1.00;
	
	@Override
	public String toString() {
		return "Batata [preço=" + preço + "]";
	}

	public Batata(double preço) {
		super();
		this.preço = preço;
	}
	
	
}
