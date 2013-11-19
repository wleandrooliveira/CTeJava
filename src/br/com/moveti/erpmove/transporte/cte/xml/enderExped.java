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
@XStreamAlias("enderExped")
public class enderExped {
    
    @XStreamAlias("xLgr")
    private String xLgr;
    @XStreamAlias("nro")
    private String nro;
    @XStreamAlias("xCpl")
    private String xCpl;
    @XStreamAlias("xBairro")
    private String xBairro;
    @XStreamAlias("cMun")
    private String cMun;
    @XStreamAlias("xMun")
    private String xMun;
    @XStreamAlias("CEP")
    private String CEP;
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("cPais")
    private String cPais;
    @XStreamAlias("xPais")
    private String xPais;

   
}
