/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.infInut;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("inutCTe")
public class inutCTe {
    @XStreamAlias("versao")
    private String versao;   
    private infInut infInut = new infInut();
    private Signature Signature = new Signature();

    
}
