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
 * Valores da Prestação de Serviço
 * @author Jéssica
 */
@XStreamAlias("vPrest")
public class vPrest {
    @XStreamAlias("vTPrest")
    private String vTPrest;
    @XStreamAlias("vRec")
    private String vRec;
      @XStreamImplicit(itemFieldName = "Comp")
    private List<Comp> Comp = new ArrayList<Comp>();  

    /**
     * @return the vTPrest
     */
    public String getvTPrest() {
        return vTPrest;
    }

    /**
     * @param vTPrest the vTPrest to set
     */
    public void setvTPrest(String vTPrest) {
        this.vTPrest = vTPrest;
    }

    /**
     * @return the vRec
     */
    public String getvRec() {
        return vRec;
    }

    /**
     * @param vRec the vRec to set
     */
    public void setvRec(String vRec) {
        this.vRec = vRec;
    }
}
