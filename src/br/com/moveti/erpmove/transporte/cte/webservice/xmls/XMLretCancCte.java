/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.webservice.xmls;

import br.com.moveti.erpmove.transporte.cte.model.Signature;
import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.infCanc;
import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.retCancCTe;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
public class XMLretCancCte {
    private retCancCTe retCanc = new retCancCTe();        
    private String XML = new String();
    
    public void BuscaDadosXML() {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("retCancCte", retCancCTe.class);
        xstream.alias("infCanc", infCanc.class);
        xstream.alias("Signature", Signature.class);        
        retCanc = (retCancCTe)xstream.fromXML(XML);
    }

    public retCancCTe getRetCanc() {
        return retCanc;
    }

    public void setRetCanc(retCancCTe retCanc) {
        this.retCanc = retCanc;
    }

    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }
}
