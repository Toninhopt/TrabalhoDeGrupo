package Trabalho;
/**
 * 
 * @author Hugo Duarte, Andr� Ribeiro, Teresa Santos
 *
 */
public class Batata extends Produto {

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
	 * Metodo Construtor
	 * @param nome
	 * @param preco
	 */
	public Batata(String nome, double preco) {
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