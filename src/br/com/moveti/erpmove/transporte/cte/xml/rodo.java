/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do Rodoviário - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("rodo")
public class rodo {
    @XStreamAlias("RNTRC")    
    private String RNTRC;
    @XStreamAlias("dPrev")
    private String dPrev;
    @XStreamAlias("lota")
    private String lota;
    @XStreamAlias("CIOT")
    private String CIOT;
    private occ occ = new occ();
    private valePed valePed = new valePed();    
    private veic veic = new veic();
    private lacRodo lacRodo = new lacRodo();
    private moto moto = new moto();

    
}
