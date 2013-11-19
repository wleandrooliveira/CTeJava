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
@XStreamAlias("cteProc")
public class cteProc {
    @XStreamAlias("versao")
    private String versao;
    private CTe CTe = new CTe();
    private protCTe protCTe = new protCTe();

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
     * @return the CTe
     */
    public CTe getCTe() {
        return CTe;
    }

    /**
     * @param CTe the CTe to set
     */
    public void setCTe(CTe CTe) {
        this.CTe = CTe;
    }

    /**
     * @return the protCTe
     */
    public protCTe getProtCTe() {
        return protCTe;
    }

    /**
     * @param protCTe the protCTe to set
     */
    public void setProtCTe(protCTe protCTe) {
        this.protCTe = protCTe;
    }
}
