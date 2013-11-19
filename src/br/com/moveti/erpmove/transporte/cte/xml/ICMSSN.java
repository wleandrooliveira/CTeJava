/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Simples Nacional - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("CST")
public class ICMSSN {
    @XStreamAlias("indSN")
    private String indSN;
    @XStreamAlias("infAdFisco")
    private String infAdFisco;

    
}
