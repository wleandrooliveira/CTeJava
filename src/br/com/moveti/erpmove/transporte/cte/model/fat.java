/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Dados da fatura
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("fat")
public class fat {

    @XStreamAlias("nFat")
    private String nFat;
    @XStreamAlias("vOrig")
    private String vOrig;
    @XStreamAlias("vDesc")
    private String vDesc;
    @XStreamAlias("vLiq")
    private String vLiq;

    /**
     * Descricao: Número da fatura
     * Tamanho: 1 - 60
     * @param 
     */
    public void setnFat(String nFat) {
        this.nFat = nFat;
    }

    /**
     * Descricao: Valor original da fatura
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvOrig(String vOrig) {
        this.vOrig = vOrig;
    }

    /**
     * Descricao: Valor do desconto da fatura
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvDesc(String vDesc) {
        this.vDesc = vDesc;
    }

    /**
     * Descricao: Valor líquido da fatura
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvLiq(String vLiq) {
        this.vLiq = vLiq;
    }

    public String getnFat() {
        return nFat;
    }

    public String getvDesc() {
        return vDesc;
    }

    public String getvLiq() {
        return vLiq;
    }

    public String getvOrig() {
        return vOrig;
    }
}
