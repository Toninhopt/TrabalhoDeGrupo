package Trabalho;

public class BigTasty extends Hamburger {
	
	protected double preço = 5.00;
	
	
	
	public BigTasty(double preço) {
		super(preço);
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "BigTasty [preço=" + preço + "]";
	}
	
	
	
	
	
	
}
