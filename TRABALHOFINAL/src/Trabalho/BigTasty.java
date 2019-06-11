package Trabalho;

public class BigTasty extends Hamburger {
	
	protected double preço = 3.00;
	
	
	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	

	@Override
	public String toString() {
		return "BigTasty [preço=" + preço + "]";
	}
	
	
	
	
	
	
}
