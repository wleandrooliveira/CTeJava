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
public class conhecimentoTransporteEletronico {

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
    private String id_municipio_ini_prest;
    private String municipio_ini_prest;
    private String uf_municipio_ini_prest;
    private String id_municipio_fim_prest;
    private String municipio_fim_prest;
    private String uf_id_municipio_fim_prest;
    private String retira;
    private String retira_detalhes;
    private String tomador_servico;
    private String tomador_cnpj;
    private String tomador_cpf;
    private String tomador_ie;
    private String tomador_nome;
    private String tomador_nome_fant;
    private String tomador_telefone;
    private String tomador_rua;
    private String tomador_num;
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
    private String emitente_rua;
    private String emitente_num;
    private String emitente_compl;
    private String emitente_bairro;
    private String emitente_codigo_municipio;
    private String emitente_municipio;
    private String emitente_cep;
    private String emitente_uf;
    private String emitente_telefone;
    private String remetente_cnpj;
    private String remetente_cpf;
    private String remetente_ie;
    private String remetente_nome;
    private String remetente_nome_fant;
    private String remetente_telefone;
    private String remetente_rua;
    private String remetente_num;
    private String remetente_compl;
    private String remetente_bairro;
    private String remetente_codigo_municipio;
    private String remetente_municipio;
    private String remetente_cep;
    private String remetente_uf;
    private String remetente_codigo_pais;
    private String remetente_pais;
    private String remetente_email;
    private String expedidor_cnpj;
    private String expedidor_cpf;
    private String expedidor_ie;
    private String expedidor_nome;
    private String expedidor_telefone;
    private String expedidor_rua;
    private String expedidor_num;
    private String expedidor_compl;
    private String expedidor_bairro;
    private String expedidor_codigo_municipio;
    private String expedidor_municipio;
    private String expedidor_cep;
    private String expedidor_uf;
    private String expedidor_codigo_pais;
    private String expedidor_pais;
    private String expedidor_email;
    private String recebedor_cnpj;
    private String recebedor_cpf;
    private String recebedor_nome;
    private String recebedor_telefone;
    private String recebedor_rua;
    private String recebedor_num;
    private String recebedor_compl;
    private String recebedor_bairro;
    private String recebedor_codigo_municipio;
    private String recebedor_municipio;
    private String recebedor_cep;
    private String recebedor_uf;
    private String recebedor_codigo_pais;
    private String recebedor_pais;
    private String recebedor_email;
    private String recebedor_ie;
    private String destinatario_cnpj;
    private String destinatario_cpf;
    private String destinatario_ie;
    private String destinatario_nome;
    private String destinatario_telefone;
    private String destinatario_suframa;
    private String destinatario_rua;
    private String destinatario_num;
    private String destinatario_compl;
    private String destinatario_bairro;
    private String destinatario_codigo_municipio;
    private String destinatario_municipio;
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
    private String seguradora_num_apolice;
    private String seguradora_num_averb;
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
        String Conteudo[] = new String[179];
        conexao con = null;
        ResultSet RS = null;
        SQL = "INSERT INTO conhecimentotransporte_eletronico (id_nota_fiscal,numero_nfe,chave_acesso_nfe,chave_acesso_cte,cfop,natureza_operacao,modelo,serie,numero_cte,data_emissao,hora_emissao,"
                + "tipo_emissao,tipo_impressao,tipo_cte,indicador_emissao,id_municipio_envio,municipio_envio,uf_envio,modal,tipo_servico,id_municipio_ini_prest,municipio_ini_prest,"
                + "uf_municipio_ini_prest,id_municipio_fim_prest,municipio_fim_prest,uf_id_municipio_fim_prest,retira,retira_detalhes,tomador_servico,tomador_cnpj,tomador_cpf,tomador_ie,"
                + "tomador_nome,tomador_nome_fant,tomador_telefone,tomador_rua,tomador_num,tomador_compl,tomador_bairro,tomador_codigo_municipio,tomador_municipio,tomador_cep,tomador_uf,"
                + "tomador_codigo_pais,tomador_pais,tomador_email,data_emissao_contingencia,justificativa_contingencia,emitente_cnpj,emitente_ie,emitente_nome,emitente_nome_fant,emitente_rua,emitente_num,emitente_compl,"
                + "emitente_bairro,emitente_codigo_municipio,emitente_municipio,emitente_cep,emitente_uf,emitente_telefone,remetente_cnpj,remetente_cpf,remetente_ie,remetente_nome,"
                + "remetente_nome_fant,remetente_telefone,remetente_rua,remetente_num,"
                + "remetente_compl,remetente_bairro,remetente_codigo_municipio,remetente_municipio,remetente_cep,"
                + "remetente_uf,remetente_codigo_pais,remetente_pais,remetente_email,expedidor_cnpj,expedidor_cpf,expedidor_ie,expedidor_nome,expedidor_telefone,expedidor_rua,expedidor_num,"
                + "expedidor_compl,expedidor_bairro,expedidor_codigo_municipio,expedidor_municipio,expedidor_cep,expedidor_uf,expedidor_codigo_pais,expedidor_pais,expedidor_email,"
                + "recebedor_cnpj,recebedor_cpf,recebedor_nome,recebedor_telefone,recebedor_rua,recebedor_num,recebedor_compl,recebedor_bairro,recebedor_codigo_municipio,recebedor_municipio,"
                + "recebedor_cep,recebedor_uf,recebedor_codigo_pais,recebedor_pais,recebedor_email,recebedor_ie,destinatario_cnpj,destinatario_cpf,destinatario_ie,destinatario_nome,"
                + "destinatario_telefone,destinatario_suframa,destinatario_rua,destinatario_num,destinatario_compl,destinatario_bairro,destinatario_codigo_municipio,destinatario_municipio,"
                + "destinatario_cep,destinatario_uf,destinatario_codigo_pais,destinatario_nome_pais,destinatario_email,prestacao_valor_total_servico,prestacao_valor_receber,aliq_icms,bc_icms,valor_icms,aliq_icms_st,"
                + "bc_icms_st,valor_icms_st,valor_cred_icms,cst,percentual_reducao_bc,valor_carga,id_prod_predomintante,prod_predominante,outras_carac_carga,unidade,tipo_medida,quantidade_carga,"
                + "seguro_responsavel,seguradora_nome,seguradora_num_apolice,seguradora_num_averb,seguradora_valor_carga,previsao_entrega,indicador_lotacao,codigo_op_transp,serie_occ,num_occ,"
                + "data_emissao_occ,cnpj_transportadora_occ,ie_occ,uf_occ,telefone_occ,id_transportadora_occ,id_veiculo,veiculo_renavam,veiculo_placa,veiculo_tara,veiculo_cap_kg,veiculo_cap_m3,"
                + "veiculo_tipo,veiculo_tipo_propriedade,veiculo_tipo_rodado,veiculo_tipo_carroceria,veiculo_uf_licenciatura,veiculo_prop_cpf,veiculo_prop_cnpj,veiculo_prop_rntrc,veiculo_prop_nome,"
                + "veiculo_prop_ie,veiculo_prop_uf,veiculo_prop_tipo) VALUES ()";

        Conteudo[0] = String.valueOf(this.getId_nota_fiscal());
        Conteudo[1] = String.valueOf(this.getNumero_nfe());
        Conteudo[2] = String.valueOf(this.getChave_acesso_nfe());
        Conteudo[3] = String.valueOf(this.getChave_acesso_cte());
        Conteudo[4] = String.valueOf(this.getCfop());
        Conteudo[5] = String.valueOf(this.getNatureza_operacao());
        Conteudo[6] = String.valueOf(this.getModelo());
        Conteudo[7] = String.valueOf(this.getSerie());
        Conteudo[8] = String.valueOf(this.getNumero_cte());
        Conteudo[9] = String.valueOf(this.getData_emissao());
        Conteudo[10] = String.valueOf(this.getHora_emissao());
        Conteudo[11] = String.valueOf(this.getTipo_emissao());
        Conteudo[12] = String.valueOf(this.getTipo_impressao());
        Conteudo[13] = String.valueOf(this.getTipo_cte());
        Conteudo[14] = String.valueOf(this.getIndicador_emissao());
        Conteudo[15] = String.valueOf(this.getId_municipio_envio());
        Conteudo[16] = String.valueOf(this.getMunicipio_envio());
        Conteudo[17] = String.valueOf(this.getUf_envio());
        Conteudo[18] = String.valueOf(this.getModal());
        Conteudo[19] = String.valueOf(this.getTipo_servico());
        Conteudo[20] = String.valueOf(this.getId_municipio_ini_prest());
        Conteudo[21] = String.valueOf(this.getMunicipio_ini_prest());
        Conteudo[22] = String.valueOf(this.getUf_municipio_ini_prest());
        Conteudo[23] = String.valueOf(this.getId_municipio_fim_prest());
        Conteudo[24] = String.valueOf(this.getMunicipio_fim_prest());
        Conteudo[25] = String.valueOf(this.getUf_id_municipio_fim_prest());
        Conteudo[26] = String.valueOf(this.getRetira());
        Conteudo[27] = String.valueOf(this.getRetira_detalhes());
        Conteudo[28] = String.valueOf(this.getTomador_servico());
        Conteudo[29] = String.valueOf(this.getTomador_cnpj());
        Conteudo[30] = String.valueOf(this.getTomador_cpf());
        Conteudo[31] = String.valueOf(this.getTomador_ie());
        Conteudo[32] = String.valueOf(this.getTomador_nome());
        Conteudo[33] = String.valueOf(this.getTomador_nome_fant());
        Conteudo[34] = String.valueOf(this.getTomador_telefone());
        Conteudo[35] = String.valueOf(this.getTomador_rua());
        Conteudo[36] = String.valueOf(this.getTomador_num());
        Conteudo[37] = String.valueOf(this.getTomador_compl());
        Conteudo[38] = String.valueOf(this.getTomador_bairro());
        Conteudo[39] = String.valueOf(this.getTomador_codigo_municipio());
        Conteudo[40] = String.valueOf(this.getTomador_municipio());
        Conteudo[41] = String.valueOf(this.getTomador_cep());
        Conteudo[42] = String.valueOf(this.getTomador_uf());
        Conteudo[43] = String.valueOf(this.getTomador_codigo_pais());
        Conteudo[44] = String.valueOf(this.getTomador_pais());
        Conteudo[45] = String.valueOf(this.getTomador_email());
        Conteudo[46] = String.valueOf(this.getData_emissao_contingencia());
        Conteudo[47] = String.valueOf(this.getJustificativa_contingencia());
        Conteudo[48] = String.valueOf(this.getEmitente_cnpj());
        Conteudo[49] = String.valueOf(this.getEmitente_ie());
        Conteudo[50] = String.valueOf(this.getEmitente_nome());
        Conteudo[51] = String.valueOf(this.getEmitente_nome_fant());
        Conteudo[52] = String.valueOf(this.getEmitente_rua());
        Conteudo[53] = String.valueOf(this.getEmitente_num());
        Conteudo[54] = String.valueOf(this.getEmitente_compl());
        Conteudo[55] = String.valueOf(this.getEmitente_bairro());
        Conteudo[56] = String.valueOf(this.getEmitente_codigo_municipio());
        Conteudo[57] = String.valueOf(this.getEmitente_municipio());
        Conteudo[58] = String.valueOf(this.getEmitente_cep());
        Conteudo[59] = String.valueOf(this.getEmitente_uf());
        Conteudo[60] = String.valueOf(this.getEmitente_telefone());
        Conteudo[61] = String.valueOf(this.getRemetente_cnpj());
        Conteudo[62] = String.valueOf(this.getRemetente_cpf());
        Conteudo[63] = String.valueOf(this.getRemetente_ie());
        Conteudo[64] = String.valueOf(this.getRemetente_nome());
        Conteudo[65] = String.valueOf(this.getRemetente_nome_fant());
        Conteudo[66] = String.valueOf(this.getRemetente_telefone());
        Conteudo[67] = String.valueOf(this.getRemetente_rua());
        Conteudo[68] = String.valueOf(this.getRemetente_num());
        Conteudo[69] = String.valueOf(this.getRemetente_compl());
        Conteudo[70] = String.valueOf(this.getRemetente_bairro());
        Conteudo[71] = String.valueOf(this.getRemetente_codigo_municipio());
        Conteudo[72] = String.valueOf(this.getRemetente_municipio());
        Conteudo[73] = String.valueOf(this.getRemetente_cep());
        Conteudo[74] = String.valueOf(this.getRemetente_uf());
        Conteudo[75] = String.valueOf(this.getRemetente_codigo_pais());
        Conteudo[76] = String.valueOf(this.getRemetente_pais());
        Conteudo[77] = String.valueOf(this.getRemetente_email());
        Conteudo[78] = String.valueOf(this.getExpedidor_cnpj());
        Conteudo[79] = String.valueOf(this.getExpedidor_cpf());
        Conteudo[80] = String.valueOf(this.getExpedidor_ie());
        Conteudo[81] = String.valueOf(this.getExpedidor_nome());
        Conteudo[82] = String.valueOf(this.getExpedidor_telefone());
        Conteudo[83] = String.valueOf(this.getExpedidor_rua());
        Conteudo[84] = String.valueOf(this.getExpedidor_num());
        Conteudo[85] = String.valueOf(this.getExpedidor_compl());
        Conteudo[86] = String.valueOf(this.getExpedidor_bairro());
        Conteudo[87] = String.valueOf(this.getExpedidor_codigo_municipio());
        Conteudo[88] = String.valueOf(this.getExpedidor_municipio());
        Conteudo[89] = String.valueOf(this.getExpedidor_cep());
        Conteudo[90] = String.valueOf(this.getExpedidor_uf());
        Conteudo[91] = String.valueOf(this.getExpedidor_codigo_pais());
        Conteudo[92] = String.valueOf(this.getExpedidor_pais());
        Conteudo[93] = String.valueOf(this.getExpedidor_email());
        Conteudo[94] = String.valueOf(this.getRecebedor_cnpj());
        Conteudo[95] = String.valueOf(this.getRecebedor_cpf());
        Conteudo[96] = String.valueOf(this.getRecebedor_nome());
        Conteudo[97] = String.valueOf(this.getRecebedor_telefone());
        Conteudo[98] = String.valueOf(this.getRecebedor_rua());
        Conteudo[99] = String.valueOf(this.getRecebedor_num());
        Conteudo[100] = String.valueOf(this.getRecebedor_compl());
        Conteudo[101] = String.valueOf(this.getRecebedor_bairro());
        Conteudo[102] = String.valueOf(this.getRecebedor_codigo_municipio());
        Conteudo[103] = String.valueOf(this.getRecebedor_municipio());
        Conteudo[104] = String.valueOf(this.getRecebedor_cep());
        Conteudo[105] = String.valueOf(this.getRecebedor_uf());
        Conteudo[106] = String.valueOf(this.getRecebedor_codigo_pais());
        Conteudo[107] = String.valueOf(this.getRecebedor_pais());
        Conteudo[108] = String.valueOf(this.getRecebedor_email());
        Conteudo[109] = String.valueOf(this.getRecebedor_ie());
        Conteudo[110] = String.valueOf(this.getDestinatario_cnpj());
        Conteudo[111] = String.valueOf(this.getDestinatario_cpf());
        Conteudo[112] = String.valueOf(this.getDestinatario_ie());
        Conteudo[113] = String.valueOf(this.getDestinatario_nome());
        Conteudo[114] = String.valueOf(this.getDestinatario_telefone());
        Conteudo[115] = String.valueOf(this.getDestinatario_suframa());
        Conteudo[116] = String.valueOf(this.getDestinatario_rua());
        Conteudo[117] = String.valueOf(this.getDestinatario_num());
        Conteudo[118] = String.valueOf(this.getDestinatario_compl());
        Conteudo[119] = String.valueOf(this.getDestinatario_bairro());
        Conteudo[120] = String.valueOf(this.getDestinatario_codigo_municipio());
        Conteudo[121] = String.valueOf(this.getDestinatario_municipio());
        Conteudo[122] = String.valueOf(this.getDestinatario_cep());
        Conteudo[123] = String.valueOf(this.getDestinatario_uf());
        Conteudo[124] = String.valueOf(this.getDestinatario_codigo_pais());
        Conteudo[125] = String.valueOf(this.getDestinatario_nome_pais());
        Conteudo[126] = String.valueOf(this.getDestinatario_email());        
        Conteudo[127] = String.valueOf(this.getPrestacao_valor_total_servico());
        Conteudo[128] = String.valueOf(this.getPrestacao_valor_receber());
        Conteudo[129] = String.valueOf(this.getAliq_icms());
        Conteudo[130] = String.valueOf(this.getBc_icms());
        Conteudo[131] = String.valueOf(this.getValor_icms());
        Conteudo[132] = String.valueOf(this.getAliq_icms_st());
        Conteudo[133] = String.valueOf(this.getBc_icms_st());
        Conteudo[134] = String.valueOf(this.getValor_icms_st());
        Conteudo[135] = String.valueOf(this.getValor_cred_icms());
        Conteudo[136] = String.valueOf(this.getCst());
        Conteudo[137] = String.valueOf(this.getPercentual_reducao_bc());
        Conteudo[138] = String.valueOf(this.getValor_carga());
        Conteudo[139] = String.valueOf(this.getId_prod_predomintante());
        Conteudo[140] = String.valueOf(this.getProd_predominante());
        Conteudo[141] = String.valueOf(this.getOutras_carac_carga());
        Conteudo[142] = String.valueOf(this.getUnidade());
        Conteudo[143] = String.valueOf(this.getTipo_medida());
        Conteudo[144] = String.valueOf(this.getQuantidade_carga());
        Conteudo[145] = String.valueOf(this.getSeguro_responsavel());
        Conteudo[146] = String.valueOf(this.getSeguradora_nome());
        Conteudo[147] = String.valueOf(this.getSeguradora_num_apolice());
        Conteudo[148] = String.valueOf(this.getSeguradora_num_averb());
        Conteudo[149] = String.valueOf(this.getSeguradora_valor_carga());
        Conteudo[150] = String.valueOf(this.getPrevisao_entrega());
        Conteudo[151] = String.valueOf(this.getIndicador_lotacao());
        Conteudo[152] = String.valueOf(this.getCodigo_op_transp());
        Conteudo[153] = String.valueOf(this.getSerie_occ());
        Conteudo[154] = String.valueOf(this.getNum_occ());
        Conteudo[155] = String.valueOf(this.getData_emissao_occ());
        Conteudo[156] = String.valueOf(this.getCnpj_transportadora_occ());
        Conteudo[157] = String.valueOf(this.getIe_occ());
        Conteudo[158] = String.valueOf(this.getUf_occ());
        Conteudo[159] = String.valueOf(this.getTelefone_occ());
        Conteudo[160] = String.valueOf(this.getId_transportadora_occ());
        Conteudo[161] = String.valueOf(this.getId_veiculo());
        Conteudo[162] = String.valueOf(this.getVeiculo_renavam());
        Conteudo[163] = String.valueOf(this.getVeiculo_placa());
        Conteudo[164] = String.valueOf(this.getVeiculo_tara());
        Conteudo[165] = String.valueOf(this.getVeiculo_cap_kg());
        Conteudo[166] = String.valueOf(this.getVeiculo_cap_m3());
        Conteudo[167] = String.valueOf(this.getVeiculo_tipo());
        Conteudo[168] = String.valueOf(this.getVeiculo_tipo_propriedade());
        Conteudo[169] = String.valueOf(this.getVeiculo_tipo_rodado());
        Conteudo[170] = String.valueOf(this.getVeiculo_tipo_carroceria());
        Conteudo[171] = String.valueOf(this.getVeiculo_uf_licenciatura());
        Conteudo[172] = String.valueOf(this.getVeiculo_prop_cpf());
        Conteudo[173] = String.valueOf(this.getVeiculo_prop_cnpj());
        Conteudo[174] = String.valueOf(this.getVeiculo_prop_rntrc());
        Conteudo[175] = String.valueOf(this.getVeiculo_prop_nome());
        Conteudo[176] = String.valueOf(this.getVeiculo_prop_ie());
        Conteudo[177] = String.valueOf(this.getVeiculo_prop_uf());
        Conteudo[178] = String.valueOf(this.getVeiculo_prop_tipo());

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
        String Conteudo[] = new String[180];
        conexao con = null;
        ResultSet RS = null;

        SQL = "UPDATE conhecimentotransporte_eletronico SET id_nota_fiscal = ?, numero_nfe = ?, chave_acesso_nfe = ?, chave_acesso_cte = ?, cfop = ?, natureza_operacao = ?, modelo = ?, serie = ?, numero_cte = ?, data_emissao = ?, hora_emissao = ?, "
                + "tipo_emissao = ?, tipo_impressao = ?, tipo_cte = ?, indicador_emissao = ?, id_municipio_envio = ?, municipio_envio = ?, uf_envio = ?, modal = ?, tipo_servico = ?, id_municipio_ini_prest = ?, municipio_ini_prest = ?, "
                + "uf_municipio_ini_prest = ?, id_municipio_fim_prest = ?, municipio_fim_prest = ?, uf_id_municipio_fim_prest = ?, retira = ?, retira_detalhes = ?, tomador_servico = ?, tomador_cnpj = ?, tomador_cpf = ?, tomador_ie = ?, "
                + "tomador_nome = ?, tomador_nome_fant = ?, tomador_telefone = ?, tomador_rua = ?, tomador_num = ?, tomador_compl = ?, tomador_bairro = ?, tomador_codigo_municipio = ?, tomador_municipio = ?, tomador_cep = ?, tomador_uf = ?, "
                + "tomador_codigo_pais = ?, tomador_pais = ?, tomador_email = ?, data_emissao_contingencia = ?, justificativa_contingencia = ?, emitente_cnpj = ?, emitente_ie = ?, emitente_nome = ?, emitente_nome_fant = ?, emitente_rua = ?, emitente_num = ?, emitente_compl = ?, "
                + "emitente_bairro = ?, emitente_codigo_municipio = ?, emitente_municipio = ?, emitente_cep = ?, emitente_uf = ?, emitente_telefone = ?, remetente_cnpj = ?, remetente_cpf = ?, remetente_ie = ?, remetente_nome = ?, "
                + "remetente_nome_fant = ?, remetente_telefone = ?, remetente_rua = ?, remetente_num = ?, "
                + "remetente_compl = ?, remetente_bairro = ?, remetente_codigo_municipio = ?, remetente_municipio = ?, remetente_cep = ?, "
                + "remetente_uf = ?, remetente_codigo_pais = ?, remetente_pais = ?, remetente_email = ?, expedidor_cnpj = ?, expedidor_cpf = ?, expedidor_ie = ?, expedidor_nome = ?, expedidor_telefone = ?, expedidor_rua = ?, expedidor_num = ?, "
                + "expedidor_compl = ?, expedidor_bairro = ?, expedidor_codigo_municipio = ?, expedidor_municipio = ?, expedidor_cep = ?, expedidor_uf = ?, expedidor_codigo_pais = ?, expedidor_pais = ?, expedidor_email = ?, "
                + "recebedor_cnpj = ?, recebedor_cpf = ?, recebedor_nome = ?, recebedor_telefone = ?, recebedor_rua = ?, recebedor_num = ?, recebedor_compl = ?, recebedor_bairro = ?, recebedor_codigo_municipio = ?, recebedor_municipio = ?, "
                + "recebedor_cep = ?, recebedor_uf = ?, recebedor_codigo_pais = ?, recebedor_pais = ?, recebedor_email = ?, recebedor_ie = ?, destinatario_cnpj = ?, destinatario_cpf = ?, destinatario_ie = ?, destinatario_nome = ?, "
                + "destinatario_telefone = ?, destinatario_suframa = ?, destinatario_rua = ?, destinatario_num = ?, destinatario_compl = ?, destinatario_bairro = ?, destinatario_codigo_municipio = ?, destinatario_municipio = ?, "
                + "destinatario_cep = ?, destinatario_uf = ?, destinatario_codigo_pais = ?, destinatario_nome_pais = ?, destinatario_email = ?, prestacao_valor_total_servico = ?, prestacao_valor_receber = ?, aliq_icms = ?, bc_icms = ?, valor_icms = ?, aliq_icms_st = ?, "
                + "bc_icms_st = ?, valor_icms_st = ?, valor_cred_icms = ?, cst = ?, percentual_reducao_bc = ?, valor_carga = ?, id_prod_predomintante = ?, prod_predominante = ?, outras_carac_carga = ?, unidade = ?, tipo_medida = ?, quantidade_carga = ?, "
                + "seguro_responsavel = ?, seguradora_nome = ?, seguradora_num_apolice = ?, seguradora_num_averb = ?, seguradora_valor_carga = ?, previsao_entrega = ?, indicador_lotacao = ?, codigo_op_transp = ?, serie_occ = ?, num_occ = ?, "
                + "data_emissao_occ = ?, cnpj_transportadora_occ = ?, ie_occ = ?, uf_occ = ?, telefone_occ = ?, id_transportadora_occ = ?, id_veiculo = ?, veiculo_renavam = ?, veiculo_placa = ?, veiculo_tara = ?, veiculo_cap_kg = ?, veiculo_cap_m3 = ?, "
                + "veiculo_tipo = ?, veiculo_tipo_propriedade = ?, veiculo_tipo_rodado = ?, veiculo_tipo_carroceria = ?, veiculo_uf_licenciatura = ?, veiculo_prop_cpf = ?, veiculo_prop_cnpj = ?, veiculo_prop_rntrc = ?, veiculo_prop_nome = ?, "
                + "veiculo_prop_ie = ?, veiculo_prop_uf = ?, veiculo_prop_tipo = ? "
                + "WHERE id = " + getId();

        Conteudo[0] = String.valueOf(this.getId_nota_fiscal());
        Conteudo[1] = String.valueOf(this.getNumero_nfe());
        Conteudo[2] = String.valueOf(this.getChave_acesso_nfe());
        Conteudo[3] = String.valueOf(this.getChave_acesso_cte());
        Conteudo[4] = String.valueOf(this.getCfop());
        Conteudo[5] = String.valueOf(this.getNatureza_operacao());
        Conteudo[6] = String.valueOf(this.getModelo());
        Conteudo[7] = String.valueOf(this.getSerie());
        Conteudo[8] = String.valueOf(this.getNumero_cte());
        Conteudo[9] = String.valueOf(this.getData_emissao());
        Conteudo[10] = String.valueOf(this.getHora_emissao());
        Conteudo[11] = String.valueOf(this.getTipo_emissao());
        Conteudo[12] = String.valueOf(this.getTipo_impressao());
        Conteudo[13] = String.valueOf(this.getTipo_cte());
        Conteudo[14] = String.valueOf(this.getIndicador_emissao());
        Conteudo[15] = String.valueOf(this.getId_municipio_envio());
        Conteudo[16] = String.valueOf(this.getMunicipio_envio());
        Conteudo[17] = String.valueOf(this.getUf_envio());
        Conteudo[18] = String.valueOf(this.getModal());
        Conteudo[19] = String.valueOf(this.getTipo_servico());
        Conteudo[20] = String.valueOf(this.getId_municipio_ini_prest());
        Conteudo[21] = String.valueOf(this.getMunicipio_ini_prest());
        Conteudo[22] = String.valueOf(this.getUf_municipio_ini_prest());
        Conteudo[23] = String.valueOf(this.getId_municipio_fim_prest());
        Conteudo[24] = String.valueOf(this.getMunicipio_fim_prest());
        Conteudo[25] = String.valueOf(this.getUf_id_municipio_fim_prest());
        Conteudo[26] = String.valueOf(this.getRetira());
        Conteudo[27] = String.valueOf(this.getRetira_detalhes());
        Conteudo[28] = String.valueOf(this.getTomador_servico());
        Conteudo[29] = String.valueOf(this.getTomador_cnpj());
        Conteudo[30] = String.valueOf(this.getTomador_cpf());
        Conteudo[31] = String.valueOf(this.getTomador_ie());
        Conteudo[32] = String.valueOf(this.getTomador_nome());
        Conteudo[33] = String.valueOf(this.getTomador_nome_fant());
        Conteudo[34] = String.valueOf(this.getTomador_telefone());
        Conteudo[35] = String.valueOf(this.getTomador_rua());
        Conteudo[36] = String.valueOf(this.getTomador_num());
        Conteudo[37] = String.valueOf(this.getTomador_compl());
        Conteudo[38] = String.valueOf(this.getTomador_bairro());
        Conteudo[39] = String.valueOf(this.getTomador_codigo_municipio());
        Conteudo[40] = String.valueOf(this.getTomador_municipio());
        Conteudo[41] = String.valueOf(this.getTomador_cep());
        Conteudo[42] = String.valueOf(this.getTomador_uf());
        Conteudo[43] = String.valueOf(this.getTomador_codigo_pais());
        Conteudo[44] = String.valueOf(this.getTomador_pais());
        Conteudo[45] = String.valueOf(this.getTomador_email());
        Conteudo[46] = String.valueOf(this.getData_emissao_contingencia());
        Conteudo[47] = String.valueOf(this.getJustificativa_contingencia());
        Conteudo[48] = String.valueOf(this.getEmitente_cnpj());
        Conteudo[49] = String.valueOf(this.getEmitente_ie());
        Conteudo[50] = String.valueOf(this.getEmitente_nome());
        Conteudo[51] = String.valueOf(this.getEmitente_nome_fant());
        Conteudo[52] = String.valueOf(this.getEmitente_rua());
        Conteudo[53] = String.valueOf(this.getEmitente_num());
        Conteudo[54] = String.valueOf(this.getEmitente_compl());
        Conteudo[55] = String.valueOf(this.getEmitente_bairro());
        Conteudo[56] = String.valueOf(this.getEmitente_codigo_municipio());
        Conteudo[57] = String.valueOf(this.getEmitente_municipio());
        Conteudo[58] = String.valueOf(this.getEmitente_cep());
        Conteudo[59] = String.valueOf(this.getEmitente_uf());
        Conteudo[60] = String.valueOf(this.getEmitente_telefone());
        Conteudo[61] = String.valueOf(this.getRemetente_cnpj());
        Conteudo[62] = String.valueOf(this.getRemetente_cpf());
        Conteudo[63] = String.valueOf(this.getRemetente_ie());
        Conteudo[64] = String.valueOf(this.getRemetente_nome());
        Conteudo[65] = String.valueOf(this.getRemetente_nome_fant());
        Conteudo[66] = String.valueOf(this.getRemetente_telefone());
        Conteudo[67] = String.valueOf(this.getRemetente_rua());
        Conteudo[68] = String.valueOf(this.getRemetente_num());
        Conteudo[69] = String.valueOf(this.getRemetente_compl());
        Conteudo[70] = String.valueOf(this.getRemetente_bairro());
        Conteudo[71] = String.valueOf(this.getRemetente_codigo_municipio());
        Conteudo[72] = String.valueOf(this.getRemetente_municipio());
        Conteudo[73] = String.valueOf(this.getRemetente_cep());
        Conteudo[74] = String.valueOf(this.getRemetente_uf());
        Conteudo[75] = String.valueOf(this.getRemetente_codigo_pais());
        Conteudo[76] = String.valueOf(this.getRemetente_pais());
        Conteudo[77] = String.valueOf(this.getRemetente_email());
        Conteudo[78] = String.valueOf(this.getExpedidor_cnpj());
        Conteudo[79] = String.valueOf(this.getExpedidor_cpf());
        Conteudo[80] = String.valueOf(this.getExpedidor_ie());
        Conteudo[81] = String.valueOf(this.getExpedidor_nome());
        Conteudo[82] = String.valueOf(this.getExpedidor_telefone());
        Conteudo[83] = String.valueOf(this.getExpedidor_rua());
        Conteudo[84] = String.valueOf(this.getExpedidor_num());
        Conteudo[85] = String.valueOf(this.getExpedidor_compl());
        Conteudo[86] = String.valueOf(this.getExpedidor_bairro());
        Conteudo[87] = String.valueOf(this.getExpedidor_codigo_municipio());
        Conteudo[88] = String.valueOf(this.getExpedidor_municipio());
        Conteudo[89] = String.valueOf(this.getExpedidor_cep());
        Conteudo[90] = String.valueOf(this.getExpedidor_uf());
        Conteudo[91] = String.valueOf(this.getExpedidor_codigo_pais());
        Conteudo[92] = String.valueOf(this.getExpedidor_pais());
        Conteudo[93] = String.valueOf(this.getExpedidor_email());
        Conteudo[94] = String.valueOf(this.getRecebedor_cnpj());
        Conteudo[95] = String.valueOf(this.getRecebedor_cpf());
        Conteudo[96] = String.valueOf(this.getRecebedor_nome());
        Conteudo[97] = String.valueOf(this.getRecebedor_telefone());
        Conteudo[98] = String.valueOf(this.getRecebedor_rua());
        Conteudo[99] = String.valueOf(this.getRecebedor_num());
        Conteudo[100] = String.valueOf(this.getRecebedor_compl());
        Conteudo[101] = String.valueOf(this.getRecebedor_bairro());
        Conteudo[102] = String.valueOf(this.getRecebedor_codigo_municipio());
        Conteudo[103] = String.valueOf(this.getRecebedor_municipio());
        Conteudo[104] = String.valueOf(this.getRecebedor_cep());
        Conteudo[105] = String.valueOf(this.getRecebedor_uf());
        Conteudo[106] = String.valueOf(this.getRecebedor_codigo_pais());
        Conteudo[107] = String.valueOf(this.getRecebedor_pais());
        Conteudo[108] = String.valueOf(this.getRecebedor_email());
        Conteudo[109] = String.valueOf(this.getRecebedor_ie());
        Conteudo[110] = String.valueOf(this.getDestinatario_cnpj());
        Conteudo[111] = String.valueOf(this.getDestinatario_cpf());
        Conteudo[112] = String.valueOf(this.getDestinatario_ie());
        Conteudo[113] = String.valueOf(this.getDestinatario_nome());
        Conteudo[114] = String.valueOf(this.getDestinatario_telefone());
        Conteudo[115] = String.valueOf(this.getDestinatario_suframa());
        Conteudo[116] = String.valueOf(this.getDestinatario_rua());
        Conteudo[117] = String.valueOf(this.getDestinatario_num());
        Conteudo[118] = String.valueOf(this.getDestinatario_compl());
        Conteudo[119] = String.valueOf(this.getDestinatario_bairro());
        Conteudo[120] = String.valueOf(this.getDestinatario_codigo_municipio());
        Conteudo[121] = String.valueOf(this.getDestinatario_municipio());
        Conteudo[122] = String.valueOf(this.getDestinatario_cep());
        Conteudo[123] = String.valueOf(this.getDestinatario_uf());
        Conteudo[124] = String.valueOf(this.getDestinatario_codigo_pais());
        Conteudo[125] = String.valueOf(this.getDestinatario_nome_pais());
        Conteudo[126] = String.valueOf(this.getDestinatario_email());        
        Conteudo[127] = String.valueOf(this.getPrestacao_valor_total_servico());
        Conteudo[128] = String.valueOf(this.getPrestacao_valor_receber());
        Conteudo[129] = String.valueOf(this.getAliq_icms());
        Conteudo[130] = String.valueOf(this.getBc_icms());
        Conteudo[131] = String.valueOf(this.getValor_icms());
        Conteudo[132] = String.valueOf(this.getAliq_icms_st());
        Conteudo[133] = String.valueOf(this.getBc_icms_st());
        Conteudo[134] = String.valueOf(this.getValor_icms_st());
        Conteudo[135] = String.valueOf(this.getValor_cred_icms());
        Conteudo[136] = String.valueOf(this.getCst());
        Conteudo[137] = String.valueOf(this.getPercentual_reducao_bc());
        Conteudo[138] = String.valueOf(this.getValor_carga());
        Conteudo[139] = String.valueOf(this.getId_prod_predomintante());
        Conteudo[140] = String.valueOf(this.getProd_predominante());
        Conteudo[141] = String.valueOf(this.getOutras_carac_carga());
        Conteudo[142] = String.valueOf(this.getUnidade());
        Conteudo[143] = String.valueOf(this.getTipo_medida());
        Conteudo[144] = String.valueOf(this.getQuantidade_carga());
        Conteudo[145] = String.valueOf(this.getSeguro_responsavel());
        Conteudo[146] = String.valueOf(this.getSeguradora_nome());
        Conteudo[147] = String.valueOf(this.getSeguradora_num_apolice());
        Conteudo[148] = String.valueOf(this.getSeguradora_num_averb());
        Conteudo[149] = String.valueOf(this.getSeguradora_valor_carga());
        Conteudo[150] = String.valueOf(this.getPrevisao_entrega());
        Conteudo[151] = String.valueOf(this.getIndicador_lotacao());
        Conteudo[152] = String.valueOf(this.getCodigo_op_transp());
        Conteudo[153] = String.valueOf(this.getSerie_occ());
        Conteudo[154] = String.valueOf(this.getNum_occ());
        Conteudo[155] = String.valueOf(this.getData_emissao_occ());
        Conteudo[156] = String.valueOf(this.getCnpj_transportadora_occ());
        Conteudo[157] = String.valueOf(this.getIe_occ());
        Conteudo[158] = String.valueOf(this.getUf_occ());
        Conteudo[159] = String.valueOf(this.getTelefone_occ());
        Conteudo[160] = String.valueOf(this.getId_transportadora_occ());
        Conteudo[161] = String.valueOf(this.getId_veiculo());
        Conteudo[162] = String.valueOf(this.getVeiculo_renavam());
        Conteudo[163] = String.valueOf(this.getVeiculo_placa());
        Conteudo[164] = String.valueOf(this.getVeiculo_tara());
        Conteudo[165] = String.valueOf(this.getVeiculo_cap_kg());
        Conteudo[166] = String.valueOf(this.getVeiculo_cap_m3());
        Conteudo[167] = String.valueOf(this.getVeiculo_tipo());
        Conteudo[168] = String.valueOf(this.getVeiculo_tipo_propriedade());
        Conteudo[169] = String.valueOf(this.getVeiculo_tipo_rodado());
        Conteudo[170] = String.valueOf(this.getVeiculo_tipo_carroceria());
        Conteudo[171] = String.valueOf(this.getVeiculo_uf_licenciatura());
        Conteudo[172] = String.valueOf(this.getVeiculo_prop_cpf());
        Conteudo[173] = String.valueOf(this.getVeiculo_prop_cnpj());
        Conteudo[174] = String.valueOf(this.getVeiculo_prop_rntrc());
        Conteudo[175] = String.valueOf(this.getVeiculo_prop_nome());
        Conteudo[176] = String.valueOf(this.getVeiculo_prop_ie());
        Conteudo[177] = String.valueOf(this.getVeiculo_prop_uf());
        Conteudo[178] = String.valueOf(this.getVeiculo_prop_tipo());
        Conteudo[179] = String.valueOf(this.getId());

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
        String SQL = "DELETE FROM conhecimentotransporte_eletronico WHERE id = " + id;
        conexao con = new conexao();
        try {
            con.insert(SQL);
        } catch (Exception ex) {
            System.out.println("Erro ao Deletar CTRC :" + ex.toString());
        }
        con.close();
    }

    public void busca(String id) {
        String SQL = "SELECT * FROM conhecimentotransporte_eletronico WHERE id = " + id;
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
            this.setId_municipio_ini_prest(RS.getString("id_municipio_ini_prest"));
            this.setMunicipio_ini_prest(RS.getString("municipio_ini_prest"));
            this.setUf_municipio_ini_prest(RS.getString("uf_municipio_ini_prest"));
            this.setId_municipio_fim_prest(RS.getString("id_municipio_fim_prest"));
            this.setMunicipio_fim_prest(RS.getString("municipio_fim_prest"));
            this.setUf_id_municipio_fim_prest(RS.getString("uf_id_municipio_fim_prest"));
            this.setRetira(RS.getString("retira"));
            this.setRetira_detalhes(RS.getString("retira_detalhes"));
            this.setTomador_servico(RS.getString("tomador_servico"));
            this.setTomador_cnpj(RS.getString("tomador_cnpj"));
            this.setTomador_cpf(RS.getString("tomador_cpf"));
            this.setTomador_ie(RS.getString("tomador_ie"));
            this.setTomador_nome(RS.getString("tomador_nome"));
            this.setTomador_nome_fant(RS.getString("tomador_nome_fant"));
            this.setTomador_telefone(RS.getString("tomador_telefone"));
            this.setTomador_rua(RS.getString("tomador_rua"));
            this.setTomador_num(RS.getString("tomador_num"));
            this.setTomador_compl(RS.getString("tomador_compl"));
            this.setTomador_bairro(RS.getString("tomador_bairro"));
            this.setTomador_codigo_municipio(RS.getString("tomador_codigo_municipio"));
            this.setTomador_municipio(RS.getString("tomador_municipio"));
            this.setTomador_cep(RS.getString("tomador_cep"));
            this.setTomador_uf(RS.getString("tomador_uf"));
            this.setTomador_codigo_pais(RS.getString("tomador_codigo_pais"));
            this.setTomador_pais(RS.getString("tomador_pais"));
            this.setTomador_email(RS.getString("tomador_email"));
            this.setData_emissao_contingencia(RS.getString("data_emissao_contingencia"));
            this.setJustificativa_contingencia(RS.getString("justificativa_contingencia"));
            this.setEmitente_cnpj(RS.getString("emitente_cnpj"));
            this.setEmitente_ie(RS.getString("emitente_ie"));
            this.setEmitente_nome(RS.getString("emitente_nome"));
            this.setEmitente_nome_fant(RS.getString("emitente_nome_fant"));
            this.setEmitente_rua(RS.getString("emitente_rua"));
            this.setEmitente_num(RS.getString("emitente_num"));
            this.setEmitente_compl(RS.getString("emitente_compl"));
            this.setEmitente_bairro(RS.getString("emitente_bairro"));
            this.setEmitente_codigo_municipio(RS.getString("emitente_codigo_municipio"));
            this.setEmitente_municipio(RS.getString("emitente_municipio"));
            this.setEmitente_cep(RS.getString("emitente_cep"));
            this.setEmitente_uf(RS.getString("emitente_uf"));
            this.setEmitente_telefone(RS.getString("emitente_telefone"));
            this.setRemetente_cnpj(RS.getString("remetente_cnpj"));
            this.setRemetente_cpf(RS.getString("remetente_cpf"));
            this.setRemetente_ie(RS.getString("remetente_ie"));
            this.setRemetente_nome(RS.getString("remetente_nome"));
            this.setRemetente_nome_fant(RS.getString("remetente_nome_fant"));
            this.setRemetente_telefone(RS.getString("remetente_telefone"));
            this.setRemetente_rua(RS.getString("remetente_rua"));
            this.setRemetente_num(RS.getString("remetente_num"));
            this.setRemetente_compl(RS.getString("remetente_compl"));
            this.setRemetente_bairro(RS.getString("remetente_bairro"));
            this.setRemetente_codigo_municipio(RS.getString("remetente_codigo_municipio"));
            this.setRemetente_municipio(RS.getString("remetente_municipio"));
            this.setRemetente_cep(RS.getString("remetente_cep"));
            this.setRemetente_uf(RS.getString("remetente_uf"));
            this.setRemetente_codigo_pais(RS.getString("remetente_codigo_pais"));
            this.setRemetente_pais(RS.getString("remetente_pais"));
            this.setRemetente_email(RS.getString("remetente_email"));
            this.setExpedidor_cnpj(RS.getString("expedidor_cnpj"));
            this.setExpedidor_cpf(RS.getString("expedidor_cpf"));
            this.setExpedidor_ie(RS.getString("expedidor_ie"));
            this.setExpedidor_nome(RS.getString("expedidor_nome"));
            this.setExpedidor_telefone(RS.getString("expedidor_telefone"));
            this.setExpedidor_rua(RS.getString("expedidor_rua"));
            this.setExpedidor_num(RS.getString("expedidor_num"));
            this.setExpedidor_compl(RS.getString("expedidor_compl"));
            this.setExpedidor_bairro(RS.getString("expedidor_bairro"));
            this.setExpedidor_codigo_municipio(RS.getString("expedidor_codigo_municipio"));
            this.setExpedidor_municipio(RS.getString("expedidor_municipio"));
            this.setExpedidor_cep(RS.getString("expedidor_cep"));
            this.setExpedidor_uf(RS.getString("expedidor_uf"));
            this.setExpedidor_codigo_pais(RS.getString("expedidor_codigo_pais"));
            this.setExpedidor_pais(RS.getString("expedidor_pais"));
            this.setExpedidor_email(RS.getString("expedidor_email"));
            this.setRecebedor_cnpj(RS.getString("recebedor_cnpj"));
            this.setRecebedor_cpf(RS.getString("recebedor_cpf"));
            this.setRecebedor_nome(RS.getString("recebedor_nome"));
            this.setRecebedor_telefone(RS.getString("recebedor_telefone"));
            this.setRecebedor_rua(RS.getString("recebedor_rua"));
            this.setRecebedor_num(RS.getString("recebedor_num"));
            this.setRecebedor_compl(RS.getString("recebedor_compl"));
            this.setRecebedor_bairro(RS.getString("recebedor_bairro"));
            this.setRecebedor_codigo_municipio(RS.getString("recebedor_codigo_municipio"));
            this.setRecebedor_municipio(RS.getString("recebedor_municipio"));
            this.setRecebedor_cep(RS.getString("recebedor_cep"));
            this.setRecebedor_uf(RS.getString("recebedor_uf"));
            this.setRecebedor_codigo_pais(RS.getString("recebedor_codigo_pais"));
            this.setRecebedor_pais(RS.getString("recebedor_pais"));
            this.setRecebedor_email(RS.getString("recebedor_email"));
            this.setRecebedor_ie(RS.getString("recebedor_ie"));
            this.setDestinatario_cnpj(RS.getString("destinatario_cnpj"));
            this.setDestinatario_cpf(RS.getString("destinatario_cpf"));
            this.setDestinatario_ie(RS.getString("destinatario_ie"));
            this.setDestinatario_nome(RS.getString("destinatario_nome"));
            this.setDestinatario_telefone(RS.getString("destinatario_telefone"));
            this.setDestinatario_suframa(RS.getString("destinatario_suframa"));
            this.setDestinatario_rua(RS.getString("destinatario_rua"));
            this.setDestinatario_num(RS.getString("destinatario_num"));
            this.setDestinatario_compl(RS.getString("destinatario_compl"));
            this.setDestinatario_bairro(RS.getString("destinatario_bairro"));
            this.setDestinatario_codigo_municipio(RS.getString("destinatario_codigo_municipio"));
            this.setDestinatario_municipio(RS.getString("destinatario_municipio"));
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
            this.setSeguradora_num_apolice(RS.getString("seguradora_num_apolice"));
            this.setSeguradora_num_averb(RS.getString("seguradora_num_averb"));
            this.setSeguradora_valor_carga(RS.getString("seguradora_valor_carga"));
            this.setPrevisao_entrega(RS.getString("previsao_entrega"));
            this.setIndicador_lotacao(RS.getString("indicador_lotacao"));
            this.setCodigo_op_transp(RS.getString("codigo_op_transp"));
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
     * @return the id_municipio_ini_prest
     */
    public String getId_municipio_ini_prest() {
        return id_municipio_ini_prest;
    }

    /**
     * @param id_municipio_ini_prest the id_municipio_ini_prest to set
     */
    public void setId_municipio_ini_prest(String id_municipio_ini_prest) {
        this.id_municipio_ini_prest = id_municipio_ini_prest;
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
     * @return the id_municipio_fim_prest
     */
    public String getId_municipio_fim_prest() {
        return id_municipio_fim_prest;
    }

    /**
     * @param id_municipio_fim_prest the id_municipio_fim_prest to set
     */
    public void setId_municipio_fim_prest(String id_municipio_fim_prest) {
        this.id_municipio_fim_prest = id_municipio_fim_prest;
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
     * @return the uf_id_municipio_fim_prest
     */
    public String getUf_id_municipio_fim_prest() {
        return uf_id_municipio_fim_prest;
    }

    /**
     * @param uf_id_municipio_fim_prest the uf_id_municipio_fim_prest to set
     */
    public void setUf_id_municipio_fim_prest(String uf_id_municipio_fim_prest) {
        this.uf_id_municipio_fim_prest = uf_id_municipio_fim_prest;
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
     * @return the tomador_rua
     */
    public String getTomador_rua() {
        return tomador_rua;
    }

    /**
     * @param tomador_rua the tomador_rua to set
     */
    public void setTomador_rua(String tomador_rua) {
        this.tomador_rua = tomador_rua;
    }

    /**
     * @return the tomador_num
     */
    public String getTomador_num() {
        return tomador_num;
    }

    /**
     * @param tomador_num the tomador_num to set
     */
    public void setTomador_num(String tomador_num) {
        this.tomador_num = tomador_num;
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
     * @return the emitente_rua
     */
    public String getEmitente_rua() {
        return emitente_rua;
    }

    /**
     * @param emitente_rua the emitente_rua to set
     */
    public void setEmitente_rua(String emitente_rua) {
        this.emitente_rua = emitente_rua;
    }

    /**
     * @return the emitente_num
     */
    public String getEmitente_num() {
        return emitente_num;
    }

    /**
     * @param emitente_num the emitente_num to set
     */
    public void setEmitente_num(String emitente_num) {
        this.emitente_num = emitente_num;
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
     * @return the remetente_ie
     */
    public String getRemetente_ie() {
        return remetente_ie;
    }

    /**
     * @param remetente_ie the remetente_ie to set
     */
    public void setRemetente_ie(String remetente_ie) {
        this.remetente_ie = remetente_ie;
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
     * @return the remetente_rua
     */
    public String getRemetente_rua() {
        return remetente_rua;
    }

    /**
     * @param remetente_rua the remetente_rua to set
     */
    public void setRemetente_rua(String remetente_rua) {
        this.remetente_rua = remetente_rua;
    }

    /**
     * @return the remetente_num
     */
    public String getRemetente_num() {
        return remetente_num;
    }

    /**
     * @param remetente_num the remetente_num to set
     */
    public void setRemetente_num(String remetente_num) {
        this.remetente_num = remetente_num;
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
     * @return the remetente_municipio
     */
    public String getRemetente_municipio() {
        return remetente_municipio;
    }

    /**
     * @param remetente_municipio the remetente_municipio to set
     */
    public void setRemetente_municipio(String remetente_municipio) {
        this.remetente_municipio = remetente_municipio;
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
     * @return the expedidor_cnpj
     */
    public String getExpedidor_cnpj() {
        return expedidor_cnpj;
    }

    /**
     * @param expedidor_cnpj the expedidor_cnpj to set
     */
    public void setExpedidor_cnpj(String expedidor_cnpj) {
        this.expedidor_cnpj = expedidor_cnpj;
    }

    /**
     * @return the expedidor_cpf
     */
    public String getExpedidor_cpf() {
        return expedidor_cpf;
    }

    /**
     * @param expedidor_cpf the expedidor_cpf to set
     */
    public void setExpedidor_cpf(String expedidor_cpf) {
        this.expedidor_cpf = expedidor_cpf;
    }

    /**
     * @return the expedidor_ie
     */
    public String getExpedidor_ie() {
        return expedidor_ie;
    }

    /**
     * @param expedidor_ie the expedidor_ie to set
     */
    public void setExpedidor_ie(String expedidor_ie) {
        this.expedidor_ie = expedidor_ie;
    }

    /**
     * @return the expedidor_nome
     */
    public String getExpedidor_nome() {
        return expedidor_nome;
    }

    /**
     * @param expedidor_nome the expedidor_nome to set
     */
    public void setExpedidor_nome(String expedidor_nome) {
        this.expedidor_nome = expedidor_nome;
    }

    /**
     * @return the expedidor_telefone
     */
    public String getExpedidor_telefone() {
        return expedidor_telefone;
    }

    /**
     * @param expedidor_telefone the expedidor_telefone to set
     */
    public void setExpedidor_telefone(String expedidor_telefone) {
        this.expedidor_telefone = expedidor_telefone;
    }

    /**
     * @return the expedidor_rua
     */
    public String getExpedidor_rua() {
        return expedidor_rua;
    }

    /**
     * @param expedidor_rua the expedidor_rua to set
     */
    public void setExpedidor_rua(String expedidor_rua) {
        this.expedidor_rua = expedidor_rua;
    }

    /**
     * @return the expedidor_num
     */
    public String getExpedidor_num() {
        return expedidor_num;
    }

    /**
     * @param expedidor_num the expedidor_num to set
     */
    public void setExpedidor_num(String expedidor_num) {
        this.expedidor_num = expedidor_num;
    }

    /**
     * @return the expedidor_compl
     */
    public String getExpedidor_compl() {
        return expedidor_compl;
    }

    /**
     * @param expedidor_compl the expedidor_compl to set
     */
    public void setExpedidor_compl(String expedidor_compl) {
        this.expedidor_compl = expedidor_compl;
    }

    /**
     * @return the expedidor_bairro
     */
    public String getExpedidor_bairro() {
        return expedidor_bairro;
    }

    /**
     * @param expedidor_bairro the expedidor_bairro to set
     */
    public void setExpedidor_bairro(String expedidor_bairro) {
        this.expedidor_bairro = expedidor_bairro;
    }

    /**
     * @return the expedidor_codigo_municipio
     */
    public String getExpedidor_codigo_municipio() {
        return expedidor_codigo_municipio;
    }

    /**
     * @param expedidor_codigo_municipio the expedidor_codigo_municipio to set
     */
    public void setExpedidor_codigo_municipio(String expedidor_codigo_municipio) {
        this.expedidor_codigo_municipio = expedidor_codigo_municipio;
    }

    /**
     * @return the expedidor_municipio
     */
    public String getExpedidor_municipio() {
        return expedidor_municipio;
    }

    /**
     * @param expedidor_municipio the expedidor_municipio to set
     */
    public void setExpedidor_municipio(String expedidor_municipio) {
        this.expedidor_municipio = expedidor_municipio;
    }

    /**
     * @return the expedidor_cep
     */
    public String getExpedidor_cep() {
        return expedidor_cep;
    }

    /**
     * @param expedidor_cep the expedidor_cep to set
     */
    public void setExpedidor_cep(String expedidor_cep) {
        this.expedidor_cep = expedidor_cep;
    }

    /**
     * @return the expedidor_uf
     */
    public String getExpedidor_uf() {
        return expedidor_uf;
    }

    /**
     * @param expedidor_uf the expedidor_uf to set
     */
    public void setExpedidor_uf(String expedidor_uf) {
        this.expedidor_uf = expedidor_uf;
    }

    /**
     * @return the expedidor_codigo_pais
     */
    public String getExpedidor_codigo_pais() {
        return expedidor_codigo_pais;
    }

    /**
     * @param expedidor_codigo_pais the expedidor_codigo_pais to set
     */
    public void setExpedidor_codigo_pais(String expedidor_codigo_pais) {
        this.expedidor_codigo_pais = expedidor_codigo_pais;
    }

    /**
     * @return the expedidor_pais
     */
    public String getExpedidor_pais() {
        return expedidor_pais;
    }

    /**
     * @param expedidor_pais the expedidor_pais to set
     */
    public void setExpedidor_pais(String expedidor_pais) {
        this.expedidor_pais = expedidor_pais;
    }

    /**
     * @return the expedidor_email
     */
    public String getExpedidor_email() {
        return expedidor_email;
    }

    /**
     * @param expedidor_email the expedidor_email to set
     */
    public void setExpedidor_email(String expedidor_email) {
        this.expedidor_email = expedidor_email;
    }

    /**
     * @return the recebedor_cnpj
     */
    public String getRecebedor_cnpj() {
        return recebedor_cnpj;
    }

    /**
     * @param recebedor_cnpj the recebedor_cnpj to set
     */
    public void setRecebedor_cnpj(String recebedor_cnpj) {
        this.recebedor_cnpj = recebedor_cnpj;
    }

    /**
     * @return the recebedor_cpf
     */
    public String getRecebedor_cpf() {
        return recebedor_cpf;
    }

    /**
     * @param recebedor_cpf the recebedor_cpf to set
     */
    public void setRecebedor_cpf(String recebedor_cpf) {
        this.recebedor_cpf = recebedor_cpf;
    }

    /**
     * @return the recebedor_nome
     */
    public String getRecebedor_nome() {
        return recebedor_nome;
    }

    /**
     * @param recebedor_nome the recebedor_nome to set
     */
    public void setRecebedor_nome(String recebedor_nome) {
        this.recebedor_nome = recebedor_nome;
    }

    /**
     * @return the recebedor_telefone
     */
    public String getRecebedor_telefone() {
        return recebedor_telefone;
    }

    /**
     * @param recebedor_telefone the recebedor_telefone to set
     */
    public void setRecebedor_telefone(String recebedor_telefone) {
        this.recebedor_telefone = recebedor_telefone;
    }

    /**
     * @return the recebedor_rua
     */
    public String getRecebedor_rua() {
        return recebedor_rua;
    }

    /**
     * @param recebedor_rua the recebedor_rua to set
     */
    public void setRecebedor_rua(String recebedor_rua) {
        this.recebedor_rua = recebedor_rua;
    }

    /**
     * @return the recebedor_num
     */
    public String getRecebedor_num() {
        return recebedor_num;
    }

    /**
     * @param recebedor_num the recebedor_num to set
     */
    public void setRecebedor_num(String recebedor_num) {
        this.recebedor_num = recebedor_num;
    }

    /**
     * @return the recebedor_compl
     */
    public String getRecebedor_compl() {
        return recebedor_compl;
    }

    /**
     * @param recebedor_compl the recebedor_compl to set
     */
    public void setRecebedor_compl(String recebedor_compl) {
        this.recebedor_compl = recebedor_compl;
    }

    /**
     * @return the recebedor_bairro
     */
    public String getRecebedor_bairro() {
        return recebedor_bairro;
    }

    /**
     * @param recebedor_bairro the recebedor_bairro to set
     */
    public void setRecebedor_bairro(String recebedor_bairro) {
        this.recebedor_bairro = recebedor_bairro;
    }

    /**
     * @return the recebedor_codigo_municipio
     */
    public String getRecebedor_codigo_municipio() {
        return recebedor_codigo_municipio;
    }

    /**
     * @param recebedor_codigo_municipio the recebedor_codigo_municipio to set
     */
    public void setRecebedor_codigo_municipio(String recebedor_codigo_municipio) {
        this.recebedor_codigo_municipio = recebedor_codigo_municipio;
    }

    /**
     * @return the recebedor_municipio
     */
    public String getRecebedor_municipio() {
        return recebedor_municipio;
    }

    /**
     * @param recebedor_municipio the recebedor_municipio to set
     */
    public void setRecebedor_municipio(String recebedor_municipio) {
        this.recebedor_municipio = recebedor_municipio;
    }

    /**
     * @return the recebedor_cep
     */
    public String getRecebedor_cep() {
        return recebedor_cep;
    }

    /**
     * @param recebedor_cep the recebedor_cep to set
     */
    public void setRecebedor_cep(String recebedor_cep) {
        this.recebedor_cep = recebedor_cep;
    }

    /**
     * @return the recebedor_uf
     */
    public String getRecebedor_uf() {
        return recebedor_uf;
    }

    /**
     * @param recebedor_uf the recebedor_uf to set
     */
    public void setRecebedor_uf(String recebedor_uf) {
        this.recebedor_uf = recebedor_uf;
    }

    /**
     * @return the recebedor_codigo_pais
     */
    public String getRecebedor_codigo_pais() {
        return recebedor_codigo_pais;
    }

    /**
     * @param recebedor_codigo_pais the recebedor_codigo_pais to set
     */
    public void setRecebedor_codigo_pais(String recebedor_codigo_pais) {
        this.recebedor_codigo_pais = recebedor_codigo_pais;
    }

    /**
     * @return the recebedor_pais
     */
    public String getRecebedor_pais() {
        return recebedor_pais;
    }

    /**
     * @param recebedor_pais the recebedor_pais to set
     */
    public void setRecebedor_pais(String recebedor_pais) {
        this.recebedor_pais = recebedor_pais;
    }

    /**
     * @return the recebedor_email
     */
    public String getRecebedor_email() {
        return recebedor_email;
    }

    /**
     * @param recebedor_email the recebedor_email to set
     */
    public void setRecebedor_email(String recebedor_email) {
        this.recebedor_email = recebedor_email;
    }

    /**
     * @return the recebedor_ie
     */
    public String getRecebedor_ie() {
        return recebedor_ie;
    }

    /**
     * @param recebedor_ie the recebedor_ie to set
     */
    public void setRecebedor_ie(String recebedor_ie) {
        this.recebedor_ie = recebedor_ie;
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
     * @return the destinatario_ie
     */
    public String getDestinatario_ie() {
        return destinatario_ie;
    }

    /**
     * @param destinatario_ie the destinatario_ie to set
     */
    public void setDestinatario_ie(String destinatario_ie) {
        this.destinatario_ie = destinatario_ie;
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
     * @return the destinatario_rua
     */
    public String getDestinatario_rua() {
        return destinatario_rua;
    }

    /**
     * @param destinatario_rua the destinatario_rua to set
     */
    public void setDestinatario_rua(String destinatario_rua) {
        this.destinatario_rua = destinatario_rua;
    }

    /**
     * @return the destinatario_num
     */
    public String getDestinatario_num() {
        return destinatario_num;
    }

    /**
     * @param destinatario_num the destinatario_num to set
     */
    public void setDestinatario_num(String destinatario_num) {
        this.destinatario_num = destinatario_num;
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
     * @return the destinatario_municipio
     */
    public String getDestinatario_municipio() {
        return destinatario_municipio;
    }

    /**
     * @param destinatario_municipio the destinatario_municipio to set
     */
    public void setDestinatario_municipio(String destinatario_municipio) {
        this.destinatario_municipio = destinatario_municipio;
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
     * @return the seguradora_num_apolice
     */
    public String getSeguradora_num_apolice() {
        return seguradora_num_apolice;
    }

    /**
     * @param seguradora_num_apolice the seguradora_num_apolice to set
     */
    public void setSeguradora_num_apolice(String seguradora_num_apolice) {
        this.seguradora_num_apolice = seguradora_num_apolice;
    }

    /**
     * @return the seguradora_num_averb
     */
    public String getSeguradora_num_averb() {
        return seguradora_num_averb;
    }

    /**
     * @param seguradora_num_averb the seguradora_num_averb to set
     */
    public void setSeguradora_num_averb(String seguradora_num_averb) {
        this.seguradora_num_averb = seguradora_num_averb;
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
