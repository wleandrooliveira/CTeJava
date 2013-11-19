/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Grupo de informações do CT-e Normal e Substituto - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infCTeNorm")
public class infCTeNorm {

    private infCarga infCarga = new infCarga();
    private infDoc infDoc = new infDoc();
    //private contQt contQt = new contQt();
    private docAnt docAnt = new docAnt();
    private seg seg = new seg();
    private infModal infModal = new infModal();
    private peri peri = new peri();
    private veicNovos veicNovos = new veicNovos();
    private cobr cobr = new cobr();
    private infCteSub infCteSub = new infCteSub();

    /**
     * Descricao: Informações da Carga do CT-e
     * <b>Obrigatório</b>
     * @param 
     */
    public void setInfCarga(br.com.moveti.erpmove.transporte.cte.xml.infCarga infCarga) {
        this.infCarga = infCarga;
    }

    /**
     * Descricao: Informações dos documentos transportados pelo CT-e Opcional para Redespacho Intermediario e Serviço vinculado a multimodal.
     * Observacao: Poderá não ser informado para os CT-e de redespacho intermediário. Nos demais casos deverá sempre ser informado.
     * @param 
     */
    public void setInfDoc(br.com.moveti.erpmove.transporte.cte.xml.infDoc infDoc) {
        this.infDoc = infDoc;
    }

    /**
     * Descricao: Documentos de Transporte Anterior
     * @param 
     */
    public void setDocAnt(br.com.moveti.erpmove.transporte.cte.xml.docAnt docAnt) {
        this.docAnt = docAnt;
    }

    /**
     * Descricao: Informações de Seguro da Carga
     * @param 
     */
    public void setSeg(br.com.moveti.erpmove.transporte.cte.xml.seg seg) {
        this.seg = seg;
    }

    /**
     * Descricao: Informações do modal
     * <b>Obrigatório</b>
     * @param 
     */
    public void setInfModal(br.com.moveti.erpmove.transporte.cte.xml.infModal infModal) {
        this.infModal = infModal;
    }

    /**
     * Descricao: Preenchido quando for transporte de produtos classificados pela ONU como perigosos.
     * Observacao: Não deve ser preenchido para modal dutoviário. Observação para o modal aéreo: - O preenchimento desses campos não desobriga a empresa aérea de emitir os demais documentos que constam na legislação vigente.
     * @param 
     */
    public void setPeri(br.com.moveti.erpmove.transporte.cte.xml.peri peri) {
        this.peri = peri;
    }

    /**
     * Descricao: Informações dos veículos transportados
     * @param 
     */
    public void setVeicNovos(br.com.moveti.erpmove.transporte.cte.xml.veicNovos veicNovos) {
        this.veicNovos = veicNovos;
    }

    /**
     * Descricao: Preenchido quando for transporte de produtos classificados pela ONU como perigosos.
     * @param 
     */
    public void setCobr(br.com.moveti.erpmove.transporte.cte.xml.cobr cobr) {
        this.cobr = cobr;
    }

    /**
     * Descricao: Informações do CT-e de substituição
     * @param 
     */
    public void setInfCteSub(br.com.moveti.erpmove.transporte.cte.xml.infCteSub infCteSub) {
        this.infCteSub = infCteSub;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.cobr getCobr() {
        return cobr;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.docAnt getDocAnt() {
        return docAnt;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infCarga getInfCarga() {
        return infCarga;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infCteSub getInfCteSub() {
        return infCteSub;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infModal getInfModal() {
        return infModal;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infDoc getInfDoc() {
        return infDoc;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.peri getPeri() {
        return peri;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.seg getSeg() {
        return seg;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.veicNovos getVeicNovos() {
        return veicNovos;
    }
}
