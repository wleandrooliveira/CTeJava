/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações das NF-e - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infNFe")
public class infNFe {

    @XStreamAlias("chave")
    private String chave;
    @XStreamAlias("PIN")
    private String PIN;

    public void setChave(String chave) {
        this.chave = chave;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
}
