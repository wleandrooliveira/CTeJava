/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * informações dos veículos transportados - 
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("veicNovos")
public class veicNovos {

    @XStreamAlias("chassi")
    private String chassi;
    @XStreamAlias("cCor")
    private String cCor;
    @XStreamAlias("xCor")
    private String xCor;
    @XStreamAlias("cMod")
    private String cMod;
    @XStreamAlias("vUnit")
    private String vUnit;
    @XStreamAlias("vFrete")
    private String vFrete;

    /**
     * Descricao: Chassi do veículo
     * <b>Obrigatório</b>
     * Tamanho: 17
     * @param 
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * Descricao: Cor do veículo
     * Observacao: Código de cada montadora
     * <b>Obrigatório</b>
     * Tamanho: 1 - 4
     * @param   
     */
    public void setcCor(String cCor) {
        this.cCor = cCor;
    }

    /**
     * Descricao: Descrição da cor
     * <b>Obrigatório</b>
     * Tamanho: 1 - 40
     * @param 
     */
    public void setxCor(String xCor) {
        this.xCor = xCor;
    }

    /**
     * Descricao: Código Marca Modelo
     * Observacao: Utilizar tabela RENAVAM
     * <b>Obrigatório</b>
     * Tamanho: 1 - 6
     * @param 
     */
    public void setcMod(String cMod) {
        this.cMod = cMod;
    }

    /**
     * Descricao: Valor Unitário do Veículo
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvUnit(String vUnit) {
        this.vUnit = vUnit;
    }

    /**
     * Descricao: Frete Unitário
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13, 2
     * @param 
     */
    public void setvFrete(String vFrete) {
        this.vFrete = vFrete;
    }

    public String getcCor() {
        return cCor;
    }

    public String getcMod() {
        return cMod;
    }

    public String getChassi() {
        return chassi;
    }

    public String getvFrete() {
        return vFrete;
    }

    public String getvUnit() {
        return vUnit;
    }

    public String getxCor() {
        return xCor;
    }
}
