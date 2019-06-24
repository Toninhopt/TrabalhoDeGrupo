package Trabalho;

import java.util.ArrayList;
/**
 * 
 * @author Hugo Duarte
 *
 */
public class Mc {
	
	ArrayList<Tabuleiro> tabuleiro = new ArrayList<>(); 
	/**
	 * Metodo construtor
	 */
    public Mc() {

    }
    /**
     * Metodo acessor para ir buscar o tabuleiro
     * @return
     */
    public ArrayList<Tabuleiro> getTabuleiro() {
        return tabuleiro;
    }
    /**
     * Metodo acessor para ir buscar um pedido
     * @param i
     * @return
     */
    public Tabuleiro getTabuleiro(int i) {
        return tabuleiro.get(i);
    }
    /**
     * Metodo para criar um tabuleiro
     * @return
     */
    public int newTab() {
        Tabuleiro t = new Tabuleiro();
        tabuleiro.add(t);
        return tabuleiro.indexOf(t);
    }
    
}