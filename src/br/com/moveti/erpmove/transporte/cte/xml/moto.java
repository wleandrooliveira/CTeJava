/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do(s) Motorista(s)
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("moto")
public class moto {
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("CPF")
    private String CPF;

    
}
