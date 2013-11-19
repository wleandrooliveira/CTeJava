/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import java.util.LinkedList;
import java.util.List;

/**
 * Informações das Unidades de Carga (Containeres/ULD/Outros)
 * @author Geraldo Henrique Lacerda Pinto
 */
public class infUnidCarga {

    private String tpUnidCarga;
    private String idUnidCarga;
    private List<lacUnidCarga> lacUnidCarga = new LinkedList<lacUnidCarga>();
    private Double qtdRat;

    /**
     * Descricao: Tipo da Unidade de Carga
     * Observacao: 1 - Container 2 - ULD 3 - Pallet 4 - Outros
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpUnidCarga(String tpUnidCarga) {
        this.tpUnidCarga = tpUnidCarga;
    }

    /**
     * Descricao: Identificação da Unidade de Carga
     * Observacao: Informar a identificação da unidade de carga, por exemplo: número do container.
     * <b>Obrigatório</b>
     * Tamanho: 1 - 20
     * @param 
     */
    public void setIdUnidCarga(String idUnidCarga) {
        this.idUnidCarga = idUnidCarga;
    }

    /**
     * Descricao: Lacres das Unidades de Carga
     * Tamanho: 0 - n
     * @param 
     */
    public void setLacUnidCarga(List<br.com.moveti.erpmove.transporte.cte.xml.lacUnidCarga> lacUnidCarga) {
        this.lacUnidCarga = lacUnidCarga;
    }

    /**
     * Descricao: Quantidade rateada (Peso,Volume)
     * Observacao: 5 posições, sendo 3 inteiras e 2 decimais.
     * Tamanho: 3, 2
     * @param 
     */
    public void setQtdRat(Double qtdRat) {
        this.qtdRat = qtdRat;
    }

    public String getIdUnidCarga() {
        return idUnidCarga;
    }

    public List<br.com.moveti.erpmove.transporte.cte.xml.lacUnidCarga> getLacUnidCarga() {
        return lacUnidCarga;
    }

    public Double getQtdRat() {
        return qtdRat;
    }

    public String getTpUnidCarga() {
        return tpUnidCarga;
    }
}
