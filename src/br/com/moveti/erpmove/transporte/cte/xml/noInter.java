/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega no intervalo de horário definido - obrigatorio
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("noInter")
public class noInter {
    @XStreamAlias("tpHor")    
    private String tpHor;
    @XStreamAlias("hIni")
    private String hIni;
    @XStreamAlias("hFim")
    private String hFim;

    
}
