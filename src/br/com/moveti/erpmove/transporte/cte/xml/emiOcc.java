/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("emiOcc")
public class emiOcc {
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("cInt")    
    private String cInt;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("fone")
    private String fone;

    
}
