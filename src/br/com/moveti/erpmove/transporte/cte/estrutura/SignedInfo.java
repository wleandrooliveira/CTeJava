/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("SignedInfo")
public class SignedInfo {

    private CanonicalizationMethod CanonicalizationMethod;
    private SignatureMethod SignatureMethod;
    private Reference Reference;

    
}
