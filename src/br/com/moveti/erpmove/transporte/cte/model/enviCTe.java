/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("enviCTe")
public class enviCTe {

    @XStreamAlias("Versao")
    private String Versao;
    @XStreamAlias("idLote")
    private String idLote;    
    private CTe Cte = new CTe();

    
}
