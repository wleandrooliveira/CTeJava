/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Prestação sujeito à tributação com redução de BC do ICMS - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMS20")
public class ICMS20 {

    private String CST;
    private Double pRedBC;
    private Double vBC;
    private Double pICMS;
    private Double vICMS;

    /**
     * Descricao: Classificação Tributária do serviço
     * Observacao: 20 - tributação com BC reduzida do ICMS
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setCST(String CST) {
        this.CST = CST;
    }

    /**
     * Descricao: Percentual de redução da BC
     * Observacao: 5 posições, sendo 3 inteiras e 2 decimais
     * <b>Obrigatório</b>
     * Tamanho: 3, 2
     * @param 
     */
    public void setpRedBC(Double pRedBC) {
        this.pRedBC = pRedBC;
    }

    /**
     * Descricao: Valor da BC do ICMS
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvBC(Double vBC) {
        this.vBC = vBC;
    }

    /**
     * Descricao: Alíquota do ICMS
     * Observacao: 5 posições, sendo 3 inteiras e 2 decimais.
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

    public Double getpRedBC() {
        return pRedBC;
    }

    public Double getvBC() {
        return vBC;
    }

    public Double getvICMS() {
        return vICMS;
    }
}
