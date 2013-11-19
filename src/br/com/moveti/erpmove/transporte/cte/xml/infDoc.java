/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("infDoc")
public class infDoc {

    private infNF infNF;
    private List<infNFe> infNFe;
    
    public void addInfNFe(infNFe _infNFe)
    {
        if (this.infNFe == null)
        {
            this.infNFe = new LinkedList<infNFe>();
        }
        this.infNFe.add(_infNFe);
    }

    public void setInfNF(br.com.moveti.erpmove.transporte.cte.xml.infNF infNF) {
        this.infNF = infNF;
    }

    public void setInfNFe(List<br.com.moveti.erpmove.transporte.cte.xml.infNFe> infNFe) {
        this.infNFe = infNFe;
    }

    public br.com.moveti.erpmove.transporte.cte.xml.infNF getInfNF() {
        return infNF;
    }

    public List<br.com.moveti.erpmove.transporte.cte.xml.infNFe> getInfNFe() {
        return infNFe;
    }
}
