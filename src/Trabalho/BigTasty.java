package Trabalho;
/**
 * 
 * @author Hugo Duarte, Andr� Ribeiro, Teresa Santos
 *
 */
public class BigTasty extends Hamburger {

	/**
	 * Metodo acessor para buscar preco
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
	 * Metodo construtor
	 * @param nome
	 * @param preco
	 */
	public BigTasty(String nome, double preco) {
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
