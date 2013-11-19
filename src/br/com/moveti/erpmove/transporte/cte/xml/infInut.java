/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infInut")
public class infInut {
    //Tags em comum
    @XStreamAlias("Id")
    private String Id;
    @XStreamAlias("tpAmb")
    private String tpAmb;      
    @XStreamAlias("cUF")
    private String cUF;
    @XStreamAlias("ano")
    private String ano;
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("mod")
    private String mod;
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("nCTIni")
    private String nCTIni;
    @XStreamAlias("nCTFin")
    private String nCTFin;
   
    //Tags Resposta
    @XStreamAlias("verAplic")
    private String verAplic;
    @XStreamAlias("cStat")
    private String cStat;
    @XStreamAlias("xMotivo")
    private String xMotivo;
    @XStreamAlias("dhRecbto")
    private String dhRecbto;
    @XStreamAlias("nProt")
    private String nProt;
    
    //Tags do Pedido 
    @XStreamAlias("xServ")
    private String xServ; 
    @XStreamAlias("xJust")
    private String xJust;

    
    
    
}
