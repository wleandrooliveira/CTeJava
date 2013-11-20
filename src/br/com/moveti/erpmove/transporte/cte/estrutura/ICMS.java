/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

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
    public void setICMS00(br.com.moveti.erpmove.transporte.cte.estrutura.ICMS00 ICMS00) {
        this.ICMS00 = ICMS00;
    }

    /**
     * Descricao: Prestação sujeito à tributação com redução de BC do ICMS
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS20(br.com.moveti.erpmove.transporte.cte.estrutura.ICMS20 ICMS20) {
        this.ICMS20 = ICMS20;
    }

    /**
     * Descricao: ICMS Isento, não Tributado ou diferido
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS45(br.com.moveti.erpmove.transporte.cte.estrutura.ICMS45 ICMS45) {
        this.ICMS45 = ICMS45;
    }

    /**
     * Descricao: Tributação pelo ICMS60 - ICMS cobrado por substituição tributária.Responsabilidade do recolhimento do ICMS atribuído ao tomador ou 3º por ST
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS60(br.com.moveti.erpmove.transporte.cte.estrutura.ICMS60 ICMS60) {
        this.ICMS60 = ICMS60;
    }

    /**
     * Descricao: ICMS Outros
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMS90(br.com.moveti.erpmove.transporte.cte.estrutura.ICMS90 ICMS90) {
        this.ICMS90 = ICMS90;
    }

    /**
     * Descricao: ICMS devido à UF de origem da prestação, quando diferente da UF do emitente
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMSOutraUF(br.com.moveti.erpmove.transporte.cte.estrutura.ICMSOutraUF ICMSOutraUF) {
        this.ICMSOutraUF = ICMSOutraUF;
    }

    /**
     * Descricao: Simples Nacional
     * <b>Obrigatório</b>
     * @param 
     */
    public void setICMSSN(br.com.moveti.erpmove.transporte.cte.estrutura.ICMSSN ICMSSN) {
        this.ICMSSN = ICMSSN;
    }
}
