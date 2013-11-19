/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Rateio dos vagões - Não Obrigatório [0-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ratVag")
public class ratVag {
    private ratNF ratNF = new ratNF();

    
}
