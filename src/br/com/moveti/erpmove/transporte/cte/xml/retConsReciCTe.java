/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("retConsReciCTe")
public class retConsReciCTe {
    @XStreamAlias("versao")
    private String versao;
    @XStreamAlias("tpAmb")
    private String tpAmb;
    @XStreamAlias("verAplic")
    private String verAplic;
    @XStreamAlias("nRec")
    private String nRec;
    @XStreamAlias("cStat")
    private String cStat;
    @XStreamAlias("xMotivo")
    private String xMotivo;
    @XStreamAlias("cUF")
    private String cUF;

    
       
}
