/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Ordens de Coleta associados - Não obrigatório [0-10]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("occ")
public class occ {
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("nOcc")
    private String nOcc;
    @XStreamAlias("dEmi")
    private String dEmi;
    private emiOcc emiOcc = new emiOcc();

    
}
