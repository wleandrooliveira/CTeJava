/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte.model.enuns;

import java.text.ParseException;

/**
 *
 * @author Fernando
 */
public interface EnumCodificado {

    String getCodigo();

    Enum parse(String codigo) throws ParseException;
}
