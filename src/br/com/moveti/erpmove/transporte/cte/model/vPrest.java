/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;
import java.util.List;

/**
 * Valores da Prestação de Serviço - Obrigatorio
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("vPrest")
public class vPrest {

    @XStreamAlias("vTPrest")
    private Double vTPrest;
    @XStreamAlias("vRec")
    private Double vRec;
    @XStreamImplicit(itemFieldName = "Comp")
    private List<Comp> Comp = new ArrayList<Comp>();

    /**
     * Descricao: Valor Total da Prestação do Serviço
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais. Pode conter zeros quando o CT-e for de complemento de ICMS
     * <b>Obrigatório</b>
     * Tamanho: 13,2
     * @param 
     */
    public void setvTPrest(Double vTPrest) {
        this.vTPrest = vTPrest;
    }

    /**
     * Descricao: Valor a Receber
     * Observacao: 15 posições, sendo 13 inteiras e 2 decimais.
     * <b>Obrigatório</b>
     * Tamanho: 13,2
     * @param 
     */
    public void setvRec(Double vRec) {
        this.vRec = vRec;
    }

    /**
     * Descricao: Componentes do Valor da Prestação
     * Tamanho: 0 - n
     * @param 
     */
    public void setComp(List<br.com.moveti.erpmove.transporte.cte.model.Comp> Comp) {
        this.Comp = Comp;
    }

    public List<br.com.moveti.erpmove.transporte.cte.model.Comp> getComp() {
        return Comp;
    }

    public Double getvRec() {
        return vRec;
    }

    public Double getvTPrest() {
        return vTPrest;
    }
}
