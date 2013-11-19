/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações de quantidades da Carga do CT-e - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infQ")
public class infQ {
    @XStreamAlias("cUnid")
    private String cUnid;
    @XStreamAlias("tpMed")
    private String tpMed;
    @XStreamAlias("qCarga")
    private String qCarga;

    
}
