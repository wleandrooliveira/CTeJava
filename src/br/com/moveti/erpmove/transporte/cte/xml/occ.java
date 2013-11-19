/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Ordens de Coleta associados - Não obrigatório [0-10]
 * @author Jéssica
 */
@XStreamAlias("occ")
public class occ {
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("nOcc")
    private String nOcc;
    @XStreamAlias("dEmi")
    private String dEmi;
    private emiOcc emiOcc = new emiOcc();

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the nOcc
     */
    public String getnOcc() {
        return nOcc;
    }

    /**
     * @param nOcc the nOcc to set
     */
    public void setnOcc(String nOcc) {
        this.nOcc = nOcc;
    }

    /**
     * @return the dEmi
     */
    public String getdEmi() {
        return dEmi;
    }

    /**
     * @param dEmi the dEmi to set
     */
    public void setdEmi(String dEmi) {
        this.dEmi = dEmi;
    }
}
