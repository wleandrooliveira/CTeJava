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

@XStreamAlias("detVag")
public class detVag {
    @XStreamAlias("nVag")
    private String nVag;
    @XStreamAlias("cap")
    private String cap;
    @XStreamAlias("tpVag")
    private String tpVag;
    @XStreamAlias("pesoR")
    private String pesoR;
    @XStreamAlias("pesoBC")
    private String pesoBC;

    
}
