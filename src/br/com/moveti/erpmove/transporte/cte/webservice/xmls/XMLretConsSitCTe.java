/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.comunicacao.xmls;

import br.com.moveti.erpmove.transporte.cte.estrutura.infProt;
import br.com.moveti.erpmove.transporte.cte.estrutura.protCTe;
import br.com.moveti.erpmove.transporte.cte.estrutura.retConsSitCTe;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
public class XMLretConsSitCTe {
    private retConsSitCTe retCons = new retConsSitCTe();
    protCTe protCte = new protCTe();
    private String XML = new String();
    
    
    public void BuscaDadosXML() {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("retConsSitCTe", retConsSitCTe.class);       
        xstream.alias("protCTe", protCTe.class);
        xstream.alias("infProt", infProt.class);
        retCons = (retConsSitCTe) xstream.fromXML(getXML());
    }

    public retConsSitCTe getRetCons() {
        return retCons;
    }

    public void setRetCons(retConsSitCTe retCons) {
        this.retCons = retCons;
    }

    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }
}
