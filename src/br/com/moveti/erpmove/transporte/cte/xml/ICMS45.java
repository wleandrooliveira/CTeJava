/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ICMS Isento, não Tributado ou diferido - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMS45")
public class ICMS45 {
    @XStreamAlias("CST")
    private String CST;

    
}
