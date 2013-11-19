/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Grupo de informações do CT-e Normal e Substituto - Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infCTeNorm")
public class infCTeNorm {
    private infCarga infCarga = new infCarga();
    private contQt contQt = new contQt();
    private docAnt docAnt = new docAnt();
    private seg seg = new seg();
    private infModal infModal = new infModal();
    private cobr cobr = new cobr();

    
}
