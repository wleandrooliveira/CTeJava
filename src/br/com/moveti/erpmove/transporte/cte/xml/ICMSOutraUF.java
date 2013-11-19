/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ICMS devido à UF de origem da prestação, quando diferente da UF do emitente
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMSOutraUF")
public class ICMSOutraUF {
    @XStreamAlias("CST")
    private String CST;
    @XStreamAlias("pRedBCOutraUF")
    private String pRedBCOutraUF;
    @XStreamAlias("vBCOutraUF")
    private String vBCOutraUF;
    @XStreamAlias("pICMSOutraUF")
    private String pICMSOutraUF;
    @XStreamAlias("vICMSOutraUF")
    private String vICMSOutraUF;

    
}
