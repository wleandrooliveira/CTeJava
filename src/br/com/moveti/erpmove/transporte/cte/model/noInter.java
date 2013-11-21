/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import br.com.moveti.erpmove.transporte.cte.model.enuns.TipoPeriodoHora;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega no intervalo de horário definido - obrigatorio
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("noInter")
public class noInter {

    @XStreamAlias("tpHor")
    private TipoPeriodoHora tpHor;
    @XStreamAlias("hIni")
    private String hIni;
    @XStreamAlias("hFim")
    private String hFim;

    /**
     * Descricao: Tipo de hora
     * Observacao: 4 - No intervalo de tempo
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpHor(TipoPeriodoHora tpHor) {
        this.tpHor = tpHor;
    }

    /**
     * Descricao: Hora inicial
     * Observacao: Formato HH:MM:SS
     * <b>Obrigatório</b>
     * Tamanho: 8
     * @param 
     */
    public void sethIni(String hIni) {
        this.hIni = hIni;
    }

    /**
     * Descricao: Hora final
     * Observacao: Formato HH:MM:SS
     * <b>Obrigatório</b>
     * Tamanho: 8
     * @param 
     */
    public void sethFim(String hFim) {
        this.hFim = hFim;
    }

    public String gethFim() {
        return hFim;
    }

    public String gethIni() {
        return hIni;
    }

    public TipoPeriodoHora getTpHor() {
        return tpHor;
    }
}
