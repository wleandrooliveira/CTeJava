/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Proprietários do Veículo.Só preenchido quando o veículo não pertencer à empresa emitente do CT-e
 * -Não Obrigatório
 * @author Jéssica
 */
@XStreamAlias("prop")
public class prop {
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("RNTRC")
    private String RNTRC;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("tpProp")
    private String tpProp;

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
     * @return the RNTRC
     */
    public String getRNTRC() {
        return RNTRC;
    }

    /**
     * @param RNTRC the RNTRC to set
     */
    public void setRNTRC(String RNTRC) {
        this.RNTRC = RNTRC;
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
     * @return the tpProp
     */
    public String getTpProp() {
        return tpProp;
    }

    /**
     * @param tpProp the tpProp to set
     */
    public void setTpProp(String tpProp) {
        this.tpProp = tpProp;
    }
}
