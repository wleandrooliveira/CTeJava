/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Tomador é contribuinte do ICMS - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("tomaICMS")
public class tomaICMS {

    @XStreamAlias("refNFe")
    private String refNFe;
    private refNF refNF = new refNF();
    private String refCte;

    /**
     * Descricao: Chave de acesso da NF-e emitida pelo Tomador
     * <b>Obrigatório</b>
     * Tamanho: 474
     * @param 
     */
    public void setRefNFe(String refNFe) {
        this.refNFe = refNFe;
    }

    /**
     * Descricao: Informação da NF ou CT emitido pelo Tomador
     * <b>Obrigatório</b>
     * Tamanho: 474
     * @param 
     */
    public void setRefNF(br.com.moveti.erpmove.transporte.cte.model.refNF refNF) {
        this.refNF = refNF;
    }

    /**
     * Descricao: Chave de acesso do CT-e emitido pelo Tomador
     * <b>Obrigatório</b>
     * Tamanho: 474
     * @param 
     */
    public void setRefCte(String refCte) {
        this.refCte = refCte;
    }

    public String getRefCte() {
        return refCte;
    }

    public br.com.moveti.erpmove.transporte.cte.model.refNF getRefNF() {
        return refNF;
    }

    public String getRefNFe() {
        return refNFe;
    }
}
