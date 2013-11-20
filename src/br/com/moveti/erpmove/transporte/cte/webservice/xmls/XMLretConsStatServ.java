/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.webservice.xmls;

import br.com.moveti.erpmove.transporte.cte.estrutura.retornos.retConsStatServCte;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
public class XMLretConsStatServ {
    private retConsStatServCte retCons = new  retConsStatServCte();
    private String XML = new String();
    
    public void BuscaDadosXML() {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("retConsStatServCte", retConsStatServCte.class);        
        retCons = (retConsStatServCte) xstream.fromXML(getXML());
    }

    public retConsStatServCte getRetCons() {
        return retCons;
    }

    public void setRetCons(retConsStatServCte retCons) {
        this.retCons = retCons;
    }

    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }
}
