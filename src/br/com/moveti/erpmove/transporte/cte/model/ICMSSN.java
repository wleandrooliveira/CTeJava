/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Simples Nacional - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("CST")
public class ICMSSN {

    private String indSN;

    /**
     * Descricao: Indica se o contribuinte é Simples Nacional 1=Sim
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setIndSN(String indSN) {
        this.indSN = indSN;
    }

    public String getIndSN() {
        return indSN;
    }
}
