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
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("vPrest")
public class vPrest {
    @XStreamAlias("vTPrest")
    private String vTPrest;
    @XStreamAlias("vRec")
    private String vRec;
      @XStreamImplicit(itemFieldName = "Comp")
    private List<Comp> Comp = new ArrayList<Comp>();  

    
}
