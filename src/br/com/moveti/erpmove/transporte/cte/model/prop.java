/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Proprietários do Veículo.Só preenchido quando o veículo não pertencer à empresa emitente do CT-e
 * -Não Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("prop")
public class prop {
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("RNTRC")
    private String RNTRC;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("UF")
    private String UF;
    @XStreamAlias("tpProp")
    private String tpProp;

    
}
