/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Ocorrência : 0 - n
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("pass")
public class pass {

    @XStreamAlias("xPass")
    private String xPass;
    @XStreamAlias("xDest")
    private String xDest;
    @XStreamAlias("xRota")
    private String xRota;

    /**
     * Descricao: Sigla ou código interno da Filial/Porto/Estação/Aeroporto de Passagem
     * Observacao: Observação para o modal aéreo: - O código de três letras IATA, referente ao aeroporto de transferência, deverá ser incluído, quando for o caso. Quando não for possível, utilizar a sigla OACI. Qualquer solicitação de itinerário deverá ser incluída.
     * Tamanho: 1 - 15
     * @param 
     */
    public void setxPass(String xPass) {
        this.xPass = xPass;
    }

    /**
     * Descricao: Sigla ou código interno da Filial/Porto/Estação/Aeroporto de Destino
     * Observacao: Observações para o modal aéreo: - Preenchimento obrigatório para o modal aéreo. - Deverá ser incluído o código de três letras IATA do aeroporto de destino. Quando não for possível, utilizar a sigla OACI.
     * Tamanho: 1 - 15
     * @param 
     */
    public void setxDest(String xDest) {
        this.xDest = xDest;
    }

    /**
     * Descricao: Código da Rota de Entrega
     * Tamanho: 1 - 10
     * @param 
     */
    public void setxRota(String xRota) {
        this.xRota = xRota;
    }

    public String getxDest() {
        return xDest;
    }

    public String getxPass() {
        return xPass;
    }

    public String getxRota() {
        return xRota;
    }
}
