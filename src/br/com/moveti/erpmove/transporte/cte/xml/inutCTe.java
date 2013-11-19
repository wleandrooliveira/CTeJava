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
@XStreamAlias("inutCTe")
public class inutCTe {
    @XStreamAlias("versao")
    private String versao;   
    private infInut infInut = new infInut();
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
     * @return the infInut
     */
    public infInut getInfInut() {
        return infInut;
    }

    /**
     * @param infInut the infInut to set
     */
    public void setInfInut(infInut infInut) {
        this.infInut = infInut;
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
