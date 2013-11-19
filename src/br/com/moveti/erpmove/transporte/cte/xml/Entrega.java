/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Informações ref. a previsão de entrega - Não Obrigatório
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("Entrega")
public class Entrega {
    private semData semData = new semData();
    private comData comData = new comData();
    private noPeriodo noPeriodo = new noPeriodo();
    private semHora semHora = new semHora();
    private comHora comHora = new comHora();
    private noInter noInter = new noInter();
    
    
}
