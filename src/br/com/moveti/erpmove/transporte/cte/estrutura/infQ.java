/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações de quantidades da Carga do CT-e - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infQ")
public class infQ {

    private String cUnid;
    private String tpMed;
    private Double qCarga;

    /**
     * Descricao: Código da Unidade de Medida
     * Observacao: Preencher com: 00-M3; 01-KG; 02-TON; 03-UNIDADE; 04-LITROS; 05-MMBTU
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setcUnid(String cUnid) {
        this.cUnid = cUnid;
    }

    /**
     * Descricao: Tipo da Medida
     * Observacao: Exemplos: PESO BRUTO, PESO DECLARADO, PESO CUBADO, PESO AFORADO, PESO AFERIDO, PESO BASE DE CÁLCULO, LITRAGEM, CAIXAS e etc
     * <b>Obrigatório</b>
     * Tamanho: 1 - 20
     * @param 
     */
    public void setTpMed(String tpMed) {
        this.tpMed = tpMed;
    }

    /**
     * Descricao: Quantidade
     * Observacao: 15 posições, sendo 11 inteiras e 4 decimais 
     * <b>Obrigatório</b>
     * Tamanho: 11,4
     * @param 
     */
    public void setqCarga(Double qCarga) {
        this.qCarga = qCarga;
    }
}
