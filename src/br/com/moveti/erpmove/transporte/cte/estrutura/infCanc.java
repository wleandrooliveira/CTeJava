/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infCanc")
//Serve para o Pedido e para a resposta do cancelamento [xServ]
public class infCanc {

    @XStreamAlias("Id")
    private String Id;
    @XStreamAlias("tpAmb")
    private String tpAmb;
    @XStreamAlias("xServ")
    private String xServ;
    @XStreamAlias("verAplic")
    private String verAplic;
    @XStreamAlias("cStat")
    private String cStat;
    @XStreamAlias("xMotivo")
    private String xMotivo;
    @XStreamAlias("cUF")
    private String cUF;
    @XStreamAlias("chCTe")
    private String chCTe;
    @XStreamAlias("dhRecbto")
    private String dhRecbto;
    @XStreamAlias("nProt")
    private String nProt;

   
}
