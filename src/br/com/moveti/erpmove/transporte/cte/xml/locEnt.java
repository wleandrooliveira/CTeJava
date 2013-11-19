/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Local de Entrega constante na Nota Fiscal
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("locEnt")
public class locEnt {

    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("xNome")
    private String xNome;
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
    @XStreamAlias("UF")
    private String UF;

    /**
     * Descricao: Número do CNPJ
     * Observacao: Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros. Informar os zeros não significativos
     * <b>Obrigatório</b>
     * Tamanho: 14
     * @param 
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Descricao: Número do CPF
     * Observacao: Informar os zeros não significativos
     * <b>Obrigatório</b>
     * Tamanho: 11
     * @param 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * Descricao: Razão social ou nome do remetente
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

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
     * Descricao: Sigla da UF
     * Observacao: Informar EX para operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public String getUF() {
        return UF;
    }

    public String getcMun() {
        return cMun;
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

    public String getxNome() {
        return xNome;
    }
}
