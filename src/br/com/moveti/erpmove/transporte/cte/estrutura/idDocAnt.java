/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.estrutura;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações de identificação dos documentos de Transporte Anterior - Obrigatorio [1-n]
 * @author Jéssica
 */
@XStreamAlias("idDocAnt")
public class idDocAnt {
    private idDocAntPap idDocAntPap = new idDocAntPap();
    private idDocAntEle idDocAntEle = new idDocAntEle();

    
}
