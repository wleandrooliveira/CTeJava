/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("CTe")
public class CTe {

    private String xmlns = "http://www.portalfiscal.inf.br/cte";
    private infCte infCte = new infCte();
    private Signature Signature = new Signature();

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public void setInfCte(br.com.moveti.erpmove.transporte.cte.model.infCte infCte) {
        this.infCte = infCte;
    }

    public void setSignature(br.com.moveti.erpmove.transporte.cte.model.Signature Signature) {
        this.Signature = Signature;
    }

    public br.com.moveti.erpmove.transporte.cte.model.Signature getSignature() {
        return Signature;
    }

    public br.com.moveti.erpmove.transporte.cte.model.infCte getInfCte() {
        return infCte;
    }

    public String getXmlns() {
        return xmlns;
    }
}
