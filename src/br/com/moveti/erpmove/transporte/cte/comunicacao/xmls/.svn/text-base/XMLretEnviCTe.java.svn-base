/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.comunicacao.xmls;

import br.com.moveti.erpmove.transporte.cte.xml.infRec;
import br.com.moveti.erpmove.transporte.cte.xml.retEnviCte;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Jéssica
 */
public class XMLretEnviCTe {
    private retEnviCte retEnv = new retEnviCte();
    private String XML = new String();
    
    public void BuscaDadosXML() {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("retEnviCte", retEnviCte.class);    
        xstream.alias("infRec", infRec.class);    
        setRetEnv((retEnviCte) xstream.fromXML(getXML()));
    }

    public retEnviCte getRetEnv() {
        return retEnv;
    }

    public void setRetEnv(retEnviCte retEnv) {
        this.retEnv = retEnv;
    }

    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }
}
