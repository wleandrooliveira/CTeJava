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
@XStreamAlias("consStatServCte")
public class consStatServCte {
    @XStreamAlias("versao")
    private String versao;
    @XStreamAlias("tpAmb")
    private String tpAmb;
    @XStreamAlias("xServ")
    private String xServ;

    
}
