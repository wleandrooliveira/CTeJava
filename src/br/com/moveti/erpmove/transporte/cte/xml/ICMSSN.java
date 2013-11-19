/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Simples Nacional - Obrigatório
 * @author Jéssica
 */
@XStreamAlias("CST")
public class ICMSSN {
    @XStreamAlias("indSN")
    private String indSN;
    @XStreamAlias("infAdFisco")
    private String infAdFisco;

    /**
     * @return the indSN
     */
    public String getIndSN() {
        return indSN;
    }

    /**
     * @param indSN the indSN to set
     */
    public void setIndSN(String indSN) {
        this.indSN = indSN;
    }

    /**
     * @return the infAdFisco
     */
    public String getInfAdFisco() {
        return infAdFisco;
    }

    /**
     * @param infAdFisco the infAdFisco to set
     */
    public void setInfAdFisco(String infAdFisco) {
        this.infAdFisco = infAdFisco;
    }
}
