package Trabalho;
/**
 * 
 * @author Hugo Duarte, Andr� Ribeiro, Teresa Santos
 *
 */
public abstract class Hamburger extends Produto {
	
	/**
	 * Metodo acessor super
	 */
	
	@Override
	public double getPre�o() {
		return super.getPre�o();
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
	 * @param pre�o
	 */
	public Hamburger(String nome, double pre�o) {
		super(nome, pre�o);
	}
}
