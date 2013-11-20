/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
@XStreamAlias("Transforms")
public class Transforms {
    
    @XStreamImplicit(itemFieldName = "Transform")
    List<Transform> Transform = new ArrayList<Transform>();

    
   
        
}
