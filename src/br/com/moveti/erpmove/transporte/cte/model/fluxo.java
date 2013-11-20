/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Previsão do fluxo da carga - obrigatório para o modelo de transporte aéreo.
 * @author Geraldo Henrique Lacerda Pinto
 * 
 */
@XStreamAlias("fluxo")
public class fluxo {

    @XStreamAlias("xOrig")
    private String xOrig;
    private pass pass = new pass();

    /**
     * Descricao: Sigla ou código interno da Filial/Porto/Estação/ Aeroporto de Origem
     * Observacao: Observações para o modal aéreo: - Preenchimento obrigatório para o modal aéreo. - O código de três letras IATA do aeroporto de partida deverá ser incluído como primeira anotação. Quando não for possível, utilizar a sigla OACI.
     * Tamanho: 1 - 15
     * @param 
     */
    public void setxOrig(String xOrig) {
        this.xOrig = xOrig;
    }

    /**
     * Descricao: 
     * Observacao: 
     * Tamanho: 0 - n
     * @param 
     */
    public void setPass(br.com.moveti.erpmove.transporte.cte.model.pass pass) {
        this.pass = pass;
    }

    public br.com.moveti.erpmove.transporte.cte.model.pass getPass() {
        return pass;
    }

    public String getxOrig() {
        return xOrig;
    }
}
