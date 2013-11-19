/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações dos demais documentos - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infOutros")
public class infOutros {
    @XStreamAlias("tpDoc")
    private String tpDoc;
    //NO
    @XStreamAlias("descOutros")
    private String descOutros;
    //NO
    @XStreamAlias("nDoc")
    private String nDoc;
    //NO
    @XStreamAlias("dEmi")
    private String dEmi;
    //NO
    @XStreamAlias("vDocFisc")
    private String vDocFisc;

    
}
