package Trabalho;
/**
 * 
 * @author Hugo Duarte, André Ribeiro, Teresa Santos
 *
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
	 * @param bigtasty
	 * @param bebida
	 * @param batata
	 */
	public MenuBigTasty(String nome, double preco, Produto bigtasty, Produto bebida, Produto batata) {
		super(nome, preco);
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
	
	
	