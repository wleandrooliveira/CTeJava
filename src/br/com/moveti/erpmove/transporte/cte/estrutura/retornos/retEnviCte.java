/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura.retornos;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("retEnviCte")
public class retEnviCte {
    @XStreamAlias("versao")
    private String versao;
    @XStreamAlias("tbAmb")
    private String tbAmb;
    @XStreamAlias("cUF")
    private String cUF;
    @XStreamAlias("verAplic")
    private String  verAplic;
    @XStreamAlias("cStat")
    private String cStat;
    @XStreamAlias("XMotivo")
    private String xMotivo;
    private infRec infRec = new infRec();

    
}
