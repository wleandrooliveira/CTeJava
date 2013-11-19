/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("enderDest")
public class enderDest {

    @XStreamAlias("xLgr")
    private String xLgr;
    @XStreamAlias("nro")
    private String nro;
    @XStreamAlias("xCpl")
    private String xCpl;
    @XStreamAlias("xBairro")
    private String xBairro;
    @XStreamAlias("cMun")
    private String cMun;
    @XStreamAlias("xMun")
    private String xMun;
    @XStreamAlias("CEP")
    private String CEP;
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("cPais")
    private String cPais;
    @XStreamAlias("xPais")
    private String xPais;

    /**
     * Descricao: Logradouro
     * <b>Obrigatório</b>
     * Tamanho: 1 - 255
     * @param 
     */
    public void setxLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    /**
     * Descricao: Número
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setNro(String nro) {
        this.nro = nro;
    }

    /**
     * Descricao: Complemento
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxCpl(String xCpl) {
        this.xCpl = xCpl;
    }

    /**
     * Descricao: Bairro
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    /**
     * Descricao: Código do município (utilizar a tabela do IBGE)
     * Observacao: Informar 9999999 para operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 7
     * @param 
     */
    public void setcMun(String cMun) {
        this.cMun = cMun;
    }

    /**
     * Descricao: Nome do município
     * Observacao: Informar EXTERIOR para operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    /**
     * Descricao: CEP
     * Observacao: Informar os zeros não significativos
     * Tamanho: 8
     * @param 
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * Descricao: Sigla da UF
     * Observacao: Informar EX para operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * Descricao: Código do país
     * Observacao: Utilizar a tabela do BACEN
     * Tamanho: 1 - 4
     * @param 
     */
    public void setcPais(String cPais) {
        this.cPais = cPais;
    }

    /**
     * Descricao: Nome do país
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxPais(String xPais) {
        this.xPais = xPais;
    }

    public String getCEP() {
        return CEP;
    }

    public String getUF() {
        return UF;
    }

    public String getcMun() {
        return cMun;
    }

    public String getcPais() {
        return cPais;
    }

    public String getNro() {
        return nro;
    }

    public String getxBairro() {
        return xBairro;
    }

    public String getxCpl() {
        return xCpl;
    }

    public String getxLgr() {
        return xLgr;
    }

    public String getxMun() {
        return xMun;
    }

    public String getxPais() {
        return xPais;
    }
}
