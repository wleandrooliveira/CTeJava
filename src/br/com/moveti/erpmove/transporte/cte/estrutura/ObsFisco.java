/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Campo de uso livre do contribuinte - Não Obrigatório [0-10]
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("ObsFisco")
public class ObsFisco {

    @XStreamAlias("xCampo")
    private String xCampo;
    @XStreamAlias("xTexto")
    private String xTexto;

    /**
     * Descricao: Identificação do campo  
     * <b>Obrigatório</b>
     * Tamanho: 1 - 20
     * @param 
     */
    public void setxCampo(String xCampo) {
        this.xCampo = xCampo;
    }

    /**
     * Descricao: Conteúdo do campo
     * <b>Obrigatório</b>
     * Tamanho: 1 - 160
     * @param 
     */
    public void setxTexto(String xTexto) {
        this.xTexto = xTexto;
    }

    public String getxCampo() {
        return xCampo;
    }

    public String getxTexto() {
        return xTexto;
    }
}
