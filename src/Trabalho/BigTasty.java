package Trabalho;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class BigTasty extends Hamburger {

	/**
	 * Metodo acessor para buscar pre�o
	 */
	@Override
	public double getPreco() {
		return super.getPreco();
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
	 * @param pre�o
	 */
	public BigTasty(String nome, double pre�o) {
		super(nome, pre�o);
	}
	/**
	 * Metodo que retorna o nome e cria nova linha
	 */
	@Override
	public String toString() {
		return getNome()+"\n----------------------------------";
	}

	
	
	
	
	
	
	
}
