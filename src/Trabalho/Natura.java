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
	public double getpreco() {
		return super.getpreco();
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
	 * @param preco
	 */
	public Natura(String nome, double preco) {
		super(nome, preco);
	}
	/**
	 * Metodo que retorna o nome e cria nova linha
	 */
	@Override
	public String toString() {
		return getNome()+"\n----------------------------------";
	}


	
	
	

}
