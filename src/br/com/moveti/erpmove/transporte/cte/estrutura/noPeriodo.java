/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega no período definido - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("noPeriodo")
public class noPeriodo {

    @XStreamAlias("tpPer")
    private String tpPer;
    @XStreamAlias("dIni")
    private String dIni;
    @XStreamAlias("dFim")
    private String dFim;

    /**
     * Descricao: Tipo período
     * Observacao: 4-no período
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpPer(String tpPer) {
        this.tpPer = tpPer;
    }

    /**
     * Descricao: Data inicial 
     * Observacao: Formato AAAA-MM-DD
     * <b>Obrigatório</b>
     * Tamanho: 10
     * @param 
     */
    public void setdIni(String dIni) {
        this.dIni = dIni;
    }

    /**
     * Descricao: Data final
     * Observacao: Formato AAAA-MM-DD
     * <b>Obrigatório</b>
     * Tamanho: 10
     * @param 
     */
    public void setdFim(String dFim) {
        this.dFim = dFim;
    }

    public String getdFim() {
        return dFim;
    }

    public String getdIni() {
        return dIni;
    }

    public String getTpPer() {
        return tpPer;
    }
}
