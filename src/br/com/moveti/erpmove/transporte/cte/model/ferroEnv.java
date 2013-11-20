/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ferroEnv")
public class ferroEnv {
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("cInt")
    private String cInt;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("xNome")
    private String xNome;

    
    
}
