/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Jéssica
 */
@XStreamAlias("protCTe")
public class protCTe {
    @XStreamAlias("versao")
    private String versao;
    private infProt infProt = new infProt();
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
     * @return the infProt
     */
    public infProt getInfProt() {
        return infProt;
    }

    /**
     * @param infProt the infProt to set
     */
    public void setInfProt(infProt infProt) {
        this.infProt = infProt;
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
