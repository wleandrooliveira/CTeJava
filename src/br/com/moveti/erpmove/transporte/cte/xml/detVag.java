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

@XStreamAlias("detVag")
public class detVag {
    @XStreamAlias("nVag")
    private String nVag;
    @XStreamAlias("cap")
    private String cap;
    @XStreamAlias("tpVag")
    private String tpVag;
    @XStreamAlias("pesoR")
    private String pesoR;
    @XStreamAlias("pesoBC")
    private String pesoBC;

    /**
     * @return the nVag
     */
    public String getnVag() {
        return nVag;
    }

    /**
     * @param nVag the nVag to set
     */
    public void setnVag(String nVag) {
        this.nVag = nVag;
    }

    /**
     * @return the cap
     */
    public String getCap() {
        return cap;
    }

    /**
     * @param cap the cap to set
     */
    public void setCap(String cap) {
        this.cap = cap;
    }

    /**
     * @return the tpVag
     */
    public String getTpVag() {
        return tpVag;
    }

    /**
     * @param tpVag the tpVag to set
     */
    public void setTpVag(String tpVag) {
        this.tpVag = tpVag;
    }

    /**
     * @return the pesoR
     */
    public String getPesoR() {
        return pesoR;
    }

    /**
     * @param pesoR the pesoR to set
     */
    public void setPesoR(String pesoR) {
        this.pesoR = pesoR;
    }

    /**
     * @return the pesoBC
     */
    public String getPesoBC() {
        return pesoBC;
    }

    /**
     * @param pesoBC the pesoBC to set
     */
    public void setPesoBC(String pesoBC) {
        this.pesoBC = pesoBC;
    }
    
}
