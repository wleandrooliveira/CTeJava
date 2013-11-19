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
@XStreamAlias("lacre")
public class lacre {
    @XStreamAlias("nLacre")
    private String nLacre;

    /**
     * @return the nLacre
     */
    public String getnLacre() {
        return nLacre;
    }

    /**
     * @param nLacre the nLacre to set
     */
    public void setnLacre(String nLacre) {
        this.nLacre = nLacre;
    }
    
}
