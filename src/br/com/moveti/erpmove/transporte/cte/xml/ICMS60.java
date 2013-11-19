/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMS60")
public class ICMS60 {

    private String CST;
    private Double vBCSTRet;
    private Double vICMSSTRet;
    private Double pICMSSTRet;
    private Double vCred;

    /**
     * Descricao: Classificação Tributária do Serviço
     * Observacao: 60 - ICMS cobrado anteriormente por substituição tributária
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setCST(String CST) {
        this.CST = CST;
    }

    /**
     * Descricao: Valor da BC do ICMS ST retido
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvBCSTRet(Double vBCSTRet) {
        this.vBCSTRet = vBCSTRet;
    }

    /**
     * Descricao: Valor do ICMS ST retido
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvICMSSTRet(Double vICMSSTRet) {
        this.vICMSSTRet = vICMSSTRet;
    }

    /**
     * Descricao: Alíquota do ICMS
     * Observacao: 5 posições, sendo 3 inteiras e 2 decimais
     * <b>Obrigatório</b>
     * Tamanho: 3, 2
     * @param 
     */
    public void setpICMSSTRet(Double pICMSSTRet) {
        this.pICMSSTRet = pICMSSTRet;
    }

    /**
     * Descricao: Valor do Crédito outorgado/Presumido
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

    public Double getpICMSSTRet() {
        return pICMSSTRet;
    }

    public Double getvBCSTRet() {
        return vBCSTRet;
    }

    public Double getvCred() {
        return vCred;
    }

    public Double getvICMSSTRet() {
        return vICMSSTRet;
    }
}
