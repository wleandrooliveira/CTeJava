/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ICMS Isento, não Tributado ou diferido - Obrigatório
 * @author Jéssica
 */
@XStreamAlias("ICMS45")
public class ICMS45 {
    @XStreamAlias("CST")
    private String CST;

    /**
     * @return the CST
     */
    public String getCST() {
        return CST;
    }

    /**
     * @param CST the CST to set
     */
    public void setCST(String CST) {
        this.CST = CST;
    }
}
