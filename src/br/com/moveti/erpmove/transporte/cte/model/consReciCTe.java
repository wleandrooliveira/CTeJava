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
@XStreamAlias("consReciCTe")
public class consReciCTe {
    @XStreamAlias("versao")
    private String versao;
    @XStreamAlias("tbAmb")
    private String tbAmb;
    @XStreamAlias("nRec")
    private String nRec;

    
}
