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
@XStreamAlias("CTe")
public class CTe {
   private infCte infCte = new infCte();
   private Signature Signature = new Signature();

    /**
     * @return the infCte
     */
    public infCte getInfCTe() {
        return infCte;
    }

    /**
     * @param infCte the infCte to set
     */
    public void setInfCTe(infCte infCTe) {
        this.infCte = infCTe;
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
