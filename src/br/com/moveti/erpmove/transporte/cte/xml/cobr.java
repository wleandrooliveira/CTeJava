/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.LinkedList;
import java.util.List;

/**
 * Dados da cobrança do CT-e
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("cobr")
public class cobr {

    private fat fat = new fat();
    private List<dup> dup = new LinkedList<dup>();

    /**
     * Descricao: Dados da fatura
     * @param 
     */
    public void setFat(br.com.moveti.erpmove.transporte.cte.xml.fat fat) {
        this.fat = fat;
    }

    /**
     * Descricao: Dados das duplicatas
     * @param 
     */
    public void setDup(List<br.com.moveti.erpmove.transporte.cte.xml.dup> dup) {
        this.dup = dup;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.fat getFat() {
        return fat;
    }

    public List<br.com.moveti.erpmove.transporte.cte.xml.dup> getDup() {
        return dup;
    }
}
