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
@XStreamAlias("KeyInfo")
public class KeyInfo {

    private X509Data X509Data;

    public X509Data getX509Data() {
        return X509Data;
    }

    public void setX509Data(X509Data X509Data) {
        this.X509Data = X509Data;
    }
}
