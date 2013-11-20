/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Documentos de transporte anterior eletrônicos - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("idDocAntEle")
public class idDocAntEle {
    @XStreamAlias("chave")
    private String chave;

    
}
