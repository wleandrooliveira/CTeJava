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

    private String RNTRC;
    private String dPrev;
    private String lota;
    private String CIOT;
    private occ occ;
    private valePed valePed;
    private veic veic;
    private lacRodo lacRodo;
    private moto moto;

    public void setRNTRC(String RNTRC) {
        this.RNTRC = RNTRC;
    }

    public void setdPrev(String dPrev) {
        this.dPrev = dPrev;
    }

    public void setLota(String lota) {
        this.lota = lota;
    }

    public void setCIOT(String CIOT) {
        this.CIOT = CIOT;
    }

    public void setOcc(br.com.moveti.erpmove.transporte.cte.xml.occ occ) {
        this.occ = occ;
    }

    public void setValePed(br.com.moveti.erpmove.transporte.cte.xml.valePed valePed) {
        this.valePed = valePed;
    }

    public void setVeic(br.com.moveti.erpmove.transporte.cte.xml.veic veic) {
        this.veic = veic;
    }

    public void setLacRodo(br.com.moveti.erpmove.transporte.cte.xml.lacRodo lacRodo) {
        this.lacRodo = lacRodo;
    }

    public void setMoto(br.com.moveti.erpmove.transporte.cte.xml.moto moto) {
        this.moto = moto;
    }
}
