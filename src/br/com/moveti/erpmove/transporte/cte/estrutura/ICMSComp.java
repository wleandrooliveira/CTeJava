/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMSComp")
public class ICMSComp {
    private ICMS00 ICMS00 = new ICMS00();   
    private ICMS20 ICMS20 = new ICMS20();       
    private ICMS45 ICMS45 = new ICMS45();
    private ICMS60 ICMS60 = new ICMS60();   
    private ICMS90 ICMS90 = new ICMS90();
    private ICMSOutraUF ICMSOutraUF = new ICMSOutraUF();
    private ICMSSN ICMSSN = new ICMSSN();

    
}
