package Trabalho;

public class Bebida extends Produtos {
	
	private double preço = 1.00;
	
	public double getPreço() {
		return preço;
	}
	
	
	@Override
	public String toString() {
		return "Bebida\n----------------------------------";
	}	
	
}
