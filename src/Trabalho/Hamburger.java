package Trabalho;

public abstract class Hamburger extends Produtos {
	
	protected double pre�o;
	protected BigTasty nome;

	public Hamburger(double pre�o) {
		super();
		this.pre�o = pre�o;
	}

	@Override
	public String toString() {
		return "Hamburger [pre�o=" + pre�o + "]";
	}
	
	
	
	
	
}
