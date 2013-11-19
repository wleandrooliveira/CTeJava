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
    private enderDest enderDest = new enderDest();
    @XStreamAlias("email")
    private String email;
    @XStreamAlias("locEnt")
    private locEnt locEnt = new locEnt();

    
}
