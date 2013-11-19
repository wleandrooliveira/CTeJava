/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.controller;

import crncomp.conexao;
import java.sql.ResultSet;

/**
 *
 * @author Jéssica
 */
public class conhecimento_transporte_notas {
    
  private String id ;
  private String modelo;
  private String serie ;
  private String numero ;
  private String data_emissao ;
  private String valor_bc_icms ;
  private String valor_icms ;
  private String valor_bc_icms_st ;
  private String valor_icms_st ;
  private String valor_produtos ;
  private String valor_nota_fiscal ;
  private String cfop_predominante ;
  private String peso_total ;
  private String chave_acesso ;
  private String id_controle_transporte;

  public int gravar(){
      String SQL = null;
      String Conteudo[] = new String[14];
      conexao con = null;
      ResultSet RS = null;
      
      SQL = "INSERT INTO conhecimento_transporte_notas (modelo,serie ,numero ,data_emissao ,valor_bc_icms ,valor_icms ,valor_bc_icms_st ,valor_icms_st ,valor_produtos ,"
              + "valor_nota_fiscal ,cfop_predominante ,peso_total ,chave_acesso,id_controle_transporte ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      
        Conteudo[0] = String.valueOf(this.getModelo());
        Conteudo[1] = String.valueOf(this.getSerie());
        Conteudo[2] = String.valueOf(this.getNumero());
        Conteudo[3] = String.valueOf(this.getData_emissao());
        Conteudo[4] = String.valueOf(this.getValor_bc_icms());
        Conteudo[5] = String.valueOf(this.getValor_icms());
        Conteudo[6] = String.valueOf(this.getValor_bc_icms_st());
        Conteudo[7] = String.valueOf(this.getValor_icms_st());
        Conteudo[8] = String.valueOf(this.getValor_produtos());               
        Conteudo[9] = String.valueOf(this.getValor_nota_fiscal());
        Conteudo[10] = String.valueOf(this.getCfop_predominante());
        Conteudo[11] = String.valueOf(this.getPeso_total());
        Conteudo[12] = String.valueOf(this.getChave_acesso());  
        Conteudo[13] = String.valueOf(this.getId_controle_transporte());  
        
      try {
            System.out.println(" Vai gravar ");
            con = new conexao();
            con.prepareStatement(SQL, Conteudo);
            con.close();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
  }
  
  public int alterar(){
      String SQL = null;
      String Conteudo[] = new String[13];
      conexao con = null;
      ResultSet RS = null;
      
      SQL = "UPDATE conhecimento_transporte_notas SET  modelo,serie = ?, numero = ?, data_emissao = ?, "
              + "valor_bc_icms = ?, valor_icms = ?, valor_bc_icms_st = ?, valor_icms_st = ?, valor_produtos = ?, "
              + "valor_nota_fiscal = ?, cfop_predominante = ?, peso_total = ?, chave_acesso = ? , id_controle_transporte = ? WHERE id = ?";
      
        Conteudo[0] = String.valueOf(this.getModelo());
        Conteudo[1] = String.valueOf(this.getSerie());
        Conteudo[2] = String.valueOf(this.getNumero());
        Conteudo[3] = String.valueOf(this.getData_emissao());
        Conteudo[4] = String.valueOf(this.getValor_bc_icms());
        Conteudo[5] = String.valueOf(this.getValor_icms());
        Conteudo[6] = String.valueOf(this.getValor_bc_icms_st());
        Conteudo[7] = String.valueOf(this.getValor_icms_st());
        Conteudo[8] = String.valueOf(this.getValor_produtos());               
        Conteudo[9] = String.valueOf(this.getValor_nota_fiscal());
        Conteudo[10] = String.valueOf(this.getCfop_predominante());
        Conteudo[11] = String.valueOf(this.getPeso_total());
        Conteudo[12] = String.valueOf(this.getChave_acesso());      
        Conteudo[13] = String.valueOf(this.getId_controle_transporte()); 
        Conteudo[14] = String.valueOf(this.getId());
        
      try {
            System.out.println(" Vai alterar ");
            con = new conexao();
            con.prepareStatement(SQL, Conteudo);
            con.close();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
  }
  
  public void deletar(String id) {
        String SQL = "DELETE FROM conhecimento_transporte_notas WHERE id = " + id;
        conexao con = new conexao();
        try {
            con.insert(SQL);
        } catch (Exception ex) {
            System.out.println("Erro ao Deletar cte_notas :" + ex.toString());
        }
        con.close();
    }
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    public String getValor_bc_icms() {
        return valor_bc_icms;
    }

    public void setValor_bc_icms(String valor_bc_icms) {
        this.valor_bc_icms = valor_bc_icms;
    }

    public String getValor_icms() {
        return valor_icms;
    }

    public void setValor_icms(String valor_icms) {
        this.valor_icms = valor_icms;
    }

    public String getValor_bc_icms_st() {
        return valor_bc_icms_st;
    }

    public void setValor_bc_icms_st(String valor_bc_icms_st) {
        this.valor_bc_icms_st = valor_bc_icms_st;
    }

    public String getValor_icms_st() {
        return valor_icms_st;
    }

    public void setValor_icms_st(String valor_icms_st) {
        this.valor_icms_st = valor_icms_st;
    }

    public String getValor_produtos() {
        return valor_produtos;
    }

    public void setValor_produtos(String valor_produtos) {
        this.valor_produtos = valor_produtos;
    }

    public String getValor_nota_fiscal() {
        return valor_nota_fiscal;
    }

    public void setValor_nota_fiscal(String valor_nota_fiscal) {
        this.valor_nota_fiscal = valor_nota_fiscal;
    }

    public String getCfop_predominante() {
        return cfop_predominante;
    }

    public void setCfop_predominante(String cfop_predominante) {
        this.cfop_predominante = cfop_predominante;
    }

    public String getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(String peso_total) {
        this.peso_total = peso_total;
    }

    public String getChave_acesso() {
        return chave_acesso;
    }

    public void setChave_acesso(String chave_acesso) {
        this.chave_acesso = chave_acesso;
    }

    public String getId_controle_transporte() {
        return id_controle_transporte;
    }

    public void setId_controle_transporte(String id_controle_transporte) {
        this.id_controle_transporte = id_controle_transporte;
    }

}
