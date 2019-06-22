package Trabalho;
/**
 * 
 * @author Hugo Duarte, André Ribeiro, Teresa Santos
 *
 */
public abstract class Hamburger extends Produto {
	
	/**
	 * Metodo acessor super
	 */
	
	@Override
	public double getPreço() {
		return super.getPreço();
	}
	/**
	 * Metodo acessor super	
	 */
	@Override
	public String getNome() {
		return super.getNome();
	}
	/**
	 * Metodo construtor
	 * @param nome
	 * @param preço
	 */
	public Hamburger(String nome, double preço) {
		super(nome, preço);
	}
}
