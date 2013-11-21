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
@XStreamAlias("vPresComp")
public class vPresComp {

    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("vComp")
    private Double vComp;

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public void setvComp(Double vComp) {
        this.vComp = vComp;
    }

    public Double getvComp() {
        return vComp;
    }

    public String getxNome() {
        return xNome;
    }
}
