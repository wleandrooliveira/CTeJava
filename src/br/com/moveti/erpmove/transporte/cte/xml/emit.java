/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Identificação do Emitente do CT-e
 * @author Jéssica
 */
@XStreamAlias("emit")
public class emit {
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("xFant")
    private String xFant;
    private enderEmit enderEmit = new enderEmit();

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the IE
     */
    public String getIE() {
        return IE;
    }

    /**
     * @param IE the IE to set
     */
    public void setIE(String IE) {
        this.IE = IE;
    }

    /**
     * @return the xNome
     */
    public String getxNome() {
        return xNome;
    }

    /**
     * @param xNome the xNome to set
     */
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    /**
     * @return the xFant
     */
    public String getxFant() {
        return xFant;
    }

    /**
     * @param xFant the xFant to set
     */
    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    /**
     * @return the enderEmit
     */
    public enderEmit getEnderEmit() {
        return enderEmit;
    }

    /**
     * @param enderEmit the enderEmit to set
     */
    public void setEnderEmit(enderEmit enderEmit) {
        this.enderEmit = enderEmit;
    }
}
