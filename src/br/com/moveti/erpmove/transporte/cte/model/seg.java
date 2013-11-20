/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações de Seguro da Carga
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("seg")
public class seg {
    @XStreamAlias("respSeg")
    private String respSeg;
    @XStreamAlias("xSeg")
    private String xSeg;
    @XStreamAlias("nApol")    
    private String nApol;
    @XStreamAlias("nAver")
    private String nAver;
    @XStreamAlias("vCarga")
    private String vCarga;

   
}
