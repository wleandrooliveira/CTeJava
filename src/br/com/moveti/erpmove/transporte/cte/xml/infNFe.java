/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações das NF-e - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infNFe")
public class infNFe {

    @XStreamAlias("Chave")
    private String Chave;
    @XStreamAlias("PIN")
    private String PIN;

    public void setChave(String Chave) {
        this.Chave = Chave;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
}
