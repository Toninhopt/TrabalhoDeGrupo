package Trabalho;

public class Batata extends Produtos {
	
	protected double pre�o = 1.00;
	
	@Override
	public String toString() {
		return "Batata [pre�o=" + pre�o + "]";
	}

	public Batata(double pre�o) {
		super();
		this.pre�o = pre�o;
	}
	
	
}
