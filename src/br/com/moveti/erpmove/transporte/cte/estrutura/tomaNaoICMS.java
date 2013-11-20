/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Tomador não é contribuinte do ICMS
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("tomaNaoICMS")
public class tomaNaoICMS {
    @XStreamAlias("refCteAnu")
    private String refCteAnu;

   
}
