/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações ref. a previsão de entrega - Não Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("Entrega")
public class Entrega {

    private semData semData = new semData();
    private comData comData = new comData();
    private noPeriodo noPeriodo = new noPeriodo();
    private semHora semHora = new semHora();
    private comHora comHora = new comHora();
    private noInter noInter = new noInter();

    /**
     * Descricao: Entrega sem data definida
     * Observacao: Esta opção é proibida para o modal aéreo.
     * <b>Obrigatório</b>
     * @param 
     */
    public void setSemData(br.com.moveti.erpmove.transporte.cte.model.semData semData) {
        this.semData = semData;
    }

    /**
     * Descricao:Entrega com data definida 
     * <b>Obrigatório</b>
     * @param 
     */
    public void setComData(br.com.moveti.erpmove.transporte.cte.model.comData comData) {
        this.comData = comData;
    }

    /**
     * Descricao: Entrega no período definido
     * <b>Obrigatório</b>
     * @param 
     */
    public void setNoPeriodo(br.com.moveti.erpmove.transporte.cte.model.noPeriodo noPeriodo) {
        this.noPeriodo = noPeriodo;
    }

    /**
     * Descricao: Entrega sem hora definida
     * <b>Obrigatório</b>
     * @param 
     */
    public void setSemHora(br.com.moveti.erpmove.transporte.cte.model.semHora semHora) {
        this.semHora = semHora;
    }

    /**
     * Descricao: Entrega com hora definida
     * <b>Obrigatório</b>
     * @param 
     */
    public void setComHora(br.com.moveti.erpmove.transporte.cte.model.comHora comHora) {
        this.comHora = comHora;
    }

    /**
     * Descricao: Entrega no intervalo de horário definido
     * <b>Obrigatório</b>
     * @param 
     */
    public void setNoInter(br.com.moveti.erpmove.transporte.cte.model.noInter noInter) {
        this.noInter = noInter;
    }

    public br.com.moveti.erpmove.transporte.cte.model.comData getComData() {
        return comData;
    }

    public br.com.moveti.erpmove.transporte.cte.model.comHora getComHora() {
        return comHora;
    }

    public br.com.moveti.erpmove.transporte.cte.model.noInter getNoInter() {
        return noInter;
    }

    public br.com.moveti.erpmove.transporte.cte.model.noPeriodo getNoPeriodo() {
        return noPeriodo;
    }

    public br.com.moveti.erpmove.transporte.cte.model.semData getSemData() {
        return semData;
    }

    public br.com.moveti.erpmove.transporte.cte.model.semHora getSemHora() {
        return semHora;
    }
}
