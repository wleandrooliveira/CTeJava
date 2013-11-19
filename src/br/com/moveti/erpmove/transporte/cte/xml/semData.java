/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Entrega sem data definida, opção é proibida para o Aéreo. - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("semData")
public class semData {
    @XStreamAlias("tpPer")
    private String tpPer;

    
}
