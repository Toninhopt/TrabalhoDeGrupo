package Trabalho;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class Batata extends Produto {

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
	 * Metodo Construtor
	 * @param nome
	 * @param preço
	 */
	public Batata(String nome, double preço) {
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
