/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * Identificação do CT-e - Obrigatório [1-1]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ide")
public class ide {

    @XStreamAlias("cUF")
    private String cUF;
    @XStreamAlias("cCT")
    private String cCT;
    @XStreamAlias("CFOP")
    private String CFOP;
    @XStreamAlias("natOp")
    private String natOp;
    @XStreamAlias("forPag")
    private String forPag;
    @XStreamAlias("mod")
    private String mod;
    @XStreamAlias("serie")
    private String serie;
    @XStreamAlias("nCT")
    private String nCT;
    @XStreamAlias("dhEmi")
    private String dhEmi;
    @XStreamAlias("tpImp")
    private String tpImp;
    @XStreamAlias("tpEmis")
    private String tpEmis;
    @XStreamAlias("cDV")
    private String cDV;
    @XStreamAlias("tpAmb")
    private String tpAmb;
    @XStreamAlias("tpCTe")
    private String tpCTe;
    @XStreamAlias("procEmi")
    private String procEmi;
    @XStreamAlias("verProc")
    private String verProc;
    @XStreamAlias("refCTE")
    private String refCTE;
    @XStreamAlias("cMunEnv")
    private String cMunEnv;
    @XStreamAlias("xMunEnv")
    private String xMunEnv;
    @XStreamAlias("UFEnv")
    private String UFEnv;
    @XStreamAlias("modal")
    private String modal;
    @XStreamAlias("tpServ")
    private String tpServ;
    @XStreamAlias("cMunIni")
    private String cMunIni;
    @XStreamAlias("xMunIni")
    private String xMunIni;
    @XStreamAlias("UFIni")
    private String UFIni;
    @XStreamAlias("cMunFim")
    private String cMunFim;
    @XStreamAlias("xMunFim")
    private String xMunFim;
    @XStreamAlias("UFFim")
    private String UFFim;
    @XStreamAlias("retira")
    private String retira;
    @XStreamAlias("xDetRetira")
    private String XDetRetira;
    @XStreamAlias("toma03")
    private toma03 toma03;
    //= new toma03();
    @XStreamAlias("toma04")
    private toma4 toma04;
    //= new toma4();

    /**
     * Descricao: Código da UF do emitente do CT-e.
     * Observacao: Utilizar a Tabela do IBGE.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    /**
     * Descricao: Código numérico que compõe a Chave de Acesso.
     * Observacao: Número aleatório gerado pelo emitente
    para cada CT-e, com o objetivo de evitar
    acessos indevidos ao documento.
     * <b>Obrigatório</b>
     * Tamanho: 8
     * @param 
     */
    public void setcCT(String cCT) {
        this.cCT = cCT;
    }

    /**
     * Descricao: Código Fiscal de Operações e Prestações
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 4
     * @param 
     */
    public void setCFOP(String CFOP) {
        this.CFOP = CFOP;
    }

    /**
     * Descricao: Natureza da Operação
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    /**
     * Descricao: Forma de pagamento do serviço
     * Observacao: Preencher com:
    0 - Pago;
    1 - A pagar;
    2 - Outros
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setForPag(String forPag) {
        this.forPag = forPag;
    }

    /**
     * Descricao: Modelo do documento fiscal
     * Observacao: Utilizar o código 57 para identificação do CT-e, emitido em substituição aos modelos de conhecimentos em papel.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setMod(String mod) {
        this.mod = mod;
    }

    /**
     * Descricao: Série do CT-e
     * Observacao: Preencher com "0" no caso de série única
     * <b>Obrigatório</b>
     * Tamanho: 1 - 3
     * @param 
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Descricao: Número do CT-e
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 1 - 9
     * @param 
     */
    public void setnCT(String nCT) {
        this.nCT = nCT;
    }

    /**
     * Descricao: Data e hora de emissão do CT-e
     * Observacao: Formato AAAA-MM-DDTHH:MM:DD
     * <b>Obrigatório</b>
     * Tamanho: 19
     * @param 
     */
    public void setDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
    }

    /**
     * Descricao: Formato de impressão do DACTE
     * Observacao: Preencher com: 1 - Retrato; 2 - Paisagem.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setTpImp(String tpImp) {
        this.tpImp = tpImp;
    }

    /**
     * Descricao: Forma de emissão do CT-e
     * Observacao: Preencher com:
     *              1 - Normal;
     *              4-EPEC pela SVC; 
     *              5 - Contingência FSDA;
     *              7 - Autorização pela SVC-RS;
     *              8 - Autorização pela SVC-SP
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpEmis(String tpEmis) {
        this.tpEmis = tpEmis;
    }

    /**
     * Descricao: Digito Verificador da chave de acesso do
    CT-e
     * Observacao: Informar o dígito de controle da chave de
    acesso do CT-e, que deve ser calculado
    com a aplicação do algoritmo módulo 11
    (base 2,9) da chave de acesso.
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setcDV(String cDV) {
        this.cDV = cDV;
    }

    /**
     * Descricao: Tipo do Ambiente
     * Observacao: Preencher com:1 - Produção; 2 -
    Homologação
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    /**
     * Descricao: Tipo do CT-e
     * Observacao: Preencher com: 0 - CT-e Normal; 1 - CT-e de Complemento de Valores; 2 - CT-e de Anulação; 3 - CT-e Substituto
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpCTe(String tpCTe) {
        this.tpCTe = tpCTe;
    }

    /**
     * Descricao: Identificador do processo de emissão do CT-e
     * Observacao: Preencher com: 0 - emissão de CT-e com aplicativo do contribuinte; 1 - emissão de CT-e avulsa pelo Fisco; 2 - emissão de CT-e avulsa, pelo contribuinte com seu certificado digital, através do site do Fisco; 3- emissão CT-e pelo contribuinte com aplicativo fornecido pelo Fisco.
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setProcEmi(String procEmi) {
        this.procEmi = procEmi;
    }

    /**
     * Descricao: Versão do processo de emissão
     * Observacao: Iinformar a versão do aplicativo emissor de CT-e.
     * <b>Obrigatório</b>
     * Tamanho: 1 - 20
     * @param 
     */
    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }

    /**
     * Descricao: Chave de acesso do CT-e referenciado
     * Observacao: 
     * Tamanho: 44
     * @param 
     */
    public void setRefCTE(String refCTE) {
        this.refCTE = refCTE;
    }

    /**
     * Descricao: Código do Município de envio do CT-e (de onde o documento foi transmitido)
     * Observacao: Utilizar a tabela do IBGE. Informar 9999999 para as operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 7
     * @param 
     */
    public void setcMunEnv(String cMunEnv) {
        this.cMunEnv = cMunEnv;
    }

    /**
     * Descricao: Nome do Município de envio do CT-e (de
    onde o documento foi transmitido)
     * Observacao: Informar PAIS/Municipio para as
    operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxMunEnv(String xMunEnv) {
        this.xMunEnv = xMunEnv;
    }

    /**
     * Descricao: Sigla da UF de envio do CT-e (de onde o
    documento foi transmitido)
     * Observacao: Informar 'EX' para operações com o
    exterior.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setUFEnv(String UFEnv) {
        this.UFEnv = UFEnv;
    }

    /**
     * Descricao: Modal
     * Observacao: Preencher com:01-Rodoviário;
    02-Aéreo;03-Aquaviário;04-Ferroviário;05-Dutoviário;06-Multimodal;
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setModal(String modal) {
        this.modal = modal;
    }

    /**
     * Descricao: Tipo do Serviço
     * Observacao: Preencher com:
    0 - Normal;1 - Subcontratação;
    2 - Redespacho;3 - Redespacho
    Intermediário; 4 - Serviço Vinculado a
    Multimodal
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setTpServ(String tpServ) {
        this.tpServ = tpServ;
    }

    /**
     * Descricao: Código do Município de início da
    prestação
     * Observacao: Utilizar a tabela do IBGE. Informar
    9999999 para operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 7
     * @param 
     */
    public void setcMunIni(String cMunIni) {
        this.cMunIni = cMunIni;
    }

    /**
     * Descricao: Nome do Município do início da
    prestação
     * Observacao: Informar 'EXTERIOR' para operações
    com o exterior
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxMunIni(String xMunIni) {
        this.xMunIni = xMunIni;
    }

    /**
     * Descricao: UF do início da prestação
     * Observacao: Informar 'EX' para operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setUFIni(String UFIni) {
        this.UFIni = UFIni;
    }

    /**
     * Descricao: Código do Município de término da
    prestação
     * Observacao: Utilizar a tabela do IBGE. Informar
    9999999 para operações com o exterior
     * <b>Obrigatório</b>
     * Tamanho: 7
     * @param 
     */
    public void setcMunFim(String cMunFim) {
        this.cMunFim = cMunFim;
    }

    /**
     * Descricao: Nome do Município do término da prestação
     * Observacao: Informar 'EXTERIOR' para operações com o exterior.
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxMunFim(String xMunFim) {
        this.xMunFim = xMunFim;
    }

    /**
     * Descricao: UF do término da prestação
     * Observacao: Informar 'EX' para operações com o
    exterior.
     * <b>Obrigatório</b>
     * Tamanho: 2
     * @param 
     */
    public void setUFFim(String UFFim) {
        this.UFFim = UFFim;
    }

    /**
     * Descricao: Indicador se o Recebedor retira no Aeroporto, Filial, Porto ou Estação de Destino?
     * Observacao: Preencher com: 0 - sim; 1 - não
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setRetira(String retira) {
        this.retira = retira;
    }

    /**
     * Descricao: Detalhes do retira
     * Tamanho: 1 - 160
     * @param 
     */
    public void setXDetRetira(String XDetRetira) {
        this.XDetRetira = XDetRetira;
    }

    /**
     * Descricao: Indicador do "papel" do tomador do serviço no CT-e
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setToma03(br.com.moveti.erpmove.transporte.cte.model.toma03 toma03) {
        this.toma03 = toma03;
    }

    /**
     * Descricao: Indicador do "papel" do tomador do serviço no CT-e
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setToma04(br.com.moveti.erpmove.transporte.cte.model.toma4 toma04) {
        this.toma04 = toma04;
    }

    public String getCFOP() {
        return CFOP;
    }

    public String getcMunFim() {
        return cMunFim;
    }

    public String getUFEnv() {
        return UFEnv;
    }

    public String getUFFim() {
        return UFFim;
    }

    public String getUFIni() {
        return UFIni;
    }

    public String getXDetRetira() {
        return XDetRetira;
    }

    public String getcCT() {
        return cCT;
    }

    public String getcDV() {
        return cDV;
    }

    public String getcMunEnv() {
        return cMunEnv;
    }

    public String getcMunIni() {
        return cMunIni;
    }

    public String getcUF() {
        return cUF;
    }

    public String getDhEmi() {
        return dhEmi;
    }

    public String getForPag() {
        return forPag;
    }

    public String getMod() {
        return mod;
    }

    public String getModal() {
        return modal;
    }

    public String getnCT() {
        return nCT;
    }

    public String getNatOp() {
        return natOp;
    }

    public String getProcEmi() {
        return procEmi;
    }

    public String getRefCTE() {
        return refCTE;
    }

    public String getRetira() {
        return retira;
    }

    public String getSerie() {
        return serie;
    }

    public br.com.moveti.erpmove.transporte.cte.model.toma03 getToma03() {
        return toma03;
    }

    public br.com.moveti.erpmove.transporte.cte.model.toma4 getToma04() {
        return toma04;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public String getTpCTe() {
        return tpCTe;
    }

    public String getTpEmis() {
        return tpEmis;
    }

    public String getTpImp() {
        return tpImp;
    }

    public String getTpServ() {
        return tpServ;
    }

    public String getVerProc() {
        return verProc;
    }

    public String getxMunEnv() {
        return xMunEnv;
    }

    public String getxMunFim() {
        return xMunFim;
    }

    public String getxMunIni() {
        return xMunIni;
    }
}
