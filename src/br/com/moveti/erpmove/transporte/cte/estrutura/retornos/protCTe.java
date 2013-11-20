/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura.retornos;

import br.com.moveti.erpmove.transporte.cte.model.Signature;
import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.infProt;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("protCTe")
public class protCTe {
    @XStreamAlias("versao")
    private String versao;
    private infProt infProt = new infProt();
    private Signature Signature = new Signature();

   
}
