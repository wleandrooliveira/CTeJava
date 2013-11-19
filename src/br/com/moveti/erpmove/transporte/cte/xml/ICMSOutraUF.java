/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ICMS devido à UF de origem da prestação, quando diferente da UF do emitente
 * @author Jéssica
 */
@XStreamAlias("ICMSOutraUF")
public class ICMSOutraUF {
    @XStreamAlias("CST")
    private String CST;
    @XStreamAlias("pRedBCOutraUF")
    private String pRedBCOutraUF;
    @XStreamAlias("vBCOutraUF")
    private String vBCOutraUF;
    @XStreamAlias("pICMSOutraUF")
    private String pICMSOutraUF;
    @XStreamAlias("vICMSOutraUF")
    private String vICMSOutraUF;

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

    /**
     * @return the pRedBCOutraUF
     */
    public String getpRedBCOutraUF() {
        return pRedBCOutraUF;
    }

    /**
     * @param pRedBCOutraUF the pRedBCOutraUF to set
     */
    public void setpRedBCOutraUF(String pRedBCOutraUF) {
        this.pRedBCOutraUF = pRedBCOutraUF;
    }

    /**
     * @return the vBCOutraUF
     */
    public String getvBCOutraUF() {
        return vBCOutraUF;
    }

    /**
     * @param vBCOutraUF the vBCOutraUF to set
     */
    public void setvBCOutraUF(String vBCOutraUF) {
        this.vBCOutraUF = vBCOutraUF;
    }

    /**
     * @return the pICMSOutraUF
     */
    public String getpICMSOutraUF() {
        return pICMSOutraUF;
    }

    /**
     * @param pICMSOutraUF the pICMSOutraUF to set
     */
    public void setpICMSOutraUF(String pICMSOutraUF) {
        this.pICMSOutraUF = pICMSOutraUF;
    }

    /**
     * @return the vICMSOutraUF
     */
    public String getvICMSOutraUF() {
        return vICMSOutraUF;
    }

    /**
     * @param vICMSOutraUF the vICMSOutraUF to set
     */
    public void setvICMSOutraUF(String vICMSOutraUF) {
        this.vICMSOutraUF = vICMSOutraUF;
    }
    
}
