/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Grupo de informações das balsas - Não Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("balsa")
public class balsa {
    @XStreamAlias("xBalsa")
    private String xBalsa;
    @XStreamAlias("nViag")
    private String nViag;
    @XStreamAlias("direc")
    private String direc;
    @XStreamAlias("prtEmb")
    private String prtEmb;  
    @XStreamAlias("prtTrans")
    private String prtTrans;
    @XStreamAlias("prtDest")
    private String prtDest;
    @XStreamAlias("tpNav")
    private String tpNav;
    @XStreamAlias("irin")
    private String irin;

    
}
