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
@XStreamAlias("infInut")
public class infInut {
    //Tags em comum
    @XStreamAlias("Id")
    private String Id;
    @XStreamAlias("tpAmb")
    private String tpAmb;      
    @XStreamAlias("cUF")
    private String cUF;
    @XStreamAlias("ano")
    private String ano;
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("mod")
    private String mod;
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("nCTIni")
    private String nCTIni;
    @XStreamAlias("nCTFin")
    private String nCTFin;
   
    //Tags Resposta
    @XStreamAlias("verAplic")
    private String verAplic;
    @XStreamAlias("cStat")
    private String cStat;
    @XStreamAlias("xMotivo")
    private String xMotivo;
    @XStreamAlias("dhRecbto")
    private String dhRecbto;
    @XStreamAlias("nProt")
    private String nProt;
    
    //Tags do Pedido 
    @XStreamAlias("xServ")
    private String xServ; 
    @XStreamAlias("xJust")
    private String xJust;

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
     * @return the tpAmb
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * @param tpAmb the tpAmb to set
     */
    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    /**
     * @return the cUF
     */
    public String getcUF() {
        return cUF;
    }

    /**
     * @param cUF the cUF to set
     */
    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the mod
     */
    public String getMod() {
        return mod;
    }

    /**
     * @param mod the mod to set
     */
    public void setMod(String mod) {
        this.mod = mod;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the nCTIni
     */
    public String getnCTIni() {
        return nCTIni;
    }

    /**
     * @param nCTIni the nCTIni to set
     */
    public void setnCTIni(String nCTIni) {
        this.nCTIni = nCTIni;
    }

    /**
     * @return the nCTFin
     */
    public String getnCTFin() {
        return nCTFin;
    }

    /**
     * @param nCTFin the nCTFin to set
     */
    public void setnCTFin(String nCTFin) {
        this.nCTFin = nCTFin;
    }

    /**
     * @return the verAplic
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * @param verAplic the verAplic to set
     */
    public void setVerAplic(String verAplic) {
        this.verAplic = verAplic;
    }

    /**
     * @return the cStat
     */
    public String getcStat() {
        return cStat;
    }

    /**
     * @param cStat the cStat to set
     */
    public void setcStat(String cStat) {
        this.cStat = cStat;
    }

    /**
     * @return the xMotivo
     */
    public String getxMotivo() {
        return xMotivo;
    }

    /**
     * @param xMotivo the xMotivo to set
     */
    public void setxMotivo(String xMotivo) {
        this.xMotivo = xMotivo;
    }

    /**
     * @return the dhRecbto
     */
    public String getDhRecbto() {
        return dhRecbto;
    }

    /**
     * @param dhRecbto the dhRecbto to set
     */
    public void setDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
    }

    /**
     * @return the nProt
     */
    public String getnProt() {
        return nProt;
    }

    /**
     * @param nProt the nProt to set
     */
    public void setnProt(String nProt) {
        this.nProt = nProt;
    }

    /**
     * @return the xServ
     */
    public String getxServ() {
        return xServ;
    }

    /**
     * @param xServ the xServ to set
     */
    public void setxServ(String xServ) {
        this.xServ = xServ;
    }

    /**
     * @return the xJust
     */
    public String getxJust() {
        return xJust;
    }

    /**
     * @param xJust the xJust to set
     */
    public void setxJust(String xJust) {
        this.xJust = xJust;
    }
    
    
    
}
