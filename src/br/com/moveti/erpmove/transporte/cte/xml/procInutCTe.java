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
@XStreamAlias("procInutCTe")
public class procInutCTe {
    @XStreamAlias("versao")
    private String versao;
    private inutCTe inutCTe = new inutCTe();
    private retInutCTe retInutCTe = new retInutCTe();

   
}
