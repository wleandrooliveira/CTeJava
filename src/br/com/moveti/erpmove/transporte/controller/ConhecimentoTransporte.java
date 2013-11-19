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
 * @author Geraldo Henrique Lacerda Pinto
 */
public class ConhecimentoTransporte {

    private String id;
    private String idNotaFiscal;
    private String numeroNfe;
    private String chaveAcessoNfe;
    private String chaveAcessoCte;
    private String cfop;
    private String naturezaOperacao;
    private String modelo;
    private String serie;
    private String numeroCte;
    private String dataEmissao;
    private String horaEmissao;
    private String tipoEmissao;
    private String tipoImpressao;
    private String tipoCte;
    private String indicadorEmissao;
    private String codigoMunicipioEnvio;
    private String municipioEnvio;
    private String ufEnvio;
    private String modal;
    private String tipoServico;
    private String codigoMunicipioIniPrest;
    private String municipioIniPrest;
    private String ufMunicipioIniPrest;
    private String codigoMunicipioFimPrest;
    private String municipioFimPrest;
    private String ufMunicipioFimPrest;
    private String retira;
    private String retiraDetalhes;
    private String tomadorServico;
    private String tomadorCnpj;
    private String tomadorCpf;
    private String tomadorIe;
    private String tomadorNome;
    private String tomadorNomeFantasia;
    private String tomadorTelefone;
    private String tomadorRua;
    private String tomadorNumero;
    private String tomadorCompleto;
    private String tomadorBairro;
    private String tomadorCodigoMunicipio;
    private String tomadorMunicipio;
    private String tomadorCep;
    private String tomadorUf;
    private String tomadorCodigoPais;
    private String tomadorPais;
    private String tomadorEmail;
    private String dataEmissaoContingencia;
    private String justificativaContingencia;
    private String emitenteCnpj;
    private String emitenteIe;
    private String emitenteNome;
    private String emitenteNomeFantasia;
    private String emitenteRua;
    private String emitenteNumero;
    private String emitenteComplemento;
    private String emitenteBairro;
    private String emitenteCodigoMunicipio;
    private String emitenteMunicipio;
    private String emitenteCep;
    private String emitenteUf;
    private String emitenteTelefone;
    private String remetenteCnpj;
    private String remetenteCpf;
    private String remetenteIe;
    private String remetenteNome;
    private String remetenteNomeFantasia;
    private String remetenteTelefone;
    private String remetenteRua;
    private String remetenteNumero;
    private String remetenteComplemento;
    private String remetenteBairro;
    private String remetenteCodigoMunicipio;
    private String remetenteMunicipio;
    private String remetenteCep;
    private String remetenteUf;
    private String remetenteCodigoPais;
    private String remetentePais;
    private String remetenteEmail;
    private String expedidorCnpj;
    private String expedidorCpf;
    private String expedidorIe;
    private String expedidorNome;
    private String expedidorTelefone;
    private String expedidorRua;
    private String expedidorNumero;
    private String expedidorComplemento;
    private String expedidorBairro;
    private String expedidorCodigoMunicipio;
    private String expedidorMunicipio;
    private String expedidorCep;
    private String expedidorUf;
    private String expedidorCodigoPais;
    private String expedidorPais;
    private String expedidorEmail;
    private String recebedorCnpj;
    private String recebedorCpf;
    private String recebedorNome;
    private String recebedorTelefone;
    private String recebedorRua;
    private String recebedorNumero;
    private String recebedorComplemento;
    private String recebedorBairro;
    private String recebedorCodigoMunicipio;
    private String recebedorMunicipio;
    private String recebedorCep;
    private String recebedorUf;
    private String recebedorCodigoPais;
    private String recebedorPais;
    private String recebedorEmail;
    private String recebedorIe;
    private String destinatarioCnpj;
    private String destinatarioCpf;
    private String destinatarioIe;
    private String destinatarioNome;
    private String destinatarioTelefone;
    private String destinatarioSuframa;
    private String destinatarioRua;
    private String destinatarioNumero;
    private String destinatarioComplemento;
    private String destinatarioBairro;
    private String destinatarioCodigoMunicipio;
    private String destinatarioMunicipio;
    private String destinatarioCep;
    private String destinatarioUf;
    private String destinatarioCodigoPais;
    private String destinatarioNomePais;
    private String destinatarioEmail;
    private String prestacaoValorTotalServico;
    private String prestacaoValorReceber;
    private double aliquotaIcms;
    private double bcIcms;
    private double valorIcms;
    private double aliquotaIcmsSt;
    private double bcIcmsSt;
    private double valorIcmsSt;
    private double valorCreditoIcms;
    private String cst;
    private double percentualReducaoBc;
    private double valorCarga;
    private String idProdutoPredomintante;
    private String prodPredominante;
    private String outrasCaracteristicasCarga;
    private String unidade;
    private String tipoMedida;
    private String quantidadeCarga;
    private String seguroResponsavel;
    private String seguradoraNome;
    private String seguradoraNumeroApolice;
    private String seguradoraNumeroAverb;
    private String seguradoraValorCarga;
    private String rntrc;
    private String previsaoEntrega;
    private String indicadorLotacao;
    private String codigoOpTransp;
    private String serieOcc;
    private String numOcc;
    private String dataEmissaoOcc;
    private String cnpjTransportadoraOcc;
    private String ieOcc;
    private String ufOcc;
    private String telefoneOcc;
    private String idTransportadoraOcc;
    private String idVeiculo;
    private String veiculoRenavam;
    private String veiculoPlaca;
    private String veiculoTara;
    private String veiculoCapKg;
    private String veiculoCapM3;
    private String veiculoTipo;
    private String veiculoTipoPropriedade;
    private String veiculoTipoRodado;
    private String veiculoTipoCarroceria;
    private String veiculoUfLicenciatura;
    private String veiculoPropCpf;
    private String veiculoPropCnpj;
    private String veiculoPropRntrc;
    private String veiculoPropNome;
    private String veiculoPropIe;
    private String veiculoPropUf;
    private String veiculoPropTipo;

    public String getRntrc() {
        return rntrc;
    }

    public void setRntrc(String rntrc) {
        this.rntrc = rntrc;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getAliquotaIcmsSt() {
        return aliquotaIcmsSt;
    }

    public void setAliquotaIcmsSt(double aliquotaIcmsSt) {
        this.aliquotaIcmsSt = aliquotaIcmsSt;
    }

    public double getBcIcms() {
        return bcIcms;
    }

    public void setBcIcms(double bcIcms) {
        this.bcIcms = bcIcms;
    }

    public double getBcIcmsSt() {
        return bcIcmsSt;
    }

    public void setBcIcmsSt(double bcIcmsSt) {
        this.bcIcmsSt = bcIcmsSt;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getChaveAcessoCte() {
        return chaveAcessoCte;
    }

    public void setChaveAcessoCte(String chaveAcessoCte) {
        this.chaveAcessoCte = chaveAcessoCte;
    }

    public String getChaveAcessoNfe() {
        return chaveAcessoNfe;
    }

    public void setChaveAcessoNfe(String chaveAcessoNfe) {
        this.chaveAcessoNfe = chaveAcessoNfe;
    }

    public String getCnpjTransportadoraOcc() {
        return cnpjTransportadoraOcc;
    }

    public void setCnpjTransportadoraOcc(String cnpjTransportadoraOcc) {
        this.cnpjTransportadoraOcc = cnpjTransportadoraOcc;
    }

    public String getCodigoMunicipioEnvio() {
        return codigoMunicipioEnvio;
    }

    public void setCodigoMunicipioEnvio(String codigoMunicipioEnvio) {
        this.codigoMunicipioEnvio = codigoMunicipioEnvio;
    }

    public String getCodigoMunicipioFimPrest() {
        return codigoMunicipioFimPrest;
    }

    public void setCodigoMunicipioFimPrest(String codigoMunicipioFimPrest) {
        this.codigoMunicipioFimPrest = codigoMunicipioFimPrest;
    }

    public String getCodigoMunicipioIniPrest() {
        return codigoMunicipioIniPrest;
    }

    public void setCodigoMunicipioIniPrest(String codigoMunicipioIniPrest) {
        this.codigoMunicipioIniPrest = codigoMunicipioIniPrest;
    }

    public String getCodigoOpTransp() {
        return codigoOpTransp;
    }

    public void setCodigoOpTransp(String codigoOpTransp) {
        this.codigoOpTransp = codigoOpTransp;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataEmissaoContingencia() {
        return dataEmissaoContingencia;
    }

    public void setDataEmissaoContingencia(String dataEmissaoContingencia) {
        this.dataEmissaoContingencia = dataEmissaoContingencia;
    }

    public String getDataEmissaoOcc() {
        return dataEmissaoOcc;
    }

    public void setDataEmissaoOcc(String dataEmissaoOcc) {
        this.dataEmissaoOcc = dataEmissaoOcc;
    }

    public String getDestinatarioBairro() {
        return destinatarioBairro;
    }

    public void setDestinatarioBairro(String destinatarioBairro) {
        this.destinatarioBairro = destinatarioBairro;
    }

    public String getDestinatarioCep() {
        return destinatarioCep;
    }

    public void setDestinatarioCep(String destinatarioCep) {
        this.destinatarioCep = destinatarioCep;
    }

    public String getDestinatarioCnpj() {
        return destinatarioCnpj;
    }

    public void setDestinatarioCnpj(String destinatarioCnpj) {
        this.destinatarioCnpj = destinatarioCnpj;
    }

    public String getDestinatarioCodigoMunicipio() {
        return destinatarioCodigoMunicipio;
    }

    public void setDestinatarioCodigoMunicipio(String destinatarioCodigoMunicipio) {
        this.destinatarioCodigoMunicipio = destinatarioCodigoMunicipio;
    }

    public String getDestinatarioCodigoPais() {
        return destinatarioCodigoPais;
    }

    public void setDestinatarioCodigoPais(String destinatarioCodigoPais) {
        this.destinatarioCodigoPais = destinatarioCodigoPais;
    }

    public String getDestinatarioComplemento() {
        return destinatarioComplemento;
    }

    public void setDestinatarioComplemento(String destinatarioComplemento) {
        this.destinatarioComplemento = destinatarioComplemento;
    }

    public String getDestinatarioCpf() {
        return destinatarioCpf;
    }

    public void setDestinatarioCpf(String destinatarioCpf) {
        this.destinatarioCpf = destinatarioCpf;
    }

    public String getDestinatarioEmail() {
        return destinatarioEmail;
    }

    public void setDestinatarioEmail(String destinatarioEmail) {
        this.destinatarioEmail = destinatarioEmail;
    }

    public String getDestinatarioIe() {
        return destinatarioIe;
    }

    public void setDestinatarioIe(String destinatarioIe) {
        this.destinatarioIe = destinatarioIe;
    }

    public String getDestinatarioMunicipio() {
        return destinatarioMunicipio;
    }

    public void setDestinatarioMunicipio(String destinatarioMunicipio) {
        this.destinatarioMunicipio = destinatarioMunicipio;
    }

    public String getDestinatarioNome() {
        return destinatarioNome;
    }

    public void setDestinatarioNome(String destinatarioNome) {
        this.destinatarioNome = destinatarioNome;
    }

    public String getDestinatarioNomePais() {
        return destinatarioNomePais;
    }

    public void setDestinatarioNomePais(String destinatarioNomePais) {
        this.destinatarioNomePais = destinatarioNomePais;
    }

    public String getDestinatarioNumero() {
        return destinatarioNumero;
    }

    public void setDestinatarioNumero(String destinatarioNumero) {
        this.destinatarioNumero = destinatarioNumero;
    }

    public String getDestinatarioRua() {
        return destinatarioRua;
    }

    public void setDestinatarioRua(String destinatarioRua) {
        this.destinatarioRua = destinatarioRua;
    }

    public String getDestinatarioSuframa() {
        return destinatarioSuframa;
    }

    public void setDestinatarioSuframa(String destinatarioSuframa) {
        this.destinatarioSuframa = destinatarioSuframa;
    }

    public String getDestinatarioTelefone() {
        return destinatarioTelefone;
    }

    public void setDestinatarioTelefone(String destinatarioTelefone) {
        this.destinatarioTelefone = destinatarioTelefone;
    }

    public String getDestinatarioUf() {
        return destinatarioUf;
    }

    public void setDestinatarioUf(String destinatarioUf) {
        this.destinatarioUf = destinatarioUf;
    }

    public String getEmitenteBairro() {
        return emitenteBairro;
    }

    public void setEmitenteBairro(String emitenteBairro) {
        this.emitenteBairro = emitenteBairro;
    }

    public String getEmitenteCep() {
        return emitenteCep;
    }

    public void setEmitenteCep(String emitenteCep) {
        this.emitenteCep = emitenteCep;
    }

    public String getEmitenteCnpj() {
        return emitenteCnpj;
    }

    public void setEmitenteCnpj(String emitenteCnpj) {
        this.emitenteCnpj = emitenteCnpj;
    }

    public String getEmitenteCodigoMunicipio() {
        return emitenteCodigoMunicipio;
    }

    public void setEmitenteCodigoMunicipio(String emitenteCodigoMunicipio) {
        this.emitenteCodigoMunicipio = emitenteCodigoMunicipio;
    }

    public String getEmitenteComplemento() {
        return emitenteComplemento;
    }

    public void setEmitenteComplemento(String emitenteComplemento) {
        this.emitenteComplemento = emitenteComplemento;
    }

    public String getEmitenteIe() {
        return emitenteIe;
    }

    public void setEmitenteIe(String emitenteIe) {
        this.emitenteIe = emitenteIe;
    }

    public String getEmitenteMunicipio() {
        return emitenteMunicipio;
    }

    public void setEmitenteMunicipio(String emitenteMunicipio) {
        this.emitenteMunicipio = emitenteMunicipio;
    }

    public String getEmitenteNome() {
        return emitenteNome;
    }

    public void setEmitenteNome(String emitenteNome) {
        this.emitenteNome = emitenteNome;
    }

    public String getEmitenteNomeFantasia() {
        return emitenteNomeFantasia;
    }

    public void setEmitenteNomeFantasia(String emitenteNomeFantasia) {
        this.emitenteNomeFantasia = emitenteNomeFantasia;
    }

    public String getEmitenteNumero() {
        return emitenteNumero;
    }

    public void setEmitenteNumero(String emitenteNumero) {
        this.emitenteNumero = emitenteNumero;
    }

    public String getEmitenteRua() {
        return emitenteRua;
    }

    public void setEmitenteRua(String emitenteRua) {
        this.emitenteRua = emitenteRua;
    }

    public String getEmitenteTelefone() {
        return emitenteTelefone;
    }

    public void setEmitenteTelefone(String emitenteTelefone) {
        this.emitenteTelefone = emitenteTelefone;
    }

    public String getEmitenteUf() {
        return emitenteUf;
    }

    public void setEmitenteUf(String emitenteUf) {
        this.emitenteUf = emitenteUf;
    }

    public String getExpedidorBairro() {
        return expedidorBairro;
    }

    public void setExpedidorBairro(String expedidorBairro) {
        this.expedidorBairro = expedidorBairro;
    }

    public String getExpedidorCep() {
        return expedidorCep;
    }

    public void setExpedidorCep(String expedidorCep) {
        this.expedidorCep = expedidorCep;
    }

    public String getExpedidorCnpj() {
        return expedidorCnpj;
    }

    public void setExpedidorCnpj(String expedidorCnpj) {
        this.expedidorCnpj = expedidorCnpj;
    }

    public String getExpedidorCodigoMunicipio() {
        return expedidorCodigoMunicipio;
    }

    public void setExpedidorCodigoMunicipio(String expedidorCodigoMunicipio) {
        this.expedidorCodigoMunicipio = expedidorCodigoMunicipio;
    }

    public String getExpedidorCodigoPais() {
        return expedidorCodigoPais;
    }

    public void setExpedidorCodigoPais(String expedidorCodigoPais) {
        this.expedidorCodigoPais = expedidorCodigoPais;
    }

    public String getExpedidorComplemento() {
        return expedidorComplemento;
    }

    public void setExpedidorComplemento(String expedidorComplemento) {
        this.expedidorComplemento = expedidorComplemento;
    }

    public String getExpedidorCpf() {
        return expedidorCpf;
    }

    public void setExpedidorCpf(String expedidorCpf) {
        this.expedidorCpf = expedidorCpf;
    }

    public String getExpedidorEmail() {
        return expedidorEmail;
    }

    public void setExpedidorEmail(String expedidorEmail) {
        this.expedidorEmail = expedidorEmail;
    }

    public String getExpedidorIe() {
        return expedidorIe;
    }

    public void setExpedidorIe(String expedidorIe) {
        this.expedidorIe = expedidorIe;
    }

    public String getExpedidorMunicipio() {
        return expedidorMunicipio;
    }

    public void setExpedidorMunicipio(String expedidorMunicipio) {
        this.expedidorMunicipio = expedidorMunicipio;
    }

    public String getExpedidorNome() {
        return expedidorNome;
    }

    public void setExpedidorNome(String expedidorNome) {
        this.expedidorNome = expedidorNome;
    }

    public String getExpedidorNumero() {
        return expedidorNumero;
    }

    public void setExpedidorNumero(String expedidorNumero) {
        this.expedidorNumero = expedidorNumero;
    }

    public String getExpedidorPais() {
        return expedidorPais;
    }

    public void setExpedidorPais(String expedidorPais) {
        this.expedidorPais = expedidorPais;
    }

    public String getExpedidorRua() {
        return expedidorRua;
    }

    public void setExpedidorRua(String expedidorRua) {
        this.expedidorRua = expedidorRua;
    }

    public String getExpedidorTelefone() {
        return expedidorTelefone;
    }

    public void setExpedidorTelefone(String expedidorTelefone) {
        this.expedidorTelefone = expedidorTelefone;
    }

    public String getExpedidorUf() {
        return expedidorUf;
    }

    public void setExpedidorUf(String expedidorUf) {
        this.expedidorUf = expedidorUf;
    }

    public String getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(String horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public void setIdNotaFiscal(String idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

    public String getIdProdutoPredomintante() {
        return idProdutoPredomintante;
    }

    public void setIdProdutoPredomintante(String idProdutoPredomintante) {
        this.idProdutoPredomintante = idProdutoPredomintante;
    }

    public String getIdTransportadoraOcc() {
        return idTransportadoraOcc;
    }

    public void setIdTransportadoraOcc(String idTransportadoraOcc) {
        this.idTransportadoraOcc = idTransportadoraOcc;
    }

    public String getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(String idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getIeOcc() {
        return ieOcc;
    }

    public void setIeOcc(String ieOcc) {
        this.ieOcc = ieOcc;
    }

    public String getIndicadorEmissao() {
        return indicadorEmissao;
    }

    public void setIndicadorEmissao(String indicadorEmissao) {
        this.indicadorEmissao = indicadorEmissao;
    }

    public String getIndicadorLotacao() {
        return indicadorLotacao;
    }

    public void setIndicadorLotacao(String indicadorLotacao) {
        this.indicadorLotacao = indicadorLotacao;
    }

    public String getJustificativaContingencia() {
        return justificativaContingencia;
    }

    public void setJustificativaContingencia(String justificativaContingencia) {
        this.justificativaContingencia = justificativaContingencia;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMunicipioEnvio() {
        return municipioEnvio;
    }

    public void setMunicipioEnvio(String municipioEnvio) {
        this.municipioEnvio = municipioEnvio;
    }

    public String getMunicipioFimPrest() {
        return municipioFimPrest;
    }

    public void setMunicipioFimPrest(String municipioFimPrest) {
        this.municipioFimPrest = municipioFimPrest;
    }

    public String getMunicipioIniPrest() {
        return municipioIniPrest;
    }

    public void setMunicipioIniPrest(String municipioIniPrest) {
        this.municipioIniPrest = municipioIniPrest;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public String getNumOcc() {
        return numOcc;
    }

    public void setNumOcc(String numOcc) {
        this.numOcc = numOcc;
    }

    public String getNumeroCte() {
        return numeroCte;
    }

    public void setNumeroCte(String numeroCte) {
        this.numeroCte = numeroCte;
    }

    public String getNumeroNfe() {
        return numeroNfe;
    }

    public void setNumeroNfe(String numeroNfe) {
        this.numeroNfe = numeroNfe;
    }

    public String getOutrasCaracteristicasCarga() {
        return outrasCaracteristicasCarga;
    }

    public void setOutrasCaracteristicasCarga(String outrasCaracteristicasCarga) {
        this.outrasCaracteristicasCarga = outrasCaracteristicasCarga;
    }

    public double getPercentualReducaoBc() {
        return percentualReducaoBc;
    }

    public void setPercentualReducaoBc(double percentualReducaoBc) {
        this.percentualReducaoBc = percentualReducaoBc;
    }

    public String getPrestacaoValorReceber() {
        return prestacaoValorReceber;
    }

    public void setPrestacaoValorReceber(String prestacaoValorReceber) {
        this.prestacaoValorReceber = prestacaoValorReceber;
    }

    public String getPrestacaoValorTotalServico() {
        return prestacaoValorTotalServico;
    }

    public void setPrestacaoValorTotalServico(String prestacaoValorTotalServico) {
        this.prestacaoValorTotalServico = prestacaoValorTotalServico;
    }

    public String getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(String previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public String getProdPredominante() {
        return prodPredominante;
    }

    public void setProdPredominante(String prodPredominante) {
        this.prodPredominante = prodPredominante;
    }

    public String getQuantidadeCarga() {
        return quantidadeCarga;
    }

    public void setQuantidadeCarga(String quantidadeCarga) {
        this.quantidadeCarga = quantidadeCarga;
    }

    public String getRecebedorBairro() {
        return recebedorBairro;
    }

    public void setRecebedorBairro(String recebedorBairro) {
        this.recebedorBairro = recebedorBairro;
    }

    public String getRecebedorCep() {
        return recebedorCep;
    }

    public void setRecebedorCep(String recebedorCep) {
        this.recebedorCep = recebedorCep;
    }

    public String getRecebedorCnpj() {
        return recebedorCnpj;
    }

    public void setRecebedorCnpj(String recebedorCnpj) {
        this.recebedorCnpj = recebedorCnpj;
    }

    public String getRecebedorCodigoMunicipio() {
        return recebedorCodigoMunicipio;
    }

    public void setRecebedorCodigoMunicipio(String recebedorCodigoMunicipio) {
        this.recebedorCodigoMunicipio = recebedorCodigoMunicipio;
    }

    public String getRecebedorCodigoPais() {
        return recebedorCodigoPais;
    }

    public void setRecebedorCodigoPais(String recebedorCodigoPais) {
        this.recebedorCodigoPais = recebedorCodigoPais;
    }

    public String getRecebedorComplemento() {
        return recebedorComplemento;
    }

    public void setRecebedorComplemento(String recebedorComplemento) {
        this.recebedorComplemento = recebedorComplemento;
    }

    public String getRecebedorCpf() {
        return recebedorCpf;
    }

    public void setRecebedorCpf(String recebedorCpf) {
        this.recebedorCpf = recebedorCpf;
    }

    public String getRecebedorEmail() {
        return recebedorEmail;
    }

    public void setRecebedorEmail(String recebedorEmail) {
        this.recebedorEmail = recebedorEmail;
    }

    public String getRecebedorIe() {
        return recebedorIe;
    }

    public void setRecebedorIe(String recebedorIe) {
        this.recebedorIe = recebedorIe;
    }

    public String getRecebedorMunicipio() {
        return recebedorMunicipio;
    }

    public void setRecebedorMunicipio(String recebedorMunicipio) {
        this.recebedorMunicipio = recebedorMunicipio;
    }

    public String getRecebedorNome() {
        return recebedorNome;
    }

    public void setRecebedorNome(String recebedorNome) {
        this.recebedorNome = recebedorNome;
    }

    public String getRecebedorNumero() {
        return recebedorNumero;
    }

    public void setRecebedorNumero(String recebedorNumero) {
        this.recebedorNumero = recebedorNumero;
    }

    public String getRecebedorPais() {
        return recebedorPais;
    }

    public void setRecebedorPais(String recebedorPais) {
        this.recebedorPais = recebedorPais;
    }

    public String getRecebedorRua() {
        return recebedorRua;
    }

    public void setRecebedorRua(String recebedorRua) {
        this.recebedorRua = recebedorRua;
    }

    public String getRecebedorTelefone() {
        return recebedorTelefone;
    }

    public void setRecebedorTelefone(String recebedorTelefone) {
        this.recebedorTelefone = recebedorTelefone;
    }

    public String getRecebedorUf() {
        return recebedorUf;
    }

    public void setRecebedorUf(String recebedorUf) {
        this.recebedorUf = recebedorUf;
    }

    public String getRemetenteBairro() {
        return remetenteBairro;
    }

    public void setRemetenteBairro(String remetenteBairro) {
        this.remetenteBairro = remetenteBairro;
    }

    public String getRemetenteCep() {
        return remetenteCep;
    }

    public void setRemetenteCep(String remetenteCep) {
        this.remetenteCep = remetenteCep;
    }

    public String getRemetenteCnpj() {
        return remetenteCnpj;
    }

    public void setRemetenteCnpj(String remetenteCnpj) {
        this.remetenteCnpj = remetenteCnpj;
    }

    public String getRemetenteCodigoMunicipio() {
        return remetenteCodigoMunicipio;
    }

    public void setRemetenteCodigoMunicipio(String remetenteCodigoMunicipio) {
        this.remetenteCodigoMunicipio = remetenteCodigoMunicipio;
    }

    public String getRemetenteCodigoPais() {
        return remetenteCodigoPais;
    }

    public void setRemetenteCodigoPais(String remetenteCodigoPais) {
        this.remetenteCodigoPais = remetenteCodigoPais;
    }

    public String getRemetenteComplemento() {
        return remetenteComplemento;
    }

    public void setRemetenteComplemento(String remetenteComplemento) {
        this.remetenteComplemento = remetenteComplemento;
    }

    public String getRemetenteCpf() {
        return remetenteCpf;
    }

    public void setRemetenteCpf(String remetenteCpf) {
        this.remetenteCpf = remetenteCpf;
    }

    public String getRemetenteEmail() {
        return remetenteEmail;
    }

    public void setRemetenteEmail(String remetenteEmail) {
        this.remetenteEmail = remetenteEmail;
    }

    public String getRemetenteIe() {
        return remetenteIe;
    }

    public void setRemetenteIe(String remetenteIe) {
        this.remetenteIe = remetenteIe;
    }

    public String getRemetenteMunicipio() {
        return remetenteMunicipio;
    }

    public void setRemetenteMunicipio(String remetenteMunicipio) {
        this.remetenteMunicipio = remetenteMunicipio;
    }

    public String getRemetenteNome() {
        return remetenteNome;
    }

    public void setRemetenteNome(String remetenteNome) {
        this.remetenteNome = remetenteNome;
    }

    public String getRemetenteNomeFantasia() {
        return remetenteNomeFantasia;
    }

    public void setRemetenteNomeFantasia(String remetenteNomeFantasia) {
        this.remetenteNomeFantasia = remetenteNomeFantasia;
    }

    public String getRemetenteNumero() {
        return remetenteNumero;
    }

    public void setRemetenteNumero(String remetenteNumero) {
        this.remetenteNumero = remetenteNumero;
    }

    public String getRemetentePais() {
        return remetentePais;
    }

    public void setRemetentePais(String remetentePais) {
        this.remetentePais = remetentePais;
    }

    public String getRemetenteRua() {
        return remetenteRua;
    }

    public void setRemetenteRua(String remetenteRua) {
        this.remetenteRua = remetenteRua;
    }

    public String getRemetenteTelefone() {
        return remetenteTelefone;
    }

    public void setRemetenteTelefone(String remetenteTelefone) {
        this.remetenteTelefone = remetenteTelefone;
    }

    public String getRemetenteUf() {
        return remetenteUf;
    }

    public void setRemetenteUf(String remetenteUf) {
        this.remetenteUf = remetenteUf;
    }

    public String getRetira() {
        return retira;
    }

    public void setRetira(String retira) {
        this.retira = retira;
    }

    public String getRetiraDetalhes() {
        return retiraDetalhes;
    }

    public void setRetiraDetalhes(String retiraDetalhes) {
        this.retiraDetalhes = retiraDetalhes;
    }

    public String getSeguradoraNome() {
        return seguradoraNome;
    }

    public void setSeguradoraNome(String seguradoraNome) {
        this.seguradoraNome = seguradoraNome;
    }

    public String getSeguradoraNumeroApolice() {
        return seguradoraNumeroApolice;
    }

    public void setSeguradoraNumeroApolice(String seguradoraNumeroApolice) {
        this.seguradoraNumeroApolice = seguradoraNumeroApolice;
    }

    public String getSeguradoraNumeroAverb() {
        return seguradoraNumeroAverb;
    }

    public void setSeguradoraNumeroAverb(String seguradoraNumeroAverb) {
        this.seguradoraNumeroAverb = seguradoraNumeroAverb;
    }

    public String getSeguradoraValorCarga() {
        return seguradoraValorCarga;
    }

    public void setSeguradoraValorCarga(String seguradoraValorCarga) {
        this.seguradoraValorCarga = seguradoraValorCarga;
    }

    public String getSeguroResponsavel() {
        return seguroResponsavel;
    }

    public void setSeguroResponsavel(String seguroResponsavel) {
        this.seguroResponsavel = seguroResponsavel;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerieOcc() {
        return serieOcc;
    }

    public void setSerieOcc(String serieOcc) {
        this.serieOcc = serieOcc;
    }

    public String getTelefoneOcc() {
        return telefoneOcc;
    }

    public void setTelefoneOcc(String telefoneOcc) {
        this.telefoneOcc = telefoneOcc;
    }

    public String getTipoCte() {
        return tipoCte;
    }

    public void setTipoCte(String tipoCte) {
        this.tipoCte = tipoCte;
    }

    public String getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(String tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public String getTipoImpressao() {
        return tipoImpressao;
    }

    public void setTipoImpressao(String tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public String getTipoMedida() {
        return tipoMedida;
    }

    public void setTipoMedida(String tipoMedida) {
        this.tipoMedida = tipoMedida;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getTomadorBairro() {
        return tomadorBairro;
    }

    public void setTomadorBairro(String tomadorBairro) {
        this.tomadorBairro = tomadorBairro;
    }

    public String getTomadorCep() {
        return tomadorCep;
    }

    public void setTomadorCep(String tomadorCep) {
        this.tomadorCep = tomadorCep;
    }

    public String getTomadorCnpj() {
        return tomadorCnpj;
    }

    public void setTomadorCnpj(String tomadorCnpj) {
        this.tomadorCnpj = tomadorCnpj;
    }

    public String getTomadorCodigoMunicipio() {
        return tomadorCodigoMunicipio;
    }

    public void setTomadorCodigoMunicipio(String tomadorCodigoMunicipio) {
        this.tomadorCodigoMunicipio = tomadorCodigoMunicipio;
    }

    public String getTomadorCodigoPais() {
        return tomadorCodigoPais;
    }

    public void setTomadorCodigoPais(String tomadorCodigoPais) {
        this.tomadorCodigoPais = tomadorCodigoPais;
    }

    public String getTomadorCompleto() {
        return tomadorCompleto;
    }

    public void setTomadorCompleto(String tomadorCompleto) {
        this.tomadorCompleto = tomadorCompleto;
    }

    public String getTomadorCpf() {
        return tomadorCpf;
    }

    public void setTomadorCpf(String tomadorCpf) {
        this.tomadorCpf = tomadorCpf;
    }

    public String getTomadorEmail() {
        return tomadorEmail;
    }

    public void setTomadorEmail(String tomadorEmail) {
        this.tomadorEmail = tomadorEmail;
    }

    public String getTomadorIe() {
        return tomadorIe;
    }

    public void setTomadorIe(String tomadorIe) {
        this.tomadorIe = tomadorIe;
    }

    public String getTomadorMunicipio() {
        return tomadorMunicipio;
    }

    public void setTomadorMunicipio(String tomadorMunicipio) {
        this.tomadorMunicipio = tomadorMunicipio;
    }

    public String getTomadorNome() {
        return tomadorNome;
    }

    public void setTomadorNome(String tomadorNome) {
        this.tomadorNome = tomadorNome;
    }

    public String getTomadorNomeFantasia() {
        return tomadorNomeFantasia;
    }

    public void setTomadorNomeFantasia(String tomadorNomeFantasia) {
        this.tomadorNomeFantasia = tomadorNomeFantasia;
    }

    public String getTomadorNumero() {
        return tomadorNumero;
    }

    public void setTomadorNumero(String tomadorNumero) {
        this.tomadorNumero = tomadorNumero;
    }

    public String getTomadorPais() {
        return tomadorPais;
    }

    public void setTomadorPais(String tomadorPais) {
        this.tomadorPais = tomadorPais;
    }

    public String getTomadorRua() {
        return tomadorRua;
    }

    public void setTomadorRua(String tomadorRua) {
        this.tomadorRua = tomadorRua;
    }

    public String getTomadorServico() {
        return tomadorServico;
    }

    public void setTomadorServico(String tomadorServico) {
        this.tomadorServico = tomadorServico;
    }

    public String getTomadorTelefone() {
        return tomadorTelefone;
    }

    public void setTomadorTelefone(String tomadorTelefone) {
        this.tomadorTelefone = tomadorTelefone;
    }

    public String getTomadorUf() {
        return tomadorUf;
    }

    public void setTomadorUf(String tomadorUf) {
        this.tomadorUf = tomadorUf;
    }

    public String getUfEnvio() {
        return ufEnvio;
    }

    public void setUfEnvio(String ufEnvio) {
        this.ufEnvio = ufEnvio;
    }

    public String getUfMunicipioFimPrest() {
        return ufMunicipioFimPrest;
    }

    public void setUfMunicipioFimPrest(String ufMunicipioFimPrest) {
        this.ufMunicipioFimPrest = ufMunicipioFimPrest;
    }

    public String getUfMunicipioIniPrest() {
        return ufMunicipioIniPrest;
    }

    public void setUfMunicipioIniPrest(String ufMunicipioIniPrest) {
        this.ufMunicipioIniPrest = ufMunicipioIniPrest;
    }

    public String getUfOcc() {
        return ufOcc;
    }

    public void setUfOcc(String ufOcc) {
        this.ufOcc = ufOcc;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getValorCarga() {
        return valorCarga;
    }

    public void setValorCarga(double valorCarga) {
        this.valorCarga = valorCarga;
    }

    public double getValorCreditoIcms() {
        return valorCreditoIcms;
    }

    public void setValorCreditoIcms(double valorCreditoIcms) {
        this.valorCreditoIcms = valorCreditoIcms;
    }

    public double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public double getValorIcmsSt() {
        return valorIcmsSt;
    }

    public void setValorIcmsSt(double valorIcmsSt) {
        this.valorIcmsSt = valorIcmsSt;
    }

    public String getVeiculoCapKg() {
        return veiculoCapKg;
    }

    public void setVeiculoCapKg(String veiculoCapKg) {
        this.veiculoCapKg = veiculoCapKg;
    }

    public String getVeiculoCapM3() {
        return veiculoCapM3;
    }

    public void setVeiculoCapM3(String veiculoCapM3) {
        this.veiculoCapM3 = veiculoCapM3;
    }

    public String getVeiculoPlaca() {
        return veiculoPlaca;
    }

    public void setVeiculoPlaca(String veiculoPlaca) {
        this.veiculoPlaca = veiculoPlaca;
    }

    public String getVeiculoPropCnpj() {
        return veiculoPropCnpj;
    }

    public void setVeiculoPropCnpj(String veiculoPropCnpj) {
        this.veiculoPropCnpj = veiculoPropCnpj;
    }

    public String getVeiculoPropCpf() {
        return veiculoPropCpf;
    }

    public void setVeiculoPropCpf(String veiculoPropCpf) {
        this.veiculoPropCpf = veiculoPropCpf;
    }

    public String getVeiculoPropIe() {
        return veiculoPropIe;
    }

    public void setVeiculoPropIe(String veiculoPropIe) {
        this.veiculoPropIe = veiculoPropIe;
    }

    public String getVeiculoPropNome() {
        return veiculoPropNome;
    }

    public void setVeiculoPropNome(String veiculoPropNome) {
        this.veiculoPropNome = veiculoPropNome;
    }

    public String getVeiculoPropRntrc() {
        return veiculoPropRntrc;
    }

    public void setVeiculoPropRntrc(String veiculoPropRntrc) {
        this.veiculoPropRntrc = veiculoPropRntrc;
    }

    public String getVeiculoPropTipo() {
        return veiculoPropTipo;
    }

    public void setVeiculoPropTipo(String veiculoPropTipo) {
        this.veiculoPropTipo = veiculoPropTipo;
    }

    public String getVeiculoPropUf() {
        return veiculoPropUf;
    }

    public void setVeiculoPropUf(String veiculoPropUf) {
        this.veiculoPropUf = veiculoPropUf;
    }

    public String getVeiculoRenavam() {
        return veiculoRenavam;
    }

    public void setVeiculoRenavam(String veiculoRenavam) {
        this.veiculoRenavam = veiculoRenavam;
    }

    public String getVeiculoTara() {
        return veiculoTara;
    }

    public void setVeiculoTara(String veiculoTara) {
        this.veiculoTara = veiculoTara;
    }

    public String getVeiculoTipo() {
        return veiculoTipo;
    }

    public void setVeiculoTipo(String veiculoTipo) {
        this.veiculoTipo = veiculoTipo;
    }

    public String getVeiculoTipoCarroceria() {
        return veiculoTipoCarroceria;
    }

    public void setVeiculoTipoCarroceria(String veiculoTipoCarroceria) {
        this.veiculoTipoCarroceria = veiculoTipoCarroceria;
    }

    public String getVeiculoTipoPropriedade() {
        return veiculoTipoPropriedade;
    }

    public void setVeiculoTipoPropriedade(String veiculoTipoPropriedade) {
        this.veiculoTipoPropriedade = veiculoTipoPropriedade;
    }

    public String getVeiculoTipoRodado() {
        return veiculoTipoRodado;
    }

    public void setVeiculoTipoRodado(String veiculoTipoRodado) {
        this.veiculoTipoRodado = veiculoTipoRodado;
    }

    public String getVeiculoUfLicenciatura() {
        return veiculoUfLicenciatura;
    }

    public void setVeiculoUfLicenciatura(String veiculoUfLicenciatura) {
        this.veiculoUfLicenciatura = veiculoUfLicenciatura;
    }
}
