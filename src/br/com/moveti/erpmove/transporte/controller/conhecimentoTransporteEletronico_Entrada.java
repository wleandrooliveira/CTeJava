/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.controller;

import crncomp.conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jéssica
 */
public class conhecimentoTransporteEletronico_Entrada {

    private String id;
    private String id_nota_fiscal;
    private String numero_nfe;
    private String chave_acesso_nfe;
    private String chave_acesso_cte;
    private String cfop;
    private String natureza_operacao;
    private String modelo;
    private String serie;
    private String numero_cte;
    private String data_emissao;
    private String hora_emissao;
    private String tipo_emissao;
    private String tipo_impressao;
    private String tipo_cte;
    private String indicador_emissao;
    private String id_municipio_envio;
    private String municipio_envio;
    private String uf_envio;
    private String modal;
    private String tipo_servico;
    private String codigo_municipio_ini_prest;
    private String municipio_ini_prest;
    private String uf_municipio_ini_prest;
    private String codigo_municipio_fim_prest;
    private String municipio_fim_prest;
    private String uf_codigo_municipio_fim_prest;
    private String retira;
    private String retira_detalhes;
    private String tomador_servico;
    private String tomador_cnpj;
    private String tomador_cpf;
    private String tomador_ie;
    private String tomador_nome;
    private String tomador_nome_fant;
    private String tomador_telefone;
    private String tomador_endereco;
    private String tomador_numero;
    private String tomador_compl;
    private String tomador_bairro;
    private String tomador_codigo_municipio;
    private String tomador_municipio;
    private String tomador_cep;
    private String tomador_uf;
    private String tomador_codigo_pais;
    private String tomador_pais;
    private String tomador_email;
    private String data_emissao_contingencia;
    private String justificativa_contingencia;
    private String emitente_cnpj;
    private String emitente_ie;
    private String emitente_nome;
    private String emitente_nome_fant;
    private String emitente_endereco;
    private String emitente_numero;
    private String emitente_compl;
    private String emitente_bairro;
    private String emitente_codigo_municipio;
    private String emitente_municipio;
    private String emitente_cep;
    private String emitente_uf;
    private String emitente_telefone;
    private String remetente_cnpj;
    private String remetente_cpf;
    private String remetente_inscricaoestadual;
    private String remetente_nome;
    private String remetente_nome_fant;
    private String remetente_telefone;
    private String remetente_endereco;
    private String remetente_numero;
    private String remetente_compl;
    private String remetente_bairro;
    private String remetente_codigo_municipio;
    private String remetente_cidade;
    private String remetente_cep;
    private String remetente_uf;
    private String remetente_codigo_pais;
    private String remetente_pais;
    private String remetente_email;
    private String consignatario_cnpj;
    private String consignatario_cpf;
    private String consignatario_ie;
    private String consignatario_nome;
    private String consignatario_telefone;
    private String consignatario_endereco;
    private String consignatario_numero;
    private String consignatario_compl;
    private String consignatario_bairro;
    private String consignatario_codigo_municipio;
    private String consignatario_municipio;
    private String consignatario_cep;
    private String consignatario_uf;
    private String consignatario_codigo_pais;
    private String consignatario_pais;
    private String consignatario_email;
    private String redespacho_cnpj;
    private String redespacho_cpf;
    private String redespacho_nome;
    private String redespacho_telefone;
    private String redespacho_endereco;
    private String redespacho_numero;
    private String redespacho_compl;
    private String redespacho_bairro;
    private String redespacho_codigo_municipio;
    private String redespacho_municipio;
    private String redespacho_cep;
    private String redespacho_uf;
    private String redespacho_codigo_pais;
    private String redespacho_pais;
    private String redespacho_email;
    private String redespacho_ie;
    private String destinatario_cnpj;
    private String destinatario_cpf;
    private String destinatario_inscricaoestadual;
    private String destinatario_nome;
    private String destinatario_telefone;
    private String destinatario_suframa;
    private String destinatario_endereco;
    private String destinatario_numero;
    private String destinatario_compl;
    private String destinatario_bairro;
    private String destinatario_codigo_municipio;
    private String destinatario_cidade;
    private String destinatario_cep;
    private String destinatario_uf;
    private String destinatario_codigo_pais;
    private String destinatario_nome_pais;
    private String destinatario_email;    
    private String prestacao_valor_total_servico;
    private String prestacao_valor_receber;
    private String aliq_icms;
    private String bc_icms;
    private String valor_icms;
    private String aliq_icms_st;
    private String bc_icms_st;
    private String valor_icms_st;
    private String valor_cred_icms;
    private String cst;
    private String percentual_reducao_bc;
    private String valor_carga;
    private String id_prod_predomintante;
    private String prod_predominante;
    private String outras_carac_carga;
    private String unidade;
    private String tipo_medida;
    private String quantidade_carga;
    private String seguro_responsavel;
    private String seguradora_nome;
    private String seguradora_numero_apolice;
    private String seguradora_numero_averb;
    private String seguradora_valor_carga;
    private String previsao_entrega;
    private String indicador_lotacao;
    private String codigo_op_transp;
    private String serie_occ;
    private String num_occ;
    private String data_emissao_occ;
    private String cnpj_transportadora_occ;
    private String ie_occ;
    private String uf_occ;
    private String telefone_occ;
    private String id_transportadora_occ;
    private String id_veiculo;
    private String veiculo_renavam;
    private String veiculo_placa;
    private String veiculo_tara;
    private String veiculo_cap_kg;
    private String veiculo_cap_m3;
    private String veiculo_tipo;
    private String veiculo_tipo_propriedade;
    private String veiculo_tipo_rodado;
    private String veiculo_tipo_carroceria;
    private String veiculo_uf_licenciatura;
    private String veiculo_prop_cpf;
    private String veiculo_prop_cnpj;
    private String veiculo_prop_rntrc;
    private String veiculo_prop_nome;
    private String veiculo_prop_ie;
    private String veiculo_prop_uf;
    private String veiculo_prop_tipo;

    public int gravar() {
        //1 - erro na gravação
        //0 - sucesso na gravação
        String SQL;
        String Conteudo[] = new String[138];
        conexao con = null;
        ResultSet RS = null;
        SQL = "INSERT INTO conhecimento_transporte (id_nota_fiscal,numero_nfe,chave_acesso_nfe,chave_acesso_cte,cfop,natureza_operacao,modelo,serie,data_emissao,"
                + "codigo_municipio_ini_prest,municipio_ini_prest,"
                + "uf_municipio_ini_prest,codigo_municipio_fim_prest,municipio_fim_prest,uf_municipio_fim_prest,emitente_cnpj,emitente_ie,emitente_nome,emitente_nome_fant,emitente_endereco,emitente_num,emitente_compl,"
                + "emitente_bairro,emitente_codigo_municipio,emitente_municipio,emitente_cep,emitente_uf,emitente_telefone,remetente_cnpj,remetente_cpf,remetente_inscricaoestadual,remetente_nome,"
                + "remetente_nome_fant,remetente_telefone,remetente_endereco,remetente_numero,"
                + "remetente_compl,remetente_bairro,remetente_codigo_municipio,remetente_cidade,remetente_cep,"
                + "remetente_uf,remetente_codigo_pais,remetente_pais,remetente_email,consignatario_cnpj,consignatario_cpf,consignatario_inscricaoestadual,consignatario_nome,consignatario_telefone,consignatario_endereco,consignatario_numero,"
                + "consignatario_compl,consignatario_bairro,consignatario_codigo_cidade,consignatario_cidade,consignatario_cep,consignatario_uf,consignatario_codigo_pais,consignatario_pais,consignatario_email,"
                + "redespacho_cnpj,redespacho_cpf,redespacho_nome,redespacho_telefone,redespacho_endereco,redespacho_numero,redespacho_compl,redespacho_bairro,redespacho_codigo_cidade,redespacho_cidade,"
                + "redespacho_cep,redespacho_uf,redespacho_codigo_pais,redespacho_pais,redespacho_email,redespacho_inscricaoestadual,destinatario_cnpj,destinatario_cpf,destinatario_inscricaoestadual,destinatario_nome,"
                + "destinatario_telefone,destinatario_suframa,destinatario_endereco,destinatario_numero,destinatario_compl,destinatario_bairro,destinatario_codigo_municipio,destinatario_cidade,"
                + "destinatario_cep,destinatario_uf,destinatario_codigo_pais,destinatario_pais,destinatario_email,prestacao_valor_total_servico,prestacao_valor_receber,aliq_icms,bc_icms,valor_icms,aliq_icms_st,"
                + "bc_icms_st,valor_icms_st,valor_cred_icms,cst,percentual_reducao_bc,valor_carga,"
                + "seguro_responsavel,seguradora_nome,seguradora_numero_apolice,seguradora_numero_averb,seguradora_valor_carga,previsao_entrega,"               
                + "serie_occ,num_occ,"
                + "data_emissao_occ,cnpj_transportadora_occ,ie_occ,uf_occ,telefone_occ,id_transportadora_occ,id_veiculo,veiculo_renavam,veiculo_placa,veiculo_tara,veiculo_cap_kg,veiculo_cap_m3,"
                + "veiculo_tipo,veiculo_tipo_propriedade,veiculo_tipo_rodado,veiculo_tipo_carroceria,veiculo_uf_licenciatura,veiculo_prop_cpf,veiculo_prop_cnpj,veiculo_prop_rntrc,veiculo_prop_nome,"
                + "veiculo_prop_ie,veiculo_prop_uf,veiculo_prop_tipo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

        Conteudo[0] = String.valueOf(this.getId_nota_fiscal());
        Conteudo[1] = String.valueOf(this.getNumero_nfe());
        Conteudo[2] = String.valueOf(this.getChave_acesso_nfe());
        Conteudo[3] = String.valueOf(this.getChave_acesso_cte());
        Conteudo[4] = String.valueOf(this.getCfop());
        Conteudo[5] = String.valueOf(this.getNatureza_operacao());
        Conteudo[6] = String.valueOf(this.getModelo());
        Conteudo[7] = String.valueOf(this.getSerie());
        Conteudo[8] = String.valueOf(this.getData_emissao());               
        Conteudo[9] = String.valueOf(this.getCodigo_municipio_ini_prest());
        Conteudo[10] = String.valueOf(this.getMunicipio_ini_prest());
        Conteudo[11] = String.valueOf(this.getUf_municipio_ini_prest());
        Conteudo[12] = String.valueOf(this.getcodigo_municipio_fim_prest());
        Conteudo[13] = String.valueOf(this.getMunicipio_fim_prest());
        Conteudo[14] = String.valueOf(this.getUf_codigo_municipio_fim_prest());       
        Conteudo[15] = String.valueOf(this.getEmitente_cnpj());
        Conteudo[16] = String.valueOf(this.getEmitente_ie());
        Conteudo[17] = String.valueOf(this.getEmitente_nome());
        Conteudo[18] = String.valueOf(this.getEmitente_nome_fant());
        Conteudo[19] = String.valueOf(this.getEmitente_endereco());
        Conteudo[20] = String.valueOf(this.getEmitente_numero());
        Conteudo[21] = String.valueOf(this.getEmitente_compl());
        Conteudo[22] = String.valueOf(this.getEmitente_bairro());
        Conteudo[23] = String.valueOf(this.getEmitente_codigo_municipio());
        Conteudo[24] = String.valueOf(this.getEmitente_municipio());
        Conteudo[25] = String.valueOf(this.getEmitente_cep());
        Conteudo[26] = String.valueOf(this.getEmitente_uf());
        Conteudo[27] = String.valueOf(this.getEmitente_telefone());
        Conteudo[28] = String.valueOf(this.getRemetente_cnpj());
        Conteudo[29] = String.valueOf(this.getRemetente_cpf());
        Conteudo[30] = String.valueOf(this.getRemetente_ie());
        Conteudo[31] = String.valueOf(this.getRemetente_nome());
        Conteudo[32] = String.valueOf(this.getRemetente_nome_fant());
        Conteudo[33] = String.valueOf(this.getRemetente_telefone());
        Conteudo[34] = String.valueOf(this.getRemetente_endereco());
        Conteudo[35] = String.valueOf(this.getRemetente_numero());
        Conteudo[36] = String.valueOf(this.getRemetente_compl());
        Conteudo[37] = String.valueOf(this.getRemetente_bairro());
        Conteudo[38] = String.valueOf(this.getRemetente_codigo_municipio());
        Conteudo[39] = String.valueOf(this.getRemetente_municipio());
        Conteudo[40] = String.valueOf(this.getRemetente_cep());
        Conteudo[41] = String.valueOf(this.getRemetente_uf());
        Conteudo[42] = String.valueOf(this.getRemetente_codigo_pais());
        Conteudo[43] = String.valueOf(this.getRemetente_pais());
        Conteudo[44] = String.valueOf(this.getRemetente_email());
        Conteudo[45] = String.valueOf(this.getconsignatario_cnpj());
        Conteudo[46] = String.valueOf(this.getconsignatario_cpf());
        Conteudo[47] = String.valueOf(this.getconsignatario_ie());
        Conteudo[48] = String.valueOf(this.getconsignatario_nome());
        Conteudo[49] = String.valueOf(this.getconsignatario_telefone());
        Conteudo[50] = String.valueOf(this.getconsignatario_endereco());
        Conteudo[51] = String.valueOf(this.getconsignatario_numero());
        Conteudo[52] = String.valueOf(this.getconsignatario_compl());
        Conteudo[53] = String.valueOf(this.getconsignatario_bairro());
        Conteudo[54] = String.valueOf(this.getconsignatario_codigo_municipio());
        Conteudo[55] = String.valueOf(this.getconsignatario_municipio());
        Conteudo[56] = String.valueOf(this.getconsignatario_cep());
        Conteudo[57] = String.valueOf(this.getconsignatario_uf());
        Conteudo[58] = String.valueOf(this.getconsignatario_codigo_pais());
        Conteudo[59] = String.valueOf(this.getconsignatario_pais());
        Conteudo[60] = String.valueOf(this.getconsignatario_email());
        Conteudo[61] = String.valueOf(this.getredespacho_cnpj());
        Conteudo[62] = String.valueOf(this.getredespacho_cpf());
        Conteudo[63] = String.valueOf(this.getredespacho_nome());
        Conteudo[64] = String.valueOf(this.getredespacho_telefone());
        Conteudo[65] = String.valueOf(this.getredespacho_endereco());
        Conteudo[66] = String.valueOf(this.getredespacho_numero());
        Conteudo[67] = String.valueOf(this.getredespacho_compl());
        Conteudo[68] = String.valueOf(this.getredespacho_bairro());
        Conteudo[69] = String.valueOf(this.getredespacho_codigo_municipio());
        Conteudo[70] = String.valueOf(this.getredespacho_municipio());
        Conteudo[71] = String.valueOf(this.getredespacho_cep());
        Conteudo[72] = String.valueOf(this.getredespacho_uf());
        Conteudo[73] = String.valueOf(this.getredespacho_codigo_pais());
        Conteudo[74] = String.valueOf(this.getredespacho_pais());
        Conteudo[75] = String.valueOf(this.getredespacho_email());
        Conteudo[76] = String.valueOf(this.getredespacho_ie());
        Conteudo[77] = String.valueOf(this.getDestinatario_cnpj());
        Conteudo[78] = String.valueOf(this.getDestinatario_cpf());
        Conteudo[79] = String.valueOf(this.getDestinatario_ie());
        Conteudo[80] = String.valueOf(this.getDestinatario_nome());
        Conteudo[81] = String.valueOf(this.getDestinatario_telefone());
        Conteudo[82] = String.valueOf(this.getDestinatario_suframa());
        Conteudo[83] = String.valueOf(this.getDestinatario_endereco());
        Conteudo[84] = String.valueOf(this.getDestinatario_numero());
        Conteudo[85] = String.valueOf(this.getDestinatario_compl());
        Conteudo[86] = String.valueOf(this.getDestinatario_bairro());
        Conteudo[87] = String.valueOf(this.getDestinatario_codigo_municipio());
        Conteudo[88] = String.valueOf(this.getDestinatario_municipio());
        Conteudo[89] = String.valueOf(this.getDestinatario_cep());
        Conteudo[90] = String.valueOf(this.getDestinatario_uf());
        Conteudo[91] = String.valueOf(this.getDestinatario_codigo_pais());
        Conteudo[92] = String.valueOf(this.getDestinatario_nome_pais());
        Conteudo[93] = String.valueOf(this.getDestinatario_email());        
        Conteudo[94] = String.valueOf(this.getPrestacao_valor_total_servico());
        Conteudo[95] = String.valueOf(this.getPrestacao_valor_receber());
        Conteudo[96] = String.valueOf(this.getAliq_icms());
        Conteudo[97] = String.valueOf(this.getBc_icms());
        Conteudo[98] = String.valueOf(this.getValor_icms());
        Conteudo[99] = String.valueOf(this.getAliq_icms_st());
        Conteudo[100] = String.valueOf(this.getBc_icms_st());
        Conteudo[101] = String.valueOf(this.getValor_icms_st());
        Conteudo[102] = String.valueOf(this.getValor_cred_icms());
        Conteudo[103] = String.valueOf(this.getCst());
        Conteudo[104] = String.valueOf(this.getPercentual_reducao_bc());
        Conteudo[105] = String.valueOf(this.getValor_carga());       
        Conteudo[106] = String.valueOf(this.getSeguro_responsavel());
        Conteudo[107] = String.valueOf(this.getSeguradora_nome());
        Conteudo[108] = String.valueOf(this.getSeguradora_numero_apolice());
        Conteudo[109] = String.valueOf(this.getSeguradora_numero_averb());
        Conteudo[110] = String.valueOf(this.getSeguradora_valor_carga());
        Conteudo[111] = String.valueOf(this.getPrevisao_entrega());       
        Conteudo[112] = String.valueOf(this.getSerie_occ());
        Conteudo[113] = String.valueOf(this.getNum_occ());
        Conteudo[114] = String.valueOf(this.getData_emissao_occ());
        Conteudo[115] = String.valueOf(this.getCnpj_transportadora_occ());
        Conteudo[116] = String.valueOf(this.getIe_occ());
        Conteudo[117] = String.valueOf(this.getUf_occ());
        Conteudo[118] = String.valueOf(this.getTelefone_occ());
        Conteudo[119] = String.valueOf(this.getId_transportadora_occ());
        Conteudo[120] = String.valueOf(this.getId_veiculo());
        Conteudo[121] = String.valueOf(this.getVeiculo_renavam());
        Conteudo[122] = String.valueOf(this.getVeiculo_placa());
        Conteudo[123] = String.valueOf(this.getVeiculo_tara());
        Conteudo[124] = String.valueOf(this.getVeiculo_cap_kg());
        Conteudo[125] = String.valueOf(this.getVeiculo_cap_m3());
        Conteudo[126] = String.valueOf(this.getVeiculo_tipo());
        Conteudo[127] = String.valueOf(this.getVeiculo_tipo_propriedade());
        Conteudo[128] = String.valueOf(this.getVeiculo_tipo_rodado());
        Conteudo[129] = String.valueOf(this.getVeiculo_tipo_carroceria());
        Conteudo[130] = String.valueOf(this.getVeiculo_uf_licenciatura());
        Conteudo[131] = String.valueOf(this.getVeiculo_prop_cpf());
        Conteudo[132] = String.valueOf(this.getVeiculo_prop_cnpj());
        Conteudo[133] = String.valueOf(this.getVeiculo_prop_rntrc());
        Conteudo[134] = String.valueOf(this.getVeiculo_prop_nome());
        Conteudo[135] = String.valueOf(this.getVeiculo_prop_ie());
        Conteudo[136] = String.valueOf(this.getVeiculo_prop_uf());
        Conteudo[137] = String.valueOf(this.getVeiculo_prop_tipo());

        try {
            System.out.println(" Vai gravar ");
            con = new conexao();
            con.prepareStatement(SQL, Conteudo);
            con.close();
            return 0;
        } catch (Exception e) {
            System.out.println("Erro ao Incluir CTRC: " + e.toString());
            return 1;
        }
    }

    public int alterar() {
        //1 - erro na gravação
        //0 - sucesso na gravação
        String SQL = "";
        String Conteudo[] = new String[139];
        conexao con = null;
        ResultSet RS = null;

        SQL = "UPDATE conhecimento_transporte SET id_nota_fiscal = ?, numero_nfe = ?, chave_acesso_nfe = ?, chave_acesso_cte = ?, cfop = ?, natureza_operacao = ?, modelo = ?, serie = ?, data_emissao = ?, "
               +" codigo_municipio_ini_prest = ?, municipio_ini_prest = ?, "
                 +" uf_municipio_ini_prest = ?, codigo_municipio_fim_prest = ?, municipio_fim_prest = ?, uf_municipio_fim_prest = ?, emitente_cnpj = ?, emitente_ie = ?, emitente_nome = ?, emitente_nome_fant = ?, emitente_endereco = ?, emitente_num = ?, emitente_compl = ?, "
                 +" emitente_bairro = ?, emitente_codigo_municipio = ?, emitente_municipio = ?, emitente_cep = ?, emitente_uf = ?, emitente_telefone = ?, remetente_cnpj = ?, remetente_cpf = ?, remetente_inscricaoestadual = ?, remetente_nome = ?, "
                 +" remetente_nome_fant = ?, remetente_telefone = ?, remetente_endereco = ?, remetente_numero = ?, "
                 +" remetente_compl = ?, remetente_bairro = ?, remetente_codigo_municipio = ?, remetente_cidade = ?, remetente_cep = ?, "
                 +" remetente_uf = ?, remetente_codigo_pais = ?, remetente_pais = ?, remetente_email = ?, consignatario_cnpj = ?, consignatario_cpf = ?, consignatario_inscricaoestadual = ?, consignatario_nome = ?, consignatario_telefone = ?, consignatario_endereco = ?, consignatario_numero = ?, "
                 +" consignatario_compl = ?, consignatario_bairro = ?, consignatario_codigo_cidade = ?, consignatario_cidade = ?, consignatario_cep = ?, consignatario_uf = ?, consignatario_codigo_pais = ?, consignatario_pais = ?, consignatario_email = ?," 
                 +" redespacho_cnpj = ?, redespacho_cpf = ?, redespacho_nome = ?, redespacho_telefone = ?, redespacho_endereco = ?, redespacho_numero = ?, redespacho_compl = ?, redespacho_bairro = ?, redespacho_codigo_cidade = ?, redespacho_cidade = ?, "
                 +" redespacho_cep = ?, redespacho_uf = ?, redespacho_codigo_pais = ?, redespacho_pais = ?, redespacho_email = ?, redespacho_inscricaoestadual = ?, destinatario_cnpj = ?, destinatario_cpf = ?, destinatario_inscricaoestadual = ?, destinatario_nome = ?, "
                 +" destinatario_telefone = ?, destinatario_suframa = ?, destinatario_endereco = ?, destinatario_numero = ?, destinatario_compl = ?, destinatario_bairro = ?, destinatario_codigo_municipio = ?, destinatario_cidade = ?, "
                 +" destinatario_cep = ?, destinatario_uf = ?, destinatario_codigo_pais = ?, destinatario_pais = ?, destinatario_email = ?, prestacao_valor_total_servico = ?, prestacao_valor_receber = ?, aliq_icms = ?, bc_icms = ?, valor_icms = ?, aliq_icms_st = ?, "
                 +" bc_icms_st = ?, valor_icms_st = ?, valor_cred_icms = ?, cst = ?, percentual_reducao_bc = ?, valor_carga = ?, "
                 +" seguro_responsavel = ?, seguradora_nome = ?, seguradora_numero_apolice = ?, seguradora_numero_averb = ?, seguradora_valor_carga = ?, previsao_entrega = ?,   "             
                 +" serie_occ = ?, num_occ = ?, "
                 +" data_emissao_occ = ?, cnpj_transportadora_occ = ?, ie_occ = ?, uf_occ = ?, telefone_occ = ?, id_transportadora_occ = ?, id_veiculo = ?, veiculo_renavam = ?, veiculo_placa = ?, veiculo_tara = ?, veiculo_cap_kg = ?, veiculo_cap_m3 = ?, "
                 +" veiculo_tipo = ?, veiculo_tipo_propriedade = ?, veiculo_tipo_rodado = ?, veiculo_tipo_carroceria = ?, veiculo_uf_licenciatura = ?, veiculo_prop_cpf = ?, veiculo_prop_cnpj = ?, veiculo_prop_rntrc = ?, veiculo_prop_nome = ?, "
                 +" veiculo_prop_ie = ?, veiculo_prop_uf = ?, veiculo_prop_tipo "
                + "WHERE id = " + getId();

        Conteudo[0] = String.valueOf(this.getId_nota_fiscal());
        Conteudo[1] = String.valueOf(this.getNumero_nfe());
        Conteudo[2] = String.valueOf(this.getChave_acesso_nfe());
        Conteudo[3] = String.valueOf(this.getChave_acesso_cte());
        Conteudo[4] = String.valueOf(this.getCfop());
        Conteudo[5] = String.valueOf(this.getNatureza_operacao());
        Conteudo[6] = String.valueOf(this.getModelo());
        Conteudo[7] = String.valueOf(this.getSerie());
        Conteudo[8] = String.valueOf(this.getData_emissao());               
        Conteudo[9] = String.valueOf(this.getCodigo_municipio_ini_prest());
        Conteudo[10] = String.valueOf(this.getMunicipio_ini_prest());
        Conteudo[11] = String.valueOf(this.getUf_municipio_ini_prest());
        Conteudo[12] = String.valueOf(this.getcodigo_municipio_fim_prest());
        Conteudo[13] = String.valueOf(this.getMunicipio_fim_prest());
        Conteudo[14] = String.valueOf(this.getUf_codigo_municipio_fim_prest());       
        Conteudo[15] = String.valueOf(this.getEmitente_cnpj());
        Conteudo[16] = String.valueOf(this.getEmitente_ie());
        Conteudo[17] = String.valueOf(this.getEmitente_nome());
        Conteudo[18] = String.valueOf(this.getEmitente_nome_fant());
        Conteudo[19] = String.valueOf(this.getEmitente_endereco());
        Conteudo[20] = String.valueOf(this.getEmitente_numero());
        Conteudo[21] = String.valueOf(this.getEmitente_compl());
        Conteudo[22] = String.valueOf(this.getEmitente_bairro());
        Conteudo[23] = String.valueOf(this.getEmitente_codigo_municipio());
        Conteudo[24] = String.valueOf(this.getEmitente_municipio());
        Conteudo[25] = String.valueOf(this.getEmitente_cep());
        Conteudo[26] = String.valueOf(this.getEmitente_uf());
        Conteudo[27] = String.valueOf(this.getEmitente_telefone());
        Conteudo[28] = String.valueOf(this.getRemetente_cnpj());
        Conteudo[29] = String.valueOf(this.getRemetente_cpf());
        Conteudo[30] = String.valueOf(this.getRemetente_ie());
        Conteudo[31] = String.valueOf(this.getRemetente_nome());
        Conteudo[32] = String.valueOf(this.getRemetente_nome_fant());
        Conteudo[33] = String.valueOf(this.getRemetente_telefone());
        Conteudo[34] = String.valueOf(this.getRemetente_endereco());
        Conteudo[35] = String.valueOf(this.getRemetente_numero());
        Conteudo[36] = String.valueOf(this.getRemetente_compl());
        Conteudo[37] = String.valueOf(this.getRemetente_bairro());
        Conteudo[38] = String.valueOf(this.getRemetente_codigo_municipio());
        Conteudo[39] = String.valueOf(this.getRemetente_municipio());
        Conteudo[40] = String.valueOf(this.getRemetente_cep());
        Conteudo[41] = String.valueOf(this.getRemetente_uf());
        Conteudo[42] = String.valueOf(this.getRemetente_codigo_pais());
        Conteudo[43] = String.valueOf(this.getRemetente_pais());
        Conteudo[44] = String.valueOf(this.getRemetente_email());
        Conteudo[45] = String.valueOf(this.getconsignatario_cnpj());
        Conteudo[46] = String.valueOf(this.getconsignatario_cpf());
        Conteudo[47] = String.valueOf(this.getconsignatario_ie());
        Conteudo[48] = String.valueOf(this.getconsignatario_nome());
        Conteudo[49] = String.valueOf(this.getconsignatario_telefone());
        Conteudo[50] = String.valueOf(this.getconsignatario_endereco());
        Conteudo[51] = String.valueOf(this.getconsignatario_numero());
        Conteudo[52] = String.valueOf(this.getconsignatario_compl());
        Conteudo[53] = String.valueOf(this.getconsignatario_bairro());
        Conteudo[54] = String.valueOf(this.getconsignatario_codigo_municipio());
        Conteudo[55] = String.valueOf(this.getconsignatario_municipio());
        Conteudo[56] = String.valueOf(this.getconsignatario_cep());
        Conteudo[57] = String.valueOf(this.getconsignatario_uf());
        Conteudo[58] = String.valueOf(this.getconsignatario_codigo_pais());
        Conteudo[59] = String.valueOf(this.getconsignatario_pais());
        Conteudo[60] = String.valueOf(this.getconsignatario_email());
        Conteudo[61] = String.valueOf(this.getredespacho_cnpj());
        Conteudo[62] = String.valueOf(this.getredespacho_cpf());
        Conteudo[63] = String.valueOf(this.getredespacho_nome());
        Conteudo[64] = String.valueOf(this.getredespacho_telefone());
        Conteudo[65] = String.valueOf(this.getredespacho_endereco());
        Conteudo[66] = String.valueOf(this.getredespacho_numero());
        Conteudo[67] = String.valueOf(this.getredespacho_compl());
        Conteudo[68] = String.valueOf(this.getredespacho_bairro());
        Conteudo[69] = String.valueOf(this.getredespacho_codigo_municipio());
        Conteudo[70] = String.valueOf(this.getredespacho_municipio());
        Conteudo[71] = String.valueOf(this.getredespacho_cep());
        Conteudo[72] = String.valueOf(this.getredespacho_uf());
        Conteudo[73] = String.valueOf(this.getredespacho_codigo_pais());
        Conteudo[74] = String.valueOf(this.getredespacho_pais());
        Conteudo[75] = String.valueOf(this.getredespacho_email());
        Conteudo[76] = String.valueOf(this.getredespacho_ie());
        Conteudo[77] = String.valueOf(this.getDestinatario_cnpj());
        Conteudo[78] = String.valueOf(this.getDestinatario_cpf());
        Conteudo[79] = String.valueOf(this.getDestinatario_ie());
        Conteudo[80] = String.valueOf(this.getDestinatario_nome());
        Conteudo[81] = String.valueOf(this.getDestinatario_telefone());
        Conteudo[82] = String.valueOf(this.getDestinatario_suframa());
        Conteudo[83] = String.valueOf(this.getDestinatario_endereco());
        Conteudo[84] = String.valueOf(this.getDestinatario_numero());
        Conteudo[85] = String.valueOf(this.getDestinatario_compl());
        Conteudo[86] = String.valueOf(this.getDestinatario_bairro());
        Conteudo[87] = String.valueOf(this.getDestinatario_codigo_municipio());
        Conteudo[88] = String.valueOf(this.getDestinatario_municipio());
        Conteudo[89] = String.valueOf(this.getDestinatario_cep());
        Conteudo[90] = String.valueOf(this.getDestinatario_uf());
        Conteudo[91] = String.valueOf(this.getDestinatario_codigo_pais());
        Conteudo[92] = String.valueOf(this.getDestinatario_nome_pais());
        Conteudo[93] = String.valueOf(this.getDestinatario_email());        
        Conteudo[94] = String.valueOf(this.getPrestacao_valor_total_servico());
        Conteudo[95] = String.valueOf(this.getPrestacao_valor_receber());
        Conteudo[96] = String.valueOf(this.getAliq_icms());
        Conteudo[97] = String.valueOf(this.getBc_icms());
        Conteudo[98] = String.valueOf(this.getValor_icms());
        Conteudo[99] = String.valueOf(this.getAliq_icms_st());
        Conteudo[100] = String.valueOf(this.getBc_icms_st());
        Conteudo[101] = String.valueOf(this.getValor_icms_st());
        Conteudo[102] = String.valueOf(this.getValor_cred_icms());
        Conteudo[103] = String.valueOf(this.getCst());
        Conteudo[104] = String.valueOf(this.getPercentual_reducao_bc());
        Conteudo[105] = String.valueOf(this.getValor_carga());       
        Conteudo[106] = String.valueOf(this.getSeguro_responsavel());
        Conteudo[107] = String.valueOf(this.getSeguradora_nome());
        Conteudo[108] = String.valueOf(this.getSeguradora_numero_apolice());
        Conteudo[109] = String.valueOf(this.getSeguradora_numero_averb());
        Conteudo[110] = String.valueOf(this.getSeguradora_valor_carga());
        Conteudo[111] = String.valueOf(this.getPrevisao_entrega());       
        Conteudo[112] = String.valueOf(this.getSerie_occ());
        Conteudo[113] = String.valueOf(this.getNum_occ());
        Conteudo[114] = String.valueOf(this.getData_emissao_occ());
        Conteudo[115] = String.valueOf(this.getCnpj_transportadora_occ());
        Conteudo[116] = String.valueOf(this.getIe_occ());
        Conteudo[117] = String.valueOf(this.getUf_occ());
        Conteudo[118] = String.valueOf(this.getTelefone_occ());
        Conteudo[119] = String.valueOf(this.getId_transportadora_occ());
        Conteudo[120] = String.valueOf(this.getId_veiculo());
        Conteudo[121] = String.valueOf(this.getVeiculo_renavam());
        Conteudo[122] = String.valueOf(this.getVeiculo_placa());
        Conteudo[123] = String.valueOf(this.getVeiculo_tara());
        Conteudo[124] = String.valueOf(this.getVeiculo_cap_kg());
        Conteudo[125] = String.valueOf(this.getVeiculo_cap_m3());
        Conteudo[126] = String.valueOf(this.getVeiculo_tipo());
        Conteudo[127] = String.valueOf(this.getVeiculo_tipo_propriedade());
        Conteudo[128] = String.valueOf(this.getVeiculo_tipo_rodado());
        Conteudo[129] = String.valueOf(this.getVeiculo_tipo_carroceria());
        Conteudo[130] = String.valueOf(this.getVeiculo_uf_licenciatura());
        Conteudo[131] = String.valueOf(this.getVeiculo_prop_cpf());
        Conteudo[132] = String.valueOf(this.getVeiculo_prop_cnpj());
        Conteudo[133] = String.valueOf(this.getVeiculo_prop_rntrc());
        Conteudo[134] = String.valueOf(this.getVeiculo_prop_nome());
        Conteudo[135] = String.valueOf(this.getVeiculo_prop_ie());
        Conteudo[136] = String.valueOf(this.getVeiculo_prop_uf());
        Conteudo[137] = String.valueOf(this.getVeiculo_prop_tipo());
        Conteudo[138] = String.valueOf(this.getId());

        try {
            con = new conexao();
            con.prepareStatement(SQL, Conteudo);
            con.close();
            return 0;
        } catch (Exception e) {
            System.out.println("Erro ao Alterar CTRC :" + e.toString());
            return 1;
        }
    }

    public void deletar(String id) {
        String SQL = "DELETE FROM conhecimento_transporte WHERE id = " + id;
        conexao con = new conexao();
        try {
            con.insert(SQL);
        } catch (Exception ex) {
            System.out.println("Erro ao Deletar CTRC :" + ex.toString());
        }
        con.close();
    }
    
    public String busca_idMax(){
        String ret = null ;
        String SQL = "SELECT MAX(id) as id FROM conhecimento_transporte ";
         ResultSet RS = null;
        conexao con = new conexao();
       
        RS = con.executaSQL(SQL);
        try {
            while(RS.next()){
                ret = RS.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(conhecimentoTransporteEletronico_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    public void mudaStatus(String id) {
        String Conteudo[] = new String[2];
        System.out.println("ID ID IDndjsahnd:"+id);
        String SQL = "UPDATE cte_xml_importa SET status = ? WHERE numero_cte = ?" ;
        conexao conn = null;
        ResultSet RS = null;
        Conteudo[0] = "1";
        Conteudo[1] = id;

        try {
            conn = new conexao();          
            conn.prepareStatement(SQL, Conteudo);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(conhecimentoTransporteEletronico_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    public void busca(String id) {
        String SQL = "SELECT * FROM conhecimento_transporte WHERE id = " + id;
        conexao con = new conexao();
        ResultSet RS = null;

        RS = con.executaSQL(SQL);
        try {
            RS.first();
            this.setId_nota_fiscal(RS.getString("id_nota_fiscal"));
            this.setNumero_nfe(RS.getString("numero_nfe"));
            this.setChave_acesso_nfe(RS.getString("chave_acesso_nfe"));
            this.setChave_acesso_cte(RS.getString("chave_acesso_cte"));
            this.setCfop(RS.getString("cfop"));
            this.setNatureza_operacao(RS.getString("natureza_operacao"));
            this.setModelo(RS.getString("modelo"));
            this.setSerie(RS.getString("serie"));
            this.setNumero_cte(RS.getString("numero_cte"));
            this.setData_emissao(RS.getString("data_emissao"));
            this.setHora_emissao(RS.getString("hora_emissao"));
            this.setTipo_emissao(RS.getString("tipo_emissao"));
            this.setTipo_impressao(RS.getString("tipo_impressao"));
            this.setTipo_cte(RS.getString("tipo_cte"));
            this.setIndicador_emissao(RS.getString("indicador_emissao"));
            this.setId_municipio_envio(RS.getString("id_municipio_envio"));
            this.setMunicipio_envio(RS.getString("municipio_envio"));
            this.setUf_envio(RS.getString("uf_envio"));
            this.setModal(RS.getString("modal"));
            this.setTipo_servico(RS.getString("tipo_servico"));
            this.setCodigo_municipio_ini_prest(RS.getString("codigo_municipio_ini_prest"));
            this.setMunicipio_ini_prest(RS.getString("municipio_ini_prest"));
            this.setUf_municipio_ini_prest(RS.getString("uf_municipio_ini_prest"));
            this.setcodigo_municipio_fim_prest(RS.getString("codigo_municipio_fim_prest"));
            this.setMunicipio_fim_prest(RS.getString("municipio_fim_prest"));
            this.setUf_codigo_municipio_fim_prest(RS.getString("uf_municipio_fim_prest"));                 
            this.setEmitente_cnpj(RS.getString("emitente_cnpj"));
            this.setEmitente_ie(RS.getString("emitente_ie"));
            this.setEmitente_nome(RS.getString("emitente_nome"));
            this.setEmitente_nome_fant(RS.getString("emitente_nome_fant"));
            this.setEmitente_endereco(RS.getString("emitente_endereco"));
            this.setEmitente_numero(RS.getString("emitente_numero"));
            this.setEmitente_compl(RS.getString("emitente_compl"));
            this.setEmitente_bairro(RS.getString("emitente_bairro"));
            this.setEmitente_codigo_municipio(RS.getString("emitente_codigo_municipio"));
            this.setEmitente_municipio(RS.getString("emitente_municipio"));
            this.setEmitente_cep(RS.getString("emitente_cep"));
            this.setEmitente_uf(RS.getString("emitente_uf"));
            this.setEmitente_telefone(RS.getString("emitente_telefone"));
            this.setRemetente_cnpj(RS.getString("remetente_cnpj"));
            this.setRemetente_cpf(RS.getString("remetente_cpf"));
            this.setRemetente_ie(RS.getString("remetente_inscricaoestadual"));
            this.setRemetente_nome(RS.getString("remetente_nome"));
            this.setRemetente_nome_fant(RS.getString("remetente_nome_fant"));
            this.setRemetente_telefone(RS.getString("remetente_telefone"));
            this.setRemetente_endereco(RS.getString("remetente_endereco"));
            this.setRemetente_numero(RS.getString("remetente_numero"));
            this.setRemetente_compl(RS.getString("remetente_compl"));
            this.setRemetente_bairro(RS.getString("remetente_bairro"));
            this.setRemetente_codigo_municipio(RS.getString("remetente_codigo_municipio"));
            this.setRemetente_municipio(RS.getString("remetente_cidade"));
            this.setRemetente_cep(RS.getString("remetente_cep"));
            this.setRemetente_uf(RS.getString("remetente_uf"));
            this.setRemetente_codigo_pais(RS.getString("remetente_codigo_pais"));
            this.setRemetente_pais(RS.getString("remetente_pais"));
            this.setRemetente_email(RS.getString("remetente_email"));
            this.setconsignatario_cnpj(RS.getString("consignatario_cnpj"));
            this.setconsignatario_cpf(RS.getString("consignatario_cpf"));
            this.setconsignatario_ie(RS.getString("consignatario_ie"));
            this.setconsignatario_nome(RS.getString("consignatario_nome"));
            this.setconsignatario_telefone(RS.getString("consignatario_telefone"));
            this.setconsignatario_endereco(RS.getString("consignatario_endereco"));
            this.setconsignatario_numero(RS.getString("consignatario_numero"));
            this.setconsignatario_compl(RS.getString("consignatario_compl"));
            this.setconsignatario_bairro(RS.getString("consignatario_bairro"));
            this.setconsignatario_codigo_municipio(RS.getString("consignatario_codigo_municipio"));
            this.setconsignatario_municipio(RS.getString("consignatario_municipio"));
            this.setconsignatario_cep(RS.getString("consignatario_cep"));
            this.setconsignatario_uf(RS.getString("consignatario_uf"));
            this.setconsignatario_codigo_pais(RS.getString("consignatario_codigo_pais"));
            this.setconsignatario_pais(RS.getString("consignatario_pais"));
            this.setconsignatario_email(RS.getString("consignatario_email"));
            this.setredespacho_cnpj(RS.getString("redespacho_cnpj"));
            this.setredespacho_cpf(RS.getString("redespacho_cpf"));
            this.setredespacho_nome(RS.getString("redespacho_nome"));
            this.setredespacho_telefone(RS.getString("redespacho_telefone"));
            this.setredespacho_endereco(RS.getString("redespacho_endereco"));
            this.setredespacho_numero(RS.getString("redespacho_numero"));
            this.setredespacho_compl(RS.getString("redespacho_compl"));
            this.setredespacho_bairro(RS.getString("redespacho_bairro"));
            this.setredespacho_codigo_municipio(RS.getString("redespacho_codigo_municipio"));
            this.setredespacho_municipio(RS.getString("redespacho_municipio"));
            this.setredespacho_cep(RS.getString("redespacho_cep"));
            this.setredespacho_uf(RS.getString("redespacho_uf"));
            this.setredespacho_codigo_pais(RS.getString("redespacho_codigo_pais"));
            this.setredespacho_pais(RS.getString("redespacho_pais"));
            this.setredespacho_email(RS.getString("redespacho_email"));
            this.setredespacho_ie(RS.getString("redespacho_ie"));
            this.setDestinatario_cnpj(RS.getString("destinatario_cnpj"));
            this.setDestinatario_cpf(RS.getString("destinatario_cpf"));
            this.setDestinatario_ie(RS.getString("destinatario_inscricaoestadual"));
            this.setDestinatario_nome(RS.getString("destinatario_nome"));
            this.setDestinatario_telefone(RS.getString("destinatario_telefone"));
            this.setDestinatario_suframa(RS.getString("destinatario_suframa"));
            this.setDestinatario_endereco(RS.getString("destinatario_endereco"));
            this.setDestinatario_numero(RS.getString("destinatario_numero"));
            this.setDestinatario_compl(RS.getString("destinatario_compl"));
            this.setDestinatario_bairro(RS.getString("destinatario_bairro"));
            this.setDestinatario_codigo_municipio(RS.getString("destinatario_codigo_municipio"));
            this.setDestinatario_municipio(RS.getString("destinatario_cidade"));
            this.setDestinatario_cep(RS.getString("destinatario_cep"));
            this.setDestinatario_uf(RS.getString("destinatario_uf"));
            this.setDestinatario_codigo_pais(RS.getString("destinatario_codigo_pais"));
            this.setDestinatario_nome_pais(RS.getString("destinatario_nome_pais"));
            this.setDestinatario_email(RS.getString("destinatario_email"));           
            this.setPrestacao_valor_total_servico(RS.getString("prestacao_valor_total_servico"));
            this.setPrestacao_valor_receber(RS.getString("prestacao_valor_receber"));
            this.setAliq_icms(RS.getString("aliq_icms"));
            this.setBc_icms(RS.getString("bc_icms"));
            this.setValor_icms(RS.getString("valor_icms"));
            this.setAliq_icms_st(RS.getString("aliq_icms_st"));
            this.setBc_icms_st(RS.getString("bc_icms_st"));
            this.setValor_icms_st(RS.getString("valor_icms_st"));
            this.setValor_cred_icms(RS.getString("valor_cred_icms"));
            this.setCst(RS.getString("cst"));
            this.setPercentual_reducao_bc(RS.getString("percentual_reducao_bc"));
            this.setValor_carga(RS.getString("valor_carga"));
            this.setId_prod_predomintante(RS.getString("id_prod_predomintante"));
            this.setProd_predominante(RS.getString("prod_predominante"));
            this.setOutras_carac_carga(RS.getString("outras_carac_carga"));
            this.setUnidade(RS.getString("unidade"));
            this.setTipo_medida(RS.getString("tipo_medida"));
            this.setQuantidade_carga(RS.getString("quantidade_carga"));
            this.setSeguro_responsavel(RS.getString("seguro_responsavel"));
            this.setSeguradora_nome(RS.getString("seguradora_nome"));
            this.setSeguradora_numero_apolice(RS.getString("seguradora_numero_apolice"));
            this.setSeguradora_numero_averb(RS.getString("seguradora_numero_averb"));
            this.setSeguradora_valor_carga(RS.getString("seguradora_valor_carga"));
            this.setPrevisao_entrega(RS.getString("previsao_entrega"));            
            this.setSerie_occ(RS.getString("serie_occ"));
            this.setNum_occ(RS.getString("num_occ"));
            this.setData_emissao_occ(RS.getString("data_emissao_occ"));
            this.setCnpj_transportadora_occ(RS.getString("cnpj_transportadora_occ"));
            this.setIe_occ(RS.getString("ie_occ"));
            this.setUf_occ(RS.getString("uf_occ"));
            this.setTelefone_occ(RS.getString("telefone_occ"));
            this.setId_transportadora_occ(RS.getString("id_transportadora_occ"));
            this.setId_veiculo(RS.getString("id_veiculo"));
            this.setVeiculo_renavam(RS.getString("veiculo_renavam"));
            this.setVeiculo_placa(RS.getString("veiculo_placa"));
            this.setVeiculo_tara(RS.getString("veiculo_tara"));
            this.setVeiculo_cap_kg(RS.getString("veiculo_cap_kg"));
            this.setVeiculo_cap_m3(RS.getString("veiculo_cap_m3"));
            this.setVeiculo_tipo(RS.getString("veiculo_tipo"));
            this.setVeiculo_tipo_propriedade(RS.getString("veiculo_tipo_propriedade"));
            this.setVeiculo_tipo_rodado(RS.getString("veiculo_tipo_rodado"));
            this.setVeiculo_tipo_carroceria(RS.getString("veiculo_tipo_carroceria"));
            this.setVeiculo_uf_licenciatura(RS.getString("veiculo_uf_licenciatura"));
            this.setVeiculo_prop_cpf(RS.getString("veiculo_prop_cpf"));
            this.setVeiculo_prop_cnpj(RS.getString("veiculo_prop_cnpj"));
            this.setVeiculo_prop_rntrc(RS.getString("veiculo_prop_rntrc"));
            this.setVeiculo_prop_nome(RS.getString("veiculo_prop_nome"));
            this.setVeiculo_prop_ie(RS.getString("veiculo_prop_ie"));
            this.setVeiculo_prop_uf(RS.getString("veiculo_prop_uf"));
            this.setVeiculo_prop_tipo(RS.getString("veiculo_prop_tipo"));
            this.setId(RS.getString("id"));
        } catch (Exception ex) {
            System.out.println("Erro ao Buscar CTrC :" + ex.toString());
        }
        con.close();
    }

    /**
     * @return the id_nota_fiscal
     */
    public String getId_nota_fiscal() {
        return id_nota_fiscal;
    }

    /**
     * @param id_nota_fiscal the id_nota_fiscal to set
     */
    public void setId_nota_fiscal(String id_nota_fiscal) {
        this.id_nota_fiscal = id_nota_fiscal;
    }

    /**
     * @return the numero_nfe
     */
    public String getNumero_nfe() {
        return numero_nfe;
    }

    /**
     * @param numero_nfe the numero_nfe to set
     */
    public void setNumero_nfe(String numero_nfe) {
        this.numero_nfe = numero_nfe;
    }

    /**
     * @return the chave_acesso_nfe
     */
    public String getChave_acesso_nfe() {
        return chave_acesso_nfe;
    }

    /**
     * @param chave_acesso_nfe the chave_acesso_nfe to set
     */
    public void setChave_acesso_nfe(String chave_acesso_nfe) {
        this.chave_acesso_nfe = chave_acesso_nfe;
    }

    /**
     * @return the chave_acesso_cte
     */
    public String getChave_acesso_cte() {
        return chave_acesso_cte;
    }

    /**
     * @param chave_acesso_cte the chave_acesso_cte to set
     */
    public void setChave_acesso_cte(String chave_acesso_cte) {
        this.chave_acesso_cte = chave_acesso_cte;
    }

    /**
     * @return the cfop
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * @param cfop the cfop to set
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    /**
     * @return the natureza_operacao
     */
    public String getNatureza_operacao() {
        return natureza_operacao;
    }

    /**
     * @param natureza_operacao the natureza_operacao to set
     */
    public void setNatureza_operacao(String natureza_operacao) {
        this.natureza_operacao = natureza_operacao;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the numero_cte
     */
    public String getNumero_cte() {
        return numero_cte;
    }

    /**
     * @param numero_cte the numero_cte to set
     */
    public void setNumero_cte(String numero_cte) {
        this.numero_cte = numero_cte;
    }

    /**
     * @return the data_emissao
     */
    public String getData_emissao() {
        return data_emissao;
    }

    /**
     * @param data_emissao the data_emissao to set
     */
    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    /**
     * @return the hora_emissao
     */
    public String getHora_emissao() {
        return hora_emissao;
    }

    /**
     * @param hora_emissao the hora_emissao to set
     */
    public void setHora_emissao(String hora_emissao) {
        this.hora_emissao = hora_emissao;
    }

    /**
     * @return the tipo_emissao
     */
    public String getTipo_emissao() {
        return tipo_emissao;
    }

    /**
     * @param tipo_emissao the tipo_emissao to set
     */
    public void setTipo_emissao(String tipo_emissao) {
        this.tipo_emissao = tipo_emissao;
    }

    /**
     * @return the tipo_impressao
     */
    public String getTipo_impressao() {
        return tipo_impressao;
    }

    /**
     * @param tipo_impressao the tipo_impressao to set
     */
    public void setTipo_impressao(String tipo_impressao) {
        this.tipo_impressao = tipo_impressao;
    }

    /**
     * @return the tipo_cte
     */
    public String getTipo_cte() {
        return tipo_cte;
    }

    /**
     * @param tipo_cte the tipo_cte to set
     */
    public void setTipo_cte(String tipo_cte) {
        this.tipo_cte = tipo_cte;
    }

    /**
     * @return the indicador_emissao
     */
    public String getIndicador_emissao() {
        return indicador_emissao;
    }

    /**
     * @param indicador_emissao the indicador_emissao to set
     */
    public void setIndicador_emissao(String indicador_emissao) {
        this.indicador_emissao = indicador_emissao;
    }

    /**
     * @return the id_municipio_envio
     */
    public String getId_municipio_envio() {
        return id_municipio_envio;
    }

    /**
     * @param id_municipio_envio the id_municipio_envio to set
     */
    public void setId_municipio_envio(String id_municipio_envio) {
        this.id_municipio_envio = id_municipio_envio;
    }

    /**
     * @return the municipio_envio
     */
    public String getMunicipio_envio() {
        return municipio_envio;
    }

    /**
     * @param municipio_envio the municipio_envio to set
     */
    public void setMunicipio_envio(String municipio_envio) {
        this.municipio_envio = municipio_envio;
    }

    /**
     * @return the uf_envio
     */
    public String getUf_envio() {
        return uf_envio;
    }

    /**
     * @param uf_envio the uf_envio to set
     */
    public void setUf_envio(String uf_envio) {
        this.uf_envio = uf_envio;
    }

    /**
     * @return the modal
     */
    public String getModal() {
        return modal;
    }

    /**
     * @param modal the modal to set
     */
    public void setModal(String modal) {
        this.modal = modal;
    }

    /**
     * @return the tipo_servico
     */
    public String getTipo_servico() {
        return tipo_servico;
    }

    /**
     * @param tipo_servico the tipo_servico to set
     */
    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    /**
     * @return the codigo_municipio_ini_prest
     */
    public String getCodigo_municipio_ini_prest() {
        return codigo_municipio_ini_prest;
    }

    /**
     * @param codigo_municipio_ini_prest the codigo_municipio_ini_prest to set
     */
    public void setCodigo_municipio_ini_prest(String codigo_municipio_ini_prest) {
        this.codigo_municipio_ini_prest = codigo_municipio_ini_prest;
    }

    /**
     * @return the municipio_ini_prest
     */
    public String getMunicipio_ini_prest() {
        return municipio_ini_prest;
    }

    /**
     * @param municipio_ini_prest the municipio_ini_prest to set
     */
    public void setMunicipio_ini_prest(String municipio_ini_prest) {
        this.municipio_ini_prest = municipio_ini_prest;
    }

    /**
     * @return the uf_municipio_ini_prest
     */
    public String getUf_municipio_ini_prest() {
        return uf_municipio_ini_prest;
    }

    /**
     * @param uf_municipio_ini_prest the uf_municipio_ini_prest to set
     */
    public void setUf_municipio_ini_prest(String uf_municipio_ini_prest) {
        this.uf_municipio_ini_prest = uf_municipio_ini_prest;
    }

    /**
     * @return the codigo_municipio_fim_prest
     */
    public String getcodigo_municipio_fim_prest() {
        return codigo_municipio_fim_prest;
    }

    /**
     * @param codigo_municipio_fim_prest the codigo_municipio_fim_prest to set
     */
    public void setcodigo_municipio_fim_prest(String codigo_municipio_fim_prest) {
        this.codigo_municipio_fim_prest = codigo_municipio_fim_prest;
    }

    /**
     * @return the municipio_fim_prest
     */
    public String getMunicipio_fim_prest() {
        return municipio_fim_prest;
    }

    /**
     * @param municipio_fim_prest the municipio_fim_prest to set
     */
    public void setMunicipio_fim_prest(String municipio_fim_prest) {
        this.municipio_fim_prest = municipio_fim_prest;
    }

    /**
     * @return the uf_codigo_municipio_fim_prest
     */
    public String getUf_codigo_municipio_fim_prest() {
        return uf_codigo_municipio_fim_prest;
    }

    /**
     * @param uf_codigo_municipio_fim_prest the uf_codigo_municipio_fim_prest to set
     */
    public void setUf_codigo_municipio_fim_prest(String uf_codigo_municipio_fim_prest) {
        this.uf_codigo_municipio_fim_prest = uf_codigo_municipio_fim_prest;
    }

    /**
     * @return the retira
     */
    public String getRetira() {
        return retira;
    }

    /**
     * @param retira the retira to set
     */
    public void setRetira(String retira) {
        this.retira = retira;
    }

    /**
     * @return the retira_detalhes
     */
    public String getRetira_detalhes() {
        return retira_detalhes;
    }

    /**
     * @param retira_detalhes the retira_detalhes to set
     */
    public void setRetira_detalhes(String retira_detalhes) {
        this.retira_detalhes = retira_detalhes;
    }

    /**
     * @return the tomador_servico
     */
    public String getTomador_servico() {
        return tomador_servico;
    }

    /**
     * @param tomador_servico the tomador_servico to set
     */
    public void setTomador_servico(String tomador_servico) {
        this.tomador_servico = tomador_servico;
    }

    /**
     * @return the tomador_cnpj
     */
    public String getTomador_cnpj() {
        return tomador_cnpj;
    }

    /**
     * @param tomador_cnpj the tomador_cnpj to set
     */
    public void setTomador_cnpj(String tomador_cnpj) {
        this.tomador_cnpj = tomador_cnpj;
    }

    /**
     * @return the tomador_cpf
     */
    public String getTomador_cpf() {
        return tomador_cpf;
    }

    /**
     * @param tomador_cpf the tomador_cpf to set
     */
    public void setTomador_cpf(String tomador_cpf) {
        this.tomador_cpf = tomador_cpf;
    }

    /**
     * @return the tomador_ie
     */
    public String getTomador_ie() {
        return tomador_ie;
    }

    /**
     * @param tomador_ie the tomador_ie to set
     */
    public void setTomador_ie(String tomador_ie) {
        this.tomador_ie = tomador_ie;
    }

    /**
     * @return the tomador_nome
     */
    public String getTomador_nome() {
        return tomador_nome;
    }

    /**
     * @param tomador_nome the tomador_nome to set
     */
    public void setTomador_nome(String tomador_nome) {
        this.tomador_nome = tomador_nome;
    }

    /**
     * @return the tomador_nome_fant
     */
    public String getTomador_nome_fant() {
        return tomador_nome_fant;
    }

    /**
     * @param tomador_nome_fant the tomador_nome_fant to set
     */
    public void setTomador_nome_fant(String tomador_nome_fant) {
        this.tomador_nome_fant = tomador_nome_fant;
    }

    /**
     * @return the tomador_telefone
     */
    public String getTomador_telefone() {
        return tomador_telefone;
    }

    /**
     * @param tomador_telefone the tomador_telefone to set
     */
    public void setTomador_telefone(String tomador_telefone) {
        this.tomador_telefone = tomador_telefone;
    }

    /**
     * @return the tomador_endereco
     */
    public String getTomador_endereco() {
        return tomador_endereco;
    }

    /**
     * @param tomador_endereco the tomador_endereco to set
     */
    public void setTomador_endereco(String tomador_endereco) {
        this.tomador_endereco = tomador_endereco;
    }

    /**
     * @return the tomador_numero
     */
    public String getTomador_numero() {
        return tomador_numero;
    }

    /**
     * @param tomador_numero the tomador_numero to set
     */
    public void setTomador_numero(String tomador_numero) {
        this.tomador_numero = tomador_numero;
    }

    /**
     * @return the tomador_compl
     */
    public String getTomador_compl() {
        return tomador_compl;
    }

    /**
     * @param tomador_compl the tomador_compl to set
     */
    public void setTomador_compl(String tomador_compl) {
        this.tomador_compl = tomador_compl;
    }

    /**
     * @return the tomador_bairro
     */
    public String getTomador_bairro() {
        return tomador_bairro;
    }

    /**
     * @param tomador_bairro the tomador_bairro to set
     */
    public void setTomador_bairro(String tomador_bairro) {
        this.tomador_bairro = tomador_bairro;
    }

    /**
     * @return the tomador_codigo_municipio
     */
    public String getTomador_codigo_municipio() {
        return tomador_codigo_municipio;
    }

    /**
     * @param tomador_codigo_municipio the tomador_codigo_municipio to set
     */
    public void setTomador_codigo_municipio(String tomador_codigo_municipio) {
        this.tomador_codigo_municipio = tomador_codigo_municipio;
    }

    /**
     * @return the tomador_municipio
     */
    public String getTomador_municipio() {
        return tomador_municipio;
    }

    /**
     * @param tomador_municipio the tomador_municipio to set
     */
    public void setTomador_municipio(String tomador_municipio) {
        this.tomador_municipio = tomador_municipio;
    }

    /**
     * @return the tomador_cep
     */
    public String getTomador_cep() {
        return tomador_cep;
    }

    /**
     * @param tomador_cep the tomador_cep to set
     */
    public void setTomador_cep(String tomador_cep) {
        this.tomador_cep = tomador_cep;
    }

    /**
     * @return the tomador_uf
     */
    public String getTomador_uf() {
        return tomador_uf;
    }

    /**
     * @param tomador_uf the tomador_uf to set
     */
    public void setTomador_uf(String tomador_uf) {
        this.tomador_uf = tomador_uf;
    }

    /**
     * @return the tomador_codigo_pais
     */
    public String getTomador_codigo_pais() {
        return tomador_codigo_pais;
    }

    /**
     * @param tomador_codigo_pais the tomador_codigo_pais to set
     */
    public void setTomador_codigo_pais(String tomador_codigo_pais) {
        this.tomador_codigo_pais = tomador_codigo_pais;
    }

    /**
     * @return the tomador_pais
     */
    public String getTomador_pais() {
        return tomador_pais;
    }

    /**
     * @param tomador_pais the tomador_pais to set
     */
    public void setTomador_pais(String tomador_pais) {
        this.tomador_pais = tomador_pais;
    }

    /**
     * @return the tomador_email
     */
    public String getTomador_email() {
        return tomador_email;
    }

    /**
     * @param tomador_email the tomador_email to set
     */
    public void setTomador_email(String tomador_email) {
        this.tomador_email = tomador_email;
    }

    /**
     * @return the emitente_cnpj
     */
    public String getEmitente_cnpj() {
        return emitente_cnpj;
    }

    /**
     * @param emitente_cnpj the emitente_cnpj to set
     */
    public void setEmitente_cnpj(String emitente_cnpj) {
        this.emitente_cnpj = emitente_cnpj;
    }

    /**
     * @return the emitente_ie
     */
    public String getEmitente_ie() {
        return emitente_ie;
    }

    /**
     * @param emitente_ie the emitente_ie to set
     */
    public void setEmitente_ie(String emitente_ie) {
        this.emitente_ie = emitente_ie;
    }

    /**
     * @return the emitente_nome
     */
    public String getEmitente_nome() {
        return emitente_nome;
    }

    /**
     * @param emitente_nome the emitente_nome to set
     */
    public void setEmitente_nome(String emitente_nome) {
        this.emitente_nome = emitente_nome;
    }

    /**
     * @return the emitente_nome_fant
     */
    public String getEmitente_nome_fant() {
        return emitente_nome_fant;
    }

    /**
     * @param emitente_nome_fant the emitente_nome_fant to set
     */
    public void setEmitente_nome_fant(String emitente_nome_fant) {
        this.emitente_nome_fant = emitente_nome_fant;
    }

    /**
     * @return the emitente_endereco
     */
    public String getEmitente_endereco() {
        return emitente_endereco;
    }

    /**
     * @param emitente_endereco the emitente_endereco to set
     */
    public void setEmitente_endereco(String emitente_endereco) {
        this.emitente_endereco = emitente_endereco;
    }

    /**
     * @return the emitente_numero
     */
    public String getEmitente_numero() {
        return emitente_numero;
    }

    /**
     * @param emitente_numero the emitente_numero to set
     */
    public void setEmitente_numero(String emitente_numero) {
        this.emitente_numero = emitente_numero;
    }

    /**
     * @return the emitente_compl
     */
    public String getEmitente_compl() {
        return emitente_compl;
    }

    /**
     * @param emitente_compl the emitente_compl to set
     */
    public void setEmitente_compl(String emitente_compl) {
        this.emitente_compl = emitente_compl;
    }

    /**
     * @return the emitente_bairro
     */
    public String getEmitente_bairro() {
        return emitente_bairro;
    }

    /**
     * @param emitente_bairro the emitente_bairro to set
     */
    public void setEmitente_bairro(String emitente_bairro) {
        this.emitente_bairro = emitente_bairro;
    }

    /**
     * @return the emitente_codigo_municipio
     */
    public String getEmitente_codigo_municipio() {
        return emitente_codigo_municipio;
    }

    /**
     * @param emitente_codigo_municipio the emitente_codigo_municipio to set
     */
    public void setEmitente_codigo_municipio(String emitente_codigo_municipio) {
        this.emitente_codigo_municipio = emitente_codigo_municipio;
    }

    /**
     * @return the emitente_municipio
     */
    public String getEmitente_municipio() {
        return emitente_municipio;
    }

    /**
     * @param emitente_municipio the emitente_municipio to set
     */
    public void setEmitente_municipio(String emitente_municipio) {
        this.emitente_municipio = emitente_municipio;
    }

    /**
     * @return the emitente_cep
     */
    public String getEmitente_cep() {
        return emitente_cep;
    }

    /**
     * @param emitente_cep the emitente_cep to set
     */
    public void setEmitente_cep(String emitente_cep) {
        this.emitente_cep = emitente_cep;
    }

    /**
     * @return the emitente_uf
     */
    public String getEmitente_uf() {
        return emitente_uf;
    }

    /**
     * @param emitente_uf the emitente_uf to set
     */
    public void setEmitente_uf(String emitente_uf) {
        this.emitente_uf = emitente_uf;
    }

    /**
     * @return the emitente_telefone
     */
    public String getEmitente_telefone() {
        return emitente_telefone;
    }

    /**
     * @param emitente_telefone the emitente_telefone to set
     */
    public void setEmitente_telefone(String emitente_telefone) {
        this.emitente_telefone = emitente_telefone;
    }

    /**
     * @return the remetente_cnpj
     */
    public String getRemetente_cnpj() {
        return remetente_cnpj;
    }

    /**
     * @param remetente_cnpj the remetente_cnpj to set
     */
    public void setRemetente_cnpj(String remetente_cnpj) {
        this.remetente_cnpj = remetente_cnpj;
    }

    /**
     * @return the remetente_cpf
     */
    public String getRemetente_cpf() {
        return remetente_cpf;
    }

    /**
     * @param remetente_cpf the remetente_cpf to set
     */
    public void setRemetente_cpf(String remetente_cpf) {
        this.remetente_cpf = remetente_cpf;
    }

    /**
     * @return the remetente_inscricaoestadual
     */
    public String getRemetente_ie() {
        return remetente_inscricaoestadual;
    }

    /**
     * @param remetente_inscricaoestadual the remetente_inscricaoestadual to set
     */
    public void setRemetente_ie(String remetente_inscricaoestadual) {
        this.remetente_inscricaoestadual = remetente_inscricaoestadual;
    }

    /**
     * @return the remetente_nome
     */
    public String getRemetente_nome() {
        return remetente_nome;
    }

    /**
     * @param remetente_nome the remetente_nome to set
     */
    public void setRemetente_nome(String remetente_nome) {
        this.remetente_nome = remetente_nome;
    }

    /**
     * @return the remetente_nome_fant
     */
    public String getRemetente_nome_fant() {
        return remetente_nome_fant;
    }

    /**
     * @param remetente_nome_fant the remetente_nome_fant to set
     */
    public void setRemetente_nome_fant(String remetente_nome_fant) {
        this.remetente_nome_fant = remetente_nome_fant;
    }

    /**
     * @return the remetente_telefone
     */
    public String getRemetente_telefone() {
        return remetente_telefone;
    }

    /**
     * @param remetente_telefone the remetente_telefone to set
     */
    public void setRemetente_telefone(String remetente_telefone) {
        this.remetente_telefone = remetente_telefone;
    }

    /**
     * @return the remetente_endereco
     */
    public String getRemetente_endereco() {
        return remetente_endereco;
    }

    /**
     * @param remetente_endereco the remetente_endereco to set
     */
    public void setRemetente_endereco(String remetente_endereco) {
        this.remetente_endereco = remetente_endereco;
    }

    /**
     * @return the remetente_numero
     */
    public String getRemetente_numero() {
        return remetente_numero;
    }

    /**
     * @param remetente_numero the remetente_numero to set
     */
    public void setRemetente_numero(String remetente_numero) {
        this.remetente_numero = remetente_numero;
    }

    /**
     * @return the remetente_compl
     */
    public String getRemetente_compl() {
        return remetente_compl;
    }

    /**
     * @param remetente_compl the remetente_compl to set
     */
    public void setRemetente_compl(String remetente_compl) {
        this.remetente_compl = remetente_compl;
    }

    /**
     * @return the remetente_bairro
     */
    public String getRemetente_bairro() {
        return remetente_bairro;
    }

    /**
     * @param remetente_bairro the remetente_bairro to set
     */
    public void setRemetente_bairro(String remetente_bairro) {
        this.remetente_bairro = remetente_bairro;
    }

    /**
     * @return the remetente_codigo_municipio
     */
    public String getRemetente_codigo_municipio() {
        return remetente_codigo_municipio;
    }

    /**
     * @param remetente_codigo_municipio the remetente_codigo_municipio to set
     */
    public void setRemetente_codigo_municipio(String remetente_codigo_municipio) {
        this.remetente_codigo_municipio = remetente_codigo_municipio;
    }

    /**
     * @return the remetente_cidade
     */
    public String getRemetente_municipio() {
        return remetente_cidade;
    }

    /**
     * @param remetente_cidade the remetente_cidade to set
     */
    public void setRemetente_municipio(String remetente_cidade) {
        this.remetente_cidade = remetente_cidade;
    }

    /**
     * @return the remetente_cep
     */
    public String getRemetente_cep() {
        return remetente_cep;
    }

    /**
     * @param remetente_cep the remetente_cep to set
     */
    public void setRemetente_cep(String remetente_cep) {
        this.remetente_cep = remetente_cep;
    }

    /**
     * @return the remetente_uf
     */
    public String getRemetente_uf() {
        return remetente_uf;
    }

    /**
     * @param remetente_uf the remetente_uf to set
     */
    public void setRemetente_uf(String remetente_uf) {
        this.remetente_uf = remetente_uf;
    }

    /**
     * @return the remetente_codigo_pais
     */
    public String getRemetente_codigo_pais() {
        return remetente_codigo_pais;
    }

    /**
     * @param remetente_codigo_pais the remetente_codigo_pais to set
     */
    public void setRemetente_codigo_pais(String remetente_codigo_pais) {
        this.remetente_codigo_pais = remetente_codigo_pais;
    }

    /**
     * @return the remetente_pais
     */
    public String getRemetente_pais() {
        return remetente_pais;
    }

    /**
     * @param remetente_pais the remetente_pais to set
     */
    public void setRemetente_pais(String remetente_pais) {
        this.remetente_pais = remetente_pais;
    }

    /**
     * @return the remetente_email
     */
    public String getRemetente_email() {
        return remetente_email;
    }

    /**
     * @param remetente_email the remetente_email to set
     */
    public void setRemetente_email(String remetente_email) {
        this.remetente_email = remetente_email;
    }

    /**
     * @return the consignatario_cnpj
     */
    public String getconsignatario_cnpj() {
        return consignatario_cnpj;
    }

    /**
     * @param consignatario_cnpj the consignatario_cnpj to set
     */
    public void setconsignatario_cnpj(String consignatario_cnpj) {
        this.consignatario_cnpj = consignatario_cnpj;
    }

    /**
     * @return the consignatario_cpf
     */
    public String getconsignatario_cpf() {
        return consignatario_cpf;
    }

    /**
     * @param consignatario_cpf the consignatario_cpf to set
     */
    public void setconsignatario_cpf(String consignatario_cpf) {
        this.consignatario_cpf = consignatario_cpf;
    }

    /**
     * @return the consignatario_ie
     */
    public String getconsignatario_ie() {
        return consignatario_ie;
    }

    /**
     * @param consignatario_inscricaoestadualthe consignatario_inscricaoestadualto set
     */
    public void setconsignatario_ie(String consignatario_ie) {
        this.consignatario_ie= consignatario_ie;
    }

    /**
     * @return the consignatario_nome
     */
    public String getconsignatario_nome() {
        return consignatario_nome;
    }

    /**
     * @param consignatario_nome the consignatario_nome to set
     */
    public void setconsignatario_nome(String consignatario_nome) {
        this.consignatario_nome = consignatario_nome;
    }

    /**
     * @return the consignatario_telefone
     */
    public String getconsignatario_telefone() {
        return consignatario_telefone;
    }

    /**
     * @param consignatario_telefone the consignatario_telefone to set
     */
    public void setconsignatario_telefone(String consignatario_telefone) {
        this.consignatario_telefone = consignatario_telefone;
    }

    /**
     * @return the consignatario_endereco
     */
    public String getconsignatario_endereco() {
        return consignatario_endereco;
    }

    /**
     * @param consignatario_endereco the consignatario_endereco to set
     */
    public void setconsignatario_endereco(String consignatario_endereco) {
        this.consignatario_endereco = consignatario_endereco;
    }

    /**
     * @return the consignatario_numero
     */
    public String getconsignatario_numero() {
        return consignatario_numero;
    }

    /**
     * @param consignatario_numero the consignatario_numero to set
     */
    public void setconsignatario_numero(String consignatario_numero) {
        this.consignatario_numero = consignatario_numero;
    }

    /**
     * @return the consignatario_compl
     */
    public String getconsignatario_compl() {
        return consignatario_compl;
    }

    /**
     * @param consignatario_compl the consignatario_compl to set
     */
    public void setconsignatario_compl(String consignatario_compl) {
        this.consignatario_compl = consignatario_compl;
    }

    /**
     * @return the consignatario_bairro
     */
    public String getconsignatario_bairro() {
        return consignatario_bairro;
    }

    /**
     * @param consignatario_bairro the consignatario_bairro to set
     */
    public void setconsignatario_bairro(String consignatario_bairro) {
        this.consignatario_bairro = consignatario_bairro;
    }

    /**
     * @return the consignatario_codigo_municipio
     */
    public String getconsignatario_codigo_municipio() {
        return consignatario_codigo_municipio;
    }

    /**
     * @param consignatario_codigo_municipio the consignatario_codigo_municipio to set
     */
    public void setconsignatario_codigo_municipio(String consignatario_codigo_municipio) {
        this.consignatario_codigo_municipio = consignatario_codigo_municipio;
    }

    /**
     * @return the consignatario_municipio
     */
    public String getconsignatario_municipio() {
        return consignatario_municipio;
    }

    /**
     * @param consignatario_municipio the consignatario_municipio to set
     */
    public void setconsignatario_municipio(String consignatario_municipio) {
        this.consignatario_municipio = consignatario_municipio;
    }

    /**
     * @return the consignatario_cep
     */
    public String getconsignatario_cep() {
        return consignatario_cep;
    }

    /**
     * @param consignatario_cep the consignatario_cep to set
     */
    public void setconsignatario_cep(String consignatario_cep) {
        this.consignatario_cep = consignatario_cep;
    }

    /**
     * @return the consignatario_uf
     */
    public String getconsignatario_uf() {
        return consignatario_uf;
    }

    /**
     * @param consignatario_uf the consignatario_uf to set
     */
    public void setconsignatario_uf(String consignatario_uf) {
        this.consignatario_uf = consignatario_uf;
    }

    /**
     * @return the consignatario_codigo_pais
     */
    public String getconsignatario_codigo_pais() {
        return consignatario_codigo_pais;
    }

    /**
     * @param consignatario_codigo_pais the consignatario_codigo_pais to set
     */
    public void setconsignatario_codigo_pais(String consignatario_codigo_pais) {
        this.consignatario_codigo_pais = consignatario_codigo_pais;
    }

    /**
     * @return the consignatario_pais
     */
    public String getconsignatario_pais() {
        return consignatario_pais;
    }

    /**
     * @param consignatario_pais the consignatario_pais to set
     */
    public void setconsignatario_pais(String consignatario_pais) {
        this.consignatario_pais = consignatario_pais;
    }

    /**
     * @return the consignatario_email
     */
    public String getconsignatario_email() {
        return consignatario_email;
    }

    /**
     * @param consignatario_email the consignatario_email to set
     */
    public void setconsignatario_email(String consignatario_email) {
        this.consignatario_email = consignatario_email;
    }

    /**
     * @return the redespacho_cnpj
     */
    public String getredespacho_cnpj() {
        return redespacho_cnpj;
    }

    /**
     * @param redespacho_cnpj the redespacho_cnpj to set
     */
    public void setredespacho_cnpj(String redespacho_cnpj) {
        this.redespacho_cnpj = redespacho_cnpj;
    }

    /**
     * @return the redespacho_cpf
     */
    public String getredespacho_cpf() {
        return redespacho_cpf;
    }

    /**
     * @param redespacho_cpf the redespacho_cpf to set
     */
    public void setredespacho_cpf(String redespacho_cpf) {
        this.redespacho_cpf = redespacho_cpf;
    }

    /**
     * @return the redespacho_nome
     */
    public String getredespacho_nome() {
        return redespacho_nome;
    }

    /**
     * @param redespacho_nome the redespacho_nome to set
     */
    public void setredespacho_nome(String redespacho_nome) {
        this.redespacho_nome = redespacho_nome;
    }

    /**
     * @return the redespacho_telefone
     */
    public String getredespacho_telefone() {
        return redespacho_telefone;
    }

    /**
     * @param redespacho_telefone the redespacho_telefone to set
     */
    public void setredespacho_telefone(String redespacho_telefone) {
        this.redespacho_telefone = redespacho_telefone;
    }

    /**
     * @return the redespacho_endereco
     */
    public String getredespacho_endereco() {
        return redespacho_endereco;
    }

    /**
     * @param redespacho_endereco the redespacho_endereco to set
     */
    public void setredespacho_endereco(String redespacho_endereco) {
        this.redespacho_endereco = redespacho_endereco;
    }

    /**
     * @return the redespacho_numero
     */
    public String getredespacho_numero() {
        return redespacho_numero;
    }

    /**
     * @param redespacho_numero the redespacho_numero to set
     */
    public void setredespacho_numero(String redespacho_numero) {
        this.redespacho_numero = redespacho_numero;
    }

    /**
     * @return the redespacho_compl
     */
    public String getredespacho_compl() {
        return redespacho_compl;
    }

    /**
     * @param redespacho_compl the redespacho_compl to set
     */
    public void setredespacho_compl(String redespacho_compl) {
        this.redespacho_compl = redespacho_compl;
    }

    /**
     * @return the redespacho_bairro
     */
    public String getredespacho_bairro() {
        return redespacho_bairro;
    }

    /**
     * @param redespacho_bairro the redespacho_bairro to set
     */
    public void setredespacho_bairro(String redespacho_bairro) {
        this.redespacho_bairro = redespacho_bairro;
    }

    /**
     * @return the redespacho_codigo_municipio
     */
    public String getredespacho_codigo_municipio() {
        return redespacho_codigo_municipio;
    }

    /**
     * @param redespacho_codigo_municipio the redespacho_codigo_municipio to set
     */
    public void setredespacho_codigo_municipio(String redespacho_codigo_municipio) {
        this.redespacho_codigo_municipio = redespacho_codigo_municipio;
    }

    /**
     * @return the redespacho_municipio
     */
    public String getredespacho_municipio() {
        return redespacho_municipio;
    }

    /**
     * @param redespacho_municipio the redespacho_municipio to set
     */
    public void setredespacho_municipio(String redespacho_municipio) {
        this.redespacho_municipio = redespacho_municipio;
    }

    /**
     * @return the redespacho_cep
     */
    public String getredespacho_cep() {
        return redespacho_cep;
    }

    /**
     * @param redespacho_cep the redespacho_cep to set
     */
    public void setredespacho_cep(String redespacho_cep) {
        this.redespacho_cep = redespacho_cep;
    }

    /**
     * @return the redespacho_uf
     */
    public String getredespacho_uf() {
        return redespacho_uf;
    }

    /**
     * @param redespacho_uf the redespacho_uf to set
     */
    public void setredespacho_uf(String redespacho_uf) {
        this.redespacho_uf = redespacho_uf;
    }

    /**
     * @return the redespacho_codigo_pais
     */
    public String getredespacho_codigo_pais() {
        return redespacho_codigo_pais;
    }

    /**
     * @param redespacho_codigo_pais the redespacho_codigo_pais to set
     */
    public void setredespacho_codigo_pais(String redespacho_codigo_pais) {
        this.redespacho_codigo_pais = redespacho_codigo_pais;
    }

    /**
     * @return the redespacho_pais
     */
    public String getredespacho_pais() {
        return redespacho_pais;
    }

    /**
     * @param redespacho_pais the redespacho_pais to set
     */
    public void setredespacho_pais(String redespacho_pais) {
        this.redespacho_pais = redespacho_pais;
    }

    /**
     * @return the redespacho_email
     */
    public String getredespacho_email() {
        return redespacho_email;
    }

    /**
     * @param redespacho_email the redespacho_email to set
     */
    public void setredespacho_email(String redespacho_email) {
        this.redespacho_email = redespacho_email;
    }

    /**
     * @return the redespacho_ie
     */
    public String getredespacho_ie() {
        return redespacho_ie;
    }

    /**
     * @param redespacho_inscricaoestadualthe redespacho_inscricaoestadualto set
     */
    public void setredespacho_ie(String redespacho_ie) {
        this.redespacho_ie= redespacho_ie;
    }

    /**
     * @return the destinatario_cnpj
     */
    public String getDestinatario_cnpj() {
        return destinatario_cnpj;
    }

    /**
     * @param destinatario_cnpj the destinatario_cnpj to set
     */
    public void setDestinatario_cnpj(String destinatario_cnpj) {
        this.destinatario_cnpj = destinatario_cnpj;
    }

    /**
     * @return the destinatario_cpf
     */
    public String getDestinatario_cpf() {
        return destinatario_cpf;
    }

    /**
     * @param destinatario_cpf the destinatario_cpf to set
     */
    public void setDestinatario_cpf(String destinatario_cpf) {
        this.destinatario_cpf = destinatario_cpf;
    }

    /**
     * @return the destinatario_inscricaoestadual
     */
    public String getDestinatario_ie() {
        return destinatario_inscricaoestadual;
    }

    /**
     * @param destinatario_inscricaoestadual the destinatario_inscricaoestadual to set
     */
    public void setDestinatario_ie(String destinatario_inscricaoestadual) {
        this.destinatario_inscricaoestadual = destinatario_inscricaoestadual;
    }

    /**
     * @return the destinatario_nome
     */
    public String getDestinatario_nome() {
        return destinatario_nome;
    }

    /**
     * @param destinatario_nome the destinatario_nome to set
     */
    public void setDestinatario_nome(String destinatario_nome) {
        this.destinatario_nome = destinatario_nome;
    }

    /**
     * @return the destinatario_telefone
     */
    public String getDestinatario_telefone() {
        return destinatario_telefone;
    }

    /**
     * @param destinatario_telefone the destinatario_telefone to set
     */
    public void setDestinatario_telefone(String destinatario_telefone) {
        this.destinatario_telefone = destinatario_telefone;
    }

    /**
     * @return the destinatario_suframa
     */
    public String getDestinatario_suframa() {
        return destinatario_suframa;
    }

    /**
     * @param destinatario_suframa the destinatario_suframa to set
     */
    public void setDestinatario_suframa(String destinatario_suframa) {
        this.destinatario_suframa = destinatario_suframa;
    }

    /**
     * @return the destinatario_endereco
     */
    public String getDestinatario_endereco() {
        return destinatario_endereco;
    }

    /**
     * @param destinatario_endereco the destinatario_endereco to set
     */
    public void setDestinatario_endereco(String destinatario_endereco) {
        this.destinatario_endereco = destinatario_endereco;
    }

    /**
     * @return the destinatario_numero
     */
    public String getDestinatario_numero() {
        return destinatario_numero;
    }

    /**
     * @param destinatario_numero the destinatario_numero to set
     */
    public void setDestinatario_numero(String destinatario_numero) {
        this.destinatario_numero = destinatario_numero;
    }

    /**
     * @return the destinatario_compl
     */
    public String getDestinatario_compl() {
        return destinatario_compl;
    }

    /**
     * @param destinatario_compl the destinatario_compl to set
     */
    public void setDestinatario_compl(String destinatario_compl) {
        this.destinatario_compl = destinatario_compl;
    }

    /**
     * @return the destinatario_bairro
     */
    public String getDestinatario_bairro() {
        return destinatario_bairro;
    }

    /**
     * @param destinatario_bairro the destinatario_bairro to set
     */
    public void setDestinatario_bairro(String destinatario_bairro) {
        this.destinatario_bairro = destinatario_bairro;
    }

    /**
     * @return the destinatario_codigo_municipio
     */
    public String getDestinatario_codigo_municipio() {
        return destinatario_codigo_municipio;
    }

    /**
     * @param destinatario_codigo_municipio the destinatario_codigo_municipio to set
     */
    public void setDestinatario_codigo_municipio(String destinatario_codigo_municipio) {
        this.destinatario_codigo_municipio = destinatario_codigo_municipio;
    }

    /**
     * @return the destinatario_cidade
     */
    public String getDestinatario_municipio() {
        return destinatario_cidade;
    }

    /**
     * @param destinatario_cidade the destinatario_cidade to set
     */
    public void setDestinatario_municipio(String destinatario_cidade) {
        this.destinatario_cidade = destinatario_cidade;
    }

    /**
     * @return the destinatario_cep
     */
    public String getDestinatario_cep() {
        return destinatario_cep;
    }

    /**
     * @param destinatario_cep the destinatario_cep to set
     */
    public void setDestinatario_cep(String destinatario_cep) {
        this.destinatario_cep = destinatario_cep;
    }

    /**
     * @return the destinatario_uf
     */
    public String getDestinatario_uf() {
        return destinatario_uf;
    }

    /**
     * @param destinatario_uf the destinatario_uf to set
     */
    public void setDestinatario_uf(String destinatario_uf) {
        this.destinatario_uf = destinatario_uf;
    }

    /**
     * @return the destinatario_codigo_pais
     */
    public String getDestinatario_codigo_pais() {
        return destinatario_codigo_pais;
    }

    /**
     * @param destinatario_codigo_pais the destinatario_codigo_pais to set
     */
    public void setDestinatario_codigo_pais(String destinatario_codigo_pais) {
        this.destinatario_codigo_pais = destinatario_codigo_pais;
    }

    /**
     * @return the destinatario_nome_pais
     */
    public String getDestinatario_nome_pais() {
        return destinatario_nome_pais;
    }

    /**
     * @param destinatario_nome_pais the destinatario_nome_pais to set
     */
    public void setDestinatario_nome_pais(String destinatario_nome_pais) {
        this.destinatario_nome_pais = destinatario_nome_pais;
    }

    /**
     * @return the destinatario_email
     */
    public String getDestinatario_email() {
        return destinatario_email;
    }

    /**
     * @param destinatario_email the destinatario_email to set
     */
    public void setDestinatario_email(String destinatario_email) {
        this.destinatario_email = destinatario_email;
    }   

    /**
     * @return the prestacao_valor_total_servico
     */
    public String getPrestacao_valor_total_servico() {
        return prestacao_valor_total_servico;
    }

    /**
     * @param prestacao_valor_total_servico the prestacao_valor_total_servico to set
     */
    public void setPrestacao_valor_total_servico(String prestacao_valor_total_servico) {
        this.prestacao_valor_total_servico = prestacao_valor_total_servico;
    }

    /**
     * @return the prestacao_valor_receber
     */
    public String getPrestacao_valor_receber() {
        return prestacao_valor_receber;
    }

    /**
     * @param prestacao_valor_receber the prestacao_valor_receber to set
     */
    public void setPrestacao_valor_receber(String prestacao_valor_receber) {
        this.prestacao_valor_receber = prestacao_valor_receber;
    }

    /**
     * @return the aliq_icms
     */
    public String getAliq_icms() {
        return aliq_icms;
    }

    /**
     * @param aliq_icms the aliq_icms to set
     */
    public void setAliq_icms(String aliq_icms) {
        this.aliq_icms = aliq_icms;
    }

    /**
     * @return the bc_icms
     */
    public String getBc_icms() {
        return bc_icms;
    }

    /**
     * @param bc_icms the bc_icms to set
     */
    public void setBc_icms(String bc_icms) {
        this.bc_icms = bc_icms;
    }

    /**
     * @return the valor_icms
     */
    public String getValor_icms() {
        return valor_icms;
    }

    /**
     * @param valor_icms the valor_icms to set
     */
    public void setValor_icms(String valor_icms) {
        this.valor_icms = valor_icms;
    }

    /**
     * @return the aliq_icms_st
     */
    public String getAliq_icms_st() {
        return aliq_icms_st;
    }

    /**
     * @param aliq_icms_st the aliq_icms_st to set
     */
    public void setAliq_icms_st(String aliq_icms_st) {
        this.aliq_icms_st = aliq_icms_st;
    }

    /**
     * @return the bc_icms_st
     */
    public String getBc_icms_st() {
        return bc_icms_st;
    }

    /**
     * @param bc_icms_st the bc_icms_st to set
     */
    public void setBc_icms_st(String bc_icms_st) {
        this.bc_icms_st = bc_icms_st;
    }

    /**
     * @return the valor_icms_st
     */
    public String getValor_icms_st() {
        return valor_icms_st;
    }

    /**
     * @param valor_icms_st the valor_icms_st to set
     */
    public void setValor_icms_st(String valor_icms_st) {
        this.valor_icms_st = valor_icms_st;
    }

    /**
     * @return the valor_cred_icms
     */
    public String getValor_cred_icms() {
        return valor_cred_icms;
    }

    /**
     * @param valor_cred_icms the valor_cred_icms to set
     */
    public void setValor_cred_icms(String valor_cred_icms) {
        this.valor_cred_icms = valor_cred_icms;
    }

    /**
     * @return the cst
     */
    public String getCst() {
        return cst;
    }

    /**
     * @param cst the cst to set
     */
    public void setCst(String cst) {
        this.cst = cst;
    }

    /**
     * @return the percentual_reducao_bc
     */
    public String getPercentual_reducao_bc() {
        return percentual_reducao_bc;
    }

    /**
     * @param percentual_reducao_bc the percentual_reducao_bc to set
     */
    public void setPercentual_reducao_bc(String percentual_reducao_bc) {
        this.percentual_reducao_bc = percentual_reducao_bc;
    }

    /**
     * @return the valor_carga
     */
    public String getValor_carga() {
        return valor_carga;
    }

    /**
     * @param valor_carga the valor_carga to set
     */
    public void setValor_carga(String valor_carga) {
        this.valor_carga = valor_carga;
    }

    /**
     * @return the id_prod_predomintante
     */
    public String getId_prod_predomintante() {
        return id_prod_predomintante;
    }

    /**
     * @param id_prod_predomintante the id_prod_predomintante to set
     */
    public void setId_prod_predomintante(String id_prod_predomintante) {
        this.id_prod_predomintante = id_prod_predomintante;
    }

    /**
     * @return the prod_predominante
     */
    public String getProd_predominante() {
        return prod_predominante;
    }

    /**
     * @param prod_predominante the prod_predominante to set
     */
    public void setProd_predominante(String prod_predominante) {
        this.prod_predominante = prod_predominante;
    }

    /**
     * @return the outras_carac_carga
     */
    public String getOutras_carac_carga() {
        return outras_carac_carga;
    }

    /**
     * @param outras_carac_carga the outras_carac_carga to set
     */
    public void setOutras_carac_carga(String outras_carac_carga) {
        this.outras_carac_carga = outras_carac_carga;
    }

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the tipo_medida
     */
    public String getTipo_medida() {
        return tipo_medida;
    }

    /**
     * @param tipo_medida the tipo_medida to set
     */
    public void setTipo_medida(String tipo_medida) {
        this.tipo_medida = tipo_medida;
    }

    /**
     * @return the quantidade_carga
     */
    public String getQuantidade_carga() {
        return quantidade_carga;
    }

    /**
     * @param quantidade_carga the quantidade_carga to set
     */
    public void setQuantidade_carga(String quantidade_carga) {
        this.quantidade_carga = quantidade_carga;
    }

    /**
     * @return the seguro_responsavel
     */
    public String getSeguro_responsavel() {
        return seguro_responsavel;
    }

    /**
     * @param seguro_responsavel the seguro_responsavel to set
     */
    public void setSeguro_responsavel(String seguro_responsavel) {
        this.seguro_responsavel = seguro_responsavel;
    }

    /**
     * @return the seguradora_nome
     */
    public String getSeguradora_nome() {
        return seguradora_nome;
    }

    /**
     * @param seguradora_nome the seguradora_nome to set
     */
    public void setSeguradora_nome(String seguradora_nome) {
        this.seguradora_nome = seguradora_nome;
    }

    /**
     * @return the seguradora_numero_apolice
     */
    public String getSeguradora_numero_apolice() {
        return seguradora_numero_apolice;
    }

    /**
     * @param seguradora_numero_apolice the seguradora_numero_apolice to set
     */
    public void setSeguradora_numero_apolice(String seguradora_numero_apolice) {
        this.seguradora_numero_apolice = seguradora_numero_apolice;
    }

    /**
     * @return the seguradora_numero_averb
     */
    public String getSeguradora_numero_averb() {
        return seguradora_numero_averb;
    }

    /**
     * @param seguradora_numero_averb the seguradora_numero_averb to set
     */
    public void setSeguradora_numero_averb(String seguradora_numero_averb) {
        this.seguradora_numero_averb = seguradora_numero_averb;
    }

    /**
     * @return the seguradora_valor_carga
     */
    public String getSeguradora_valor_carga() {
        return seguradora_valor_carga;
    }

    /**
     * @param seguradora_valor_carga the seguradora_valor_carga to set
     */
    public void setSeguradora_valor_carga(String seguradora_valor_carga) {
        this.seguradora_valor_carga = seguradora_valor_carga;
    }

    /**
     * @return the previsao_entrega
     */
    public String getPrevisao_entrega() {
        return previsao_entrega;
    }

    /**
     * @param previsao_entrega the previsao_entrega to set
     */
    public void setPrevisao_entrega(String previsao_entrega) {
        this.previsao_entrega = previsao_entrega;
    }

    /**
     * @return the indicador_lotacao
     */
    public String getIndicador_lotacao() {
        return indicador_lotacao;
    }

    /**
     * @param indicador_lotacao the indicador_lotacao to set
     */
    public void setIndicador_lotacao(String indicador_lotacao) {
        this.indicador_lotacao = indicador_lotacao;
    }

    /**
     * @return the codigo_op_transp
     */
    public String getCodigo_op_transp() {
        return codigo_op_transp;
    }

    /**
     * @param codigo_op_transp the codigo_op_transp to set
     */
    public void setCodigo_op_transp(String codigo_op_transp) {
        this.codigo_op_transp = codigo_op_transp;
    }

    /**
     * @return the serie_occ
     */
    public String getSerie_occ() {
        return serie_occ;
    }

    /**
     * @param serie_occ the serie_occ to set
     */
    public void setSerie_occ(String serie_occ) {
        this.serie_occ = serie_occ;
    }

    /**
     * @return the num_occ
     */
    public String getNum_occ() {
        return num_occ;
    }

    /**
     * @param num_occ the num_occ to set
     */
    public void setNum_occ(String num_occ) {
        this.num_occ = num_occ;
    }

    /**
     * @return the data_emissao_occ
     */
    public String getData_emissao_occ() {
        return data_emissao_occ;
    }

    /**
     * @param data_emissao_occ the data_emissao_occ to set
     */
    public void setData_emissao_occ(String data_emissao_occ) {
        this.data_emissao_occ = data_emissao_occ;
    }

    /**
     * @return the cnpj_transportadora_occ
     */
    public String getCnpj_transportadora_occ() {
        return cnpj_transportadora_occ;
    }

    /**
     * @param cnpj_transportadora_occ the cnpj_transportadora_occ to set
     */
    public void setCnpj_transportadora_occ(String cnpj_transportadora_occ) {
        this.cnpj_transportadora_occ = cnpj_transportadora_occ;
    }

    /**
     * @return the ie_occ
     */
    public String getIe_occ() {
        return ie_occ;
    }

    /**
     * @param ie_occ the ie_occ to set
     */
    public void setIe_occ(String ie_occ) {
        this.ie_occ = ie_occ;
    }

    /**
     * @return the uf_occ
     */
    public String getUf_occ() {
        return uf_occ;
    }

    /**
     * @param uf_occ the uf_occ to set
     */
    public void setUf_occ(String uf_occ) {
        this.uf_occ = uf_occ;
    }

    /**
     * @return the telefone_occ
     */
    public String getTelefone_occ() {
        return telefone_occ;
    }

    /**
     * @param telefone_occ the telefone_occ to set
     */
    public void setTelefone_occ(String telefone_occ) {
        this.telefone_occ = telefone_occ;
    }

    /**
     * @return the id_transportadora_occ
     */
    public String getId_transportadora_occ() {
        return id_transportadora_occ;
    }

    /**
     * @param id_transportadora_occ the id_transportadora_occ to set
     */
    public void setId_transportadora_occ(String id_transportadora_occ) {
        this.id_transportadora_occ = id_transportadora_occ;
    }

    /**
     * @return the id_veiculo
     */
    public String getId_veiculo() {
        return id_veiculo;
    }

    /**
     * @param id_veiculo the id_veiculo to set
     */
    public void setId_veiculo(String id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    /**
     * @return the veiculo_renavam
     */
    public String getVeiculo_renavam() {
        return veiculo_renavam;
    }

    /**
     * @param veiculo_renavam the veiculo_renavam to set
     */
    public void setVeiculo_renavam(String veiculo_renavam) {
        this.veiculo_renavam = veiculo_renavam;
    }

    /**
     * @return the veiculo_placa
     */
    public String getVeiculo_placa() {
        return veiculo_placa;
    }

    /**
     * @param veiculo_placa the veiculo_placa to set
     */
    public void setVeiculo_placa(String veiculo_placa) {
        this.veiculo_placa = veiculo_placa;
    }

    /**
     * @return the veiculo_tara
     */
    public String getVeiculo_tara() {
        return veiculo_tara;
    }

    /**
     * @param veiculo_tara the veiculo_tara to set
     */
    public void setVeiculo_tara(String veiculo_tara) {
        this.veiculo_tara = veiculo_tara;
    }

    /**
     * @return the veiculo_cap_kg
     */
    public String getVeiculo_cap_kg() {
        return veiculo_cap_kg;
    }

    /**
     * @param veiculo_cap_kg the veiculo_cap_kg to set
     */
    public void setVeiculo_cap_kg(String veiculo_cap_kg) {
        this.veiculo_cap_kg = veiculo_cap_kg;
    }

    /**
     * @return the veiculo_cap_m3
     */
    public String getVeiculo_cap_m3() {
        return veiculo_cap_m3;
    }

    /**
     * @param veiculo_cap_m3 the veiculo_cap_m3 to set
     */
    public void setVeiculo_cap_m3(String veiculo_cap_m3) {
        this.veiculo_cap_m3 = veiculo_cap_m3;
    }

    /**
     * @return the veiculo_tipo
     */
    public String getVeiculo_tipo() {
        return veiculo_tipo;
    }

    /**
     * @param veiculo_tipo the veiculo_tipo to set
     */
    public void setVeiculo_tipo(String veiculo_tipo) {
        this.veiculo_tipo = veiculo_tipo;
    }

    /**
     * @return the veiculo_tipo_propriedade
     */
    public String getVeiculo_tipo_propriedade() {
        return veiculo_tipo_propriedade;
    }

    /**
     * @param veiculo_tipo_propriedade the veiculo_tipo_propriedade to set
     */
    public void setVeiculo_tipo_propriedade(String veiculo_tipo_propriedade) {
        this.veiculo_tipo_propriedade = veiculo_tipo_propriedade;
    }

    /**
     * @return the veiculo_tipo_rodado
     */
    public String getVeiculo_tipo_rodado() {
        return veiculo_tipo_rodado;
    }

    /**
     * @param veiculo_tipo_rodado the veiculo_tipo_rodado to set
     */
    public void setVeiculo_tipo_rodado(String veiculo_tipo_rodado) {
        this.veiculo_tipo_rodado = veiculo_tipo_rodado;
    }

    /**
     * @return the veiculo_tipo_carroceria
     */
    public String getVeiculo_tipo_carroceria() {
        return veiculo_tipo_carroceria;
    }

    /**
     * @param veiculo_tipo_carroceria the veiculo_tipo_carroceria to set
     */
    public void setVeiculo_tipo_carroceria(String veiculo_tipo_carroceria) {
        this.veiculo_tipo_carroceria = veiculo_tipo_carroceria;
    }

    /**
     * @return the veiculo_uf_licenciatura
     */
    public String getVeiculo_uf_licenciatura() {
        return veiculo_uf_licenciatura;
    }

    /**
     * @param veiculo_uf_licenciatura the veiculo_uf_licenciatura to set
     */
    public void setVeiculo_uf_licenciatura(String veiculo_uf_licenciatura) {
        this.veiculo_uf_licenciatura = veiculo_uf_licenciatura;
    }

    /**
     * @return the veiculo_prop_cpf
     */
    public String getVeiculo_prop_cpf() {
        return veiculo_prop_cpf;
    }

    /**
     * @param veiculo_prop_cpf the veiculo_prop_cpf to set
     */
    public void setVeiculo_prop_cpf(String veiculo_prop_cpf) {
        this.veiculo_prop_cpf = veiculo_prop_cpf;
    }

    /**
     * @return the veiculo_prop_cnpj
     */
    public String getVeiculo_prop_cnpj() {
        return veiculo_prop_cnpj;
    }

    /**
     * @param veiculo_prop_cnpj the veiculo_prop_cnpj to set
     */
    public void setVeiculo_prop_cnpj(String veiculo_prop_cnpj) {
        this.veiculo_prop_cnpj = veiculo_prop_cnpj;
    }

    /**
     * @return the veiculo_prop_rntrc
     */
    public String getVeiculo_prop_rntrc() {
        return veiculo_prop_rntrc;
    }

    /**
     * @param veiculo_prop_rntrc the veiculo_prop_rntrc to set
     */
    public void setVeiculo_prop_rntrc(String veiculo_prop_rntrc) {
        this.veiculo_prop_rntrc = veiculo_prop_rntrc;
    }

    /**
     * @return the veiculo_prop_nome
     */
    public String getVeiculo_prop_nome() {
        return veiculo_prop_nome;
    }

    /**
     * @param veiculo_prop_nome the veiculo_prop_nome to set
     */
    public void setVeiculo_prop_nome(String veiculo_prop_nome) {
        this.veiculo_prop_nome = veiculo_prop_nome;
    }

    /**
     * @return the veiculo_prop_ie
     */
    public String getVeiculo_prop_ie() {
        return veiculo_prop_ie;
    }

    /**
     * @param veiculo_prop_ie the veiculo_prop_ie to set
     */
    public void setVeiculo_prop_ie(String veiculo_prop_ie) {
        this.veiculo_prop_ie = veiculo_prop_ie;
    }

    /**
     * @return the veiculo_prop_uf
     */
    public String getVeiculo_prop_uf() {
        return veiculo_prop_uf;
    }

    /**
     * @param veiculo_prop_uf the veiculo_prop_uf to set
     */
    public void setVeiculo_prop_uf(String veiculo_prop_uf) {
        this.veiculo_prop_uf = veiculo_prop_uf;
    }

    /**
     * @return the veiculo_prop_tipo
     */
    public String getVeiculo_prop_tipo() {
        return veiculo_prop_tipo;
    }

    /**
     * @param veiculo_prop_tipo the veiculo_prop_tipo to set
     */
    public void setVeiculo_prop_tipo(String veiculo_prop_tipo) {
        this.veiculo_prop_tipo = veiculo_prop_tipo;
    }

    /**
     * @return the data_emissao_contingencia
     */
    public String getData_emissao_contingencia() {
        return data_emissao_contingencia;
    }

    /**
     * @param data_emissao_contingencia the data_emissao_contingencia to set
     */
    public void setData_emissao_contingencia(String data_emissao_contingencia) {
        this.data_emissao_contingencia = data_emissao_contingencia;
    }

    /**
     * @return the justificativa_contingencia
     */
    public String getJustificativa_contingencia() {
        return justificativa_contingencia;
    }

    /**
     * @param justificativa_contingencia the justificativa_contingencia to set
     */
    public void setJustificativa_contingencia(String justificativa_contingencia) {
        this.justificativa_contingencia = justificativa_contingencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
