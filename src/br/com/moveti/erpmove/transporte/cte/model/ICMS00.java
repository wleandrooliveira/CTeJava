/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Prestação sujeito à tributação normal do ICMS - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMS00")
public class ICMS00 {

    private String CST;
    private Double vBC;
    private Double pICMS;
    private Double vICMS;

    /**
     * Descricao: Classificação Tributária do Serviço
     * Observacao: 00 - tributação normal ICMS
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setCST(String CST) {
        this.CST = CST;
    }

    /**
     * Descricao: Valor da BC do ICMS
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvBC(Double vBC) {
        this.vBC = vBC;
    }

    /**
     * Descricao: Alíquota do ICMS
     * Observacao: 5 posições, sendo 3 inteiras e 2 decimais
     * <b>Obrigatório</b>
     * Tamanho: 3, 2
     * @param 
     */
    public void setpICMS(Double pICMS) {
        this.pICMS = pICMS;
    }

    /**
     * Descricao: Valor do ICMS
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvICMS(Double vICMS) {
        this.vICMS = vICMS;
    }

    public String getCST() {
        return CST;
    }

    public Double getpICMS() {
        return pICMS;
    }

    public Double getvBC() {
        return vBC;
    }

    public Double getvICMS() {
        return vICMS;
    }
}
