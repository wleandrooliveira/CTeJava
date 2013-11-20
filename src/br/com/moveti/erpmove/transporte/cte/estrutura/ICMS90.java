/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ICMS Outros - Obrigatorio
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMS90")
public class ICMS90 {

    private String CST;
    private Double pRedBC;
    private Double vBC;
    private Double pICMS;
    private Double vICMS;
    private Double vCred;

    /**
     * Descricao: Classificação Tributária do Serviço
     * Observacao: 90 - ICMS outros
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

    /**
     * Descricao: Valor do Crédito Outorgado/Presumido
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * Tamanho: 13, 2
     * @param 
     */
    public void setvCred(Double vCred) {
        this.vCred = vCred;
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

    public Double getvCred() {
        return vCred;
    }

    public Double getvICMS() {
        return vICMS;
    }
}
