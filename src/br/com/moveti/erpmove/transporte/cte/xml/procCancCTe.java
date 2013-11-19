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
@XStreamAlias("procCancCTe")
public class procCancCTe {
    @XStreamAlias("versao")
    private String versao;
    private cancCTe cancCTe = new cancCTe();
    private retCancCTe retCancCTe = new retCancCTe();

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
     * @return the cancCTe
     */
    public cancCTe getCancCTe() {
        return cancCTe;
    }

    /**
     * @param cancCTe the cancCTe to set
     */
    public void setCancCTe(cancCTe cancCTe) {
        this.cancCTe = cancCTe;
    }

    /**
     * @return the retCancCTe
     */
    public retCancCTe getRetCancCTe() {
        return retCancCTe;
    }

    /**
     * @param retCancCTe the retCancCTe to set
     */
    public void setRetCancCTe(retCancCTe retCancCTe) {
        this.retCancCTe = retCancCTe;
    }
}
