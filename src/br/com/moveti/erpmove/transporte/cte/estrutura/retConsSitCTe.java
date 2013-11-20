/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("retConsSitCTe")
public class retConsSitCTe {
    @XStreamAlias("versao")
    private String versao;
    @XStreamAlias("tbAmb")
    private String tbAmb;
    @XStreamAlias("verAplic")
    private String verAplic;
    @XStreamAlias("cStat")
    private String cStat;
    @XStreamAlias("xMotivo")
    private String xMotivo;
    @XStreamAlias("cUF")
    private String cUF;
    protCTe protCTe = new protCTe();
    retCancCTe retCancCTe = new retCancCTe();

    
   
    
}
