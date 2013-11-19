/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do Destinatário do CT-e - Não Obrigatório : Só pode ser omitido em caso de redespacho intermediário
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("dest")
public class dest {

    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("fone")
    private String fone;
    @XStreamAlias("ISUF")
    private String ISUF;
    private enderDest enderDest = new enderDest();
    @XStreamAlias("email")
    private String email;
    @XStreamAlias("locEnt")
    private locEnt locEnt = new locEnt();

    /**
     * Descricao: Número do CNPJ
     * Observacao: Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros. Informar os zeros não significativos
     * <b>Obrigatório</b>
     * Tamanho: 14
     * @param 
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Descricao: Número do CPF
     * Observacao: Informar os zeros não significativos
     * <b>Obrigatório</b>
     * Tamanho: 11
     * @param 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * Descricao: Inscrição Estadual
     * Observacao: Informar a IE do remetente ou ISENTO se remetente é contribuinte do ICMS isento de inscrição no cadastro de contribuintes do ICMS. Caso o remetente não seja contribuinte do ICMS não informar o conteúdo.
     * Tamanho: 0 - 14
     * @param 
     */
    public void setIE(String IE) {
        this.IE = IE;
    }

    /**
     * Descricao: Razão social ou nome do remetente
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    /**
     * Descricao: Telefone
     * Tamanho: 6 - 14
     * @param 
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * Descricao: Inscrição na SUFRAMA
     * Observacao:(Obrigatório nas operações com as áreas com benefícios de incentivos fiscais sob controle da SUFRAMA)
     * Tamanho: 8 - 9
     * @param 
     */
    public void setISUF(String ISUF) {
        this.ISUF = ISUF;
    }

    /**
     * Descricao: Dados do endereço
     * <b>Obrigatório</b>
     * @param 
     */
    public void setEnderDest(br.com.moveti.erpmove.transporte.cte.xml.enderDest enderDest) {
        this.enderDest = enderDest;
    }

    /**
     * Descricao: Endereço de email
     * Tamanho: 1 - 60
     * @param 
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
