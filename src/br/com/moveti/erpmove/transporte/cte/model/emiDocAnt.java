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
@XStreamAlias("emiDocAnt")
public class emiDocAnt {
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("CPF")    
    private String CPF;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("xNome")
    private String xNome;

    
}
