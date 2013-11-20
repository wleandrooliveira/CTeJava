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
@XStreamAlias("aquav")
public class aquav {
    @XStreamAlias("vPrest")
    private String vPrest;
    @XStreamAlias("vAFRMM")    
    private String vAFRMM;
    @XStreamAlias("nBooking")
    private String nBooking;
    @XStreamAlias("nCtrl")
    private String nCtrl;
    @XStreamAlias("xNavio")
    private String xNavio;

   
    
}
