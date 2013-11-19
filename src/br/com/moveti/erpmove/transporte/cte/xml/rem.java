/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("rem")
public class rem {
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
    private String fone;
    private enderReme enderReme = new enderReme();
    @XStreamAlias("email")
    private String email;
    @XStreamImplicit(itemFieldName = "infNF")
    private List<infNF> infNF = new ArrayList<infNF>();       
    private List<infNFe> infNFe = new ArrayList<infNFe>();
    private infOutros infOutros = new infOutros();

    
}
