/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega com data definida - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
public class comData {

    @XStreamAlias("tpPer")
    private String tpPer;
    private String dProg;

    /**
     * Descricao: Tipo de data/período programado para entrega
     * Observacao: Preencher com: 1-Na data; 2-Até a data; 3-A partir da data
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpPer(String tpPer) {
        this.tpPer = tpPer;
    }

    /**
     * Descricao: Data programada
     * Observacao: Formato AAAA-MM-DD
     * <b>Obrigatório</b>
     * Tamanho: 10
     * @param 
     */
    public void setdProg(String dProg) {
        this.dProg = dProg;
    }

    public String getdProg() {
        return dProg;
    }

    public String getTpPer() {
        return tpPer;
    }
}
