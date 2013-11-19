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
    private String nRoma;
    private String nPed;
    private String mod;
    private String serie;
    private String nDoc;
    private String dEmi;
    private String vBC;
    private String vICMS;
    private String vBCST;
    private String vST;
    private String vProd;
    private String vNF;
    private String nCFOP;
    private String nPeso;
    private String PIN;
    private String dPrev;
    private infUnidTransp infUnidTransp = new infUnidTransp();
    private  infUnidCarga infUnidCarga = new infUnidCarga();
    
    private locRet locRet = new locRet();

    
}
