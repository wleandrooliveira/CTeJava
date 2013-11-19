/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega no período definido - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("noPeriodo")
public class noPeriodo {
    @XStreamAlias("tpPer")
    private String tpPer;
    @XStreamAlias("dIni")
    private String dIni;
    @XStreamAlias("dFim")
    private String dFim;

    
}
