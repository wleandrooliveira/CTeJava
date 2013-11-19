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
@XStreamAlias("consReciCTe")
public class consReciCTe {
    @XStreamAlias("versao")
    private String versao;
    @XStreamAlias("tbAmb")
    private String tbAmb;
    @XStreamAlias("nRec")
    private String nRec;

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
     * @return the tbAmb
     */
    public String getTbAmb() {
        return tbAmb;
    }

    /**
     * @param tbAmb the tbAmb to set
     */
    public void setTbAmb(String tbAmb) {
        this.tbAmb = tbAmb;
    }

    /**
     * @return the nRec
     */
    public String getnRec() {
        return nRec;
    }

    /**
     * @param nRec the nRec to set
     */
    public void setnRec(String nRec) {
        this.nRec = nRec;
    }
}
