package Trabalho;
/**
 * 
 * @author Hugo Duarte, André Ribeiro, Teresa Santos
 *
 */
public class Bebida extends Produto {
	
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
	 * Metodo Construtor
	 * @param nome
	 * @param preco
	 */
	public Bebida(String nome, double preco) {
		super(preco,nome);
	}
	/**
	 * Metodo que retorna o nome e cria nova linha
	 */
	@Override
	public String toString() {
		return getNome()+"\n----------------------------------";
	}	
}
