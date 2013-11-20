/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Local de retirada constante na NF - Não Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("locRet")
public class locRet {
    @XStreamAlias("CNPJ")    
    private String CNPJ;
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("xLgr")
    private String xLgr;
    @XStreamAlias("Nro")
    private String Nro;
    //No
    @XStreamAlias("xCpl")
    private String xCpl;
    @XStreamAlias("xBairro")
    private String xBairro;
    @XStreamAlias("cMun")
    private String cMun;
    @XStreamAlias("xMun")
    private String xMun;
    @XStreamAlias("UF")
    private String UF;

    
}
