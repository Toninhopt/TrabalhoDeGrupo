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
	public double getpreco() {
		return super.getpreco();
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
	 * @param preco
	 */
	public Hamburger(String nome, double preco) {
		super(preco,nome);
	}
}
