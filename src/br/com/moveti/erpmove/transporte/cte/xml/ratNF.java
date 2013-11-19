/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do Rateio das NF - Obrigatório [1-n]
 * @author Jéssica
 */
@XStreamAlias("ratNF")
public class ratNF {

    @XStreamAlias("ratNF")
    private String chave;
    @XStreamAlias("ratNF")
    private String pesoRat;

    /**
     * @return the chave
     */
    public String getChave() {
        return chave;
    }

    /**
     * @param chave the chave to set
     */
    public void setChave(String chave) {
        this.chave = chave;
    }

    /**
     * @return the pesoRat
     */
    public String getPesoRat() {
        return pesoRat;
    }

    /**
     * @param pesoRat the pesoRat to set
     */
    public void setPesoRat(String pesoRat) {
        this.pesoRat = pesoRat;
    }
}
