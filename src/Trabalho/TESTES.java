package Trabalho;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TESTES {

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
    public Produto getPagamento(int index) {
        return pagamento.get(index);
    }

    @Test
    void Natura() {
        natura = new Natura("Hamburger Natura", 2.00);
        assertEquals(2.00, natura.getpreco());
        assertEquals("Hamburger Natura", natura.getNome());
    }

    @Test
    void BigTasty() {
        bigtasty = new BigTasty("Hamburger BigTasty", 3.00);
        assertEquals(3.00, bigtasty.getpreco());
        assertEquals("Hamburger BigTasty", bigtasty.getNome());
    }
}
