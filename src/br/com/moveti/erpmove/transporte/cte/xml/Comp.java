/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Componentes do Valor da Prestação
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("Comp")
public class Comp {
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("vComp")
    private String vComp;

   
}
