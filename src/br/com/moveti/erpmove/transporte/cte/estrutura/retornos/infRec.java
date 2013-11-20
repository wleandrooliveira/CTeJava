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
@XStreamAlias("infRec")
public class infRec {
    @XStreamAlias("nRec")
    private String nRec;
    @XStreamAlias("dhRecbto")
    private String dhRecbto;
    @XStreamAlias("tMed")
    private String tMed;

    
}
