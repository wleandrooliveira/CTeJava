/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Endereço do emitente - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("enderEmit")
public class enderEmit {
    
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
    //NO
    @XStreamAlias("CEP")
    private String CEP;
    
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("fone")
    private String fone;

    
}
