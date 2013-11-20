/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do modal - Obrigatório [1-1]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infModal")
public class infModal {
    @XStreamAlias("versaoModal")
    private String versaoModal;    
    private rodo rodo = new rodo();

    
}
