/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ICMS")
public class ICMS {

    private ICMS00 ICMS00 = new ICMS00();
    private ICMS20 ICMS20 = new ICMS20();
    private ICMS45 ICMS45 = new ICMS45();
    private ICMS60 ICMS60 = new ICMS60();
    private ICMS90 ICMS90 = new ICMS90();
    private ICMSOutraUF ICMSOutraUF = new ICMSOutraUF();
    private ICMSSN ICMSSN = new ICMSSN();

    /**
     * Descricao: Prestação sujeito à tributação normal do ICMS
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS00(br.com.moveti.erpmove.transporte.cte.model.ICMS00 ICMS00) {
        if (ICMS00.getCST() == null) {
            this.ICMS00 = null;
        } else {
            this.ICMS00 = ICMS00;
        }
    }

    /**
     * Descricao: Prestação sujeito à tributação com redução de BC do ICMS
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS20(br.com.moveti.erpmove.transporte.cte.model.ICMS20 ICMS20) {
        if (ICMS20.getCST() == null) {
            this.ICMS20 = null;
        } else {
            this.ICMS20 = ICMS20;
        }
    }

    /**
     * Descricao: ICMS Isento, não Tributado ou diferido
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS45(br.com.moveti.erpmove.transporte.cte.model.ICMS45 ICMS45) {
        if (ICMS45.getCST() == null) {
            this.ICMS45 = null;
        } else {
            this.ICMS45 = ICMS45;
        }
    }

    /**
     * Descricao: Tributação pelo ICMS60 - ICMS cobrado por substituição tributária.Responsabilidade do recolhimento do ICMS atribuído ao tomador ou 3º por ST
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS60(br.com.moveti.erpmove.transporte.cte.model.ICMS60 ICMS60) {
        if (ICMS60.getCST() == null) {
            this.ICMS60 = null;
        } else {
            this.ICMS60 = ICMS60;
        }
    }

    /**
     * Descricao: ICMS Outros
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS90(br.com.moveti.erpmove.transporte.cte.model.ICMS90 ICMS90) {
        if (ICMS90.getCST() == null) {
            this.ICMS90 = null;
        } else {
            this.ICMS90 = ICMS90;
        }
    }

    /**
     * Descricao: ICMS devido à UF de origem da prestação, quando diferente da UF do emitente
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMSOutraUF(br.com.moveti.erpmove.transporte.cte.model.ICMSOutraUF ICMSOutraUF) {
        if (ICMSOutraUF.getCST() == null) {
            this.ICMSOutraUF = null;
        } else {
            this.ICMSOutraUF = ICMSOutraUF;
        }
    }

    /**
     * Descricao: Simples Nacional
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMSSN(br.com.moveti.erpmove.transporte.cte.model.ICMSSN ICMSSN) {
        if (ICMSSN.getIndSN() == null) {
            this.ICMSSN = null;
        } else {
            this.ICMSSN = ICMSSN;
        }
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMS00 getICMS00() {
        return ICMS00;
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMS20 getICMS20() {
        return ICMS20;
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMS45 getICMS45() {
        return ICMS45;
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMS60 getICMS60() {
        return ICMS60;
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMS90 getICMS90() {
        return ICMS90;
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMSOutraUF getICMSOutraUF() {
        return ICMSOutraUF;
    }

    public br.com.moveti.erpmove.transporte.cte.model.ICMSSN getICMSSN() {
        return ICMSSN;
    }
}
