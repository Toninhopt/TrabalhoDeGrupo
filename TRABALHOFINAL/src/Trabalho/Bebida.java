package Trabalho;

public class Bebida extends Produtos {
	
	protected double pre�o = 1.00;
	
	public double getPre�o() {
		return pre�o;
	}
	
	
	@Override
	public String toString() {
		return "Bebida [pre�o=" + pre�o + "]";
	}	
	
}
