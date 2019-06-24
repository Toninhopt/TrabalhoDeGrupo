package Trabalho;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class Natura extends Hamburger {
	/**
	 * Metodo acessor para buscar preco
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
	 * Construtor do Hamburger Natura
	 * @param nome
	 * @param preço
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
