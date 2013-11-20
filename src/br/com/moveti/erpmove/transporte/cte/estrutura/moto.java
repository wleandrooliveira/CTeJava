/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações do(s) Motorista(s)
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("moto")
public class moto {

    @XStreamAlias("xNome")
    private String xNome;
    @XStreamAlias("CPF")
    private String CPF;

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    /**
     * Descricao: 
     * Observacao: 
     * <b>Obrigatório</b>
     * Tamanho: 
     * @param 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public String getxNome() {
        return xNome;
    }
}
