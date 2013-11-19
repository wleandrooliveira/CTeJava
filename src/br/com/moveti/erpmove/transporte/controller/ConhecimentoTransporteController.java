/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.controller;

import crncomp.conexao;
import java.sql.ResultSet;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
public class ConhecimentoTransporteController {

    public int gravar() {
        //1 - erro na gravação
        //0 - sucesso na gravação
        String SQL;
        String Conteudo[] = new String[179];
        conexao con = null;
        ResultSet RS = null;
        SQL = "INSERT INTO conhecimentotransporte_eletronico (id_nota_fiscal,numero_nfe,chaveAcesso_nfe,chaveAcessoCte,cfop,natureza_operacao,modelo,serie,numeroCte,data_emissao,hora_emissao,"
                + "tipo_emissao,tipo_impressao,tipoCte,indicador_emissao,idMunicipio_envio,municipio_envio,uf_envio,modal,tipo_servico,idMunicipio_ini_prest,municipio_ini_prest,"
                + "ufMunicipio_ini_prest,idMunicipio_fim_prest,municipio_fim_prest,uf_idMunicipio_fim_prest,retira,retira_detalhes,tomador_servico,tomadorCnpj,tomadorCpf,tomador_ie,"
                + "tomador_nome,tomador_nome_fant,tomadorTelefone,tomador_rua,tomador_num,tomadorCompl,tomadorBairro,tomadorCodigoMunicipio,tomadorMunicipio,tomadorCep,tomador_uf,"
                + "tomadorCodigo_pais,tomador_pais,tomador_email,data_emissaoContingencia,justificativaContingencia,emitenteCnpj,emitente_ie,emitente_nome,emitente_nome_fant,emitente_rua,emitente_num,emitenteCompl,"
                + "emitenteBairro,emitenteCodigoMunicipio,emitenteMunicipio,emitenteCep,emitente_uf,emitenteTelefone,remetenteCnpj,remetenteCpf,remetente_ie,remetente_nome,"
                + "remetente_nome_fant,remetenteTelefone,remetente_rua,remetente_num,"
                + "remetenteCompl,remetenteBairro,remetenteCodigoMunicipio,remetenteMunicipio,remetenteCep,"
                + "remetente_uf,remetenteCodigo_pais,remetente_pais,remetente_email,expedidorCnpj,expedidorCpf,expedidor_ie,expedidor_nome,expedidorTelefone,expedidor_rua,expedidor_num,"
                + "expedidorCompl,expedidorBairro,expedidorCodigoMunicipio,expedidorMunicipio,expedidorCep,expedidor_uf,expedidorCodigo_pais,expedidor_pais,expedidor_email,"
                + "recebedorCnpj,recebedorCpf,recebedor_nome,recebedorTelefone,recebedor_rua,recebedor_num,recebedorCompl,recebedorBairro,recebedorCodigoMunicipio,recebedorMunicipio,"
                + "recebedorCep,recebedor_uf,recebedorCodigo_pais,recebedor_pais,recebedor_email,recebedor_ie,destinatarioCnpj,destinatarioCpf,destinatario_ie,destinatario_nome,"
                + "destinatarioTelefone,destinatario_suframa,destinatario_rua,destinatario_num,destinatarioCompl,destinatarioBairro,destinatarioCodigoMunicipio,destinatarioMunicipio,"
                + "destinatarioCep,destinatario_uf,destinatarioCodigo_pais,destinatario_nome_pais,destinatario_email,prestacao_valorTotal_servico,prestacao_valor_receber,aliq_icms,bc_icms,valor_icms,aliq_icms_st,"
                + "bc_icms_st,valor_icms_st,valorCred_icms,cst,percentual_reducaoBc,valorCarga,id_prod_predomintante,prod_predominante,outrasCaracCarga,unidade,tipoMedida,quantidadeCarga,"
                + "seguro_responsavel,seguradora_nome,seguradora_numApolice,seguradora_numAverb,seguradora_valorCarga,previsao_entrega,indicador_lotacao,codigo_opTransp,serie_occ,num_occ,"
                + "data_emissao_occ,cnpjTransportadora_occ,ie_occ,uf_occ,telefone_occ,idTransportadora_occ,id_veiculo,veiculo_renavam,veiculo_placa,veiculoTara,veiculoCap_kg,veiculoCapM3,"
                + "veiculoTipo,veiculoTipo_propriedade,veiculoTipo_rodado,veiculoTipoCarroceria,veiculo_uf_licenciatura,veiculo_propCpf,veiculo_propCnpj,veiculo_prop_rntrc,veiculo_prop_nome,"
                + "veiculo_prop_ie,veiculo_prop_uf,veiculo_propTipo) VALUES ()";

//        Conteudo[0] = String.valueOf(this.getId_nota_fiscal());
//        Conteudo[1] = String.valueOf(this.getNumero_nfe());
//        Conteudo[2] = String.valueOf(this.getChaveAcesso_nfe());
//        Conteudo[3] = String.valueOf(this.getChaveAcessoCte());
//        Conteudo[4] = String.valueOf(this.getCfop());
//        Conteudo[5] = String.valueOf(this.getNatureza_operacao());
//        Conteudo[6] = String.valueOf(this.getModelo());
//        Conteudo[7] = String.valueOf(this.getSerie());
//        Conteudo[8] = String.valueOf(this.getNumeroCte());
//        Conteudo[9] = String.valueOf(this.getData_emissao());
//        Conteudo[10] = String.valueOf(this.getHora_emissao());
//        Conteudo[11] = String.valueOf(this.getTipo_emissao());
//        Conteudo[12] = String.valueOf(this.getTipo_impressao());
//        Conteudo[13] = String.valueOf(this.getTipoCte());
//        Conteudo[14] = String.valueOf(this.getIndicador_emissao());
//        Conteudo[15] = String.valueOf(this.getIdMunicipio_envio());
//        Conteudo[16] = String.valueOf(this.getMunicipio_envio());
//        Conteudo[17] = String.valueOf(this.getUf_envio());
//        Conteudo[18] = String.valueOf(this.getModal());
//        Conteudo[19] = String.valueOf(this.getTipo_servico());
//        Conteudo[20] = String.valueOf(this.getIdMunicipio_ini_prest());
//        Conteudo[21] = String.valueOf(this.getMunicipio_ini_prest());
//        Conteudo[22] = String.valueOf(this.getUfMunicipio_ini_prest());
//        Conteudo[23] = String.valueOf(this.getIdMunicipio_fim_prest());
//        Conteudo[24] = String.valueOf(this.getMunicipio_fim_prest());
//        Conteudo[25] = String.valueOf(this.getUf_idMunicipio_fim_prest());
//        Conteudo[26] = String.valueOf(this.getRetira());
//        Conteudo[27] = String.valueOf(this.getRetira_detalhes());
//        Conteudo[28] = String.valueOf(this.getTomador_servico());
//        Conteudo[29] = String.valueOf(this.getTomadorCnpj());
//        Conteudo[30] = String.valueOf(this.getTomadorCpf());
//        Conteudo[31] = String.valueOf(this.getTomador_ie());
//        Conteudo[32] = String.valueOf(this.getTomador_nome());
//        Conteudo[33] = String.valueOf(this.getTomador_nome_fant());
//        Conteudo[34] = String.valueOf(this.getTomadorTelefone());
//        Conteudo[35] = String.valueOf(this.getTomador_rua());
//        Conteudo[36] = String.valueOf(this.getTomador_num());
//        Conteudo[37] = String.valueOf(this.getTomadorCompl());
//        Conteudo[38] = String.valueOf(this.getTomadorBairro());
//        Conteudo[39] = String.valueOf(this.getTomadorCodigoMunicipio());
//        Conteudo[40] = String.valueOf(this.getTomadorMunicipio());
//        Conteudo[41] = String.valueOf(this.getTomadorCep());
//        Conteudo[42] = String.valueOf(this.getTomador_uf());
//        Conteudo[43] = String.valueOf(this.getTomadorCodigo_pais());
//        Conteudo[44] = String.valueOf(this.getTomador_pais());
//        Conteudo[45] = String.valueOf(this.getTomador_email());
//        Conteudo[46] = String.valueOf(this.getData_emissaoContingencia());
//        Conteudo[47] = String.valueOf(this.getJustificativaContingencia());
//        Conteudo[48] = String.valueOf(this.getEmitenteCnpj());
//        Conteudo[49] = String.valueOf(this.getEmitente_ie());
//        Conteudo[50] = String.valueOf(this.getEmitente_nome());
//        Conteudo[51] = String.valueOf(this.getEmitente_nome_fant());
//        Conteudo[52] = String.valueOf(this.getEmitente_rua());
//        Conteudo[53] = String.valueOf(this.getEmitente_num());
//        Conteudo[54] = String.valueOf(this.getEmitenteCompl());
//        Conteudo[55] = String.valueOf(this.getEmitenteBairro());
//        Conteudo[56] = String.valueOf(this.getEmitenteCodigoMunicipio());
//        Conteudo[57] = String.valueOf(this.getEmitenteMunicipio());
//        Conteudo[58] = String.valueOf(this.getEmitenteCep());
//        Conteudo[59] = String.valueOf(this.getEmitente_uf());
//        Conteudo[60] = String.valueOf(this.getEmitenteTelefone());
//        Conteudo[61] = String.valueOf(this.getRemetenteCnpj());
//        Conteudo[62] = String.valueOf(this.getRemetenteCpf());
//        Conteudo[63] = String.valueOf(this.getRemetente_ie());
//        Conteudo[64] = String.valueOf(this.getRemetente_nome());
//        Conteudo[65] = String.valueOf(this.getRemetente_nome_fant());
//        Conteudo[66] = String.valueOf(this.getRemetenteTelefone());
//        Conteudo[67] = String.valueOf(this.getRemetente_rua());
//        Conteudo[68] = String.valueOf(this.getRemetente_num());
//        Conteudo[69] = String.valueOf(this.getRemetenteCompl());
//        Conteudo[70] = String.valueOf(this.getRemetenteBairro());
//        Conteudo[71] = String.valueOf(this.getRemetenteCodigoMunicipio());
//        Conteudo[72] = String.valueOf(this.getRemetenteMunicipio());
//        Conteudo[73] = String.valueOf(this.getRemetenteCep());
//        Conteudo[74] = String.valueOf(this.getRemetente_uf());
//        Conteudo[75] = String.valueOf(this.getRemetenteCodigo_pais());
//        Conteudo[76] = String.valueOf(this.getRemetente_pais());
//        Conteudo[77] = String.valueOf(this.getRemetente_email());
//        Conteudo[78] = String.valueOf(this.getExpedidorCnpj());
//        Conteudo[79] = String.valueOf(this.getExpedidorCpf());
//        Conteudo[80] = String.valueOf(this.getExpedidor_ie());
//        Conteudo[81] = String.valueOf(this.getExpedidor_nome());
//        Conteudo[82] = String.valueOf(this.getExpedidorTelefone());
//        Conteudo[83] = String.valueOf(this.getExpedidor_rua());
//        Conteudo[84] = String.valueOf(this.getExpedidor_num());
//        Conteudo[85] = String.valueOf(this.getExpedidorCompl());
//        Conteudo[86] = String.valueOf(this.getExpedidorBairro());
//        Conteudo[87] = String.valueOf(this.getExpedidorCodigoMunicipio());
//        Conteudo[88] = String.valueOf(this.getExpedidorMunicipio());
//        Conteudo[89] = String.valueOf(this.getExpedidorCep());
//        Conteudo[90] = String.valueOf(this.getExpedidor_uf());
//        Conteudo[91] = String.valueOf(this.getExpedidorCodigo_pais());
//        Conteudo[92] = String.valueOf(this.getExpedidor_pais());
//        Conteudo[93] = String.valueOf(this.getExpedidor_email());
//        Conteudo[94] = String.valueOf(this.getRecebedorCnpj());
//        Conteudo[95] = String.valueOf(this.getRecebedorCpf());
//        Conteudo[96] = String.valueOf(this.getRecebedor_nome());
//        Conteudo[97] = String.valueOf(this.getRecebedorTelefone());
//        Conteudo[98] = String.valueOf(this.getRecebedor_rua());
//        Conteudo[99] = String.valueOf(this.getRecebedor_num());
//        Conteudo[100] = String.valueOf(this.getRecebedorCompl());
//        Conteudo[101] = String.valueOf(this.getRecebedorBairro());
//        Conteudo[102] = String.valueOf(this.getRecebedorCodigoMunicipio());
//        Conteudo[103] = String.valueOf(this.getRecebedorMunicipio());
//        Conteudo[104] = String.valueOf(this.getRecebedorCep());
//        Conteudo[105] = String.valueOf(this.getRecebedor_uf());
//        Conteudo[106] = String.valueOf(this.getRecebedorCodigo_pais());
//        Conteudo[107] = String.valueOf(this.getRecebedor_pais());
//        Conteudo[108] = String.valueOf(this.getRecebedor_email());
//        Conteudo[109] = String.valueOf(this.getRecebedor_ie());
//        Conteudo[110] = String.valueOf(this.getDestinatarioCnpj());
//        Conteudo[111] = String.valueOf(this.getDestinatarioCpf());
//        Conteudo[112] = String.valueOf(this.getDestinatario_ie());
//        Conteudo[113] = String.valueOf(this.getDestinatario_nome());
//        Conteudo[114] = String.valueOf(this.getDestinatarioTelefone());
//        Conteudo[115] = String.valueOf(this.getDestinatario_suframa());
//        Conteudo[116] = String.valueOf(this.getDestinatario_rua());
//        Conteudo[117] = String.valueOf(this.getDestinatario_num());
//        Conteudo[118] = String.valueOf(this.getDestinatarioCompl());
//        Conteudo[119] = String.valueOf(this.getDestinatarioBairro());
//        Conteudo[120] = String.valueOf(this.getDestinatarioCodigoMunicipio());
//        Conteudo[121] = String.valueOf(this.getDestinatarioMunicipio());
//        Conteudo[122] = String.valueOf(this.getDestinatarioCep());
//        Conteudo[123] = String.valueOf(this.getDestinatario_uf());
//        Conteudo[124] = String.valueOf(this.getDestinatarioCodigo_pais());
//        Conteudo[125] = String.valueOf(this.getDestinatario_nome_pais());
//        Conteudo[126] = String.valueOf(this.getDestinatario_email());
//        Conteudo[127] = String.valueOf(this.getPrestacao_valorTotal_servico());
//        Conteudo[128] = String.valueOf(this.getPrestacao_valor_receber());
//        Conteudo[129] = String.valueOf(this.getAliq_icms());
//        Conteudo[130] = String.valueOf(this.getBc_icms());
//        Conteudo[131] = String.valueOf(this.getValor_icms());
//        Conteudo[132] = String.valueOf(this.getAliq_icms_st());
//        Conteudo[133] = String.valueOf(this.getBc_icms_st());
//        Conteudo[134] = String.valueOf(this.getValor_icms_st());
//        Conteudo[135] = String.valueOf(this.getValorCred_icms());
//        Conteudo[136] = String.valueOf(this.getCst());
//        Conteudo[137] = String.valueOf(this.getPercentual_reducaoBc());
//        Conteudo[138] = String.valueOf(this.getValorCarga());
//        Conteudo[139] = String.valueOf(this.getId_prod_predomintante());
//        Conteudo[140] = String.valueOf(this.getProd_predominante());
//        Conteudo[141] = String.valueOf(this.getOutrasCaracCarga());
//        Conteudo[142] = String.valueOf(this.getUnidade());
//        Conteudo[143] = String.valueOf(this.getTipoMedida());
//        Conteudo[144] = String.valueOf(this.getQuantidadeCarga());
//        Conteudo[145] = String.valueOf(this.getSeguro_responsavel());
//        Conteudo[146] = String.valueOf(this.getSeguradora_nome());
//        Conteudo[147] = String.valueOf(this.getSeguradora_numApolice());
//        Conteudo[148] = String.valueOf(this.getSeguradora_numAverb());
//        Conteudo[149] = String.valueOf(this.getSeguradora_valorCarga());
//        Conteudo[150] = String.valueOf(this.getPrevisao_entrega());
//        Conteudo[151] = String.valueOf(this.getIndicador_lotacao());
//        Conteudo[152] = String.valueOf(this.getCodigo_opTransp());
//        Conteudo[153] = String.valueOf(this.getSerie_occ());
//        Conteudo[154] = String.valueOf(this.getNum_occ());
//        Conteudo[155] = String.valueOf(this.getData_emissao_occ());
//        Conteudo[156] = String.valueOf(this.getCnpjTransportadora_occ());
//        Conteudo[157] = String.valueOf(this.getIe_occ());
//        Conteudo[158] = String.valueOf(this.getUf_occ());
//        Conteudo[159] = String.valueOf(this.getTelefone_occ());
//        Conteudo[160] = String.valueOf(this.getIdTransportadora_occ());
//        Conteudo[161] = String.valueOf(this.getId_veiculo());
//        Conteudo[162] = String.valueOf(this.getVeiculo_renavam());
//        Conteudo[163] = String.valueOf(this.getVeiculo_placa());
//        Conteudo[164] = String.valueOf(this.getVeiculoTara());
//        Conteudo[165] = String.valueOf(this.getVeiculoCap_kg());
//        Conteudo[166] = String.valueOf(this.getVeiculoCapM3());
//        Conteudo[167] = String.valueOf(this.getVeiculoTipo());
//        Conteudo[168] = String.valueOf(this.getVeiculoTipo_propriedade());
//        Conteudo[169] = String.valueOf(this.getVeiculoTipo_rodado());
//        Conteudo[170] = String.valueOf(this.getVeiculoTipoCarroceria());
//        Conteudo[171] = String.valueOf(this.getVeiculo_uf_licenciatura());
//        Conteudo[172] = String.valueOf(this.getVeiculo_propCpf());
//        Conteudo[173] = String.valueOf(this.getVeiculo_propCnpj());
//        Conteudo[174] = String.valueOf(this.getVeiculo_prop_rntrc());
//        Conteudo[175] = String.valueOf(this.getVeiculo_prop_nome());
//        Conteudo[176] = String.valueOf(this.getVeiculo_prop_ie());
//        Conteudo[177] = String.valueOf(this.getVeiculo_prop_uf());
//        Conteudo[178] = String.valueOf(this.getVeiculo_propTipo());

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

        SQL = "UPDATE conhecimentotransporte_eletronico SET id_nota_fiscal = ?, numero_nfe = ?, chaveAcesso_nfe = ?, chaveAcessoCte = ?, cfop = ?, natureza_operacao = ?, modelo = ?, serie = ?, numeroCte = ?, data_emissao = ?, hora_emissao = ?, "
                + "tipo_emissao = ?, tipo_impressao = ?, tipoCte = ?, indicador_emissao = ?, idMunicipio_envio = ?, municipio_envio = ?, uf_envio = ?, modal = ?, tipo_servico = ?, idMunicipio_ini_prest = ?, municipio_ini_prest = ?, "
                + "ufMunicipio_ini_prest = ?, idMunicipio_fim_prest = ?, municipio_fim_prest = ?, uf_idMunicipio_fim_prest = ?, retira = ?, retira_detalhes = ?, tomador_servico = ?, tomadorCnpj = ?, tomadorCpf = ?, tomador_ie = ?, "
                + "tomador_nome = ?, tomador_nome_fant = ?, tomadorTelefone = ?, tomador_rua = ?, tomador_num = ?, tomadorCompl = ?, tomadorBairro = ?, tomadorCodigoMunicipio = ?, tomadorMunicipio = ?, tomadorCep = ?, tomador_uf = ?, "
                + "tomadorCodigo_pais = ?, tomador_pais = ?, tomador_email = ?, data_emissaoContingencia = ?, justificativaContingencia = ?, emitenteCnpj = ?, emitente_ie = ?, emitente_nome = ?, emitente_nome_fant = ?, emitente_rua = ?, emitente_num = ?, emitenteCompl = ?, "
                + "emitenteBairro = ?, emitenteCodigoMunicipio = ?, emitenteMunicipio = ?, emitenteCep = ?, emitente_uf = ?, emitenteTelefone = ?, remetenteCnpj = ?, remetenteCpf = ?, remetente_ie = ?, remetente_nome = ?, "
                + "remetente_nome_fant = ?, remetenteTelefone = ?, remetente_rua = ?, remetente_num = ?, "
                + "remetenteCompl = ?, remetenteBairro = ?, remetenteCodigoMunicipio = ?, remetenteMunicipio = ?, remetenteCep = ?, "
                + "remetente_uf = ?, remetenteCodigo_pais = ?, remetente_pais = ?, remetente_email = ?, expedidorCnpj = ?, expedidorCpf = ?, expedidor_ie = ?, expedidor_nome = ?, expedidorTelefone = ?, expedidor_rua = ?, expedidor_num = ?, "
                + "expedidorCompl = ?, expedidorBairro = ?, expedidorCodigoMunicipio = ?, expedidorMunicipio = ?, expedidorCep = ?, expedidor_uf = ?, expedidorCodigo_pais = ?, expedidor_pais = ?, expedidor_email = ?, "
                + "recebedorCnpj = ?, recebedorCpf = ?, recebedor_nome = ?, recebedorTelefone = ?, recebedor_rua = ?, recebedor_num = ?, recebedorCompl = ?, recebedorBairro = ?, recebedorCodigoMunicipio = ?, recebedorMunicipio = ?, "
                + "recebedorCep = ?, recebedor_uf = ?, recebedorCodigo_pais = ?, recebedor_pais = ?, recebedor_email = ?, recebedor_ie = ?, destinatarioCnpj = ?, destinatarioCpf = ?, destinatario_ie = ?, destinatario_nome = ?, "
                + "destinatarioTelefone = ?, destinatario_suframa = ?, destinatario_rua = ?, destinatario_num = ?, destinatarioCompl = ?, destinatarioBairro = ?, destinatarioCodigoMunicipio = ?, destinatarioMunicipio = ?, "
                + "destinatarioCep = ?, destinatario_uf = ?, destinatarioCodigo_pais = ?, destinatario_nome_pais = ?, destinatario_email = ?, prestacao_valorTotal_servico = ?, prestacao_valor_receber = ?, aliq_icms = ?, bc_icms = ?, valor_icms = ?, aliq_icms_st = ?, "
                + "bc_icms_st = ?, valor_icms_st = ?, valorCred_icms = ?, cst = ?, percentual_reducaoBc = ?, valorCarga = ?, id_prod_predomintante = ?, prod_predominante = ?, outrasCaracCarga = ?, unidade = ?, tipoMedida = ?, quantidadeCarga = ?, "
                + "seguro_responsavel = ?, seguradora_nome = ?, seguradora_numApolice = ?, seguradora_numAverb = ?, seguradora_valorCarga = ?, previsao_entrega = ?, indicador_lotacao = ?, codigo_opTransp = ?, serie_occ = ?, num_occ = ?, "
                + "data_emissao_occ = ?, cnpjTransportadora_occ = ?, ie_occ = ?, uf_occ = ?, telefone_occ = ?, idTransportadora_occ = ?, id_veiculo = ?, veiculo_renavam = ?, veiculo_placa = ?, veiculoTara = ?, veiculoCap_kg = ?, veiculoCapM3 = ?, "
                + "veiculoTipo = ?, veiculoTipo_propriedade = ?, veiculoTipo_rodado = ?, veiculoTipoCarroceria = ?, veiculo_uf_licenciatura = ?, veiculo_propCpf = ?, veiculo_propCnpj = ?, veiculo_prop_rntrc = ?, veiculo_prop_nome = ?, "
                + "veiculo_prop_ie = ?, veiculo_prop_uf = ?, veiculo_propTipo = ? "
                + "WHERE id = " + getId();

//        Conteudo[0] = String.valueOf(this.getId_nota_fiscal());
//        Conteudo[1] = String.valueOf(this.getNumero_nfe());
//        Conteudo[2] = String.valueOf(this.getChaveAcesso_nfe());
//        Conteudo[3] = String.valueOf(this.getChaveAcessoCte());
//        Conteudo[4] = String.valueOf(this.getCfop());
//        Conteudo[5] = String.valueOf(this.getNatureza_operacao());
//        Conteudo[6] = String.valueOf(this.getModelo());
//        Conteudo[7] = String.valueOf(this.getSerie());
//        Conteudo[8] = String.valueOf(this.getNumeroCte());
//        Conteudo[9] = String.valueOf(this.getData_emissao());
//        Conteudo[10] = String.valueOf(this.getHora_emissao());
//        Conteudo[11] = String.valueOf(this.getTipo_emissao());
//        Conteudo[12] = String.valueOf(this.getTipo_impressao());
//        Conteudo[13] = String.valueOf(this.getTipoCte());
//        Conteudo[14] = String.valueOf(this.getIndicador_emissao());
//        Conteudo[15] = String.valueOf(this.getIdMunicipio_envio());
//        Conteudo[16] = String.valueOf(this.getMunicipio_envio());
//        Conteudo[17] = String.valueOf(this.getUf_envio());
//        Conteudo[18] = String.valueOf(this.getModal());
//        Conteudo[19] = String.valueOf(this.getTipo_servico());
//        Conteudo[20] = String.valueOf(this.getIdMunicipio_ini_prest());
//        Conteudo[21] = String.valueOf(this.getMunicipio_ini_prest());
//        Conteudo[22] = String.valueOf(this.getUfMunicipio_ini_prest());
//        Conteudo[23] = String.valueOf(this.getIdMunicipio_fim_prest());
//        Conteudo[24] = String.valueOf(this.getMunicipio_fim_prest());
//        Conteudo[25] = String.valueOf(this.getUf_idMunicipio_fim_prest());
//        Conteudo[26] = String.valueOf(this.getRetira());
//        Conteudo[27] = String.valueOf(this.getRetira_detalhes());
//        Conteudo[28] = String.valueOf(this.getTomador_servico());
//        Conteudo[29] = String.valueOf(this.getTomadorCnpj());
//        Conteudo[30] = String.valueOf(this.getTomadorCpf());
//        Conteudo[31] = String.valueOf(this.getTomador_ie());
//        Conteudo[32] = String.valueOf(this.getTomador_nome());
//        Conteudo[33] = String.valueOf(this.getTomador_nome_fant());
//        Conteudo[34] = String.valueOf(this.getTomadorTelefone());
//        Conteudo[35] = String.valueOf(this.getTomador_rua());
//        Conteudo[36] = String.valueOf(this.getTomador_num());
//        Conteudo[37] = String.valueOf(this.getTomadorCompl());
//        Conteudo[38] = String.valueOf(this.getTomadorBairro());
//        Conteudo[39] = String.valueOf(this.getTomadorCodigoMunicipio());
//        Conteudo[40] = String.valueOf(this.getTomadorMunicipio());
//        Conteudo[41] = String.valueOf(this.getTomadorCep());
//        Conteudo[42] = String.valueOf(this.getTomador_uf());
//        Conteudo[43] = String.valueOf(this.getTomadorCodigo_pais());
//        Conteudo[44] = String.valueOf(this.getTomador_pais());
//        Conteudo[45] = String.valueOf(this.getTomador_email());
//        Conteudo[46] = String.valueOf(this.getData_emissaoContingencia());
//        Conteudo[47] = String.valueOf(this.getJustificativaContingencia());
//        Conteudo[48] = String.valueOf(this.getEmitenteCnpj());
//        Conteudo[49] = String.valueOf(this.getEmitente_ie());
//        Conteudo[50] = String.valueOf(this.getEmitente_nome());
//        Conteudo[51] = String.valueOf(this.getEmitente_nome_fant());
//        Conteudo[52] = String.valueOf(this.getEmitente_rua());
//        Conteudo[53] = String.valueOf(this.getEmitente_num());
//        Conteudo[54] = String.valueOf(this.getEmitenteCompl());
//        Conteudo[55] = String.valueOf(this.getEmitenteBairro());
//        Conteudo[56] = String.valueOf(this.getEmitenteCodigoMunicipio());
//        Conteudo[57] = String.valueOf(this.getEmitenteMunicipio());
//        Conteudo[58] = String.valueOf(this.getEmitenteCep());
//        Conteudo[59] = String.valueOf(this.getEmitente_uf());
//        Conteudo[60] = String.valueOf(this.getEmitenteTelefone());
//        Conteudo[61] = String.valueOf(this.getRemetenteCnpj());
//        Conteudo[62] = String.valueOf(this.getRemetenteCpf());
//        Conteudo[63] = String.valueOf(this.getRemetente_ie());
//        Conteudo[64] = String.valueOf(this.getRemetente_nome());
//        Conteudo[65] = String.valueOf(this.getRemetente_nome_fant());
//        Conteudo[66] = String.valueOf(this.getRemetenteTelefone());
//        Conteudo[67] = String.valueOf(this.getRemetente_rua());
//        Conteudo[68] = String.valueOf(this.getRemetente_num());
//        Conteudo[69] = String.valueOf(this.getRemetenteCompl());
//        Conteudo[70] = String.valueOf(this.getRemetenteBairro());
//        Conteudo[71] = String.valueOf(this.getRemetenteCodigoMunicipio());
//        Conteudo[72] = String.valueOf(this.getRemetenteMunicipio());
//        Conteudo[73] = String.valueOf(this.getRemetenteCep());
//        Conteudo[74] = String.valueOf(this.getRemetente_uf());
//        Conteudo[75] = String.valueOf(this.getRemetenteCodigo_pais());
//        Conteudo[76] = String.valueOf(this.getRemetente_pais());
//        Conteudo[77] = String.valueOf(this.getRemetente_email());
//        Conteudo[78] = String.valueOf(this.getExpedidorCnpj());
//        Conteudo[79] = String.valueOf(this.getExpedidorCpf());
//        Conteudo[80] = String.valueOf(this.getExpedidor_ie());
//        Conteudo[81] = String.valueOf(this.getExpedidor_nome());
//        Conteudo[82] = String.valueOf(this.getExpedidorTelefone());
//        Conteudo[83] = String.valueOf(this.getExpedidor_rua());
//        Conteudo[84] = String.valueOf(this.getExpedidor_num());
//        Conteudo[85] = String.valueOf(this.getExpedidorCompl());
//        Conteudo[86] = String.valueOf(this.getExpedidorBairro());
//        Conteudo[87] = String.valueOf(this.getExpedidorCodigoMunicipio());
//        Conteudo[88] = String.valueOf(this.getExpedidorMunicipio());
//        Conteudo[89] = String.valueOf(this.getExpedidorCep());
//        Conteudo[90] = String.valueOf(this.getExpedidor_uf());
//        Conteudo[91] = String.valueOf(this.getExpedidorCodigo_pais());
//        Conteudo[92] = String.valueOf(this.getExpedidor_pais());
//        Conteudo[93] = String.valueOf(this.getExpedidor_email());
//        Conteudo[94] = String.valueOf(this.getRecebedorCnpj());
//        Conteudo[95] = String.valueOf(this.getRecebedorCpf());
//        Conteudo[96] = String.valueOf(this.getRecebedor_nome());
//        Conteudo[97] = String.valueOf(this.getRecebedorTelefone());
//        Conteudo[98] = String.valueOf(this.getRecebedor_rua());
//        Conteudo[99] = String.valueOf(this.getRecebedor_num());
//        Conteudo[100] = String.valueOf(this.getRecebedorCompl());
//        Conteudo[101] = String.valueOf(this.getRecebedorBairro());
//        Conteudo[102] = String.valueOf(this.getRecebedorCodigoMunicipio());
//        Conteudo[103] = String.valueOf(this.getRecebedorMunicipio());
//        Conteudo[104] = String.valueOf(this.getRecebedorCep());
//        Conteudo[105] = String.valueOf(this.getRecebedor_uf());
//        Conteudo[106] = String.valueOf(this.getRecebedorCodigo_pais());
//        Conteudo[107] = String.valueOf(this.getRecebedor_pais());
//        Conteudo[108] = String.valueOf(this.getRecebedor_email());
//        Conteudo[109] = String.valueOf(this.getRecebedor_ie());
//        Conteudo[110] = String.valueOf(this.getDestinatarioCnpj());
//        Conteudo[111] = String.valueOf(this.getDestinatarioCpf());
//        Conteudo[112] = String.valueOf(this.getDestinatario_ie());
//        Conteudo[113] = String.valueOf(this.getDestinatario_nome());
//        Conteudo[114] = String.valueOf(this.getDestinatarioTelefone());
//        Conteudo[115] = String.valueOf(this.getDestinatario_suframa());
//        Conteudo[116] = String.valueOf(this.getDestinatario_rua());
//        Conteudo[117] = String.valueOf(this.getDestinatario_num());
//        Conteudo[118] = String.valueOf(this.getDestinatarioCompl());
//        Conteudo[119] = String.valueOf(this.getDestinatarioBairro());
//        Conteudo[120] = String.valueOf(this.getDestinatarioCodigoMunicipio());
//        Conteudo[121] = String.valueOf(this.getDestinatarioMunicipio());
//        Conteudo[122] = String.valueOf(this.getDestinatarioCep());
//        Conteudo[123] = String.valueOf(this.getDestinatario_uf());
//        Conteudo[124] = String.valueOf(this.getDestinatarioCodigo_pais());
//        Conteudo[125] = String.valueOf(this.getDestinatario_nome_pais());
//        Conteudo[126] = String.valueOf(this.getDestinatario_email());
//        Conteudo[127] = String.valueOf(this.getPrestacao_valorTotal_servico());
//        Conteudo[128] = String.valueOf(this.getPrestacao_valor_receber());
//        Conteudo[129] = String.valueOf(this.getAliq_icms());
//        Conteudo[130] = String.valueOf(this.getBc_icms());
//        Conteudo[131] = String.valueOf(this.getValor_icms());
//        Conteudo[132] = String.valueOf(this.getAliq_icms_st());
//        Conteudo[133] = String.valueOf(this.getBc_icms_st());
//        Conteudo[134] = String.valueOf(this.getValor_icms_st());
//        Conteudo[135] = String.valueOf(this.getValorCred_icms());
//        Conteudo[136] = String.valueOf(this.getCst());
//        Conteudo[137] = String.valueOf(this.getPercentual_reducaoBc());
//        Conteudo[138] = String.valueOf(this.getValorCarga());
//        Conteudo[139] = String.valueOf(this.getId_prod_predomintante());
//        Conteudo[140] = String.valueOf(this.getProd_predominante());
//        Conteudo[141] = String.valueOf(this.getOutrasCaracCarga());
//        Conteudo[142] = String.valueOf(this.getUnidade());
//        Conteudo[143] = String.valueOf(this.getTipoMedida());
//        Conteudo[144] = String.valueOf(this.getQuantidadeCarga());
//        Conteudo[145] = String.valueOf(this.getSeguro_responsavel());
//        Conteudo[146] = String.valueOf(this.getSeguradora_nome());
//        Conteudo[147] = String.valueOf(this.getSeguradora_numApolice());
//        Conteudo[148] = String.valueOf(this.getSeguradora_numAverb());
//        Conteudo[149] = String.valueOf(this.getSeguradora_valorCarga());
//        Conteudo[150] = String.valueOf(this.getPrevisao_entrega());
//        Conteudo[151] = String.valueOf(this.getIndicador_lotacao());
//        Conteudo[152] = String.valueOf(this.getCodigo_opTransp());
//        Conteudo[153] = String.valueOf(this.getSerie_occ());
//        Conteudo[154] = String.valueOf(this.getNum_occ());
//        Conteudo[155] = String.valueOf(this.getData_emissao_occ());
//        Conteudo[156] = String.valueOf(this.getCnpjTransportadora_occ());
//        Conteudo[157] = String.valueOf(this.getIe_occ());
//        Conteudo[158] = String.valueOf(this.getUf_occ());
//        Conteudo[159] = String.valueOf(this.getTelefone_occ());
//        Conteudo[160] = String.valueOf(this.getIdTransportadora_occ());
//        Conteudo[161] = String.valueOf(this.getId_veiculo());
//        Conteudo[162] = String.valueOf(this.getVeiculo_renavam());
//        Conteudo[163] = String.valueOf(this.getVeiculo_placa());
//        Conteudo[164] = String.valueOf(this.getVeiculoTara());
//        Conteudo[165] = String.valueOf(this.getVeiculoCap_kg());
//        Conteudo[166] = String.valueOf(this.getVeiculoCapM3());
//        Conteudo[167] = String.valueOf(this.getVeiculoTipo());
//        Conteudo[168] = String.valueOf(this.getVeiculoTipo_propriedade());
//        Conteudo[169] = String.valueOf(this.getVeiculoTipo_rodado());
//        Conteudo[170] = String.valueOf(this.getVeiculoTipoCarroceria());
//        Conteudo[171] = String.valueOf(this.getVeiculo_uf_licenciatura());
//        Conteudo[172] = String.valueOf(this.getVeiculo_propCpf());
//        Conteudo[173] = String.valueOf(this.getVeiculo_propCnpj());
//        Conteudo[174] = String.valueOf(this.getVeiculo_prop_rntrc());
//        Conteudo[175] = String.valueOf(this.getVeiculo_prop_nome());
//        Conteudo[176] = String.valueOf(this.getVeiculo_prop_ie());
//        Conteudo[177] = String.valueOf(this.getVeiculo_prop_uf());
//        Conteudo[178] = String.valueOf(this.getVeiculo_propTipo());
//        Conteudo[179] = String.valueOf(this.getId());

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
//            this.setId_nota_fiscal(RS.getString("id_nota_fiscal"));
//            this.setNumero_nfe(RS.getString("numero_nfe"));
//            this.setChaveAcesso_nfe(RS.getString("chaveAcesso_nfe"));
//            this.setChaveAcessoCte(RS.getString("chaveAcessoCte"));
//            this.setCfop(RS.getString("cfop"));
//            this.setNatureza_operacao(RS.getString("natureza_operacao"));
//            this.setModelo(RS.getString("modelo"));
//            this.setSerie(RS.getString("serie"));
//            this.setNumeroCte(RS.getString("numeroCte"));
//            this.setData_emissao(RS.getString("data_emissao"));
//            this.setHora_emissao(RS.getString("hora_emissao"));
//            this.setTipo_emissao(RS.getString("tipo_emissao"));
//            this.setTipo_impressao(RS.getString("tipo_impressao"));
//            this.setTipoCte(RS.getString("tipoCte"));
//            this.setIndicador_emissao(RS.getString("indicador_emissao"));
//            this.setIdMunicipio_envio(RS.getString("idMunicipio_envio"));
//            this.setMunicipio_envio(RS.getString("municipio_envio"));
//            this.setUf_envio(RS.getString("uf_envio"));
//            this.setModal(RS.getString("modal"));
//            this.setTipo_servico(RS.getString("tipo_servico"));
//            this.setIdMunicipio_ini_prest(RS.getString("idMunicipio_ini_prest"));
//            this.setMunicipio_ini_prest(RS.getString("municipio_ini_prest"));
//            this.setUfMunicipio_ini_prest(RS.getString("ufMunicipio_ini_prest"));
//            this.setIdMunicipio_fim_prest(RS.getString("idMunicipio_fim_prest"));
//            this.setMunicipio_fim_prest(RS.getString("municipio_fim_prest"));
//            this.setUf_idMunicipio_fim_prest(RS.getString("uf_idMunicipio_fim_prest"));
//            this.setRetira(RS.getString("retira"));
//            this.setRetira_detalhes(RS.getString("retira_detalhes"));
//            this.setTomador_servico(RS.getString("tomador_servico"));
//            this.setTomadorCnpj(RS.getString("tomadorCnpj"));
//            this.setTomadorCpf(RS.getString("tomadorCpf"));
//            this.setTomador_ie(RS.getString("tomador_ie"));
//            this.setTomador_nome(RS.getString("tomador_nome"));
//            this.setTomador_nome_fant(RS.getString("tomador_nome_fant"));
//            this.setTomadorTelefone(RS.getString("tomadorTelefone"));
//            this.setTomador_rua(RS.getString("tomador_rua"));
//            this.setTomador_num(RS.getString("tomador_num"));
//            this.setTomadorCompl(RS.getString("tomadorCompl"));
//            this.setTomadorBairro(RS.getString("tomadorBairro"));
//            this.setTomadorCodigoMunicipio(RS.getString("tomadorCodigoMunicipio"));
//            this.setTomadorMunicipio(RS.getString("tomadorMunicipio"));
//            this.setTomadorCep(RS.getString("tomadorCep"));
//            this.setTomador_uf(RS.getString("tomador_uf"));
//            this.setTomadorCodigo_pais(RS.getString("tomadorCodigo_pais"));
//            this.setTomador_pais(RS.getString("tomador_pais"));
//            this.setTomador_email(RS.getString("tomador_email"));
//            this.setData_emissaoContingencia(RS.getString("data_emissaoContingencia"));
//            this.setJustificativaContingencia(RS.getString("justificativaContingencia"));
//            this.setEmitenteCnpj(RS.getString("emitenteCnpj"));
//            this.setEmitente_ie(RS.getString("emitente_ie"));
//            this.setEmitente_nome(RS.getString("emitente_nome"));
//            this.setEmitente_nome_fant(RS.getString("emitente_nome_fant"));
//            this.setEmitente_rua(RS.getString("emitente_rua"));
//            this.setEmitente_num(RS.getString("emitente_num"));
//            this.setEmitenteCompl(RS.getString("emitenteCompl"));
//            this.setEmitenteBairro(RS.getString("emitenteBairro"));
//            this.setEmitenteCodigoMunicipio(RS.getString("emitenteCodigoMunicipio"));
//            this.setEmitenteMunicipio(RS.getString("emitenteMunicipio"));
//            this.setEmitenteCep(RS.getString("emitenteCep"));
//            this.setEmitente_uf(RS.getString("emitente_uf"));
//            this.setEmitenteTelefone(RS.getString("emitenteTelefone"));
//            this.setRemetenteCnpj(RS.getString("remetenteCnpj"));
//            this.setRemetenteCpf(RS.getString("remetenteCpf"));
//            this.setRemetente_ie(RS.getString("remetente_ie"));
//            this.setRemetente_nome(RS.getString("remetente_nome"));
//            this.setRemetente_nome_fant(RS.getString("remetente_nome_fant"));
//            this.setRemetenteTelefone(RS.getString("remetenteTelefone"));
//            this.setRemetente_rua(RS.getString("remetente_rua"));
//            this.setRemetente_num(RS.getString("remetente_num"));
//            this.setRemetenteCompl(RS.getString("remetenteCompl"));
//            this.setRemetenteBairro(RS.getString("remetenteBairro"));
//            this.setRemetenteCodigoMunicipio(RS.getString("remetenteCodigoMunicipio"));
//            this.setRemetenteMunicipio(RS.getString("remetenteMunicipio"));
//            this.setRemetenteCep(RS.getString("remetenteCep"));
//            this.setRemetente_uf(RS.getString("remetente_uf"));
//            this.setRemetenteCodigo_pais(RS.getString("remetenteCodigo_pais"));
//            this.setRemetente_pais(RS.getString("remetente_pais"));
//            this.setRemetente_email(RS.getString("remetente_email"));
//            this.setExpedidorCnpj(RS.getString("expedidorCnpj"));
//            this.setExpedidorCpf(RS.getString("expedidorCpf"));
//            this.setExpedidor_ie(RS.getString("expedidor_ie"));
//            this.setExpedidor_nome(RS.getString("expedidor_nome"));
//            this.setExpedidorTelefone(RS.getString("expedidorTelefone"));
//            this.setExpedidor_rua(RS.getString("expedidor_rua"));
//            this.setExpedidor_num(RS.getString("expedidor_num"));
//            this.setExpedidorCompl(RS.getString("expedidorCompl"));
//            this.setExpedidorBairro(RS.getString("expedidorBairro"));
//            this.setExpedidorCodigoMunicipio(RS.getString("expedidorCodigoMunicipio"));
//            this.setExpedidorMunicipio(RS.getString("expedidorMunicipio"));
//            this.setExpedidorCep(RS.getString("expedidorCep"));
//            this.setExpedidor_uf(RS.getString("expedidor_uf"));
//            this.setExpedidorCodigo_pais(RS.getString("expedidorCodigo_pais"));
//            this.setExpedidor_pais(RS.getString("expedidor_pais"));
//            this.setExpedidor_email(RS.getString("expedidor_email"));
//            this.setRecebedorCnpj(RS.getString("recebedorCnpj"));
//            this.setRecebedorCpf(RS.getString("recebedorCpf"));
//            this.setRecebedor_nome(RS.getString("recebedor_nome"));
//            this.setRecebedorTelefone(RS.getString("recebedorTelefone"));
//            this.setRecebedor_rua(RS.getString("recebedor_rua"));
//            this.setRecebedor_num(RS.getString("recebedor_num"));
//            this.setRecebedorCompl(RS.getString("recebedorCompl"));
//            this.setRecebedorBairro(RS.getString("recebedorBairro"));
//            this.setRecebedorCodigoMunicipio(RS.getString("recebedorCodigoMunicipio"));
//            this.setRecebedorMunicipio(RS.getString("recebedorMunicipio"));
//            this.setRecebedorCep(RS.getString("recebedorCep"));
//            this.setRecebedor_uf(RS.getString("recebedor_uf"));
//            this.setRecebedorCodigo_pais(RS.getString("recebedorCodigo_pais"));
//            this.setRecebedor_pais(RS.getString("recebedor_pais"));
//            this.setRecebedor_email(RS.getString("recebedor_email"));
//            this.setRecebedor_ie(RS.getString("recebedor_ie"));
//            this.setDestinatarioCnpj(RS.getString("destinatarioCnpj"));
//            this.setDestinatarioCpf(RS.getString("destinatarioCpf"));
//            this.setDestinatario_ie(RS.getString("destinatario_ie"));
//            this.setDestinatario_nome(RS.getString("destinatario_nome"));
//            this.setDestinatarioTelefone(RS.getString("destinatarioTelefone"));
//            this.setDestinatario_suframa(RS.getString("destinatario_suframa"));
//            this.setDestinatario_rua(RS.getString("destinatario_rua"));
//            this.setDestinatario_num(RS.getString("destinatario_num"));
//            this.setDestinatarioCompl(RS.getString("destinatarioCompl"));
//            this.setDestinatarioBairro(RS.getString("destinatarioBairro"));
//            this.setDestinatarioCodigoMunicipio(RS.getString("destinatarioCodigoMunicipio"));
//            this.setDestinatarioMunicipio(RS.getString("destinatarioMunicipio"));
//            this.setDestinatarioCep(RS.getString("destinatarioCep"));
//            this.setDestinatario_uf(RS.getString("destinatario_uf"));
//            this.setDestinatarioCodigo_pais(RS.getString("destinatarioCodigo_pais"));
//            this.setDestinatario_nome_pais(RS.getString("destinatario_nome_pais"));
//            this.setDestinatario_email(RS.getString("destinatario_email"));
//            this.setPrestacao_valorTotal_servico(RS.getString("prestacao_valorTotal_servico"));
//            this.setPrestacao_valor_receber(RS.getString("prestacao_valor_receber"));
//            this.setAliq_icms(RS.getString("aliq_icms"));
//            this.setBc_icms(RS.getString("bc_icms"));
//            this.setValor_icms(RS.getString("valor_icms"));
//            this.setAliq_icms_st(RS.getString("aliq_icms_st"));
//            this.setBc_icms_st(RS.getString("bc_icms_st"));
//            this.setValor_icms_st(RS.getString("valor_icms_st"));
//            this.setValorCred_icms(RS.getString("valorCred_icms"));
//            this.setCst(RS.getString("cst"));
//            this.setPercentual_reducaoBc(RS.getString("percentual_reducaoBc"));
//            this.setValorCarga(RS.getString("valorCarga"));
//            this.setId_prod_predomintante(RS.getString("id_prod_predomintante"));
//            this.setProd_predominante(RS.getString("prod_predominante"));
//            this.setOutrasCaracCarga(RS.getString("outrasCaracCarga"));
//            this.setUnidade(RS.getString("unidade"));
//            this.setTipoMedida(RS.getString("tipoMedida"));
//            this.setQuantidadeCarga(RS.getString("quantidadeCarga"));
//            this.setSeguro_responsavel(RS.getString("seguro_responsavel"));
//            this.setSeguradora_nome(RS.getString("seguradora_nome"));
//            this.setSeguradora_numApolice(RS.getString("seguradora_numApolice"));
//            this.setSeguradora_numAverb(RS.getString("seguradora_numAverb"));
//            this.setSeguradora_valorCarga(RS.getString("seguradora_valorCarga"));
//            this.setPrevisao_entrega(RS.getString("previsao_entrega"));
//            this.setIndicador_lotacao(RS.getString("indicador_lotacao"));
//            this.setCodigo_opTransp(RS.getString("codigo_opTransp"));
//            this.setSerie_occ(RS.getString("serie_occ"));
//            this.setNum_occ(RS.getString("num_occ"));
//            this.setData_emissao_occ(RS.getString("data_emissao_occ"));
//            this.setCnpjTransportadora_occ(RS.getString("cnpjTransportadora_occ"));
//            this.setIe_occ(RS.getString("ie_occ"));
//            this.setUf_occ(RS.getString("uf_occ"));
//            this.setTelefone_occ(RS.getString("telefone_occ"));
//            this.setIdTransportadora_occ(RS.getString("idTransportadora_occ"));
//            this.setId_veiculo(RS.getString("id_veiculo"));
//            this.setVeiculo_renavam(RS.getString("veiculo_renavam"));
//            this.setVeiculo_placa(RS.getString("veiculo_placa"));
//            this.setVeiculoTara(RS.getString("veiculoTara"));
//            this.setVeiculoCap_kg(RS.getString("veiculoCap_kg"));
//            this.setVeiculoCapM3(RS.getString("veiculoCapM3"));
//            this.setVeiculoTipo(RS.getString("veiculoTipo"));
//            this.setVeiculoTipo_propriedade(RS.getString("veiculoTipo_propriedade"));
//            this.setVeiculoTipo_rodado(RS.getString("veiculoTipo_rodado"));
//            this.setVeiculoTipoCarroceria(RS.getString("veiculoTipoCarroceria"));
//            this.setVeiculo_uf_licenciatura(RS.getString("veiculo_uf_licenciatura"));
//            this.setVeiculo_propCpf(RS.getString("veiculo_propCpf"));
//            this.setVeiculo_propCnpj(RS.getString("veiculo_propCnpj"));
//            this.setVeiculo_prop_rntrc(RS.getString("veiculo_prop_rntrc"));
//            this.setVeiculo_prop_nome(RS.getString("veiculo_prop_nome"));
//            this.setVeiculo_prop_ie(RS.getString("veiculo_prop_ie"));
//            this.setVeiculo_prop_uf(RS.getString("veiculo_prop_uf"));
//            this.setVeiculo_propTipo(RS.getString("veiculo_propTipo"));
//            this.setId(RS.getString("id"));
        } catch (Exception ex) {
            System.out.println("Erro ao Buscar CTrC :" + ex.toString());
        }
        con.close();
    }
    
    public void gerarXML()
    {
        StringBuffer xml = new StringBuffer();
        ResultSet rs = null;
        ConhecimentoTransporte conhecimentoTransporte = new ConhecimentoTransporte();
        xml.append("<infCte versao Id>");
        xml.append("<ide>");
            xml.append("<cUF>");
            xml.append("<cCT>");
            xml.append("<CFOP><CFOP>");cfop
            xml.append("<natOp><natOp>");natureza_operacao
            xml.append("<forPag><forPag>");
            xml.append("<mod><mod>");modelo
            xml.append("<serie><serie>");serie
            xml.append("<nCT><nCT>");numeroCte
            xml.append("<dhEmi><dhEmi>");data_emissao + hora_emissao
            xml.append("<tpImp><tpImp>");tipo_impressao
            xml.append("<tpEmis><tpEmis>");tipo_emissao
            xml.append("<cDV><cDV>");
            xml.append("<tpAmb><tpAmb>");
            xml.append("<tpCTe><tpCTe>");tipoCte
            xml.append("<procEmi><procEmi>");
            xml.append("<verProc><verProc>");
//            xml.append("<refCTE>");
                    
            xml.append("<cMunEnv>"+conhecimentoTransporte.getCodigoMunicipioEnvio()+"</cMunEnv>");
            xml.append("<xMunEnv>"+conhecimentoTransporte.getMunicipioEnvio()+"</xMunEnv>");
            xml.append("<UFEnv>"+conhecimentoTransporte.getUfEnvio()+"</UFEnv>");
            xml.append("<modal>"+conhecimentoTransporte.getModal()+"</modal>");
            xml.append("<tpServ>"+conhecimentoTransporte.getTipoServico()+"</tpServ>");

            xml.append("<cMunIni>"+conhecimentoTransporte.getCodigoMunicipioIniPrest()+"</cMunIni>");
            xml.append("<xMunIni>"+conhecimentoTransporte.getMunicipioIniPrest()+"</xMunIni>");
            xml.append("<UFIni>"+conhecimentoTransporte.getUfMunicipioIniPrest()+"</UFIni>");
            xml.append("<cMunFim>"+conhecimentoTransporte.getCodigoMunicipioFimPrest()+"</cMunFim>");
            xml.append("<xMunFim>"+conhecimentoTransporte.getMunicipioFimPrest()+"</xMunFim>");
            xml.append("<UFFim>"+conhecimentoTransporte.getUfMunicipioFimPrest()+"</UFFim>");
            xml.append("<retira>"+conhecimentoTransporte.getRetira()+"</retira>");
            
            xml.append("<xDetRetira>"+conhecimentoTransporte.getRetiraDetalhes()+"</xDetRetira>");
            
            if (!conhecimentoTransporte.getTomadorServico().equals("4"))
            {
                xml.append("<toma03>");
                        xml.append("<toma>"+conhecimentoTransporte.getTomadorServico()+"</toma>");
                xml.append("</toma03>");
            }
            else
            {
                xml.append("<toma4>");
                    xml.append("<toma>"+conhecimentoTransporte.getTomadorServico()+"</toma>");
                    xml.append("<CNPJ>"+conhecimentoTransporte.getTomadorCnpj()+"</CNPJ>");
                    xml.append("<CPF>"+conhecimentoTransporte.getTomadorCpf()+"</CPF>");
                    xml.append("<IE>"+conhecimentoTransporte.getTomadorIe()+"</IE>");
                    xml.append("<xNome>"+conhecimentoTransporte.getTomadorNome()+"</xNome>");
                    xml.append("<xFant>"+conhecimentoTransporte.getTomadorNomeFantasia()+"</xFant>");
                    xml.append("<fone>"+conhecimentoTransporte.getTomadorTelefone()+"</fone>");

                    xml.append("<enderToma>");
                        xml.append("<xLgr>"+conhecimentoTransporte.getTomadorRua()+"</xLgr>");
                        xml.append("<nro>"+conhecimentoTransporte.getTomadorNumero()+"</nro>");
                        xml.append("<xCpl>"+conhecimentoTransporte.getTomadorCompleto()+"</xCpl>");
                        xml.append("<xBairro>"+conhecimentoTransporte.getTomadorBairro()+"</xBairro>");
                        xml.append("<cMun>"+conhecimentoTransporte.getTomadorCodigoMunicipio()+"</cMun>");
                        xml.append("<xMun>"+conhecimentoTransporte.getTomadorMunicipio()+"</xMun>");
                        xml.append("<CEP>"+conhecimentoTransporte.getTomadorCep()+"</CEP>");
                        xml.append("<UF>"+conhecimentoTransporte.getTomadorUf()+"</UF>");
                        xml.append("<cPais>"+conhecimentoTransporte.getTomadorCodigoPais()+"</cPais>");
                        xml.append("<xPais>"+conhecimentoTransporte.getTomadorPais()+"</xPais>");
                    xml.append("</enderToma>");
                    xml.append("<email>"+conhecimentoTransporte.getTomadorEmail()+"</email>");
                xml.append("</toma4>");
            }
            xml.append("<dhCont>"+conhecimentoTransporte.getDataEmissaoContingencia()+"</dhCont>");
            xml.append("<xJust>"+conhecimentoTransporte.getJustificativaContingencia()+"</xJust>");
//        xml.append("<compl>");
//            xml.append("xCaracAd
//            xml.append("xCaracSer
//            xml.append("xEmi
//            xml.append("<fluxo>
//                xml.append("<xOrig>
//                xml.append("<pass>
//                    xml.append("<xPass>
//                xml.append("</pass>
//                xml.append("<xDest>
//                xml.append("<xRota>
//            xml.append("</fluxo>
//            xml.append("<Entrega>
//                xml.append("<semData>
//                    xml.append("<tpPer>
//                xml.append("</semData>
//                xml.append("<comData>
//                    xml.append("<tpPer>
//                    xml.append("<dProg>
//                xml.append("</comData>
//                xml.append("<noPeriodo>
//                    xml.append("<tpPer>
//                    xml.append("<dIni>
//                    xml.append("<dFim>
//                xml.append("</noPeriodo>
//                xml.append("<semHora>
//                    xml.append("<tpHor>
//                xml.append("</semHora>
//                xml.append("<comHora>
//                    xml.append("<tpHor>
//                    xml.append("<hProg>
//                xml.append("</comHora>
//                xml.append("<noInter>
//                    xml.append("<tpHor>
//                    xml.append("<hIni>
//                    xml.append("<hFim>
//                xml.append("</noInter>
//            xml.append("</Entrega>
//                xml.append("<origCalc>
//                xml.append("<destCalc>
//                xml.append("<xObs>
//                xml.append("<ObsCont>
//                    xml.append("<xCampo>
//                    xml.append("<xTexto>
//                xml.append("<ObsFisco>
//                    xml.append("<xCampo>
//                    xml.append("<xTexto>
            xml.append("<emit>");
                xml.append("<CNPJ>"+conhecimentoTransporte.getEmitenteCnpj()+"</CNPJ>");
                xml.append("<IE>"+conhecimentoTransporte.getEmitenteIe()+"</IE>");
                xml.append("<xNome>"+conhecimentoTransporte.getEmitenteNome()+"</xNome>");
                // opcional
                xml.append("<xFant>"+conhecimentoTransporte.getEmitenteNomeFantasia()+"</xFant>");
                xml.append("<enderEmit>");
                    xml.append("<xLgr>"+conhecimentoTransporte.getEmitenteRua()+"</xLgr>");
                    xml.append("<nro>"+conhecimentoTransporte.getEmitenteNumero()+"</nro>");
                    // opcional
                    xml.append("<xCpl>"+conhecimentoTransporte.getEmitenteComplemento()+"</xCpl>");
                    xml.append("<xBairro>"+conhecimentoTransporte.getEmitenteBairro()+"</xBairro>");
                    xml.append("<cMun>"+conhecimentoTransporte.getEmitenteCodigoMunicipio()+"</cMun>");
                    xml.append("<xMun>"+conhecimentoTransporte.getEmitenteMunicipio()+"</xMun>");
                    // opcional
                    xml.append("<CEP>"+conhecimentoTransporte.getEmitenteCep()+"</CEP>");
                    xml.append("<UF>"+conhecimentoTransporte.getEmitenteUf()+"</UF>");
                    // opcional
                    xml.append("<fone>"+conhecimentoTransporte.getEmitenteTelefone()+"</fone>");
                xml.append("</enderEmit>");
            xml.append("</emit>");
            // opcional 
            xml.append("<rem>");
                xml.append("<CNPJ>"+conhecimentoTransporte.getRemetenteCnpj()+"</CNPJ>");
                xml.append("<CPF>"+conhecimentoTransporte.getRemetenteCpf()+"</CPF>");
                xml.append("<IE>"+conhecimentoTransporte.getRemetenteIe()+"</IE>");
                xml.append("<xNome>"+conhecimentoTransporte.getRemetenteNome()+"</xNome>");
                // opcional
                xml.append("<xFant>"+conhecimentoTransporte.getRemetenteNomeFantasia()+"</xFant>");
                // opcional
                xml.append("<fone>"+conhecimentoTransporte.getRemetenteTelefone()+"</fone>");
                xml.append("<enderReme>");
                    xml.append("<xLgr>"+conhecimentoTransporte.getRemetenteRua()+"</xLgr>");
                    xml.append("<nro>"+conhecimentoTransporte.getRemetenteNumero()+"</nro>");
                    // opcional
                    xml.append("<xCpl>"+conhecimentoTransporte.getRemetenteComplemento()+"</xCpl>");
                    xml.append("<xBairro>"+conhecimentoTransporte.getRemetenteBairro()+"</xBairro>");
                    xml.append("<cMun>"+conhecimentoTransporte.getRemetenteCodigoMunicipio()+"</cMun>");
                    xml.append("<xMun>"+conhecimentoTransporte.getRemetenteMunicipio()+"</xMun>");
                    // opcional
                    xml.append("<CEP>"+conhecimentoTransporte.getRemetenteCep()+"</CEP>");
                    xml.append("<UF>"+conhecimentoTransporte.getRemetenteUf()+"</UF>");
                    // opcional
                    xml.append("<cPais>"+conhecimentoTransporte.getRemetenteCodigoPais()+"</cPais>");
                    // opcional
                    xml.append("<xPais>"+conhecimentoTransporte.getRemetentePais()+"</xPais>");
                xml.append("</enderReme>");
                // opcional
                xml.append("<email>"+conhecimentoTransporte.getRemetenteEmail()+"</email>");
//                xml.append("<locColeta>
//                    xml.append("<CNPJ>
//                    xml.append("<CPF>
//                    xml.append("<xNome>
//                    xml.append("<xLgr>
//                    xml.append("<nro>
//                    xml.append("<xCpl>
//                    xml.append("<xBairro>
//                    xml.append("<cMun>
//                    xml.append("<xMun>
//                    xml.append("<UF>
//                xml.append("</locColeta>
            xml.append("</rem>");
            // opcional
            xml.append("<exped>");
                xml.append("<CNPJ>"+conhecimentoTransporte.getExpedidorCnpj()+"<CNPJ>");
                xml.append("<CPF>"+conhecimentoTransporte.getExpedidorCpf()+"<CPF>");
                xml.append("<IE>"+conhecimentoTransporte.getExpedidorIe()+"<IE>");
                xml.append("<xNome>"+conhecimentoTransporte.getExpedidorNome()+"<xNome>");
                // opcional
                xml.append("<fone>"+conhecimentoTransporte.getExpedidorTelefone()+"<fone>");
                xml.append("<enderExped>");
                    xml.append("<xLgr>"+conhecimentoTransporte.getExpedidorRua()+"<xLgr>");
                    xml.append("<nro>"+conhecimentoTransporte.getExpedidorNumero()+"<nro>");
                    // opcional
                    xml.append("<xCpl>"+conhecimentoTransporte.getExpedidorComplemento()+"<xCpl>");
                    xml.append("<xBairro>"+conhecimentoTransporte.getExpedidorBairro()+"<xBairro>");
                    xml.append("<cMun>"+conhecimentoTransporte.getExpedidorCodigoMunicipio()+"<cMun>");
                    xml.append("<xMun>"+conhecimentoTransporte.getExpedidorMunicipio()+"<xMun>");
                    // opcional
                    xml.append("<CEP>"+conhecimentoTransporte.getExpedidorCep()+"<CEP>");
                    xml.append("<UF>"+conhecimentoTransporte.getExpedidorUf()+"<UF>");
                    // opcional
                    xml.append("<cPais>"+conhecimentoTransporte.getExpedidorCodigoPais()+"<cPais>");
                    // opcional
                    xml.append("<xPais>"+conhecimentoTransporte.getExpedidorPais()+"<xPais>");
                xml.append("</enderExped>");
                // opcional
                xml.append("<email>"+conhecimentoTransporte.getExpedidorEmail()+"<email>");
            xml.append("</exped>");
            // opcional
            xml.append("<receb>");
                xml.append("<CNPJ>"+conhecimentoTransporte.getRecebedorCnpj()+"<CNPJ>");
                xml.append("<CPF>"+conhecimentoTransporte.getRecebedorCpf()+"<CPF>");
                xml.append("<IE>"+conhecimentoTransporte.getRecebedorIe()+"<IE>");
                xml.append("<xNome>"+conhecimentoTransporte.getRecebedorNome()+"<xNome>");
                // opcional
                xml.append("<fone>"+conhecimentoTransporte.getRecebedorTelefone()+"<fone>");
                xml.append("<enderReceb>");
                    xml.append("<xLgr>"+conhecimentoTransporte.getRecebedorRua()+"<xLgr>");
                    xml.append("<nro>"+conhecimentoTransporte.getRecebedorNumero()+"<nro>");
                    // opcional
                    xml.append("<xCpl>"+conhecimentoTransporte.getRecebedorComplemento()+"<xCpl>");
                    xml.append("<xBairro>"+conhecimentoTransporte.getRecebedorBairro()+"<xBairro>");
                    xml.append("<cMun>"+conhecimentoTransporte.getRecebedorCodigoMunicipio()+"<cMun>");
                    xml.append("<xMun>"+conhecimentoTransporte.getRecebedorMunicipio()+"<xMun>");
                    // opcional
                    xml.append("<CEP>"+conhecimentoTransporte.getRecebedorCep()+"<CEP>");
                    xml.append("<UF>"+conhecimentoTransporte.getRecebedorUf()+"<UF>");
                    // opcional
                    xml.append("<cPais>"+conhecimentoTransporte.getRecebedorCodigoPais()+"<cPais>");
                    // opcional
                    xml.append("<xPais>"+conhecimentoTransporte.getRecebedorPais()+"<xPais>");
                xml.append("</enderReceb>");
                // opcional
                xml.append("<email>"+conhecimentoTransporte.getRecebedorEmail()+"<email>");
            xml.append("</receb>");
            // opcional
            xml.append("<dest>");
                xml.append("<CNPJ>"+conhecimentoTransporte.getDestinatarioCnpj()+"<CNPJ>");
                xml.append("<CPF>"+conhecimentoTransporte.getDestinatarioCpf()+"<CPF>");
                xml.append("<IE>"+conhecimentoTransporte.getDestinatarioIe()+"<IE>");
                xml.append("<xNome>"+conhecimentoTransporte.getDestinatarioNome()+"<xNome>");
                xml.append("<fone>"+conhecimentoTransporte.getDestinatarioTelefone()+"<fone>");
                xml.append("<ISUF>"+conhecimentoTransporte.getDestinatarioSuframa()+"<ISUF>");
                xml.append("<enderDest>");
                    xml.append("<xLgr>"+conhecimentoTransporte.getDestinatarioRua()+"<xLgr>");
                    xml.append("<nro>"+conhecimentoTransporte.getDestinatarioNumero()+"<nro>");
                    xml.append("<xCpl>"+conhecimentoTransporte.getDestinatarioComplemento()+"<xCpl>");
                    xml.append("<xBairro>"+conhecimentoTransporte.getDestinatarioBairro()+"<xBairro>");
                    xml.append("<cMun>"+conhecimentoTransporte.getDestinatarioCodigoMunicipio()+"<cMun>");
                    xml.append("<xMun>"+conhecimentoTransporte.getDestinatarioMunicipio()+"<xMun>");
                    xml.append("<CEP>"+conhecimentoTransporte.getDestinatarioCep()+"<CEP>");
                    xml.append("<UF>"+conhecimentoTransporte.getDestinatarioUf()+"<UF>");
                    xml.append("<cPais>"+conhecimentoTransporte.getDestinatarioCodigoPais()+"<cPais>");
                    xml.append("<xPais>"+conhecimentoTransporte.getDestinatarioNomePais()+"<xPais>");
                xml.append("</enderDest>");
                xml.append("<email>"+conhecimentoTransporte.getDestinatarioEmail()+"<email>");
//                xml.append("<locEnt>        
//                    xml.append("<CNPJ>
//                    xml.append("<CPF>
//                    xml.append("<xNome>
//                    xml.append("<xLgr>
//                    xml.append("<nro>
//                    xml.append("<xCpl>
//                    xml.append("<xBairro>
//                    xml.append("<cMun>
//                    xml.append("<xMun>
//                    xml.append("<UF>
//                xml.append("</locEnt>
            xml.append("</dest>");
            xml.append("<vPrest>");
                xml.append("<vTPrest>"+conhecimentoTransporte.getPrestacaoValorTotalServico()+"</vTPrest>");
                xml.append("<vRec>"+conhecimentoTransporte.getPrestacaoValorReceber()+"</vRec>");
//                xml.append("<Comp>");
//                    xml.append("<xNome>");
//                    xml.append("<vComp>");
//                xml.append("</Comp>");
            xml.append("</vPrest>");
            xml.append("<imp>");
                        
                xml.append("<ICMS>");
                    xml.append("<ICMS00>");
                        xml.append("<CST>"+conhecimentoTransporte.getCst()+"<CST>");
                        xml.append("<vBC>"+conhecimentoTransporte.getBcIcms()+"<vBC>");
                        xml.append("<pICMS>"+conhecimentoTransporte.getAliquotaIcms()+"<pICMS>");
                        xml.append("<vICMS>"+conhecimentoTransporte.getValorIcms()+"<vICMS>");
                    xml.append("</ICMS00>");
                    xml.append("<ICMS20>");
                        xml.append("<CST>"+conhecimentoTransporte.getCst()+"</CST>");
                        xml.append("<pRedBC>"+conhecimentoTransporte.getPercentualReducaoBc()+"</pRedBC>");
                        xml.append("<vBC>"+conhecimentoTransporte.getBcIcms()+"</vBC>");
                        xml.append("<pICMS>"+conhecimentoTransporte.getAliquotaIcms()+"</pICMS>");
                        xml.append("<vICMS>"+conhecimentoTransporte.getValorIcms()+"</vICMS>");
                    xml.append("</ICMS20>");
                    xml.append("<ICMS45>");
                        xml.append("<CST>"+conhecimentoTransporte.getCst()+"<CST>");
                    xml.append("</ICMS45>");
                    xml.append("<ICMS60>");
//                        xml.append("<CST>cst
//                        xml.append("<vBCSTRet>
//                        xml.append("<vICMSSTRet>
//                        xml.append("<pICMSSTRet>
//                        xml.append("<vCred>"+conhecimentoTransporte.getValorCred_icms()+"<vCred>");
                    xml.append("</ICMS60>");
                    xml.append("<ICMS90>");
                        xml.append("<CST>"+conhecimentoTransporte.getCst()+"</CST>");
                        xml.append("<pRedBC>");
                        xml.append("<vBC>"+conhecimentoTransporte.getBcIcms()+"</vBC>");
                        xml.append("<pICMS>"+conhecimentoTransporte.getAliquotaIcms()+"</pICMS>");
                        xml.append("<vICMS>"+conhecimentoTransporte.getValorIcms()+"</vICMS>");
                        xml.append("<vCred>"+conhecimentoTransporte.getValorCarga()+"</vCred>");
                    xml.append("</ICMS90>");
                    xml.append("<ICMSOutraUF>");
                        xml.append("<CST>"+conhecimentoTransporte.getCst()+"</CST>");
//                        xml.append("<pRedBCOutraUF>
//                        xml.append("<vBCOutraUF>
//                        xml.append("<pICMSOutraUF>
//                        xml.append("<vICMSOutraUF>
                    xml.append("</ICMSOutraUF>");
                    xml.append("<ICMSSN>");
                        xml.append("<indSN>");
                    xml.append("</ICMSSN>");
                xml.append("<vTotTrib>");
                xml.append("<infAdFisco>");
            xml.append("<infCTeNorm>");
                xml.append("<infCarga>");
                    xml.append("<vCarga>"+conhecimentoTransporte.getValorCarga()+"</vCarga>");
                    xml.append("<proPred>"+conhecimentoTransporte.getProdPredominante()+"</proPred>");
                    xml.append("<xOutCat>"+conhecimentoTransporte.getOutrasCaracteristicasCarga()+"</xOutCat>");
                    xml.append("<infQ>");
                        xml.append("<cUnid>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<tpMed>"+conhecimentoTransporte.getTipoMedida()+"</tpMed>");
                        xml.append("<qCarga>"+conhecimentoTransporte.getQuantidadeCarga()+"</qCarga>");
                    xml.append("</infQ>");
                xml.append("</infCarga>");
                xml.append("<infDoc>");
                    xml.append("<infNF>
//                        xml.append("<nRoma>
//                        xml.append("<nPed>
                        xml.append("<mod>"+conhecimentoTransporte.getModelo()+"</cUnid>");
                        xml.append("<serie>"+conhecimentoTransporte.getSerie()+"</cUnid>");
                        xml.append("<nDoc>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<dEmi>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<vBC>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<vICMS>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<vBCST>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<vST>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<vProd>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<vNF>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        xml.append("<nCFOP>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
//                        xml.append("<nPeso>
//                        xml.append("<PIN>
//                        xml.append("<dPrev>
//                        xml.append("<infUnidTransp>");
//                            xml.append("<tpUnidTransp>
//                            xml.append("<idUnidTransp>
//                            xml.append("<lacUnidTransp>
//                                xml.append("<nLacre>
//                            xml.append("<infUnidCarga>                                        
//                                xml.append("<tpUnidCarga>
//                                xml.append("<idUnidCarga>
//                                xml.append("<lacUnidCarga>
//                                    xml.append("<nLacre>
//                                xml.append("<qtdRat>
//                            xml.append("<qtdRat>"
//                        xml.append("</infUnidTransp>");
//                        xml.append("<infUnidCarga>");
//                            xml.append("<tpUnidCarga>
//                            xml.append("<idUnidCarga>
//                            xml.append("<lacUnidCarga>
//                                xml.append("<nLacre>
//                            xml.append("<qtdRat>"
//                        xml.append("</infUnidCarga>");
                    xml.append("<infNFe>");
                        xml.append("<chave>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        // Opcional
                        xml.append("<PIN>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
                        // Opcional
                        xml.append("<dPrev>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
//                        xml.append("<infUnidTransp>
//                            xml.append("<tpUnidTransp>
//                            xml.append("<idUnidTransp>
//                            xml.append("<lacUnidTransp>
//                                xml.append("<nLacre>
//                            xml.append("<infUnidCarga>                                        
//                                xml.append("<tpUnidCarga>                                      
//                                xml.append("<idUnidCarga>
//                                xml.append("<lacUnidCarga>                                        
//                                    xml.append("<nLacre>
//                                xml.append("<qtdRat>
//                            xml.append("<qtdRat>
//                        xml.append("<infUnidCarga>
//                            xml.append("<tpUnidCarga>
//                            xml.append("<idUnidCarga>
//                            xml.append("<lacUnidCarga>
//                                xml.append("<nLacre>
//                            xml.append("<qtdRat>
                    xml.append("<infOutros>");
                        xml.append("<tpDoc>"+conhecimentoTransporte.getUnidade()+"</cUnid>");
//                        xml.append("<descOutros>
//                        xml.append("<nDoc>
//                        xml.append("<dEmi>
//                        xml.append("<vDocFisc>
//                        xml.append("<dPrev>
//                        xml.append("<infUnidTransp>
//                            xml.append("<tpUnidTransp>
//                            xml.append("<idUnidTransp>
//                            xml.append("<lacUnidTransp>
//                                xml.append("<nLacre>
//                            xml.append("</lacUnidTransp>
//                            xml.append("<infUnidCarga>
//                                xml.append("<tpUnidCarga>   
//                                xml.append("<idUnidCarga>
//                                xml.append("<lacUnidCarga>
//                                    xml.append("<nLacre>
//                            xml.append("<qtdRat>
//                        xml.append("<qtdRat>                                         
//                    xml.append("<infUnidCarga>
//                        xml.append("<tpUnidCarga>
//                        xml.append("<idUnidCarga>
//                        xml.append("<lacUnidCarga>
//                            xml.append("<nLacre>
//                        xml.append("<qtdRat>
//            xml.append("<docAnt>
//                xml.append("<emiDocAnt>
//                    xml.append("<CNPJ>
//                    xml.append("<CPF>
//                    xml.append("<IE>
//                    xml.append("<UF>
//                    xml.append("<xNome>
//                    xml.append("<idDocAnt>
//                        xml.append("<idDocAntPap>
//                            xml.append("<tpDoc>
//                            xml.append("<serie>
//                            xml.append("<subser>
//                            xml.append("<nDoc>
//                            xml.append("<dEmi>
//                        xml.append("<idDocAntEle>
//                            xml.append("<chave>
//        xml.append("<seg>
//            xml.append("<respSeg>seguro_responsavel
//            xml.append("<xSeg>seguradora_nome
//            xml.append("<nApol>seguradora_numApolice
//            xml.append("<nAver>seguradora_numAverb
//            xml.append("<vCarga>seguradora_valorCarga
        xml.append("<infModal>");
            xml.append("<versaoModal>");
            //xs:any    
        xml.append("</infModal>");
//        xml.append("<peri>
//            xml.append("<nONU>
//            xml.append("<xNomeAE>
//            xml.append("<xClaRisco>
//            xml.append("<grEmb>
//            xml.append("<qTotProd>
//            xml.append("<qVolTipo>
//            xml.append("<pontoFulgor>
                    
//        xml.append("<cobr>                    
//            xml.append("<fat>
//                xml.append("<nFat>
//                xml.append("<vOrig
//                xml.append("<vDesc
//                xml.append("<vLiq
//            xml.append("<dup
//                xml.append("<nDup
//                xml.append("<dVenc
//                xml.append("<vDup
//        xml.append("<infCteSub                        
//            xml.append("<chCte
//            xml.append("<tomaICMS
//                xml.append("<refNFe
//                xml.append("<refNF
//                    xml.append("<CNPJ                        
//                    xml.append("<CPF
//                    xml.append("<mod
//                    xml.append("<serie
//                    xml.append("<subserie                            
//                    xml.append("<nro
//                    xml.append("<valor
//                    xml.append("<dEmi                            
//                xml.append("<refCte
//            xml.append("<tomaNaoICMS
//                xml.append("<refCteAnu                        
//    xml.append("<infCteComp
//        xml.append("<chave                        
//    xml.append("<infCteAnu
//        xml.append("<chCte                
//        xml.append("<dEmi
//    xml.append("<autXML                
//        xml.append("<CNPJ            
//        xml.append("<CPF "

                
                
                
                
    xml.append("<RNTRC>"+conhecimentoTransporte.getRntrc()+"</RNTRC>");
    xml.append("<dPrev>"+conhecimentoTransporte.getPrevisaoEntrega()+"</dPrev>");
    xml.append("<lota>"+conhecimentoTransporte.getIndicadorLotacao()+"</lota>");
    xml.append("<CIOT>"+conhecimentoTransporte.getCodigoOpTransp()+"</CIOT>");
    xml.append("<occ>");
        xml.append("<serie>"+conhecimentoTransporte.getSerieOcc()+"</cInt>");
        xml.append("<nOcc>"+conhecimentoTransporte.getNumOcc()+"</cInt>");
        xml.append("<dEmi>"+conhecimentoTransporte.getDataEmissaoOcc()+"</cInt>");
        xml.append("<emiOcc>");  
            xml.append("<CNPJ>"+conhecimentoTransporte.getCnpjTransportadoraOcc()+"</cInt>");
            xml.append("<cInt>"+conhecimentoTransporte.getIdTransportadoraOcc()+"</cInt>");
            xml.append("<IE>"+conhecimentoTransporte.getIeOcc()+"</cInt>");
            xml.append("<UF>"+conhecimentoTransporte.getUfOcc()+"</cInt>");
            xml.append("<fone>"+conhecimentoTransporte.getTelefoneOcc()+"</cInt>");
        xml.append("</emiOcc>");  
    xml.append("</occ>");
                    
//    xml.append("<valePed
//        xml.append("<CNPJForn
//        xml.append("<nCompra
//        xml.append("<CNPJPg
//        xml.append("<vValePed
    xml.append("<veic>");
        xml.append("<cInt>"+conhecimentoTransporte.getIdVeiculo()+"</cInt>");
        xml.append("<RENAVAM>"+conhecimentoTransporte.getVeiculoRenavam()+"</RENAVAM>");
        xml.append("<placa>"+conhecimentoTransporte.getVeiculoPlaca()+"</placa>");
        xml.append("<tara>"+conhecimentoTransporte.getVeiculoTara()+"</tara>");
        xml.append("<capKG>"+conhecimentoTransporte.getVeiculoCapKg()+"</capKG>");
        xml.append("<capM3>"+conhecimentoTransporte.getVeiculoCapM3()+"</capM3>");
        xml.append("<tpProp>"+conhecimentoTransporte.getVeiculoTipoPropriedade()+"</tpProp>");
        xml.append("<tpVeic>"+conhecimentoTransporte.getVeiculoTipo()+"</tpVeic>");
        xml.append("<tpRod>"+conhecimentoTransporte.getVeiculoTipoRodado()+"</tpRod>");
        xml.append("<tpCar>"+conhecimentoTransporte.getVeiculoTipoCarroceria()+"</tpCar>");
        xml.append("<UF>"+conhecimentoTransporte.getVeiculoUfLicenciatura()+"</UF>");
        xml.append("<prop>");
            xml.append("<CPF>"+conhecimentoTransporte.getVeiculoPropCpf()+"</CPF>");
            xml.append("<CNPJ>"+conhecimentoTransporte.getVeiculoPropCnpj()+"</CNPJ>");
            xml.append("<RNTRC>"+conhecimentoTransporte.getVeiculoPropRntrc()+"</RNTRC>");
            xml.append("<xNome>"+conhecimentoTransporte.getVeiculoPropNome()+"</xNome>");
            xml.append("<IE>"+conhecimentoTransporte.getVeiculoPropIe()+"</IE>");
            xml.append("<UF>"+conhecimentoTransporte.getVeiculoPropUf()+"</UF>");
            xml.append("<tpProp>"+conhecimentoTransporte.getVeiculoPropTipo()+"</tpProp>");
        xml.append("</prop>");
    xml.append("</veic>");
//    xml.append("<lacRodo
//        xml.append("<nLacre
//    xml.append("<moto
//        xml.append("<xNome
//        xml.append("<CPF
        
}
}
