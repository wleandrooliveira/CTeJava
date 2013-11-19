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
@XStreamAlias("tarifa")
public class tarifa {
    @XStreamAlias("CL")
    private String CL;
    @XStreamAlias("cTar")
    private String cTar;
    @XStreamAlias("vTar")
    private String vTar;

    
    
}
