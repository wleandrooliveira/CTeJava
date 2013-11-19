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
@XStreamAlias("infCarga")
public class infCarga {
    @XStreamAlias("vCarga")
    private String vCarga;
    @XStreamAlias("proPred")
    private String proPred;
    @XStreamAlias("xOutCat")
    private String xOutCat;
    private infQ infQ = new infQ();

    
    
}
