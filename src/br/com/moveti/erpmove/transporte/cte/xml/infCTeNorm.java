/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Grupo de informações do CT-e Normal e Substituto - Obrigatório
 * @author Jéssica
 */
@XStreamAlias("infCTeNorm")
public class infCTeNorm {
    private infCarga infCarga = new infCarga();
    private contQt contQt = new contQt();
    private docAnt docAnt = new docAnt();
    private seg seg = new seg();
    private infModal infModal = new infModal();
    private cobr cobr = new cobr();

    /**
     * @return the infCarga
     */
    public infCarga getInfCarga() {
        return infCarga;
    }

    /**
     * @param infCarga the infCarga to set
     */
    public void setInfCarga(infCarga infCarga) {
        this.infCarga = infCarga;
    }

    /**
     * @return the contQt
     */
    public contQt getContQt() {
        return contQt;
    }

    /**
     * @param contQt the contQt to set
     */
    public void setContQt(contQt contQt) {
        this.contQt = contQt;
    }

    /**
     * @return the docAnt
     */
    public docAnt getDocAnt() {
        return docAnt;
    }

    /**
     * @param docAnt the docAnt to set
     */
    public void setDocAnt(docAnt docAnt) {
        this.docAnt = docAnt;
    }

    /**
     * @return the seg
     */
    public seg getSeg() {
        return seg;
    }

    /**
     * @param seg the seg to set
     */
    public void setSeg(seg seg) {
        this.seg = seg;
    }

    public infModal getInfModal() {
        return infModal;
    }

    public void setInfModal(infModal infModal) {
        this.infModal = infModal;
    }

    public cobr getCobr() {
        return cobr;
    }

    public void setCobr(cobr cobr) {
        this.cobr = cobr;
    }
}
