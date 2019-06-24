package Trabalho;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class MenuBigTasty extends Produto {
	
	protected Hamburger hamburger;
	protected Bebida bebida;
	protected Batata batata;
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
	 * @param bigtasty
	 * @param bebida
	 * @param batata
	 */
	public MenuBigTasty(String nome, double preco, Produto bigtasty, Produto bebida, Produto batata) {
		super(preco, nome);
		this.hamburger = (Hamburger) bigtasty;
		this.bebida = (Bebida) bebida;
		this.batata = (Batata) batata;
	}
	/**
	 * Metodo quer retorna nome e cria nova linha
	 */
	@Override
	public String toString() {
		return getNome()+ " --> " + this.hamburger.getNome() + " | " + this.bebida.getNome() + " | " + this.batata.getNome()+" | " +"\n----------------------------------";
	}
	
}
	
	
	