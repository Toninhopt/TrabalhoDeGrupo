package Trabalho;
/**
 * 
 * @author Hugo Duarte, Andr� Ribeiro, Teresa Santos
 *
 *
 */
public class Produto {
	
	protected double preco;
	protected String nome;
	/**
	 * Metodo acessor para buscar pre�o
	 * @return
	 */
	public double getpreco() {
		return preco;
	}
	/**
	 * Metodo acessor para buscar nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo construtor
	 * @param preco
	 * @param nome
	 */
	public Produto(double preco, String nome) {
		super();
		this.preco = preco;
		this.nome = nome;
		
	}
	
	
	
	
	
	
	
	
}
