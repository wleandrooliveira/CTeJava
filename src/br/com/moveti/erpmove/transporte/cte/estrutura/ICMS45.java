/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ICMS Isento, não Tributado ou diferido - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMS45")
public class ICMS45 {

    @XStreamAlias("CST")
    private String CST;

    /**
     * Descricao: Classificação Tributária do Serviço
     * Observacao: Preencher com: 40 - ICMS isenção; 41 - ICMS não tributada; 51 - ICMS diferido
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getCST() {
        return CST;
    }
}
