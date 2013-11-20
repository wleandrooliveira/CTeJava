/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.LinkedList;
import java.util.List;

/**
 * Informações da Carga do CT-e - Obrigatorio
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infCarga")
public class infCarga {

    private Double vCarga;
    private String proPred;
    private String xOutCat;
    private List<infQ> infQ = new LinkedList<infQ>();

    /**
     * Descricao: Valor total da carga
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais. Dever ser informado para todos os modais, com exceção para o Dutoviário.
     * Tamanho: 13,2
     * @param 
     */
    public void setvCarga(Double vCarga) {
        this.vCarga = vCarga;
    }

    /**
     * Descricao: Produto predominante
     * Observacao: Informar a descrição do produto predominante
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setProPred(String proPred) {
        this.proPred = proPred;
    }

    /**
     * Descricao: 
     * Observacao:  "FRIA", "GRANEL", "REFRIGERADA", "Medidas: 12X12X12"
     * Tamanho: 1 - 30
     * @param 
     */
    public void setxOutCat(String xOutCat) {
        this.xOutCat = xOutCat;
    }

    /**
     * Descricao: Informações de quantidades da Carga do CT-e
     * Observacao: Para o Aéreo é obrigatório o preenchimento desse campo da seguinte forma. 1 - Peso Bruto, sempre em quilogramas (obrigatório); 2 - Peso Cubado; sempre em quilogramas; 3 - Quantidade de volumes, sempre em unidades (obrigatório); 4 - Cubagem, sempre em metros cúbicos (obrigatório apenas quando for impossível preencher as dimensões da(s) embalagem(ens) na tag #12 do leiaute do Aéreo).
     * <b>Obrigatório</b>
     * Tamanho: 1 - n
     * @param 
     */
    public void setInfQ(List<br.com.moveti.erpmove.transporte.cte.model.infQ> infQ) {
        this.infQ = infQ;
    }
}
