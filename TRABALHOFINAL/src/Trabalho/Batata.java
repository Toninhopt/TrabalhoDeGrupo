package Trabalho;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class Batata extends Produto {

	/**
	 * Metodo acessor para buscar pre�o
	 */
	@Override
	public double getPre�o() {
		return super.getPre�o();
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
	 * @param pre�o
	 */
	public Batata(String nome, double pre�o) {
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
