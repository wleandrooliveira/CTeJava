/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Dados das duplicatas
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("dup")
public class dup {

    @XStreamAlias("nDup")
    private String nDup;
    @XStreamAlias("dVenc")
    private String dVenc;
    @XStreamAlias("vDup")
    private String vDup;

    /**
     * Descricao: Número da duplicata
     * Tamanho: 1 - 60
     * @param 
     */
    public void setnDup(String nDup) {
        this.nDup = nDup;
    }

    /**
     * Descricao: Data de vencimento da duplicata (AAAAMM-DD)
     * Tamanho: 10
     * @param 
     */
    public void setdVenc(String dVenc) {
        this.dVenc = dVenc;
    }

    /**
     * Descricao: Valor da duplicata
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * Tamanho: 13, 2
     * @param 
     */
    public void setvDup(String vDup) {
        this.vDup = vDup;
    }
}
