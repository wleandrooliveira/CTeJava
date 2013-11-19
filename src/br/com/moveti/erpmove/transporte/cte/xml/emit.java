/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Identificação do Emitente do CT-e - 
 * @author Geraldo Henrique Lacerda Pinto
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
     * Descricao: CNPJ do emitente
     * Observacao: Informar zeros não significativos
     * <b>Obrigatório</b>
     * Tamanho: 14
     * @param 
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Descricao: Inscrição Estadual do Emitente
     * <b>Obrigatório</b>
     * Tamanho: 2 - 14
     * @param 
     */
    public void setIE(String IE) {
        this.IE = IE;
    }

    /**
     * Descricao: Razão social ou Nome do emitente
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    /**
     * Descricao: Nome fantasia
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    /**
     * Descricao: Endereço do emitente
     * <b>Obrigatório</b>
     * @param 
     */
    public void setEnderEmit(br.com.moveti.erpmove.transporte.cte.xml.enderEmit enderEmit) {
        this.enderEmit = enderEmit;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getIE() {
        return IE;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.enderEmit getEnderEmit() {
        return enderEmit;
    }

    public String getxFant() {
        return xFant;
    }

    public String getxNome() {
        return xNome;
    }
}
