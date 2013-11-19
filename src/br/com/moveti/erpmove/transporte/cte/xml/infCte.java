/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
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
    private vPrest vPrest = new vPrest();
    private imp imp = new imp();
    
    private infCTeNorm infCTeNorm = new infCTeNorm();
    private infCteComp infCteComp = new infCteComp();
    private infCteAnu infCteAnu = new infCteAnu();
    

    /**
     * Descricao: Versão do leiaute
     * Observacao: Ex: "2.00"
     * <b>Obrigatório</b>
     * @param versao the versao to set
     */
    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * Descricao: Identificador da tag a ser assinada
     * Observacao: Informar a chave de acesso do CT-e e precedida do literal "CTe"
     * <b>Obrigatório</b>
     * Tamanho: 47
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Descricao: Identificação do CT-e
     * <b>Obrigatório</b>
     * @param 
     */
    public void setIde(br.com.moveti.erpmove.transporte.cte.xml.ide ide) {
        this.ide = ide;
    }

    /**
     * Descricao: Dados complementares do CT-e para fins operacionais ou comerciais
     * @param 
     */
    public void setCompl(br.com.moveti.erpmove.transporte.cte.xml.compl compl) {
        this.compl = compl;
    }

    /**
     * Descricao: Identificação do Emitente do CT-e
     * <b>Obrigatório</b>
     * @param 
     */
    public void setEmit(br.com.moveti.erpmove.transporte.cte.xml.emit emit) {
        this.emit = emit;
    }

    /**
     * Descricao: Informações do Remetente das mercadorias transportadas pelo CT-e
     * Observacao: Poderá não ser informado para os CTe de redespacho intermediário. Nos demais casos deverá sempre ser informado.
     * @param 
     */
    public void setRem(br.com.moveti.erpmove.transporte.cte.xml.rem rem) {
        this.rem = rem;
    }

    /**
     * Descricao: Informações do Expedidor da Carga
     * @param 
     */
    public void setExped(br.com.moveti.erpmove.transporte.cte.xml.exped exped) {
        this.exped = exped;
    }

    /**
     * Descricao: Informações do Recebedor da Carga
     * @param 
     */
    public void setReceb(br.com.moveti.erpmove.transporte.cte.xml.receb receb) {
        this.receb = receb;
    }

    /**
     * Descricao: Informações do Destinatário do CT-e
     * Observacao: Só pode ser omitido em caso de redespacho intermediário
     * @param 
     */
    public void setDest(br.com.moveti.erpmove.transporte.cte.xml.dest dest) {
        this.dest = dest;
    }

    /**
     * Descricao: Valores da Prestação de Serviço
     * <b>Obrigatório</b>
     * @param 
     */
    public void setvPrest(br.com.moveti.erpmove.transporte.cte.xml.vPrest vPrest) {
        this.vPrest = vPrest;
    }

    /**
     * Descricao: Informações relativas aos Impostos
     * <b>Obrigatório</b>
     * @param 
     */
    public void setImp(br.com.moveti.erpmove.transporte.cte.xml.imp imp) {
        this.imp = imp;
    }

    /**
     * Descricao: Grupo de informações do CT-e Normal e Substituto
     * <b>Obrigatório</b>
     * @param 
     */
    public void setInfCTeNorm(br.com.moveti.erpmove.transporte.cte.xml.infCTeNorm infCTeNorm) {
        this.infCTeNorm = infCTeNorm;
    }

    /**
     * Descricao: Detalhamento do CT-e complementado
     * <b>Obrigatório</b>
     * @param 
     */
    public void setInfCteComp(br.com.moveti.erpmove.transporte.cte.xml.infCteComp infCteComp) {
        this.infCteComp = infCteComp;
    }

    /**
     * Descricao: Detalhamento do CT-e do tipo Anulação
     * <b>Obrigatório</b>
     * @param 
     */
    public void setInfCteAnu(br.com.moveti.erpmove.transporte.cte.xml.infCteAnu infCteAnu) {
        this.infCteAnu = infCteAnu;
    }

    public String getId() {
        return Id;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.compl getCompl() {
        return compl;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.dest getDest() {
        return dest;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.emit getEmit() {
        return emit;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.exped getExped() {
        return exped;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.ide getIde() {
        return ide;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.imp getImp() {
        return imp;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infCTeNorm getInfCTeNorm() {
        return infCTeNorm;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infCteAnu getInfCteAnu() {
        return infCteAnu;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infCteComp getInfCteComp() {
        return infCteComp;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.receb getReceb() {
        return receb;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.rem getRem() {
        return rem;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.vPrest getvPrest() {
        return vPrest;
    }

    public String getVersao() {
        return versao;
    }
}
