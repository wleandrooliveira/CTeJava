/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import java.util.LinkedList;
import java.util.List;

/**
 * Informações das Unidades de Transporte (Carreta/Reboque/Vagão)
 * @author Geraldo Henrique Lacerda Pinto
 */
public class infUnidTransp {

    private String tpUnidTransp;
    private String idUnidTransp;
    private List<lacUnidTransp> lacUnidTransp = new LinkedList<lacUnidTransp>();
    private List<infUnidCarga> infUnidCarga = new LinkedList<infUnidCarga>();
    private Double qtdRat;

    /**
     * Descricao: Tipo da Unidade de Transporte
     * Observacao: 1 - Rodoviário Tração 2 - Rodoviário Reboque 3 - Navio 4 - Balsa 5 - Aeronave 6 - Vagão 7 - Outros
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpUnidTransp(String tpUnidTransp) {
        this.tpUnidTransp = tpUnidTransp;
    }

    /**
     * Descricao: Identificação da Unidade de Transporte
     * Observacao: Informar a identificação conforme o tipo de unidade de transporte. Por exemplo: para rodoviário tração ou reboque deverá preencher com a placa do veículo.
     * <b>Obrigatório</b>
     * Tamanho: 1 - 20
     * @param 
     */
    public void setIdUnidTransp(String idUnidTransp) {
        this.idUnidTransp = idUnidTransp;
    }

    /**
     * Descricao: Lacres das Unidades de Transporte
     * Tamanho: 0 - n
     * @param 
     */
    public void setLacUnidTransp(List<br.com.moveti.erpmove.transporte.cte.xml.lacUnidTransp> lacUnidTransp) {
        this.lacUnidTransp = lacUnidTransp;
    }

    /**
     * Descricao: Informações das Unidades de Carga (Containeres/ULD/Outros)
     * Observacao: Dispositivo de carga utilizada (Unit Load Device - ULD) significa todo tipo de contêiner de carga, vagão, contêiner de avião, palete de aeronave com rede ou palete de aeronave com rede sobre um iglu.
     * Tamanho: 0 - n
     * @param 
     */
    public void setInfUnidCarga(List<br.com.moveti.erpmove.transporte.cte.xml.infUnidCarga> infUnidCarga) {
        this.infUnidCarga = infUnidCarga;
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

    public String getIdUnidTransp() {
        return idUnidTransp;
    }

    public List<br.com.moveti.erpmove.transporte.cte.xml.infUnidCarga> getInfUnidCarga() {
        return infUnidCarga;
    }

    public List<br.com.moveti.erpmove.transporte.cte.xml.lacUnidTransp> getLacUnidTransp() {
        return lacUnidTransp;
    }

    public Double getQtdRat() {
        return qtdRat;
    }

    public String getTpUnidTransp() {
        return tpUnidTransp;
    }
}
