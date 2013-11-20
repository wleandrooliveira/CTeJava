/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Preenchido quando for transporte de produtos classificados pela ONU como perigosos. - Não Obrigatório
 * 
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("peri")
public class peri {
    @XStreamAlias("nONU")
    private String nONU;
    @XStreamAlias("xNomeAE")
    private String xNomeAE;
    @XStreamAlias("xClaRisco")
    private String xClaRisco;
    @XStreamAlias("grEmb")
    private String grEmb;
    @XStreamAlias("qTotProd")
    private String qTotProd;
    @XStreamAlias("qVolTipo")
    private String qVolTipo;
    @XStreamAlias("pontoFulgor")
    private String pontoFulgor;

    
}
