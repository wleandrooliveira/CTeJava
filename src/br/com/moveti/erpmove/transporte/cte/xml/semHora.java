/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega sem hora definida - obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("semHora")
public class semHora {
    @XStreamAlias("tpHor")
    private String tpHor;

   
}
