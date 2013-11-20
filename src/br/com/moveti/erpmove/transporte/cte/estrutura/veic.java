/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Dados dos Veículos - Não obrigatório [0-4]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("veic")
public class veic {

    private String cInt;
    private String RENAVAM;
    private String placa;
    private String tara;
    private String capKG;
    private String capM3;
    private String tpProp;
    private String tpVeic;
    private String tpRod;
    private String tpCar;
    private String UF;
    //
    private prop prop = new prop();

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setcInt(String cInt) {
        this.cInt = cInt;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setRENAVAM(String RENAVAM) {
        this.RENAVAM = RENAVAM;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setTara(String tara) {
        this.tara = tara;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setCapKG(String capKG) {
        this.capKG = capKG;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setCapM3(String capM3) {
        this.capM3 = capM3;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setTpProp(String tpProp) {
        this.tpProp = tpProp;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setTpVeic(String tpVeic) {
        this.tpVeic = tpVeic;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setTpRod(String tpRod) {
        this.tpRod = tpRod;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setTpCar(String tpCar) {
        this.tpCar = tpCar;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setProp(br.com.moveti.erpmove.transporte.cte.estrutura.prop prop) {
        this.prop = prop;
    }
}
