package Trabalho;
/**
 * 
 * @author Hugo Duarte
 *
 */
public abstract class Hamburger extends Produto {
	
	/**
	 * Metodo acessor super
	 */
	@Override
	public double getPreco() {
		return super.getPreco();
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
	public Hamburger(String nome, double preco) {
		super(preco, nome);
	}
}
