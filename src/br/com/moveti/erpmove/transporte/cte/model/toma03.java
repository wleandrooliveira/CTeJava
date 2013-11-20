/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * Indicador do "papel" do tomador do serviço no CT-e - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 * @version 1.0
 */
@XStreamAlias("toma03")
public class toma03 {

    @XStreamAlias("toma")
    private int toma;

    /**
     * Descricao: Tomador do Serviço
     * Observacao: Preencher com: 0-Remetente; 1-Expedidor; 2-Recebedor; 3-Destinatário Serão utilizadas as informações contidas no respectivo grupo, conforme indicado pelo conteúdo deste campo
     * <b>Obrigatório</b>
     * Tamanho: 1
     * @param 
     */
    public void setToma(int toma) {
        this.toma = toma;
    }

    public int getToma() {
        return toma;
    }
}
