/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Endereço do emitente - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("enderEmit")
public class enderEmit {

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
    @XStreamAlias("fone")
    private String fone;

    /**
     * Descricao: Logradouro
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
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
     * <b>Obrigatório</b>
     * Tamanho: 7
     * @param 
     */
    public void setcMun(String cMun) {
        this.cMun = cMun;
    }

    /**
     * Descricao: Nome do município
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    /**
     * Descricao: CEP
     * Tamanho: 8
     * @param 
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * Descricao: Sigla da UF
     * <b>Obrigatório</b>
     * Tamanho: 9
     * @param 
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * Descricao: Telefone
     * Tamanho: 6 - 14
     * @param 
     */
    public void setFone(String fone) {
        this.fone = fone;
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

    public String getFone() {
        return fone;
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
}
