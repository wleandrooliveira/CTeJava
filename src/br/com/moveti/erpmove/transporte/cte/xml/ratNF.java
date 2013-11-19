/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do Rateio das NF - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ratNF")
public class ratNF {

    @XStreamAlias("ratNF")
    private String chave;
    @XStreamAlias("ratNF")
    private String pesoRat;

    
}
