/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jéssica
 */
@XStreamAlias("rem")
public class rem {
    @XStreamAlias("CNPJ")    
    private String CNPJ;
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("xFant")
    private String xFant;
    @XStreamAlias("fone")
    private String fone;
    private enderReme enderReme = new enderReme();
    @XStreamAlias("email")
    private String email;
    @XStreamImplicit(itemFieldName = "infNF")
    private List<infNF> infNF = new ArrayList<infNF>();       
    private List<infNFe> infNFe = new ArrayList<infNFe>();
    private infOutros infOutros = new infOutros();

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
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the enderReme
     */
    public enderReme getEnderReme() {
        return enderReme;
    }

    /**
     * @param enderReme the enderReme to set
     */
    public void setEnderReme(enderReme enderReme) {
        this.enderReme = enderReme;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }  
    

    public infOutros getInfOutros() {
        return infOutros;
    }

    public void setInfOutros(infOutros infOutros) {
        this.infOutros = infOutros;
    }

    public List<infNF> getInfNF() {
        return infNF;
    }

    public void setInfNF(List<infNF> infNF) {
        this.infNF = infNF;
    }

    public List<infNFe> getInfNFe() {
        return infNFe;
    }

    public void setInfNFe(List<infNFe> infNFe) {
        this.infNFe = infNFe;
    }
}
