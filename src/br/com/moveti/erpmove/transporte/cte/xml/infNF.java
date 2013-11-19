/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações das NF - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infNF")
public class infNF {
    @XStreamAlias("nRoma")
    private String nRoma;
    @XStreamAlias("nPed")
    private String nPed;
    @XStreamAlias("mod")
    private String mod;
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("nDoc")
    private String nDoc;
    @XStreamAlias("dEmi")
    private String dEmi;
    @XStreamAlias("vBC")
    private String vBC;
    @XStreamAlias("vICMS")
    private String vICMS;
    @XStreamAlias("vBCST")
    private String vBCST;
    @XStreamAlias("vST")
    private String vST;
    @XStreamAlias("vProd")    
    private String vProd;
    @XStreamAlias("vNF")
    private String vNF;
    @XStreamAlias("nCFOP")
    private String nCFOP;
    @XStreamAlias("nPeso")
    private String nPeso;
    @XStreamAlias("PIN")
    private String PIN;
        
    private locRet locRet = new locRet();

    
}
