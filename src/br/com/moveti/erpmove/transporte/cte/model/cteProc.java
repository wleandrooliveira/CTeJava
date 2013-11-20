/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.protCTe;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("cteProc")
public class cteProc {
    @XStreamAlias("versao")
    private String versao;
    private CTe CTe = new CTe();
    private protCTe protCTe = new protCTe();

    
}
