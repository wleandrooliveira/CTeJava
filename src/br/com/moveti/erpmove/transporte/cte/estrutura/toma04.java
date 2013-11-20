/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Indicador do "papel" do tomador do serviço no CT-e - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 * @version 1.0
 */
@XStreamAlias("toma04")
public class toma04 {

    @XStreamAlias("toma")
    private int toma;
    @XStreamAlias("CNPJ")
    private String CNPJ;
    @XStreamAlias("CPF")
    private String CPF;
    @XStreamAlias("IE")
    private String IE;
    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("xFant")
    private String xFant;
    @XStreamAlias("fone")
    private int fone;
    private enderToma enderToma = new enderToma();
    @XStreamAlias("email")
    private String email;

    /**
     * Descricao: Tomador do Serviço
     * Observacao: Preencher com: 4 - Outros Obs: Informar os dados cadastrais do tomador do serviço
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setToma(int toma) {
        this.toma = toma;
    }

    /**
     * Descricao: Número do CNPJ
     * Observacao: Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros. Informar os zeros não significativos.
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
     * Observacao: Informar a IE do tomador ou ISENTO se tomador é contribuinte do ICMS isento de inscrição no cadastro de contribuintes do ICMS. Caso o tomador não seja contribuinte do ICMS não informar o conteúdo.    
     * Tamanho: 0 - 14
     * @param 
     */
    public void setIE(String IE) {
        this.IE = IE;
    }

    /**
     * Descricao: Razão Social ou Nome
     * <b>Obrigatório</b>
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    /**
     * Descricao: Nome Fantasia
     * Tamanho: 1 - 60
     * @param 
     */
    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    /**
     * Descricao: Telefone
     * Tamanho: 6 - 14
     * @param 
     */
    public void setFone(int fone) {
        this.fone = fone;
    }

    /**
     * Descricao: Dados do endereço
     * <b>Obrigatório</b>
     * @param 
     */
    public void setEnderToma(br.com.moveti.erpmove.transporte.cte.estrutura.enderToma enderToma) {
        this.enderToma = enderToma;
    }

    /**
     * Descricao: Endereço de email
     * Tamanho: 1 - 60
     * @param 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public String getIE() {
        return IE;
    }

    public String getEmail() {
        return email;
    }

    public br.com.moveti.erpmove.transporte.cte.estrutura.enderToma getEnderToma() {
        return enderToma;
    }

    public int getFone() {
        return fone;
    }

    public int getToma() {
        return toma;
    }

    public String getxFant() {
        return xFant;
    }

    public String getxNome() {
        return xNome;
    }
}
