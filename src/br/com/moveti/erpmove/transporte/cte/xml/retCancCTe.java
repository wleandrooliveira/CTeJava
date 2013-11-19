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
@XStreamAlias("retCancCTe")
public class retCancCTe {
    @XStreamAlias("versao")
    private String versao;   
    private infCanc infCanc = new infCanc();    
    private Signature Signature = new Signature();

    /**
     * @return the versao
     */
    public String getVersao() {
        return versao;
    }

    /**
     * @param versao the versao to set
     */
    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * @return the infCanc
     */
    public infCanc getInfCanc() {
        return infCanc;
    }

    /**
     * @param infCanc the infCanc to set
     */
    public void setInfCanc(infCanc infCanc) {
        this.infCanc = infCanc;
    }

    /**
     * @return the Signature
     */
    public Signature getSignature() {
        return Signature;
    }

    /**
     * @param Signature the Signature to set
     */
    public void setSignature(Signature Signature) {
        this.Signature = Signature;
    }
}
