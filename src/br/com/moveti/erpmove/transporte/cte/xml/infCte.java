/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Jéssica
 */
@XStreamAlias("infCte")
public class infCte {
    @XStreamAlias("versao")
    private String versao;
    @XStreamAlias("Id")
    private String Id;
    
    private ide ide = new ide();
    private compl compl = new compl();
    private emit emit = new emit();
    private rem rem = new rem();
    private exped exped = new exped();
    private receb receb = new receb();
    private dest dest = new dest();
    private imp imp = new imp();
    private infCTeNorm infCTeNorm = new infCTeNorm();
    private infCteComp infCteComp = new infCteComp();
    private infCteAnu infCteAnu = new infCteAnu();
    private vPrest vPrest = new vPrest();
    
    
    
    @XStreamAlias("fluxo")
    private String fluxo;
    @XStreamAlias("idTrem")
    private String idTrem;
    @XStreamAlias("vFrete")
    private String vFrete;

    /**
     * @return the versao
     */
    public String getVersao() {
        return versao;
    }

    /**
     * @param versao the versao to set
     */
    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the fluxo
     */
    public String getFluxo() {
        return fluxo;
    }

    /**
     * @param fluxo the fluxo to set
     */
    public void setFluxo(String fluxo) {
        this.fluxo = fluxo;
    }

    /**
     * @return the idTrem
     */
    public String getIdTrem() {
        return idTrem;
    }

    /**
     * @param idTrem the idTrem to set
     */
    public void setIdTrem(String idTrem) {
        this.idTrem = idTrem;
    }

    /**
     * @return the vFrete
     */
    public String getvFrete() {
        return vFrete;
    }

    /**
     * @param vFrete the vFrete to set
     */
    public void setvFrete(String vFrete) {
        this.vFrete = vFrete;
    }

    /**
     * @return the ide
     */
    public ide getIde() {
        return ide;
    }

    /**
     * @param ide the ide to set
     */
    public void setIde(ide ide) {
        this.ide = ide;
    }

    /**
     * @return the compl
     */
    public compl getCompl() {
        return compl;
    }

    /**
     * @param compl the compl to set
     */
    public void setCompl(compl compl) {
        this.compl = compl;
    }

    /**
     * @return the emit
     */
    public emit getEmit() {
        return emit;
    }

    /**
     * @param emit the emit to set
     */
    public void setEmit(emit emit) {
        this.emit = emit;
    }

    /**
     * @return the rem
     */
    public rem getRem() {
        return rem;
    }

    /**
     * @param rem the rem to set
     */
    public void setRem(rem rem) {
        this.rem = rem;
    }

    /**
     * @return the exped
     */
    public exped getExped() {
        return exped;
    }

    /**
     * @param exped the exped to set
     */
    public void setExped(exped exped) {
        this.exped = exped;
    }

    /**
     * @return the receb
     */
    public receb getReceb() {
        return receb;
    }

    /**
     * @param receb the receb to set
     */
    public void setReceb(receb receb) {
        this.receb = receb;
    }

    /**
     * @return the dest
     */
    public dest getDest() {
        return dest;
    }

    /**
     * @param dest the dest to set
     */
    public void setDest(dest dest) {
        this.dest = dest;
    }

    /**
     * @return the imp
     */
    public imp getImp() {
        return imp;
    }

    /**
     * @param imp the imp to set
     */
    public void setImp(imp imp) {
        this.imp = imp;
    }

    /**
     * @return the infCTeNorm
     */
    public infCTeNorm getInfCTeNorm() {
        return infCTeNorm;
    }

    /**
     * @param infCTeNorm the infCTeNorm to set
     */
    public void setInfCTeNorm(infCTeNorm infCTeNorm) {
        this.infCTeNorm = infCTeNorm;
    }

    /**
     * @return the infCteComp
     */
    public infCteComp getInfCteComp() {
        return infCteComp;
    }

    /**
     * @param infCteComp the infCteComp to set
     */
    public void setInfCteComp(infCteComp infCteComp) {
        this.infCteComp = infCteComp;
    }

    /**
     * @return the infCteAnu
     */
    public infCteAnu getInfCteAnu() {
        return infCteAnu;
    }

    /**
     * @param infCteAnu the infCteAnu to set
     */
    public void setInfCteAnu(infCteAnu infCteAnu) {
        this.infCteAnu = infCteAnu;
    }

    public vPrest getvPrest() {
        return vPrest;
    }

    public void setvPrest(vPrest vPrest) {
        this.vPrest = vPrest;
    }
}
