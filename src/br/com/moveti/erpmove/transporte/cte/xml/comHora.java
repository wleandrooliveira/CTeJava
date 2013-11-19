/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega com hora definida - obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("comHora")
public class comHora {
    @XStreamAlias("tpHor")
    private String tpHor;
    @XStreamAlias("hProg")
    private String hProg;

    
}
