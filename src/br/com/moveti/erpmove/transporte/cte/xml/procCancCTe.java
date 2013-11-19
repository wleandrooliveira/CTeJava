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
@XStreamAlias("procCancCTe")
public class procCancCTe {
    @XStreamAlias("versao")
    private String versao;
    private cancCTe cancCTe = new cancCTe();
    private retCancCTe retCancCTe = new retCancCTe();

}
