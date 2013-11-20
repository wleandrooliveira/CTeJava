/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.LinkedList;
import java.util.List;

/**
 * Informações dos demais documentos - Obrigatório [1-n]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infOutros")
public class infOutros {

    private String tpDoc;
    private String descOutros;
    private String nDoc;
    private String dEmi;
    private Double vDocFisc;
    private String dPrev;
    private List<infUnidTransp> infUnidTransp = new LinkedList<infUnidTransp>();
    private List<infUnidCarga> infUnidCarga = new LinkedList<infUnidCarga>();

    /**
     * Descricao: Tipo de documento originário
     * Observacao: Preencher com: 00 - Declaração; 10 - Dutoviário; 99 - Outros
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setTpDoc(String tpDoc) {
        this.tpDoc = tpDoc;
    }

    /**
     * Descricao: Descrição quando se tratar de 99-Outros
     * Tamanho: 1 - 100
     * @param 
     */
    public void setDescOutros(String descOutros) {
        this.descOutros = descOutros;
    }

    /**
     * Descricao: Número
     * Tamanho: 1 - 20
     * @param 
     */
    public void setnDoc(String nDoc) {
        this.nDoc = nDoc;
    }

    /**
     * Descricao: Data de Emissão
     * Observacao: Formato AAAA-MM-DD
     * Tamanho: 10
     * @param 
     */
    public void setdEmi(String dEmi) {
        this.dEmi = dEmi;
    }

    /**
     * Descricao: Valor do documento
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * Tamanho: 13, 2
     * @param 
     */
    public void setvDocFisc(Double vDocFisc) {
        this.vDocFisc = vDocFisc;
    }

    /**
     * Descricao: Data prevista de entrega
     * Observacao: Formato AAAA-MM-DD
     * Tamanho: 10
     * @param 
     */
    public void setdPrev(String dPrev) {
        this.dPrev = dPrev;
    }
}
