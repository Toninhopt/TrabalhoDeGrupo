package Trabalho;

/**
 * 
 * @author Hugo Duarte, André Ribeiro, Teresa Santos
 *
 */
public class Natura extends Hamburger {
	
	/**
	 * Metodo acessor para buscar preço
	 */
	@Override
	public double getPreço() {
		return super.getPreço();
	}
	/**
	 * Metodo acessor para buscar nome
	 */
	@Override
	public String getNome() {
		return super.getNome();
	}
	/**
	 * Construtor do Hamburger Natura
	 * @param nome
	 * @param preço
	 */
	public Natura(String nome, double preço) {
		super(nome, preço);
	}
	/**
	 * Metodo que retorna o nome e cria nova linha
	 */
	@Override
	public String toString() {
		return getNome()+"\n----------------------------------";
	}


	
	
	

}
