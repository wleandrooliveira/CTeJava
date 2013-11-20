/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

/**
 *
 * @author Fernando
 */
public class lacUnidCarga {

    private String nLacre;

    /**
     * Descricao: Número do lacre
     * <b>Obrigatório</b>
     * Tamanho: 1 - 20
     * @param 
     */
    public void setnLacre(String nLacre) {
        this.nLacre = nLacre;
    }

    public String getnLacre() {
        return nLacre;
    }
}
