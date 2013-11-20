/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações de Vale Pedágio - Não Obrigatório [0-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("valePed")
public class valePed {

    @XStreamAlias("CNPJForn")
    private String CNPJForn;
    @XStreamAlias("nCompra")
    private String nCompra;
    @XStreamAlias("CNPJPg")
    private String CNPJPg;
}
