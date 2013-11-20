/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Documentos de transporte anterior em papel
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("idDocAntPap")
public class idDocAntPap {
    @XStreamAlias("tpDoc")
    private String tpDoc;
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("subser")
    private String subser;
    @XStreamAlias("nDoc")    
    private String nDoc;
    @XStreamAlias("dEmi")
    private String dEmi;

    
}
