/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("refNF")
public class refNF {

    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("mod")
    private String mod;
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("subserie")
    private String subserie;
    @XStreamAlias("nro")
    private String nro;
    @XStreamAlias("valor")
    private String valor;
    @XStreamAlias("dEmi")
    private String dEmi;

    /**
     * Descricao: CNPJ do Emitente
     * Observacao: Informar o CNPJ do emitente do Documento Fiscal
     * <b>Obrigatório</b>
     * Tamanho: 14
     * @param 
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Descricao: Número do CPF
     * Observacao: Informar o CPF do emitente do documento fiscal
     * <b>Obrigatório</b>
     * Tamanho: 11
     * @param 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * Descricao: Modelo do Documento Fiscal
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setMod(String mod) {
        this.mod = mod;
    }

    /**
     * Descricao: Serie do documento fiscal
     * <b>Obrigatório</b>
     * Tamanho: 1 - 3
     * @param 
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Subserie do documento fiscal
     * Tamanho: 1 - 3
     * @param 
     */
    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }

    /**
     * Descricao: Número do documento fiscal
     * <b>Obrigatório</b>
     * Tamanho: 1 - 6
     * @param 
     */
    public void setNro(String nro) {
        this.nro = nro;
    }

    /**
     * Descricao: Valor do documento fiscal
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * Descricao: Data de emissão do documento fiscal
     * <b>Obrigatório</b>
     * Tamanho: 10
     * @param 
     */
    public void setdEmi(String dEmi) {
        this.dEmi = dEmi;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public String getdEmi() {
        return dEmi;
    }

    public String getMod() {
        return mod;
    }

    public String getNro() {
        return nro;
    }

    public String getSerie() {
        return serie;
    }

    public String getSubserie() {
        return subserie;
    }

    public String getValor() {
        return valor;
    }
}
