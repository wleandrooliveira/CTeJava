/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ICMS devido à UF de origem da prestação, quando diferente da UF do emitente
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMSOutraUF")
public class ICMSOutraUF {

    private String CST;
    private String pRedBCOutraUF;
    private String vBCOutraUF;
    private String pICMSOutraUF;
    private String vICMSOutraUF;

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
    public void setpRedBCOutraUF(String pRedBCOutraUF) {
        this.pRedBCOutraUF = pRedBCOutraUF;
    }

    /**
     * Descricao: Valor da BC do ICMS
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvBCOutraUF(String vBCOutraUF) {
        this.vBCOutraUF = vBCOutraUF;
    }

    /**
     * Descricao: Alíquota do ICMS
     * Observacao: 5 posições, sendo 3 inteiras e 2 decimais
     * <b>Obrigatório</b>
     * Tamanho: 3, 2
     * @param 
     */
    public void setpICMSOutraUF(String pICMSOutraUF) {
        this.pICMSOutraUF = pICMSOutraUF;
    }

    /**
     * Descricao: Valor do ICMS devido outra UF
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvICMSOutraUF(String vICMSOutraUF) {
        this.vICMSOutraUF = vICMSOutraUF;
    }

    public String getCST() {
        return CST;
    }

    public String getpICMSOutraUF() {
        return pICMSOutraUF;
    }

    public String getpRedBCOutraUF() {
        return pRedBCOutraUF;
    }

    public String getvBCOutraUF() {
        return vBCOutraUF;
    }

    public String getvICMSOutraUF() {
        return vICMSOutraUF;
    }
}
