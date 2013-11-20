/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do CT-e de substituição - Não Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infCteSub")
public class infCteSub {

    @XStreamAlias("chCte")
    private String chCte;
    private tomaICMS tomaICMS = new tomaICMS();
    private tomaNaoICMS tomaNaoICMS = new tomaNaoICMS();

    /**
     * Descricao: Chave de acesso do CT-e a ser substituído (original)
     * <b>Obrigatório</b>
     * Tamanho: 44
     * @param 
     */
    public void setChCte(String chCte) {
        this.chCte = chCte;
    }

    /**
     * Descricao: Tomador é contribuinte do ICMS
     * <b>Obrigatório</b>
     * @param 
     */
    public void setTomaICMS(br.com.moveti.erpmove.transporte.cte.estrutura.tomaICMS tomaICMS) {
        this.tomaICMS = tomaICMS;
    }

    /**
     * Descricao: Tomador não é contribuinte do ICMS
     * <b>Obrigatório</b>
     * @param 
     */
    public void setTomaNaoICMS(br.com.moveti.erpmove.transporte.cte.estrutura.tomaNaoICMS tomaNaoICMS) {
        this.tomaNaoICMS = tomaNaoICMS;
    }

    public String getChCte() {
        return chCte;
    }

    public br.com.moveti.erpmove.transporte.cte.estrutura.tomaICMS getTomaICMS() {
        return tomaICMS;
    }

    public br.com.moveti.erpmove.transporte.cte.estrutura.tomaNaoICMS getTomaNaoICMS() {
        return tomaNaoICMS;
    }
}
