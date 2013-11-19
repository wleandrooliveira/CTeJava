/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Dados dos Veículos - Não obrigatório [0-4]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("veic")
public class veic {

    @XStreamAlias("cInt")
    private String cInt;
    @XStreamAlias("RENAVAM")
    private String RENAVAM;
    @XStreamAlias("placa")
    private String placa;
    @XStreamAlias("tara")
    private String tara;
    @XStreamAlias("capKG")
    private String capKG;
    @XStreamAlias("capM3")
    private String capM3;
    @XStreamAlias("tpProp")
    private String tpProp;
    @XStreamAlias("tpVeic")
    private String tpVeic;
    @XStreamAlias("tpRod")
    private String tpRod;
    @XStreamAlias("tpCar")
    private String tpCar;
    @XStreamAlias("UF")
    private String UF;
    //
    private prop prop = new prop();
}
