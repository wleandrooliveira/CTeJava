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
@XStreamAlias("contQt")
public class contQt {
    @XStreamAlias("nCont")
    private String nCont;
    private lacContQt lacContQt = new lacContQt();
    @XStreamAlias("dPrev")
    private String dPrev;

    
}
