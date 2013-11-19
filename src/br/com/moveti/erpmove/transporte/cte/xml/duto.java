/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**Leiaute – Dutoviário
 * Informações do Dutoviário - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("duto")
public class duto {
    @XStreamAlias("vTar")
    private String vTar;
    @XStreamAlias("dIni")
    private String dIni;
    @XStreamAlias("dFim")
    private String dFim;

    
    
    
}
