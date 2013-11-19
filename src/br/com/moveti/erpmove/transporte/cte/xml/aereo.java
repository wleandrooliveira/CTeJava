/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do Aéreo - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("aereo")
public class aereo {
    @XStreamAlias("nMinu")
    private String nMinu;
    @XStreamAlias("nOCA")
    private String nOCA;
    @XStreamAlias("dPrev")
    private String dPrev;
    @XStreamAlias("xLAgEmi")
    private String xLAgEmi;
    @XStreamAlias("IdT")
    private String IdT;

    
}
