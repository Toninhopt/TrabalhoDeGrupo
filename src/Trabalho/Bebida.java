package Trabalho;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class Bebida extends Produto {
	
	/**
	 * Metodo acessor para buscar preço
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
	 * @param preço
	 */
	public Bebida(String nome, double preco) {
		super(preco, nome);
	}
	/**
	 * Metodo que retorna o nome e cria nova linha
	 */
	@Override
	public String toString() {
		return getNome()+"\n----------------------------------";
	}	
}
