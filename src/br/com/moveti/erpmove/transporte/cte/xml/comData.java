/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega com data definida - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
public class comData {
    @XStreamAlias("tpPer")
    private String tpPer;
    private String dProg;

    
}
