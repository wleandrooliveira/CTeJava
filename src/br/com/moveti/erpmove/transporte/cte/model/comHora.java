/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega com hora definida - obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("comHora")
public class comHora {

    @XStreamAlias("tpHor")
    private String tpHor;
    @XStreamAlias("hProg")
    private String hProg;

    /**
     * Descricao: Tipo de hora
     * Observacao: Preencher com: 1--No horário; 2-Até o horário; 3-A partir do horário
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpHor(String tpHor) {
        this.tpHor = tpHor;
    }

    /**
     * Descricao: Hora programada
     * Observacao: Formato HH:MM:SS
     * <b>Obrigatório</b>
     * Tamanho: 8
     * @param 
     */
    public void sethProg(String hProg) {
        this.hProg = hProg;
    }

    public String gethProg() {
        return hProg;
    }

    public String getTpHor() {
        return tpHor;
    }
}
