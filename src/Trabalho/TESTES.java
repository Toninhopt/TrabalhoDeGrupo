
package Trabalho;
	
import static org.junit.jupiter.api.Assertions.*;
	
import java.util.ArrayList;
	
import org.junit.jupiter.api.Test;
	
class TESTES {
	
	int pedidos;
	Mc mc;
	Tabuleiro t;
	Pagamento paga;
	Produto produto;
	MenuBigTasty menu;
	BigTasty bigtasty;
	Hamburger hamburger;
	Natura natura;
	Bebida bebida;
	Batata batata;
	
	ArrayList<Produto> pagamento = new ArrayList<>();
	ArrayList<Tabuleiro> tabuleiro = new ArrayList<>(); 
	
	public Produto getPagamento(int index) {
		return pagamento.get(index);
	}
    
		
	@Test
	void Natura() {
		natura = new Natura("Hamburger Natura", 2.00);
		assertEquals(2.00, natura.getPreco());
		assertEquals("Hamburger Natura", natura.getNome());	
	}
	
	@Test
	void BigTasty() {
		bigtasty = new BigTasty("Hamburger BigTasty", 3.00);
        assertEquals(3.00, bigtasty.getPreco());
		assertEquals("Hamburger BigTasty", bigtasty.getNome());
	}
	
	@Test
	void Bebida() {
		bebida = new Bebida("Coca-cola", 1.00);
		assertEquals(1.00, bebida.getPreco());
		assertEquals("Coca-cola", bebida.getNome());	
	}
	
	@Test
	void Batata() {
		batata = new Batata("Batatoide", 1.00); 
		assertEquals(1.00, batata.getPreco());
		assertEquals("Batatoide", batata.getNome());	
	}
	
	@Test
	void Menu() {
		bigtasty = new BigTasty("Hamburger BigTasty", 3.00);
		batata = new Batata("Batatoide", 1.00); 
		bebida = new Bebida("Coca-cola", 1.00);
		MenuBigTasty menuBigTasty = new MenuBigTasty("MenuBigTasty", 5.00, bigtasty, bebida, batata);
		assertEquals(5.00, menuBigTasty.getPreco());
		assertEquals("MenuBigTasty", menuBigTasty.getNome());	
	}
	
	@Test
	void SomaPagamento() {
        bigtasty = new BigTasty("Hamburger BigTasty", 3.00);
        natura = new Natura("Hamburger Natura", 2.00);
        batata = new Batata("Batatoide", 1.00);
        bebida = new Bebida("Coca-cola", 1.00);
        menu = new MenuBigTasty("MenuBigTasty", 5.00, bigtasty, bebida, batata);
        ArrayList<Produto> pedido = new ArrayList<>();
        pedido.add(bebida);
        pedido.add(bigtasty);
        pedido.add(natura);
        pedido.add(menu);
        pedido.add(batata);
        Pagamento paga=new Pagamento(pedido);
        double novo = paga.conta();
        assertEquals(12, novo);
    }
	
	@Test
	void TabuleiroInsertTest() {
		mc = new Mc();
		pedidos = mc.newTab();
		bebida = new Bebida("Cocacola", 1.00); 
		bigtasty = new BigTasty("bigtasty", 3.00);
		mc.getTabuleiro(pedidos).adicionar(bigtasty);
		mc.getTabuleiro(pedidos).finalizarPedido();
	}	
		
	@Test
	void TabuleiroRemoveTest() {
		try {
			mc = new Mc();
			pedidos = mc.newTab();
			bebida = new Bebida("CocaCola", 1.00);
			mc.getTabuleiro(pedidos).remove(bebida);
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
		}
	}
	
	@Test
	void TabuleiroFinalizarPedido() {
		try {
			t = new Tabuleiro();
			t.finalizarPedido();
		} catch (IllegalArgumentException e) {
			
		}
		
	}
	
}	