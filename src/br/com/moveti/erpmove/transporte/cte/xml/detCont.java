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
@XStreamAlias("detCont")
public class detCont {
    @XStreamAlias("nCont")    
    private String nCont;

    /**
     * @return the nCont
     */
    public String getnCont() {
        return nCont;
    }

    /**
     * @param nCont the nCont to set
     */
    public void setnCont(String nCont) {
        this.nCont = nCont;
    }
    
}
