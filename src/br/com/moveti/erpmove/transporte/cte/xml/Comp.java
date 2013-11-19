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
    private Double vComp;

    /**
     * Descricao: Nome do componente
     * Observacao: Exxemplos: FRETE PESO, FRETE VALOR, SEC/CAT, ADEME, AGENDAMENTO, etc
     * <b>Obrigatório</b>
     * Tamanho: 1 - 15
     * @param 
     */
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    /**
     * Descricao: Valor do componente
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13,2
     * @param 
     */
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
