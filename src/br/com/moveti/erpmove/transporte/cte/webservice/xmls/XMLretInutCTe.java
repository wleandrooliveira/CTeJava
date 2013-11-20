/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.webservice.xmls;

import br.com.moveti.erpmove.transporte.cte.estrutura.Signature;
import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.infInut;
import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.retInutCTe;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
public class XMLretInutCTe {
    private retInutCTe retInut = new retInutCTe();
    private String XML = new String();
    
     public void BuscaDadosXML() {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("retInutCTe", retInutCTe.class);        
        xstream.alias("infInut", infInut.class);  
        xstream.alias("Signature", Signature.class);  
        retInut = (retInutCTe) xstream.fromXML(getXML());
    }

    public retInutCTe getRetInut() {
        return retInut;
    }

    public void setRetInut(retInutCTe retInut) {
        this.retInut = retInut;
    }

    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }
}
