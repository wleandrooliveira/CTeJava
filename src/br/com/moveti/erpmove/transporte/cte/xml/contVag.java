/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * informações dos containeres contidos no vagão - Não Obrigatório [0-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("contVag")
public class contVag {
    @XStreamAlias("nCont")
    private String nCont;
    @XStreamAlias("dPrev")
    private String dPrev;

    
}
