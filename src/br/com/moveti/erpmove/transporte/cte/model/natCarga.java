/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("natCarga")
public class natCarga {
    @XStreamAlias("natCarga")    
    private String xDime;
    @XStreamAlias("natCarga")
    private String cInfManu;
    @XStreamAlias("cIMP")
    private String cIMP;

    
}
