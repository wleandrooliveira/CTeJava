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
@XStreamAlias("emiDocAnt")
public class emiDocAnt {
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("CPF")    
    private String CPF;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("xNome")
    private String xNome;

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
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
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
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
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
}
