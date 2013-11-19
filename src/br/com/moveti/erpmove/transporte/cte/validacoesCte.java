/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte;

import br.com.moveti.erpmove.transporte.cte.comunicacao.xmls.XMLretCancCte;
import br.com.moveti.erpmove.transporte.cte.comunicacao.xmls.XMLretEnviCTe;

/**
 *
 * @author henriquelacerda
 */
public class validacoesCte{

    private String notaFiscalXML = "";
    private String notaFiscalXMLAssinada = "";

    public String valida(String cStat) {
        if (cStat.equals("100")) {
            return "Autorizado o uso do CT-e";
        }
        if (cStat.equals("101")) {
            return "Cancelamento de CT-e homologado";
        }
        if (cStat.equals("102")) {
            return "Inutilização de número homologado";
        }
        if (cStat.equals("103")) {
            return "Lote recebido com sucesso";
        }
        if (cStat.equals("104")) {
            return "Lote processado";
        }
        if (cStat.equals("105")) {
            return "Lote em processamento";
        }
        if (cStat.equals("106")) {
            return "Lote não localizado";
        }
        if (cStat.equals("107")) {
            return "Serviço em Operação";
        }
        if (cStat.equals("108")) {
            return "Serviço Paralisado Momentaneamente (curto prazo)";
        }
        if (cStat.equals("109")) {
            return "Serviço Paralisado sem Previsão";
        }
        if (cStat.equals("110")) {
            return "Uso Denegado";
        }
        if (cStat.equals("111")) {
            return "Consulta cadastro com uma ocorrência";
        }
        if (cStat.equals("112")) {
            return "Consulta cadastro com mais de uma ocorrência";
        }
        if (cStat.equals("113")) {
            return "Serviço SVC em operação. Desativação prevista para a UF em dd/mm/aa, às hh:mm horas";
        }
        if (cStat.equals("114")) {
            return "SVC-[SP/RS] desabilitada pela SEFAZ de Origem";
        }
        if (cStat.equals("128")) {
            return "CT-e anulado pelo emissor";
        } 
        if (cStat.equals("129")) {
            return "CT-e substituído pelo emissor";
        } 
        if (cStat.equals("130")) {
            return "Apresentada Carta de Correção Eletrônica – CC-e";
        } 
        if (cStat.equals("131")) {
            return "CT-e desclassificado pelo Fisco";
        }
        if (cStat.equals("201")) {
            return "Rejeição: O numero máximo de numeração de CT-e a inutilizar ultrapassou o limite";
        }
        if (cStat.equals("202")) {
            return "Rejeição: Falha no reconhecimento da autoria ou integridade do arquivo digital";
        }
        if (cStat.equals("203")) {
            return "Rejeição: Emissor não habilitado para emissão da CT-e";
        }
        if (cStat.equals("204")) {
            return "Rejeição: Duplicidade de CT-e [nRec:999999999999999]";
        }
        if (cStat.equals("205")) {
            return "Rejeição: CT-e está denegado na base de dados da SEFAZ";
        }
        if (cStat.equals("206")) {
            return "Rejeição: CT-e já está inutilizada na Base de dados da SEFAZ";
        }
        if (cStat.equals("207")) {
            return "Rejeição: CNPJ do emitente inválido";
        }
        if (cStat.equals("208")) {
            return "Rejeição: CNPJ do destinatário inválido";
        }
        if (cStat.equals("209")) {
            return "Rejeição: IE do emitente inválida";
        }
        if (cStat.equals("210")) {
            return "Rejeição: IE do destinatário inválida";
        }
        if (cStat.equals("211")) {
            return "Rejeição: IE do substituto inválida";
        }
        if (cStat.equals("212")) {
            return "Rejeição: Data de emissão CT-e posterior a data de recebimento";
        }
        if (cStat.equals("213")) {
            return "Rejeição: CNPJ-Base do Emitente difere do CNPJ-Base do Certificado Digital";
        }
        if (cStat.equals("214")) {
            return "Rejeição: Tamanho da mensagem excedeu o limite estabelecido";
        }
        if (cStat.equals("215")) {
            return "Rejeição: Falha no schema XML";
        }
        if (cStat.equals("216")) {
            return "Rejeição: Chave de Acesso difere da cadastrada";
        }
        if (cStat.equals("217")) {
            return "Rejeição: CT-e não consta na base de dados da SEFAZ";
        }
        if (cStat.equals("218")) {
            return "Rejeição: CT-e já esta cancelada na base de dados da SEFAZ";
        }
        if (cStat.equals("219")) {
            return "Rejeição: Circulação da CT-e verificada";
        }
        if (cStat.equals("220")) {
            return "Rejeição: CT-e autorizada há mais de 7 dias (168 horas)";
        }
        if (cStat.equals("221")) {
            return "Rejeição: Confirmado o recebimento da CT-e pelo destinatário";
        }
        if (cStat.equals("222")) {
            return "Rejeição: Protocolo de Autorização de Uso difere do cadastrado";
        }
        if (cStat.equals("223")) {
            return "Rejeição: CNPJ do transmissor do lote difere do CNPJ do transmissor da consulta";
        }
        if (cStat.equals("224")) {
            return "Rejeição: A faixa inicial é maior que a faixa final";
        }
        if (cStat.equals("225")) {
            return "Rejeição: Falha no Schema XML da CTe";
        }
        if (cStat.equals("226")) {
            return "Rejeição: Código da UF do Emitente diverge da UF autorizadora";
        }
        if (cStat.equals("227")) {
            return "Rejeição: Erro na Chave de Acesso - Campo ID";
        }
        if (cStat.equals("228")) {
            return "Rejeição: Data de Emissão muito atrasada";
        }
        if (cStat.equals("229")) {
            return "Rejeição: IE do emitente não informada";
        }
        if (cStat.equals("230")) {
            return "Rejeição: IE do emitente não cadastrada";
        }
        if (cStat.equals("231")) {
            return "Rejeição: IE do emitente não vinculada ao CNPJ";
        }
        if (cStat.equals("232")) {
            return "Rejeição: IE do destinatário não informada";
        }
        if (cStat.equals("233")) {
            return "Rejeição: IE do destinatário não cadastrada";
        }
        if (cStat.equals("234")) {
            return "Rejeição: IE do destinatário não vinculada ao CNPJ";
        }
        if (cStat.equals("235")) {
            return "Rejeição: Inscrição SUFRAMA inválida";
        }
        if (cStat.equals("236")) {
            return "Rejeição: Chave de Acesso com dígito verificador inválido";
        }
        if (cStat.equals("237")) {
            return "Rejeição: CPF do destinatário inválido";
        }
        if (cStat.equals("238")) {
            return "Rejeição: Cabeçalho - Versão do arquivo XML superior a Versão vigente";
        }
        if (cStat.equals("239")) {
            return "Rejeição: Cabeçalho - Versão do arquivo XML não suportada";
        }
        if (cStat.equals("240")) {
            return "Rejeição: Cancelamento/Inutilização - Irregularidade Fiscal do Emitente";
        }
        if (cStat.equals("241")) {
            return "Rejeição: Um número da faixa já foi utilizado";
        }
        if (cStat.equals("242")) {
            return "Rejeição: Cabeçalho - Falha no Schema XML";
        }
        if (cStat.equals("243")) {
            return "Rejeição: XML Mal Formado";
        }
        if (cStat.equals("244")) {
            return "Rejeição: CNPJ do Certificado Digital difere do CNPJ da Matriz e do CNPJ do Emitente";
        }
        if (cStat.equals("245")) {
            return "Rejeição: CNPJ Emitente não cadastrado";
        }
        if (cStat.equals("246")) {
            return "Rejeição: CNPJ Destinatário não cadastrado";
        }
        if (cStat.equals("247")) {
            return "Rejeição: Sigla da UF do Emitente diverge da UF autorizadora";
        }
        if (cStat.equals("248")) {
            return "Rejeição: UF do Recibo diverge da UF autorizadora";
        }
        if (cStat.equals("249")) {
            return "Rejeição: UF da Chave de Acesso diverge da UF autorizadora";
        }
        if (cStat.equals("250")) {
            return "Rejeição: UF diverge da UF autorizadora";
        }
        if (cStat.equals("251")) {
            return "Rejeição: UF/Município destinatário não pertence a SUFRAMA";
        }
        if (cStat.equals("252")) {
            return "Rejeição: Ambiente informado diverge do Ambiente de recebimento";
        }
        if (cStat.equals("253")) {
            return "Rejeição: Digito Verificador da chave de acesso composta inválida";
        }
        if (cStat.equals("254")) {
            return "Rejeição: CT-e a ser complementado não informado para CT-e complementar";
        }        
        if (cStat.equals("256")) {
            return "Rejeição: Uma CT-e da faixa já está inutilizada na Base de dados da SEFAZ";
        }
        if (cStat.equals("257")) {
            return "Rejeição: Solicitante não habilitado para emissão da CT-e";
        }
        if (cStat.equals("258")) {
            return "Rejeição: CNPJ da consulta inválido";
        }
        if (cStat.equals("259")) {
            return "Rejeição: CNPJ da consulta não cadastrado como contribuinte na UF";
        }
        if (cStat.equals("260")) {
            return "Rejeição: IE da consulta inválida";
        }
        if (cStat.equals("261")) {
            return "Rejeição: IE da consulta não cadastrada como contribuinte na UF";
        }
        if (cStat.equals("262")) {
            return "Rejeição: UF não fornece consulta por CPF";
        }
        if (cStat.equals("263")) {
            return "Rejeição: CPF da consulta inválido";
        }
        if (cStat.equals("264")) {
            return "Rejeição: CPF da consulta não cadastrado como contribuinte na UF";
        }
        if (cStat.equals("265")) {
            return "Rejeição: Sigla da UF da consulta difere da UF do Web Service";
        }
        if (cStat.equals("266")) {
            return "Rejeição: Série utilizada não permitida no Web Service";
        }
        if (cStat.equals("267")) {
            return "Rejeição: CT-e Complementar referencia uma CT-e inexistente";
        }
        if (cStat.equals("268")) {
            return "Rejeição: CT-e Complementar referencia uma outro CT-e Complementar";
        }
        if (cStat.equals("269")) {
            return "Rejeição: CNPJ Emitente da NF Complementar difere do CNPJ da NF Referenciada";
        }
        if (cStat.equals("270")) {
            return "Rejeição: Código Município do Fato Gerador: dígito inválido";
        }
        if (cStat.equals("271")) {
            return "Rejeição: Código Município do Fato Gerador: difere da UF do emitente";
        }
        if (cStat.equals("272")) {
            return "Rejeição: Código Município do Emitente: dígito inválido";
        }
        if (cStat.equals("273")) {
            return "Rejeição: Código Município do Emitente: difere da UF do emitente";
        }
        if (cStat.equals("274")) {
            return "Rejeição: Código Município do Destinatário: dígito inválido";
        }
        if (cStat.equals("275")) {
            return "Rejeição: Código Município do Destinatário: difere da UF do Destinatário";
        }
        if (cStat.equals("276")) {
            return "Rejeição: Código Município do Local de Retirada: dígito inválido";
        }
        if (cStat.equals("277")) {
            return "Rejeição: Código Município do Local de Retirada: difere da UF do Local de Retirada";
        }
        if (cStat.equals("278")) {
            return "Rejeição: Código Município do Local de Entrega: dígito inválido";
        }
        if (cStat.equals("279")) {
            return "Rejeição: Código Município do Local de Entrega: difere da UF do Local de Entrega";
        }
        if (cStat.equals("280")) {
            return "Rejeição: Certificado Transmissor inválido";
        }
        if (cStat.equals("281")) {
            return "Rejeição: Certificado Transmissor Data Validade";
        }
        if (cStat.equals("282")) {
            return "Rejeição: IE da consulta inválidRejeição: Certificado Transmissor sem CNPJ";
        }
        if (cStat.equals("283")) {
            return "Rejeição: Certificado Transmissor - erro Cadeia de Certificação";
        }
        if (cStat.equals("284")) {
            return "Rejeição: Certificado Transmissor revogado";
        }
        if (cStat.equals("285")) {
            return "Rejeição: Certificado Transmissor difere ICP-Brasil";
        }
        if (cStat.equals("286")) {
            return "Rejeição: Certificado Transmissor erro no acesso a LCR";
        }       
        if (cStat.equals("289")) {
            return "Rejeição: Código da UF informada diverge da UF solicitada";
        }
        if (cStat.equals("290")) {
            return "Rejeição: Certificado Assinatura inválido";
        }
        if (cStat.equals("291")) {
            return "Rejeição: Certificado Assinatura Data Validade";
        }
        if (cStat.equals("292")) {
            return "Rejeição: Certificado Assinatura sem CNPJ";
        }
        if (cStat.equals("293")) {
            return "Rejeição: Certificado Assinatura - erro Cadeia de Certificação";
        }
        if (cStat.equals("294")) {
            return "Rejeição: Certificado Assinatura revogado";
        }
        if (cStat.equals("295")) {
            return "Rejeição: Certificado Assinatura difere ICP-Brasil";
        }
        if (cStat.equals("296")) {
            return "Rejeição: Certificado Assinatura erro no acesso a LCR";
        }
        if (cStat.equals("297")) {
            return "Rejeição: Assinatura difere do calculado";
        }
        if (cStat.equals("298")) {
            return "Rejeição: Assinatura difere do padrão do Projeto";
        }
        if (cStat.equals("299")) {
            return "Rejeição: XML da área de cabeçalho com codificação diferente de UTF-8";
        }
        if (cStat.equals("401")) {
            return "Rejeição: CPF do remetente inválido";
        }
        if (cStat.equals("402")) {
            return "Rejeição: XML da área de dados com codificação diferente de UTF-8";
        }
        if (cStat.equals("404")) {
            return "Rejeição: Uso de prefixo de namespace não permitido";
        }
        if (cStat.equals("405")) {
            return "Rejeição: Código do país do emitente: dígito inválido";
        }
        if (cStat.equals("406")) {
            return "Rejeição: Código do país do destinatário: dígito inválido";
        }
        if (cStat.equals("407")) {
            return "Rejeição: O CPF só pode ser informado no campo emitente para a CT-e avulsa";
        }
        if (cStat.equals("409")) {
            return "Rejeição: Campo cUF inexistente no elemento CTeCabecMsg do SOAP Header ";
        }
        if (cStat.equals("410")) {
            return "Rejeição: UF informada no campo cUF não é atendida pelo Web Service ";
        }
        if (cStat.equals("411")) {
            return "Rejeição: Campo versaoDados inexistente no elemento CTeCabecMsg do SOAP Header ";
        }
        if (cStat.equals("413")) {
            return "Rejeição: Código de Município de término da prestação: dígito inválido";
        }
        if (cStat.equals("414")) {
            return "Rejeição: Código de Município diverge da UF de término da prestação";
        }
        if (cStat.equals("415")) {
            return "Rejeição: CNPJ do remetente inválido";
        }
        if (cStat.equals("416")) {
            return "Rejeição: CPF do remetente inválido";
        }
        if (cStat.equals("417")) {
            return "Rejeição: Código de Município de localização remetente: dígito inválido";
        }
        if (cStat.equals("418")) {
            return "Rejeição: Código de Município diverge da UF de localização remetente";
        }
        if (cStat.equals("419")) {
            return "Rejeição: IE do remetente inválida";
        }
        if (cStat.equals("420")) {
            return "Rejeição: CNPJ remetente não cadastrado";
        }
        if (cStat.equals("421")) {
            return "Rejeição: IE do remetente não cadastrada";
        }
        if (cStat.equals("422")) {
            return "Rejeição: IE do remetente não vinculada ao CNPJ";
        }
        if (cStat.equals("423")) {
            return "Rejeição: Código de Município de localização destinatário: dígito inválido";
        }
        if (cStat.equals("424")) {
            return "Rejeição: Código de Município diverge da UF de localização destinatário";
        }
        if (cStat.equals("425")) {
            return "Rejeição: CNPJ destinatário não cadastrado";
        }
        if (cStat.equals("426")) {
            return "Rejeição: IE do destinatário não cadastrada";
        }
        if (cStat.equals("427")) {
            return "Rejeição: IE do destinatário não vinculada ao CNPJ";
        }
        if (cStat.equals("428")) {
            return "Rejeição: CNPJ do expedidor inválido ";
        }
        if (cStat.equals("429")) {
            return "Rejeição: CPF do expedidor inválido";
        }
        if (cStat.equals("430")) {
            return "Rejeição: Código de Município de localização expedidor: dígito inválido";
        }
        if (cStat.equals("431")) {
            return "Rejeição: Código de Município diverge da UF de localização expedidor";
        }
        if (cStat.equals("432")) {
            return "Rejeição: CNPJ expedidor não cadastrado";
        }
        if (cStat.equals("433")) {
            return "Rejeição: IE do expedidor não cadastrada";
        }
        if (cStat.equals("434")) {
            return "Rejeição: CPF do expedidor inválido";
        }
        if (cStat.equals("435")) {
            return "Rejeição: IE do expedidor não vinculada ao CNPJ";
        }
        if (cStat.equals("436")) {
            return "Rejeição: CNPJ do recebedor inválido";
        }
        if (cStat.equals("437")) {
            return "Rejeição: CPF do recebedor inválido";
        }
        if (cStat.equals("438")) {
            return "Rejeição: Código de Município de localização do recebedor: dígito inválido";
        }
        if (cStat.equals("439")) {
            return "Rejeição: Código de Município diverge da UF de localização recebedor";
        }
        if (cStat.equals("440")) {
            return "Rejeição: IE do recebedor inválida";
        }
        if (cStat.equals("441")) {
            return "Rejeição: CNPJ recebedor não cadastrado";
        }
        if (cStat.equals("442")) {
            return "Rejeição: IE do recebedor não cadastrada";
        }
        if (cStat.equals("443")) {
            return "Rejeição: IE do recebedor não vinculada ao CNPJ";
        }
        if (cStat.equals("444")) {
            return "Rejeição: CNPJ do tomador inválido";
        }
        if (cStat.equals("445")) {
            return "Rejeição: CPF do tomador inválido";
        }
        if (cStat.equals("446")) {
            return "Rejeição: Código de Município de localização tomador: dígito inválido";
        }
        if (cStat.equals("447")) {
            return "Rejeição: Código de Município diverge da UF de localização tomador";
        }
        if (cStat.equals("448")) {
            return "Rejeição: IE do tomador inválida";
        }
        if (cStat.equals("449")) {
            return "Rejeição: CNPJ tomador não cadastrado";
        }
        if (cStat.equals("455")) {
            return "Rejeição: Código de Município de início da prestação: dígito inválido";
        }
        if (cStat.equals("456")) {
            return "Rejeição: Código de Município diverge da UF de início da prestação ";
        }
        if (cStat.equals("457")) {
            return "Rejeição: O lote contém CT-e de mais de um estabelecimento emissor";
        }
        if (cStat.equals("458")) {
            return "Rejeição: Grupo de CT-e normal não informado para CT-e normal";
        }
        if (cStat.equals("459")) {
            return "Rejeição: Grupo de CT-e complementar não informado para CT-e complementar";
        }
        if (cStat.equals("460")) {
            return "Rejeição: Não informado os dados do remetente indicado como tomador do serviço";
        }
        if (cStat.equals("461")) {
            return "Rejeição: Não informado os dados do expedidor indicado como tomador do serviço";
        }
        if (cStat.equals("462")) {
            return "Rejeição: Não informado os dados do recebedor indicado como tomador do serviço";
        }
        if (cStat.equals("463")) {
            return "Rejeição: Não informado os dados do destinatário indicado como tomador do serviço";
        }
        if (cStat.equals("469")) {
            return "Rejeição: Remetente deve ser informado para tipo de serviço diferente de redespacho intermediário";
        }
        if (cStat.equals("470")) {
            return "Rejeição: Destinatário deve ser informado para tipo de serviço diferente de redespacho intermediário";
        }
        if (cStat.equals("471")) {
            return "Rejeição: Ano de inutilização não pode ser superior ao Ano atual";
        }
        if (cStat.equals("472")) {
            return "Rejeição: Ano de inutilização não pode ser inferior a 2008";
        }
        if (cStat.equals("473")) {
            return "Rejeição: Tipo Autorizador do Recibo diverge do Órgão Autorizador";
        }
        if (cStat.equals("474")) {
            return "Rejeição: Expedidor deve ser informado para tipo de serviço de redespacho intermédiario";
        }
        if (cStat.equals("475")) {
            return "Rejeição: Recebedor deve ser informado para tipo de serviço de redespacho intermédiario";
        }
        if (cStat.equals("489")) {
            return "Rejeição: D";
        }
        if (cStat.equals("490")) {
            return "Rejeição: IE do tomador não vinculada ao CNPJ";
        }
        if (cStat.equals("491")) {
            return "Rejeição: CT-e referenciado é CT-e complementar";
        }
        if (cStat.equals("492")) {
            return "Rejeição: Código de Município de envio: dígito inválido";
        }
        if (cStat.equals("493")) {
            return "Rejeição: Código de Município diverge da UF de envio";
        }
        if (cStat.equals("494")) {
            return "Rejeição: Processo de emissão informado inválido";
        }
        if (cStat.equals("495")) {
            return "Rejeição: CT-e possui Carta de Correção";
        }
        if (cStat.equals("496")) {
            return "Rejeição: Grupo CT-e de Anulação não informado para o CT-e de Anulação";
        }
        if (cStat.equals("497")) {
            return "Rejeição: CT-e objeto da anulação inexistente";
        }
        if (cStat.equals("498")) {
            return "Rejeição: CT-e objeto da anulação deve estar com a situação autorizada (não pode estar cancelado ou denegado)";
        }
        if (cStat.equals("499")) {
            return "Rejeição: CT-e de anulação deve ter tipo de emissão = normal";
        }
        if (cStat.equals("500")) {
            return "Rejeição: CT-e objeto da anulação deve ter finalidade = 0 (normal)";
        }
        if (cStat.equals("501")) {
            return "Rejeição: Data de emissão do CT-e de Anulação deve ocorrer em até 60 dias";
        }
        if (cStat.equals("502")) {
            return "Rejeição: CT-e de anulação deve ter o valor do ICMS e de prestação iguais ao CT-e original";
        }
        if (cStat.equals("503")) {
            return "Rejeição: CT-e Susbtituto deve ter tipo de emissão = normal";
        }
        if (cStat.equals("505")) {
            return "Rejeição: Grupo CT-e de Substituição não informado para o CT-e de Substituição";
        }
        if (cStat.equals("510")) {
            return "Rejeição: CNPJ do emitente do CT-e substituto deve ser igual ao informado no CT-esubstituído";
        }          
        
        if (cStat.equals("511")) {
            return "Rejeição: CNPJ do remetente do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("512")) {
            return "Rejeição: CNPJ do destinatário do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("513")) {
            return "Rejeicao: UF nao atendida pela SVC-[SP/RS]";
        }
        if (cStat.equals("514")) {
            return "Rejeição: versão da mensagem não suportada na SVC";
        }
        if (cStat.equals("515")) {
            return "Rejeição: O tpEmis informado só é válido na contingência SVC";
        }
        if (cStat.equals("516")) {
            return "Rejeição: O tpEmis informado é incompatível com SVC-[SP/RS]";
        }
        if (cStat.equals("517")) {
            return "Rejeição: CT-e informado em SVC deve ser Normal";
        }
        if (cStat.equals("518")) {
            return "Rejeição: Serviço indisponível na SVC";
        }
        if (cStat.equals("539")) {
            return "Rejeicao: Duplicidade de CT-e, com diferença na Chave de Acesso [chCTe: 99999999999999999999999999999999999999999999][nRec:999999999999999]";
        }
        if (cStat.equals("550")) {
            return "Rejeição: O CNPJ do expedidor do CT-e substituto deve ser igual ao informado no CTe substituído";
        }
        if (cStat.equals("551")) {
            return "Rejeição: O CNPJ do recebedor do CT-e substituto deve ser igual ao informado no CTe substituído";
        }
        if (cStat.equals("552")) {
            return "Rejeição: O CNPJ do tomador do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("553")) {
            return "Rejeição: A IE do emitente do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("554")) {
            return "Rejeição: A IE do remetente do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("555")) {
            return "Rejeição: A IE do destinatário do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("556")) {
            return "Rejeição: A IE do expedidor do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("557")) {
            return "Rejeição: A IE do recebedor do CT-e substituto deve ser igual ao informado no CT-e substituído ";
        }
        if (cStat.equals("558")) {
            return "Rejeição: A IE do tomador do CT-e substituto deve ser igual ao informado no CT-e substituído";
        }
        if (cStat.equals("559")) {
            return "Rejeição: A UF de início da prestação deve ser igual ao informado no CT-e substituído ";
        }
        if (cStat.equals("560")) {
            return "Rejeição: A UF de fim da prestação deve ser igual ao informado no CT-e substituído ";
        }
        if (cStat.equals("561")) {
            return "Rejeição: O valor da prestação do serviço deve ser menor ou igual ao informado no CT-e substituído";
        }
        if (cStat.equals("562")) {
            return "Rejeição: O valor do ICMS do CT-e subsituto deve ser menor ou igual ao informado no CT-e substituído";
        }
        if (cStat.equals("563")) {
            return "Rejeição: A substituição de um CT-e deve ocorrer no prazo máximo de 60 contados da data de emissão do CT-e objeto de Substituição";
        }
        if (cStat.equals("564")) {
            return "Rejeição: O CT-e de anulação não pode ser cancelado ";
        }
        if (cStat.equals("565")) {
            return "Rejeição: O CT-e só pode ser anulado pelo emitente";
        }
        if (cStat.equals("566")) {
            return "Rejeição: CT-e objeto da anulação não pode ter sido anulado anteriormente";
        }
        if (cStat.equals("567")) {
            return "Rejeição: CT-e objeto da anulação não pode ter sido substituído anteriormente";
        }
        if (cStat.equals("568")) {
            return "Rejeição: CT-e a ser substituído inexistente ";
        }
        if (cStat.equals("569")) {
            return "Rejeição: CT-e a ser substituído deve estar com a situação autorizada (não pode estar cancelado ou denegado)";
        }
        if (cStat.equals("570")) {
            return "Rejeição: CT-e a ser substituído não pode ter sido substituído anteriormente";
        }
        if (cStat.equals("571")) {
            return "Rejeição: CT-e a ser substituído deve ter finalidade = 0 (normal)";
        }
        if (cStat.equals("572")) {
            return "Rejeição: CT-e de anulação informado no grupo “Tomador não é contribuinte do ICMS” inexistente ";
        }
        if (cStat.equals("573")) {
            return "Rejeição: CT-e de anulação informado no grupo “Tomador não é contribuinte do ICMS” deve ter finalidade=2(Anulação) ";
        }
        if (cStat.equals("574")) {
            return "Rejeição: Vedado o cancelamento de CT-e do tipo substituto (tipo=3)";
        }
        if (cStat.equals("575")) {
            return "Rejeição: Vedado o cancelamento se possuir CT-e de Anulação associado";
        }
        if (cStat.equals("576")) {
            return "Rejeição: Vedado o cancelamento se possuir CT-e de Substituição associado";
        }
        if (cStat.equals("577")) {
            return "Rejeição: CT-e a ser substituído não pode ter sido anulado anteriormente ";
        }
        if (cStat.equals("578")) {
            return "Rejeição: Chave de acesso do CT-e anulado deve ser igual ao substituído";
        }
        if (cStat.equals("579")) {
            return "Rejeição: Versão informada para o modal não suportada";
        }
        if (cStat.equals("579")) {
            return "Rejeição: CPF do Local de Entrega inválido ";
        }
        if (cStat.equals("580")) {
            return "Rejeição: Falha no Schema XML específico para o modal";
        }
        if (cStat.equals("581")) {
            return "Rejeição: Campo Valor da Carga deve ser informado para o modal";
        }
        if (cStat.equals("582")) {
            return "Rejeição: Grupo Tráfego Mútuo deve ser informado";
        }
        if (cStat.equals("583")) {
            return "Rejeição: Ferrovia emitente deve ser a de origem quando respFat=1";
        }
        if (cStat.equals("584")) {
            return "Rejeição: Referenciar o CT-e que foi emitido pela ferrovia de origem";
        }
        if (cStat.equals("585")) {
            return "Rejeição: IE Emitente não autorizada a emitir CT-e para o modal informado";
        }
        if (cStat.equals("586")) {
            return "Rejeição: Data e Justificativa de entrada em contingência não devem ser informadas para tipo de emissão normal. ";
        }
        if (cStat.equals("587")) {
            return "Rejeição: Data e Justificativa de entrada em contingência devem ser informadas";
        }
        if (cStat.equals("588")) {
            return "Rejeição: Data de entrada em contingência posterior a data de emissão.";
        }                
        if (cStat.equals("589")) {
            return "Rejeição: O lote contém CT-e de mais de um modal";
        }
        if (cStat.equals("590")) {
            return "Rejeição: O lote contem CT-e de mais de uma versão de modal";
        }
        if (cStat.equals("591")) {
            return "Rejeição: Tipo autorizador do recibo diverge do Órgão Autorizador ";
        }
        if (cStat.equals("592")) {
            return "Rejeição: Chave de acesso inválida (Ano < 2009 ou Ano maior que Ano corrente)";
        }
        if (cStat.equals("593")) {
            return "Rejeição: Chave de acesso inválida (Mês = 0 ou Mês > 12)";
        }
        if (cStat.equals("594")) {
            return "Rejeição: Chave de acesso inválida (CNPJ zerado ou digito inválido)";
        }
        if (cStat.equals("595")) {
            return "Rejeição: Chave de acesso inválida (modelo diferente de 57)";
        }
        if (cStat.equals("596")) {
            return "Rejeição: Chave de acesso inválida (numero CT = 0)";
        }
        if (cStat.equals("598")) {
            return "Rejeicao: Usar somente o namespace padrao do CT-e";
        }
        if (cStat.equals("599")) {
            return "Rejeicao: Nao é permitida a presenca de caracteres de edicao no inicio/fim da mensagem ou entre as tags da mensagem";
        }
        if (cStat.equals("600")) {
            return "Rejeicao: Chave de Acesso difere da existente em BD";
        }
        if (cStat.equals("601")) {
            return "Rejeição: Quantidade de documentos informados no remetente excede limite de 2000";
        }
        if (cStat.equals("602")) {
            return "Rejeição: Chave de acesso de NF-e inválida (Ano < 2005 ou Ano maior que Ano corrente)";
        }
        if (cStat.equals("603")) {
            return "Rejeição: Chave de acesso de NF-e inválida (Mês = 0 ou Mês > 12)";
        }
        if (cStat.equals("604")) {
            return "Rejeição: Chave de acesso de NF-e inválida (CNPJ zerado ou digito inválido)";
        }
        if (cStat.equals("605")) {
            return "Rejeição: Chave de acesso de NF-e inválida (modelo diferente de 55)";
        }
        if (cStat.equals("606")) {
            return "Rejeição: Chave de acesso de NF-e inválida (numero NF = 0) ";
        }                
        if (cStat.equals("999")) {
            return "Rejeição: Erro não catalogado (informar a mensagem de erro capturado no tratamento da exceção)";
        }
        if (cStat.equals("301")) {
            return "Uso Denegado : Irregularidade fiscal do emitente ";
        }
        if (cStat.equals("302")) {
            return "Uso Denegado : Irregularidade fiscal do remetente";
        }        
        if (cStat.equals("303")) {
            return "Uso Denegado : Irregularidade fiscal do destinatário";
        }
        if (cStat.equals("304")) {
            return "Uso Denegado : Irregularidade fiscal do expedidor";
        }
        if (cStat.equals("305")) {
            return "Uso Denegado : Irregularidade fiscal do recebedor ";
        }
        if (cStat.equals("306")) {
            return "Uso Denegado : Irregularidade fiscal do tomador";
        }                       
        return "";
    }

    public static void main(String[] args) {
        String s = "<retConsSitCTe xmlns=\"http://www.portalfiscal.inf.br/CTe\" versao=\"2.00\"><tpAmb>1</tpAmb><verAplic>2.00</verAplic><cStat>217</cStat><xMotivo>Rejeicao: CT-e nao consta na base de dados da SEFAZ</xMotivo><cUF>31</cUF><chCTe>31121005202781000110550010000003941273845853</chCTe></retConsSitCTe>";
        s = "<retConsSitCTe xmlns=\"http://www.portalfiscal.inf.br/CTe\" versao=\"2.00\"><tpAmb>1</tpAmb><verAplic>2.00</verAplic><cStat>217</cStat><xMotivo>Rejeicao: CT-e nao consta na base de dados da SEFAZ</xMotivo><cUF>31</cUF><chCTe>31121005202781000110550010000003941273845853</chCTe></retConsSitCTe>";
        validarRetornoXML(s, "consulta");
    }

    public static String[] validarRetornoXML(String xml, String tipoMetodo) {
        String retorno[] = new String[5];
        System.err.println("validarRetornoXML XML :" + xml);

        if (tipoMetodo.equals("envio")) {

            XMLretEnviCTe TratamentoRetorno200 = new XMLretEnviCTe();
            // Trata o retorno dos dados do cancelamento
            // em uma classe para tratamento de xml
            TratamentoRetorno200.setXML(xml);
            TratamentoRetorno200.BuscaDadosXML();
            // Gravar os dados 
            // Codigo Status
            retorno[0] = TratamentoRetorno200.getRetEnv().getcStat();
            // Motivo
            retorno[1] = TratamentoRetorno200.getRetEnv().getxMotivo();
            // Numero recibo
            retorno[2] = TratamentoRetorno200.getRetEnv().getInfRec().getnRec();
            // Protocolo
            retorno[3] = "";
            // Data hora recebimento
            retorno[4] = TratamentoRetorno200.getRetEnv().getInfRec().getDhRecbto();

        } else if (tipoMetodo.equals("cancelamento")) {           
            XMLretCancCte TratamentoRetorno200 = new XMLretCancCte();

            if (xml.contains("<cStat>101</cStat>")) {
                // Trata o retorno dos dados do cancelamento
                // em uma classe para tratamento de xml
                TratamentoRetorno200.setXML(xml);
                TratamentoRetorno200.BuscaDadosXML();
             
                retorno[0] = TratamentoRetorno200.getRetCanc().getInfCanc().getcStat();
                // Motivo
                retorno[1] = TratamentoRetorno200.getRetCanc().getInfCanc().getxMotivo();
                // Numero recibo
                retorno[2] = "";
                // Protocolo
                retorno[3] = TratamentoRetorno200.getRetCanc().getInfCanc().getnProt();
                // Data hora recibimento
                retorno[4] = TratamentoRetorno200.getRetCanc().getInfCanc().getDhRecbto();
            } else {
                // Trata o retorno dos dados do cancelamento
                // em uma classe para tratamento de xml
                TratamentoRetorno200.setXML(xml);
                TratamentoRetorno200.BuscaDadosXML();
                // Grava os dados caso nao seja
                // Codigo Status
                retorno[0] = TratamentoRetorno200.getRetCanc().getInfCanc().getcStat();
                // Motivo
                retorno[1] = TratamentoRetorno200.getRetCanc().getInfCanc().getxMotivo();
                // Numero recibo
                retorno[2] = "";
                // Protocolo
                retorno[3] = "";
                // Data hora recebimento
                retorno[4] = TratamentoRetorno200.getRetCanc().getInfCanc().getDhRecbto();
            }
        } else if (tipoMetodo.equals("inutilizacao")) {
//            XMLretInutCTeH200 TratamentoRetornoH200 = new XMLretInutCTeH200();
//            XMLretInutCTe200 TratamentoRetorno200 = new XMLretInutCTe200();

//            if (xml.contains("<cStat>102</cStat>")) {
//                // Trata o retorno dos dados do cancelamento
//                // em uma classe para tratamento de xml
//                TratamentoRetornoH200.setXML(xml);
//                TratamentoRetornoH200.BuscaDadosXML();
//                // Gravar os dados caso cancele
//                // Codigo Status
//                retorno[0] = TratamentoRetornoH200.cStat();
//                // Motivo
//                retorno[1] = TratamentoRetornoH200.xMotivo();
//                // Numero recibo
//                retorno[2] = "";
//                // Protocolo
//                retorno[3] = TratamentoRetornoH200.nProt();
//                // Data hora recebimento
//                retorno[4] = TratamentoRetornoH200.dhRecbto();
//            } else {
//                // Trata o retorno dos dados do cancelamento
//                // em uma classe para tratamento de xml
//                TratamentoRetorno200.setXML(xml);
//                TratamentoRetorno200.BuscaDadosXML();
//                // Grava os dados caso nao sejas]
//                // Codigo Status
//                retorno[0] = TratamentoRetorno200.cStat();
//                // Motivo
//                retorno[1] = TratamentoRetorno200.xMotivo();
//                // Numero recibo
//                retorno[2] = "";
//                // Protocolo
//                retorno[3] = "";
//                // Data hora recebimento
//                retorno[4] = "";
//            }
//        } else if (tipoMetodo.equals("consulta")) {
//
//            XMLretConsSitCTe200 XMLretConsSitCTe200 = new XMLretConsSitCTe200();
//            XMLretConsSitCTe_protCTe200 XMLretConsSitCTe_protCTe200 = new XMLretConsSitCTe_protCTe200();
//            XMLretConsSitCTe_retCancCTe200 XMLretConsSitCTe_retCancCTe200 = new XMLretConsSitCTe_retCancCTe200();
//            // 
//            XMLretConsReciCTe_FalhaDados200 TratamentoRetornoFalhaDados200 = new XMLretConsReciCTe_FalhaDados200();
//            XMLretConsReciCTenProt_Autorizado200 TratamentoRetornoAutorizado200 = new XMLretConsReciCTenProt_Autorizado200();
//            XMLretConsReciCTe_FalhaSchema200 TratamentoRetornoFalhaSchema200 = new XMLretConsReciCTe_FalhaSchema200();
//            //
//            if (xml.contains("retConsSitCTe")) {
//                System.err.println("Consulta retConsSitCTe");
//                if (xml.contains("<protCTe")) {
//                    System.err.println("protCTe");
//                    XMLretConsSitCTe_protCTe200.setXML(xml);
//                    XMLretConsSitCTe_protCTe200.BuscaDadosXML();
//
//                } else if (xml.contains("<retCancCTe")) {
//                    System.err.println("retCancCTe");
//                    XMLretConsSitCTe_retCancCTe200.setXML(xml);
//                    XMLretConsSitCTe_retCancCTe200.BuscaDadosXML();
//                } else {
//                    System.err.println("asdfasdf");
//                    XMLretConsSitCTe200.setXML(xml);
//                    XMLretConsSitCTe200.BuscaDadosXML();
//                }
//
//            }
//
//
//            if (!xml.equals("0")) {
//                if (xml.contains("<protCTe")) {
//                    // Sucesso autorizacao             
//                    TratamentoRetornoAutorizado200.setXML(xml);
//                    TratamentoRetornoAutorizado200.BuscaDadosXML();
//                   
//                    //if (NF.getChaveAcesso().equals(TratamentoRetornoAutorizado200.infProtchCTe(x))) {
//                    if (TratamentoRetornoAutorizado200.infProtnProt() == null) {
//                        System.err.println("ERRO");
//                        
//                        
//                          // Codigo Status
//                        retorno[0] = TratamentoRetornoAutorizado200.infProtcStat();
//                        // Motivo
//                        retorno[1] = TratamentoRetornoAutorizado200.infProtxMotivo();
//                        // Numero recibo
//                        retorno[2] = TratamentoRetornoAutorizado200.nRec();
//                        // Protocolo
//                        retorno[3] = " ";
//                        // Data hora recebimento
//                        retorno[4] = TratamentoRetornoAutorizado200.infProtdhRecbto();
//                                             
////                      
//                    } else {
//                         // Codigo Status
//                        retorno[0] = TratamentoRetornoAutorizado200.infProtcStat();
//                        // Motivo
//                        retorno[1] = TratamentoRetornoAutorizado200.infProtxMotivo();
//                        // Numero recibo
//                        retorno[2] = " ";
//                        // Protocolo
//                        retorno[3] = TratamentoRetornoAutorizado200.infProtnProt();
//                        // Data hora recebimento
//                        retorno[4] = TratamentoRetornoAutorizado200.infProtdhRecbto();
//
//                    }
//
//                } else {
//                    System.err.println("Falha schema");
//                    TratamentoRetornoFalhaSchema200.setXML(xml);
//                    TratamentoRetornoFalhaSchema200.BuscaDadosXML();
//
//                    // Codigo Status
//                    retorno[0] = TratamentoRetornoFalhaSchema200.cStat();
//                    // Motivo
//                    retorno[1] = TratamentoRetornoFalhaSchema200.xMotivo();
//                    // Numero recibo
//                    retorno[2] = TratamentoRetornoFalhaSchema200.nRec();
//                    // Protocolo
//                    retorno[3] = "";
//                    // Data hora recebimento
//                    retorno[4] = "";
//                }
//            } else {
//                System.err.println("Falha schema");
//                TratamentoRetornoFalhaSchema200.setXML(xml);
//                TratamentoRetornoFalhaSchema200.BuscaDadosXML();
//
//                // Codigo Status
//                retorno[0] = TratamentoRetornoFalhaSchema200.cStat();
//                // Motivo
//                retorno[1] = TratamentoRetornoFalhaSchema200.xMotivo();
//                // Numero recibo
//                retorno[2] = TratamentoRetornoFalhaSchema200.nRec();
//                // Protocolo
//                retorno[3] = "";
//                // Data hora recebimento
//                retorno[4] = "";
//
//            }
//        } else if (tipoMetodo.equals("consultaCTe")) {

//            XMLretConsReciCTe_FalhaDados200 TR_FalhaDados200 = new XMLretConsReciCTe_FalhaDados200();
//            XMLretConsSitCTe200 TR_Autorizado200 = new XMLretConsSitCTe200();
//            XMLretConsSitCTe_FalhaSchema200 TR_FalhaSchema200 = new XMLretConsSitCTe_FalhaSchema200();
//
//            // CTe Canceladas
//            XMLretConsSitCTe_retCancCTe200 TratamentoRetornoHC200 = new XMLretConsSitCTe_retCancCTe200();
//            XMLretCancCTe200 TratamentoRetornoC200 = new XMLretCancCTe200();
//            // CTe Inutilizadas
//            XMLretInutCTeH200 TratamentoRetornoHI200 = new XMLretInutCTeH200();
//            XMLretInutCTe200 TratamentoRetornoI200 = new XMLretInutCTe200();
//
//            if (!xml.equals("0")) {
//                if (xml.contains("<retCancCTe")) {
//                    System.err.println("Entrei Consulta CTe 1");
//                    // Trata o retorno dos dados do cancelamento
//                    // em uma classe para tratamento de xml
//                    TratamentoRetornoHC200.setXML(xml);
//                    TratamentoRetornoHC200.BuscaDadosXML();
//                    // Gravar os dados caso cancele
//                    // Codigo Status
//                    retorno[0] = TratamentoRetornoHC200.getXmlretConsSitCTe().getRetCancCTe().getInfCanc().getcStat();
//                    // Motivo
//                    retorno[1] = TratamentoRetornoHC200.getXmlretConsSitCTe().getRetCancCTe().getInfCanc().getxMotivo();
//                    // Numero recibo
//                    retorno[2] = "";
//                    // Protocolo
//                    retorno[3] = TratamentoRetornoHC200.getXmlretConsSitCTe().getRetCancCTe().getInfCanc().getnProt();
//                    // Data hora recebimento
//                    retorno[4] = TratamentoRetornoHC200.getXmlretConsSitCTe().getRetCancCTe().getInfCanc().getDhRecbto();
//
//
////                        } else if (Retorno.contains("<cStat>102</cStat>")) {
////                            // Trata o retorno dos dados do cancelamento
////                            // em uma classe para tratamento de xml
////                            TratamentoRetornoHI200.setXML(Retorno);
////                            TratamentoRetornoHI200.BuscaDadosXML();
////                            // Gravar os dados caso cancele
////                            NF.setInutilizada(true);
////                            NF.setInutilizadaCodigoStatus(TratamentoRetornoHI200.cStat());
////                            NF.setInutilizadaMotivo(TratamentoRetornoHI200.xMotivo());
////                            NF.setInutilizadaJustificativa(NF.getInutilizadaJustificativa());
////                            //NF.setCanceladaNumeroRecibo(SenhaCertificado);
////                            NF.setInutilizadaProtocoloAutorizacao(TratamentoRetornoHI200.nProt());
////
////                            JOptionPane.showMessageDialog(null, "Nota Fiscal Inutilizada com sucesso!", "Atenção", 2);
////                            NF.GravarInutilizacaoNotaFiscal(CodigoID);
////
//                } else if (xml.contains("<infProt")) {
//                    // Sucesso autorizacao
//                    System.err.println("Entrei Consulta CTe 2");
//                    System.err.println("OK");
//                    TR_Autorizado200.setXML(xml);
//                    TR_Autorizado200.BuscaDadosXML();
//
//
//                    System.err.println("Entrei Consulta CTe 5");
//                    // Codigo Status
//                    retorno[0] = TR_Autorizado200.getXmlretConsSitCTe().getProtCTe().getInfProt().getcStat();
//                    // Motivo
//                    retorno[1] = TR_Autorizado200.getXmlretConsSitCTe().getProtCTe().getInfProt().getxMotivo();
//                    // Numero recibo
//                    retorno[2] = "";
//                    // Protocolo
//                    retorno[3] = TR_Autorizado200.getXmlretConsSitCTe().getProtCTe().getInfProt().getnProt();
//                    // Data hora recebimento
//                    retorno[4] = TR_Autorizado200.getXmlretConsSitCTe().getProtCTe().getInfProt().getDhRecbto();
//
//                } else {
//                    System.err.println("Falha schema");
//                    System.err.println("Entrei Consulta CTe 3");
//                    TR_FalhaSchema200.setXML(xml);
//                    TR_FalhaSchema200.BuscaDadosXML();
//                    // Codigo Status
//                    retorno[0] = TR_FalhaSchema200.getXmlretConsSitCTe().getcStat();
//                    // Motivo
//                    retorno[1] = TR_FalhaSchema200.getXmlretConsSitCTe().getxMotivo();
//                    // Numero recibo
//                    retorno[2] = "";
//                    // Protocolo
//                    retorno[3] = "";
//                    // Data hora recebimento
//                    retorno[4] = "";
//
//                }
//            }
        }
        return retorno;
    }

    public static String TratarRetornoCTeValidarXML(String Codigo) {
        if (Codigo.contains("TIdLote")) {
            return "Verifique o lote das Notas Fiscais";
        }
        if (Codigo.contains("#AnonType_IdinfCTeTCTe")) {
            return "Verifique os dados da Empresa na configuração do Sistema";
        }
        if (Codigo.contains("#AnonType_cNFideinfCTeTCTe")) {
            return "Verifique o código do municipio da empresa Emitente";
        }
        if (Codigo.contains("#AnonType_natOpideinfCTeTCTe")) {
            return "Verifique a Natureza de Operação da Nota Fiscal";
        }
        if (Codigo.contains("[55]")) {
            return "Verifique o Modelo da Nota Fiscal";
        }
        if (Codigo.contains("TSerie")) {
            return "Verifique a Serie da Nota Fiscal";
        }
        if (Codigo.contains("TNF")) {
            return "";
        }
        if (Codigo.contains("TData")) {
            return "Verifique as Datas de Emissão e Saída da Nota Fiscal";
        }
        if (Codigo.contains("TCodMunIBGE")) {
            return "Verifique o código do municipio do Emitente";
        }
        if (Codigo.contains("#AnonType_cDVideinfCTeTCTe")) {
            return "Verifique o Digito Verificador da Chave de acesso";
        }
        if (Codigo.contains("#AnonType_verProcideinfCTeTCTe")) {
            return "Falha ao Buscar Versão do Aplicativo";
        }
        if (Codigo.contains("TCnpj")) {
            return "Verifique o CNPJ do Emitente e do Destinatário";
        }
        if (Codigo.contains("#AnonType_xNomeemitinfCTeTCTe")) {
            return "Verifique o nome do Emitente";
        }
        if (Codigo.contains("#AnonType_xFantemitinfCTeTCTe")) {
            return "Verifique o nome Fantasia do Emitente";
        }
        if (Codigo.contains("#AnonType_xLgrTEnderEmi")) {
            return "Verifique o Logradouro do Emitente";
        }
        if (Codigo.contains("#AnonType_nroTEnderEmi")) {
            return "Verifique o Número do Emitente";
        }
        if (Codigo.contains("#AnonType_xCplTEnderEmi")) {
            return "Verifique o Complemento do endereço do Emitente";
        }
        if (Codigo.contains("#AnonType_xBairroTEnderEmi")) {
            return "Verifique o Bairro do Emitente";
        }
        if (Codigo.contains("TCodMunIBGE")) {
            return "Verifique os Códigos do Municipio do Emitente e Destinatário";
        }
        if (Codigo.contains("#AnonType_xMunTEnderEmi")) {
            return "Verifique o Municipio do Emitente";
        }
        if (Codigo.contains("#AnonType_CEPTEnderEmi")) {
            return "Verifique o CEP do Emitente";
        }
        if (Codigo.contains("#AnonType_cPaisTEnderEmi")) {
            return "Verifique o código do Pais do Emitente";
        }
        if (Codigo.contains("#AnonType_xPaisTEnderEmi")) {
            return "Verifique o Pais do Emitente";
        }
        if (Codigo.contains("#AnonType_foneTEnderEmi")) {
            return "Verifique o Telefone do Emitente";
        }
        if (Codigo.contains("TIe")) {
            return "Verifique a Inscrição Estadual do Emitente";
        }
        if (Codigo.contains("TCpf")) {
            return "Verifique o CPF do Emitente e do Destinatário";
        }
        if (Codigo.contains("#AnonType_xNomedestinfCTeTCTe")) {
            return "Verifique o Nome do Destinatário";
        }
        if (Codigo.contains("#AnonType_xLgrTEndereco")) {
            return "Verifique o Logradouro do Destinatário";
        }
        if (Codigo.contains("#AnonType_nroTEndereco")) {
            return "Verifique o Número do Destinatário";
        }
        if (Codigo.contains("#AnonType_xBairroTEndereco")) {
            return "Verifique o Bairro do Destinatário";
        }
        if (Codigo.contains("TCodMunIBGE")) {
            return "Verifique os Códigos do Municipio do Emitente e Destinatário";
        }
        if (Codigo.contains("#AnonType_xMunTEndereco")) {
            return "Verifique o Municipio do Destinatário";
        }
        if (Codigo.contains("#AnonType_CEPTEndereco")) {
            return "Verifique o CEP do Destinatário";
        }
        if (Codigo.contains("#AnonType_cPaisTEndereco")) {
            return "Verifique o Código do Pais do Destinatário";
        }
        if (Codigo.contains("#AnonType_xPaisTEndereco")) {
            return "Veririque o Pais do Destinatário";
        }
        if (Codigo.contains("#AnonType_foneTEndereco")) {
            return "Verifique o Telefone do Destinatario";
        }
        if (Codigo.contains("TIeDest")) {
            return "Verifique a Inscrição Estadual do Destinatário";
        }
        if (Codigo.contains("#AnonType_cProdproddetinfCTeTCTe")) {
            return "Erro no código do produto da Nota Fiscal";
        }
        if (Codigo.contains("#AnonType_xProdproddetinfCTeTCTe")) {
            return "Verifique o Nome dos produtos da Nota Fiscal";
        }
        if (Codigo.contains("#AnonType_uComproddetinfCTeTCTe")) {
            return "Verifique a Unidade dos produtos da Nota Fiscal";
        }
        if (Codigo.contains("TDec_0804")) {
            return "Verifique a quantidade dos Produtos na Nota Fiscal";
        }
        if (Codigo.contains("TDec_1204")) {
            return "Verifique o valor unitário dos Produtos na Nota Fiscal";
        }
        if (Codigo.contains("TDec_1302")) {
            return "Verifique o valor total dos Produtos na Nota Fiscal";
        }
        if (Codigo.contains("#AnonType_uTribproddetinfCTeTCTe")) {
            return "Verifique a Unidade tributável dos Produtos da Nota Fiscal";
        }
        if (Codigo.contains("TDec_0804")) {
            return "Verifique a quantidade tributável dos Produtos da Nota Fiscal";
        }
        if (Codigo.contains("TDec_1204")) {
            return "Verifique o valor total tributável dos Produtos na Nota Fiscal";
        }
        if (Codigo.contains("TDec_1302")) {
            return "Verifique o valor da Base de Calculo de ICMS";
        }
        if (Codigo.contains("TDec_0302")) {
            return "Verifique o valor da aliquota de ICMS";
        }
        if (Codigo.contains("TDec_1302")) {
            return "Verifique o valor do ICMS";
        }
        if (Codigo.contains("TDec_1302")) {
            return "Verifique a modalidade da Base de Calculo de ICMS ST";
        }
        if (Codigo.contains("TDec_0302")) {
            return "Verifique o valor da aliquota de ICMS";
        }
        if (Codigo.contains("TDec_1302")) {
            return "Verifique o valor do ICMS";
        }
        if (Codigo.contains("#AnonType_clEnqIPIimpostodetinfCTeTCTe")) {
            return "Verifique a classe de enquadramento do IPI";
        }
        if (Codigo.contains("#AnonType_cSeloIPIimpostodetinfCTeTCTe")) {
            return "Verifique o codigo do Selo de controle";
        }
        if (Codigo.contains("#AnonType_qSeloIPIimpostodetinfCTeTCTe")) {
            return "Verifique a quantidade do Selo de controle";
        }
        if (Codigo.contains("#AnonType_cEnqIPIimpostodetinfCTeTCTe")) {
            return "Verifique o código de Enquadramento Legal do IPI";
        }
        if (Codigo.contains("TDec_1302")) {
            return "Verifique o valor da Base de Calculo de ICMS";
        }
        if (Codigo.contains("TDec_0302")) {
            return "Verifique o valor da aliquota de ICMS";
        }
        if (Codigo.contains("TDec_1302")) {
            return "Verifique o valor do ICMS";
        }
        if (Codigo.contains("TCpf")) {
            return "Verifique o CPF do Emitente e do Destinatário";
        }
        if (Codigo.contains("#AnonType_xNometransportatranspinfCTeTCTe")) {
            return "Verifique o nome do Transportador";
        }
        if (Codigo.contains("#AnonType_IEtransportatranspinfCTeTCTe")) {
            return "Verifique a Inscrição Estadual do Tranportador";
        }
        if (Codigo.contains("#AnonType_xEndertransportatranspinfCTeTCTe")) {
            return "Verifique o Endereço do Transportador";
        }
        if (Codigo.contains("#AnonType_xMuntransportatranspinfCTeTCTe")) {
            return "Verifique o Municipio do Transportador";
        }
        if (Codigo.contains("#AnonType_placaTVeiculo")) {
            return "Verifique a placa do Veiculo do Transportador";
        }
        if (Codigo.contains("#AnonType_RNTCTVeiculo")) {
            return "Verifique o código ANTT do Transportador";
        }
        if (Codigo.contains("#AnonType_qVolvoltranspinfCTeTCTe")) {
            return "Verifique a Quantidade de Volume da Nota Fiscal";
        }
        if (Codigo.contains("#AnonType_espvoltranspinfCTeTCTe")) {
            return "Verifique a Especie da Nota Fiscal";
        }
        if (Codigo.contains("#AnonType_marcavoltranspinfCTeTCTe")) {
            return "Verifique a Marca da Nota Fiscal";
        }
        if (Codigo.contains("TDec_1203")) {
            return "Verifique o Peso da nota Fiscal";
        }
        return "";
    }

    public String getNotaFiscalXML() {
        return notaFiscalXML;
    }

    public void setNotaFiscalXML(String notaFiscalXML) {
        this.notaFiscalXML = notaFiscalXML;
    }

    public String getNotaFiscalXMLAssinada() {
        return notaFiscalXMLAssinada;
    }

    public void setNotaFiscalXMLAssinada(String notaFiscalXMLAssinada) {
        this.notaFiscalXMLAssinada = notaFiscalXMLAssinada;
    }
}
