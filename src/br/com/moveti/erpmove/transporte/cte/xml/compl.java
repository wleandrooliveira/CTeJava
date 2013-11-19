/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.LinkedList;
import java.util.List;

/**
 * Dados complementares do CTe para fins operacionais ou comerciais - Não Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("compl")
public class compl {

    @XStreamAlias("xCaracAd")
    private String xCaracAd;
    @XStreamAlias("xCaracSer")
    private String xCaracSer;
    @XStreamAlias("xEmi")
    private String xEmi;
    private fluxo fluxo = new fluxo();
    private Entrega Entrega = new Entrega();
    @XStreamAlias("origCalc")
    private String origCalc;
    @XStreamAlias("destCalc")
    private String destCalc;
    @XStreamAlias("xObs")
    private String xObs;
    private List<ObsCont> ObsCont = new LinkedList<ObsCont>();
    private List<ObsFisco> ObsFisco = new LinkedList<ObsFisco>();

    /**
     * Descricao: Característica adicional do transporte
     * Observacao: Texto livre: REENTREGA; DEVOLUÇÃO; REFATURAMENTO; etc
     * Tamanho: 1 - 15
     * @param 
     */
    public void setxCaracAd(String xCaracAd) {
        this.xCaracAd = xCaracAd;
    }

    /**
     * Descricao: Identificador da tag a ser assinada
     * Observacao: Texto livre: ENTREGA EXPRESSA; LOGÍSTICA REVERSA; CONVENCIONAL; EMERGENCIAL; etc 
     * Tamanho: 1 - 30
     * @param 
     */
    public void setxCaracSer(String xCaracSer) {
        this.xCaracSer = xCaracSer;
    }

    /**
     * Descricao: Identificador da tag a ser assinada
     * Observacao: Informar a chave de acesso do CT-e e precedida do literal "CTe"
     * Tamanho: 1 - 20
     * @param 
     */
    public void setxEmi(String xEmi) {
        this.xEmi = xEmi;
    }

    /**
     * Descricao: Previsão do fluxo da carga
     * Observacao: Preenchimento obrigatório para o modal aéreo.
     * Tamanho: 1 - 20
     * @param 
     */
    public void setFluxo(br.com.moveti.erpmove.transporte.cte.xml.fluxo fluxo) {
        this.fluxo = fluxo;
    }

    /**
     * Descricao: Informações ref. a previsão de entrega
     * @param 
     */
    public void setEntrega(br.com.moveti.erpmove.transporte.cte.xml.Entrega Entrega) {
        this.Entrega = Entrega;
    }

    /**
     * Descricao: Município de origem para efeito de cálculo do frete
     * Tamanho: 1 - 40
     * @param 
     */
    public void setOrigCalc(String origCalc) {
        this.origCalc = origCalc;
    }

    /**
     * Descricao: Município de destino para efeito de cálculo do frete
     * Tamanho: 1 - 40
     * @param 
     */
    public void setDestCalc(String destCalc) {
        this.destCalc = destCalc;
    }

    /**
     * Descricao: Observações Gerais
     * Tamanho: 1 - 2000
     * @param 
     */
    public void setxObs(String xObs) {
        this.xObs = xObs;
    }

    /**
     * Descricao: Campo de uso livre do contribuinte
     * Observacao: Informar o nome do campo no atributo xCampo e o conteúdo do campo no XTexto
     * Tamanho: 0 - 10
     * @param 
     */
    public void setObsCont(List<br.com.moveti.erpmove.transporte.cte.xml.ObsCont> ObsCont) {
        this.ObsCont = ObsCont;
    }

    /**
     * Descricao: Campo de uso livre do contribuinte
     * Observacao: Informar o nome do campo no atributo xCampo e o conteúdo do campo no XTexto
     * Tamanho: 0 - 10
     * @param 
     */
    public void setObsFisco(List<br.com.moveti.erpmove.transporte.cte.xml.ObsFisco> ObsFisco) {
        this.ObsFisco = ObsFisco;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.Entrega getEntrega() {
        return Entrega;
    }

    public List<br.com.moveti.erpmove.transporte.cte.xml.ObsCont> getObsCont() {
        return ObsCont;
    }

    public List<br.com.moveti.erpmove.transporte.cte.xml.ObsFisco> getObsFisco() {
        return ObsFisco;
    }

    public String getDestCalc() {
        return destCalc;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.fluxo getFluxo() {
        return fluxo;
    }

    public String getOrigCalc() {
        return origCalc;
    }

    public String getxCaracAd() {
        return xCaracAd;
    }

    public String getxCaracSer() {
        return xCaracSer;
    }

    public String getxEmi() {
        return xEmi;
    }

    public String getxObs() {
        return xObs;
    }
}
