/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Identificação do Emitente do CT-e
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("emit")
public class emit {
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("xFant")
    private String xFant;
    private enderEmit enderEmit = new enderEmit();

    
}
