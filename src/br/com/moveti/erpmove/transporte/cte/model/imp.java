/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações relativas aos Impostos - Obrigatorio
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("imp")
public class imp {

    private ICMS ICMS = new ICMS();
    private Double vTotTrib;
    private String infAdFisco;

    /**
     * Descricao: Informações relativas ao ICMS
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS(br.com.moveti.erpmove.transporte.cte.model.ICMS ICMS) {
        this.ICMS = ICMS;
    }

    /**
     * Descricao: Valor Total dos Tributos
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * Tamanho: 13, 2
     * @param 
     */
    public void setvTotTrib(Double vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    /**
     * Descricao: Informações adicionais de interesse do Fisco
     * Observacao: Norma referenciada, informações complementares, etc
     * Tamanho: 1 - 2000
     * @param 
     */
    public void setInfAdFisco(String infAdFisco) {
        this.infAdFisco = infAdFisco;
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMS getICMS() {
        return ICMS;
    }

    public Double getvTotTrib() {
        return vTotTrib;
    }

    public String getInfAdFisco() {
        return infAdFisco;
    }
}
