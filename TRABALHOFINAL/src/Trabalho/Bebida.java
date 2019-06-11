package Trabalho;

public class Bebida extends Produtos {
	
	protected double preço = 1.00;
	
	public double getPreço() {
		return preço;
	}
	
	
	@Override
	public String toString() {
		return "Bebida [preço=" + preço + "]";
	}	
	
}
