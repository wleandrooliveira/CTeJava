/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte;

import br.com.moveti.erpmove.transporte.controller.SocketFactoryDinamico;
import br.com.moveti.erpmove.transporte.controller._Funcoes;
import br.com.moveti.erpmove.transporte.cte.webservice.CteCancelamento.CteCancelamentoStub;
import br.com.moveti.erpmove.transporte.cte.webservice.CteConsulta.CteConsultaStub;
import br.com.moveti.erpmove.transporte.cte.webservice.CteInutilizacao.CteInutilizacaoStub;
import br.com.moveti.erpmove.transporte.cte.webservice.CteRecepcao.CteRecepcaoStub;

import br.com.moveti.erpmove.transporte.cte.webservice.CteRetRecepcao.CteRetRecepcaoStub;
import br.com.moveti.erpmove.transporte.cte.webservice.CteStatusServico.CteStatusServicoStub;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.apache.commons.httpclient.protocol.Protocol;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

/**
 *
 * @author henriquelacerda
 */
public class transmissoesCTe {

    private Provider p;
    private Provider op;
    private KeyStore ks;
    private static final int SSL_PORT = 443;
    private String XML = "";
    private String XMLAssinado = "";
    private String XMLEventoCCe = "";
    private String tipoCertificado = "";
    private String senhaCertificado = "";
    private String configuracaoCertificadoA1 = "";
    private String configuracaoCertificadoA3 = "";
    private String CaminhoKeyStoreTodos = "key.jks";
    private InputStream stream = null;
    private String configuracaoVersaoAmbiente = "";
    private String configuracaoModeloNf = "";
    private String configuracaoSerieNf = "";
    private String configuracaoAmbienteEmissaoNf = "";
    private String empresaCodEstado = "";
    private String empresaCnpj = "";
    private String estado = "";
    private String tipo = "";
    private String arquivoCacertsGeradoTodosOsEstados;
    private boolean ProtocoloAdicionado = false;
    private String aliasCertificado = "";
    

    // Assinar Nota Fiscal
    public boolean assinarControleTransporte() throws Exception {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(getXML().toString().getBytes("UTF-8")));
            doc.setXmlStandalone(true);
            doc.getDocumentElement().removeAttribute("xmlns:ns2");
            NodeList elements = doc.getElementsByTagName("infCte");
            Element el = (Element) elements.item(0);
            String id = el.getAttribute("Id"); 
            el.setIdAttribute("Id", true);
            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
            // Create a Reference to the enveloped document (in this case,
            // you are signing the whole document, so a URI of "" signifies
            // that, and also specify the SHA1 digest algorithm and
            // the ENVELOPED Transform.
            ArrayList transformList = new ArrayList();
            TransformParameterSpec tps = null;
            Transform envelopedTransform = fac.newTransform(Transform.ENVELOPED, tps);
            Transform c14NTransform = fac.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);
            stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
            transformList.add(envelopedTransform);
            transformList.add(c14NTransform);
            // Load the KeyStore and get the signing key and certificate.
            KeyStore ks = KeyStore.getInstance("PKCS12");
            char[] pin;
            Provider p2[];
            if (getTipoCertificado().equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {
                configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
                Provider p = new sun.security.pkcs11.SunPKCS11(stream);
                //p = new sun.security.pkcs11.SunPKCS11("SunPKCS11-SmartCard");               
                // procura e remove o ultimo provider               
                Security.addProvider(p);
                /*
                 * if (Security.getProviders().length > 0) {
                 * System.err.println("Verifica providers"); p2 =
                 * Security.getProviders(); for (int i =0; i < p2.length; i++) {
                 * System.err.println(p2[0].getInfo()); if
                 * (p2[0].getName().equals(p.getName())) {
                 * System.err.println(p.getName()); }
                 * //Security.removeProvider(p2[0].getName()); } }
                 */

//                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS11");
//                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            KeyStore.PrivateKeyEntry pkEntry = null;
            Enumeration aliasesEnum = ks.aliases();
            PrivateKey privateKey = null;
            while (aliasesEnum.hasMoreElements()) {
                String alias = (String) aliasesEnum.nextElement();
                if (ks.isKeyEntry(alias)) {
                    KeyStore.PasswordProtection asdf = new KeyStore.PasswordProtection(getSenhaCertificado().toCharArray());
                    KeyStore.Entry f = ks.getEntry(alias, asdf);
                    pkEntry = (KeyStore.PrivateKeyEntry) f;
                    privateKey = pkEntry.getPrivateKey();
                    break;
                }
            }
            X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
            // Create the KeyInfo containing the X509Data.
            KeyInfoFactory kif = fac.getKeyInfoFactory();
            List x509Content = new ArrayList();
            // x509Content.add(cert.getSubjectX500Principal().getName());
            x509Content.add(cert);
            X509Data xd = kif.newX509Data(x509Content);
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
            //System.err.println("Teste 04 ");
            // doc.getDocumentElement().removeAttribute("xmlns:ns2");
            // ((Element)
            // doc.getDocumentElement().getElementsByTagName("CTe").item(0))
            // .setAttribute("xmlns", "http://www.portalfiscal.inf.br/CTe");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.
            Reference ref = fac.newReference("#" + id, fac.newDigestMethod(
                    DigestMethod.SHA1, null), transformList, null, null);
            //System.err.println("Teste 05 ");
            // Create the SignedInfo.
            SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(
                    CanonicalizationMethod.INCLUSIVE,
                    (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                    Collections.singletonList(ref));
            // Create the XMLSignature, but don't sign it yet.
            XMLSignature signature = fac.newXMLSignature(si, ki);
            // Marshal, generate, and sign the enveloped signature.
            // Create a DOMSignContext and specify the RSA PrivateKey and
            // location of the resulting XMLSignature's parent element.           
            DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());
            signature.sign(dsc);
            // Output the resulting document.
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();
            trans.transform(new DOMSource(doc), new StreamResult(os));
            this.setXMLAssinado(os.toString());
            if (!getTipoCertificado().equals("A1")) {
                //Security.removeProvider(p.getName());
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void assinarCTe(XMLSignatureFactory fac, ArrayList transformList, PrivateKey privateKey, KeyInfo ki, Document doc, int i) throws Exception {
        // Obtem elemento do documento a ser assinado, será criado uma
        // REFERENCE para o mesmo
        NodeList elements = doc.getElementsByTagName("infCte");
        Element el = (Element) elements.item(i);
        String id = el.getAttribute("Id");
        // doc.getDocumentElement().removeAttribute("xmlns:ns2");
        // ((Element)
        // doc.getDocumentElement().getElementsByTagName("CTe").item(0))
        // .setAttribute("xmlns", "http://www.portalfiscal.inf.br/CTe");
        // Create a DOM XMLSignatureFactory that will be used to
        // generate the enveloped signature.
        Reference ref = fac.newReference("#" + id, fac.newDigestMethod(
                DigestMethod.SHA1, null), transformList, null, null);
        // Create the SignedInfo.
        SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(
                CanonicalizationMethod.INCLUSIVE,
                (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                Collections.singletonList(ref));
        // Create the XMLSignature, but don't sign it yet.
        XMLSignature signature = fac.newXMLSignature(si, ki);
        // Marshal, generate, and sign the enveloped signature.
        // Create a DOMSignContext and specify the RSA PrivateKey and
        // location of the resulting XMLSignature's parent element.
        DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement().getElementsByTagName("CTe").item(i));
        signature.sign(dsc);
    }
    // Validar Nota Fiscal
    public String validarXMLControlesTransporte() {
        try {
            //Parse an XML document into a DOM tree.
            //DocumentBuilder parser =
            //(DocumentBuilderFactory.newInstance().setNamespaceAware(true)).newDocumentBuilder();
            DocumentBuilderFactory DBF = DocumentBuilderFactory.newInstance();
            DBF.setNamespaceAware(true);
            DocumentBuilder parser = DBF.newDocumentBuilder();
            InputStream IS = new ByteArrayInputStream(getXMLAssinado().getBytes());

            Document document = parser.parse(IS);

            // Create a SchemaFactory capable of understanding WXS schemas.
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            InputStream is = null;
            // Load a WXS schema, represented by a Schema instance.
//            System.err.println("SAIDA :"+url.getFile());
//            is = getClass().getClassLoader().getResourceAsStream("Schema/CTe_v2.00.xsd");
//            Source schemaFile = new StreamSource(new File(".").getCanonicalPath() + "\\Schema\\CTe_v2.00.xsd");

            //new File(getClass().getClassLoader().getResource("Schema/CTe_v2.00.xsd").getFile());
            String Path = new crncomp.parametros._verificaParametro(11).getValorString();
            Source schemaFile = new StreamSource(new File(Path + "/Schema/cte_v1.04.xsd"));

            Schema schema = factory.newSchema(schemaFile);
            // Create a Validator object, which can be used to validate
            // an instance document.
            Validator validator = schema.newValidator();

            // Validate the DOM tree.
            validator.validate(new DOMSource(document));
            return "OK";
        } catch (ParserConfigurationException e) {
            return e.getMessage();
        } catch (SAXException e) {
            return e.getMessage();
        } catch (IOException e) {
            // exception handling
            System.err.println(e.getMessage());
            return e.getMessage();
        }
    }

    public String enviarControlesTransporte(int numeracaoLote) {
        String Resultado = "0";
         try {
            URL url;
            if (configuracaoAmbienteEmissaoNf.equals("2")) {
                if ("S".equals(tipo)) {
                    url = new URL("https://hom.CTe.fazenda.gov.br/SCAN/CTeRecepcao2/CTeRecepcao2.asmx");
                } else {
                    if (getEstado().equals("MT")) {
                        url = new URL("https://homologacao.sefaz.mt.gov.br/ctews/services/CteRecepcao");
                    } else if (getEstado().equals("MS")) {
                        url = new URL("https://producao.cte.ms.gov.br/cteWEB/CteRecepcao.asmx");
                    } else if (getEstado().equals("MG")) {
                        url = new URL("https://hcte.fazenda.mg.gov.br/cte/services/CteRecepcao ");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://homologacao.cte.fazenda.pr.gov.br/cte/CteRecepcao");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://homologacao.cte.sefaz.rs.gov.br/ws/cterecepcao/cterecepcao.asmx");
                    } else {
                        //if (getEstado().equals("SP")) {
                        url = new URL("https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx");
                    }
                }
            } else {
                if ("S".equals(tipo)) {
                    url = new URL("https://www.scan.fazenda.gov.br/CTeRecepcao2/CTeRecepcao2.asmx");
                } else {
                    if (getEstado().equals("MG")) {
                        url = new URL("https://cte.fazenda.mg.gov.br/cte/services/CteRecepcao");
                    } else if (getEstado().equals("MS")) {
                        url = new URL("https://homologacao.cte.ms.gov.br/cteWEB/CteRecepcao.asmx");
                    } else if (getEstado().equals("MT")) {
                        url = new URL("https://cte.sefaz.mt.gov.br/ctews/services/CteRecepcao");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://CTe2.fazenda.pr.gov.br/CTe/CTeRecepcao2?wsdl");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://cte.fazenda.pr.gov.br/cte/CteRecepcao?wsdl");
                    } else { 
                        //if (getEstado().equals("SP")) {
                        url = new URL("https://nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx");
                    }
                }
            }
            // Realiza a conexao com WebService
            try {
                this.buscarDadosCertificado();

                String xml = getXMLAssinado().replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>", "");
                xml = xml.replace("xmlns=\"http://www.portalfiscal.inf.br/cte\"", "");
                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                        + "<enviCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"2.00\">"
                        + "<idLote>" + numeracaoLote + "</idLote>"
                        + getXML().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "").replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>", "").replace("xmlns=\"http://www.portalfiscal.inf.br/CTe\"", "")
                        + "</enviCTe>";
                
                this.assinarEnviCTe(CteDadosMsg);
                
//                System.out.println(url.toString());
//                System.out.println("XML");
//                System.out.println(CteDadosMsg);
                
                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
                CteRecepcaoStub.CteDadosMsg dadosMsg = new CteRecepcaoStub.CteDadosMsg();
                dadosMsg.setExtraElement(ome);
                CteRecepcaoStub.CteCabecMsg cteCabecMsg = new CteRecepcaoStub.CteCabecMsg();
                cteCabecMsg.setCUF(empresaCodEstado);
                cteCabecMsg.setVersaoDados("2.00");
                CteRecepcaoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoStub.CteCabecMsgE();
                cteCabecMsgE.setCteCabecMsg(cteCabecMsg);
                
                CteRecepcaoStub stub = new CteRecepcaoStub(url.toString());
                CteRecepcaoStub.CteRecepcaoLoteResult result = stub.cteRecepcaoLote(dadosMsg, cteCabecMsgE);
                Resultado = result.getExtraElement().toString();

            } catch (Exception e) {
                e.printStackTrace();

            }
        } catch (Exception e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }
        return Resultado;
    }

    public boolean assinarEnviCTe(String enviCTe) throws Exception {
        try {
            System.err.println("- Tentando transmissoesControleTransporte.:assinarEnviCTe");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Document docs = builder.parse(new File(
            // "c:/xml/430802017886010001735500000000010000030371-CTe.xml"));            
            Document doc = builder.parse(new ByteArrayInputStream(enviCTe.getBytes("UTF-8")));
            doc.setXmlStandalone(true);
            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            // Create a Reference to the enveloped document (in this case,
            // you are signing the whole document, so a URI of "" signifies
            // that, and also specify the SHA1 digest algorithm and
            // the ENVELOPED Transform.
            ArrayList transformList = new ArrayList();
            TransformParameterSpec tps = null;
            Transform envelopedTransform = fac.newTransform(Transform.ENVELOPED,
                    tps);
            Transform c14NTransform = fac.newTransform(
                    "http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);

            transformList.add(envelopedTransform);
            transformList.add(c14NTransform);
            // Load the KeyStore and get the signing key and certificate.
            KeyStore ks = KeyStore.getInstance("PKCS12");
            char[] pin;
            p = null;
            if (getTipoCertificado().equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {
                configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
                Provider p = new sun.security.pkcs11.SunPKCS11(stream);
                //p = new sun.security.pkcs11.SunPKCS11("SunPKCS11-SmartCard");               
                // procura e remove o ultimo provider               
                Security.addProvider(p);
                /*
                 * if (Security.getProviders().length > 0) {
                 * System.err.println("Verifica providers"); p2 =
                 * Security.getProviders(); for (int i =0; i < p2.length; i++) {
                 * System.err.println(p2[0].getInfo()); if
                 * (p2[0].getName().equals(p.getName())) {
                 * System.err.println(p.getName()); }
                 * //Security.removeProvider(p2[0].getName()); } }
                 */
//                pin = getSenhaCertificado().toCharArray();
                //ks = KeyStore.getInstance("PKCS11", p);
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.err.println("- Tentando transmissoesControleTransporte.:assinarCancCTe Retorno :" + ex.toString());
                }
            }
            /*
             * System.err.println(ks.getProvider());
             * System.err.println(ks.getType());
             */
            KeyStore.PrivateKeyEntry pkEntry = null;
            Enumeration aliasesEnum = ks.aliases();
            PrivateKey privateKey = null;
            while (aliasesEnum.hasMoreElements()) {
                String alias = (String) aliasesEnum.nextElement();
                if (ks.isKeyEntry(alias)) {
                    pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(
                            getSenhaCertificado().toCharArray()));
                    privateKey = pkEntry.getPrivateKey();
                    break;
                }
            }
            X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
            // Create the KeyInfo containing the X509Data.
            KeyInfoFactory kif = fac.getKeyInfoFactory();
            List x509Content = new ArrayList();
            // x509Content.add(cert.getSubjectX500Principal().getName());
            x509Content.add(cert);
            X509Data xd = kif.newX509Data(x509Content);
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
            for (int i = 0; i < doc.getDocumentElement().getElementsByTagName("CTe").getLength(); i++) {
                assinarCTe(fac, transformList, privateKey, ki, doc, i);
            }
            // Output the resulting document.
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();
            trans.transform(new DOMSource(doc), new StreamResult(os));
            this.setXMLAssinado(os.toString());
            System.out.println("XML: "+os.toString());
            if (!getTipoCertificado().equals("A1")) {
                //Security.removeProvider(p.getName());
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String retornoEnviaCTe(String transmitidaNumeroRecibo) {
        String Resultado = "0";
        try {
            URL url = null;
            if (getConfiguracaoAmbienteEmissaoNf().equals("2")) {
                if (getTipo().equals("S")) {
                    url = new URL("https://hom.CTe.fazenda.gov.br/SCAN/CTeRetRecepcao2/CTeRetRecepcao2.asmx");
                } else {
                    if (getEstado().equals("MT")) {
                        url = new URL("https://homologacao.sefaz.mt.gov.br/ctews/services/CteRetRecepcao");
                    } else if (getEstado().equals("MS")) {
                        url = new URL("https://homologacao.cte.ms.gov.br/cteWEB/CteRetRecepcao.asmx");
                    } else if (getEstado().equals("MG")) {
                        url = new URL("https://hcte.fazenda.mg.gov.br/cte/services/CteRetRecepcao");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://homologacao.cte.fazenda.pr.gov.br/cte/CteRetRecepcao");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://homologacao.cte.sefaz.rs.gov.br/ws/cteretrecepcao/CteRetRecepcao.asmx");
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteRetRecepcao.asmx");
                    }
                }
            } else {
                if (getTipo().equals("S")) {
                    url = new URL("https://www.scan.fazenda.gov.br/CTeRetRecepcao2/CTeRetRecepcao2.asmx");
                } else {
                    if (getEstado().equals("MG")) {
                        url = new URL("https://cte.fazenda.mg.gov.br/cte/services/CteRetRecepcao");
                    } else if (getEstado().equals("MS")) {
                        url = new URL("https://producao.cte.ms.gov.br/cteWEB/CteRetRecepcao.asmx");
                    } else if (getEstado().equals("MT")) {
                        url = new URL("https://cte.sefaz.mt.gov.br/ctews/services/CteRetRecepcao");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://cte.fazenda.pr.gov.br/cte/CteRetRecepcao");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://cte.sefaz.rs.gov.br/ws/cteretrecepcao/CteRetRecepcao.asmx");
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://nfe.fazenda.sp.gov.br/cteWEB/services/cteRetRecepcao.asmx");
                    }
                }
            }
            // Realiza a conexao com WebService
            try {
                this.buscarDadosCertificado();
                /**
                 * Xml de Consulta.
                 */
                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                        + "<consReciCTe xmlns=\"http://www.portalfiscal.inf.br/CTe\" versao=\"2.00\">"
                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb>"
                        + "<nRec>" + transmitidaNumeroRecibo + "</nRec>"
                        + "</consReciCTe>";

                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
                CteRetRecepcaoStub.CteDadosMsg dadosMsg = new CteRetRecepcaoStub.CteDadosMsg();
                dadosMsg.setExtraElement(ome);

                CteRetRecepcaoStub.CteCabecMsg CteCabecMsg = new CteRetRecepcaoStub.CteCabecMsg();
                /**
                 * Código do Estado.
                 */
                CteCabecMsg.setCUF(getEmpresaCodEstado());
                /**
                 * Versao do XML
                 */
                CteCabecMsg.setVersaoDados("2.00");
                CteRetRecepcaoStub.CteCabecMsgE CteCabecMsgE = new CteRetRecepcaoStub.CteCabecMsgE();
                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);
                CteRetRecepcaoStub stub = new CteRetRecepcaoStub(url.toString());
                CteRetRecepcaoStub.CteRetRecepcaoResult result = stub.cteRetRecepcao(dadosMsg, CteCabecMsgE);
                Resultado = result.getExtraElement().toString();
            } catch (Exception e) {
                System.err.println("- +transmissoesControleTransporte.:retornoEnviaCTe Retorno:" + e.toString());
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("- -transmissoesControleTransporte.:retornoEnviaCTe Retorno:" + e.toString());
        }

        System.err.println("-transmissoesControleTransporte.:retornoEnviaCTe Retorno:" + Resultado);
        return Resultado;

    }

    public String consultarCTe(String chaveAcesso) {
        System.err.println("- Tentando transmissoesControleTransporte.:consultarCTe");
        String Resultado = "0";

        try {
            URL url = null;
            if (getConfiguracaoAmbienteEmissaoNf().equals("2")) {

                url = new URL("https://hom.CTe.fazenda.gov.br/SCAN/CTeConsulta2/CTeConsulta2.asmx");

                if (getEstado().equals("MT")) {
                    url = new URL("https://homologacao.sefaz.mt.gov.br/ctews/services/CteConsulta");
                } else if (getEstado().equals("MS")) {
                    url = new URL("https://homologacao.cte.ms.gov.br/cteWEB/CteConsulta.asmx");
                } else if (getEstado().equals("MG")) {
                    url = new URL("https://hcte.fazenda.mg.gov.br/cte/services/CteConsulta");
                } else if (getEstado().equals("PR")) {
                    url = new URL("https://homologacao.cte.fazenda.pr.gov.br/cte/CteConsulta");
                } else if (getEstado().equals("RS")) {
                    url = new URL("https://homologacao.cte.sefaz.rs.gov.br/ws/cteconsulta/cteconsulta.asmx");
                } else if (getEstado().equals("SP")) {
                    url = new URL("https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteConsulta.asmx");
                }
            } else {

                url = new URL("https://www.scan.fazenda.gov.br/CTeConsulta2/CTeConsulta2.asmx");

                if (getEstado().equals("MG")) {
                    url = new URL("https://cte.fazenda.mg.gov.br/cte/services/CteConsulta");
                } else if (getEstado().equals("MS")) {
                    url = new URL("https://producao.cte.ms.gov.br/cteWEB/CteConsulta.asmx");
                } else if (getEstado().equals("MT")) {
                    url = new URL("https://cte.sefaz.mt.gov.br/ctews/services/CteConsulta");
                } else if (getEstado().equals("PR")) {
                    url = new URL("https://cte.fazenda.pr.gov.br/cte/CteConsulta");
                } else if (getEstado().equals("RS")) {
                    url = new URL("https://cte.sefaz.rs.gov.br/ws/cteconsulta/cteconsulta.asmx");
                } else if (getEstado().equals("SP")) {
                    url = new URL("https://nfe.fazenda.sp.gov.br/cteWEB/services/cteConsulta.asmx");
                }

            }
            // Realiza a conexao com WebService
            try {
                this.buscarDadosCertificado();
                /**
                 * Xml de Consulta.
                 */
                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\" ?> "
                        //                        + "<consSitCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"" + Login._sessao.configuracao.getVersaoAmbiente() + "\">"
                        + "<consSitCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"2.01\">"
                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb> "
                        + "<xServ>CONSULTAR</xServ> "
                        + "<chCTe>" + chaveAcesso + "</chCTe> "
                        + "</consSitCTe>";

                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
                CteConsultaStub.CteDadosMsg dadosMsg = new CteConsultaStub.CteDadosMsg();
                dadosMsg.setExtraElement(ome);

                CteConsultaStub.CteCabecMsg CteCabecMsg = new CteConsultaStub.CteCabecMsg();
                /**
                 * Código do Estado.
                 */
                CteCabecMsg.setCUF(getEmpresaCodEstado());
                /**
                 * Versao do XML
                 */
                CteCabecMsg.setVersaoDados("2.01");
                CteConsultaStub.CteCabecMsgE CteCabecMsgE = new CteConsultaStub.CteCabecMsgE();
                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

                CteConsultaStub stub = new CteConsultaStub(url.toString());
                CteConsultaStub.CteConsultaCTResult result = stub.cteConsultaCT(dadosMsg, CteCabecMsgE);

                Resultado = result.getExtraElement().toString();

            } catch (Exception e) {
                System.err.println("- +transmissoesControleTransporte.:consultarCTe Retorno:" + e.toString());
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("- -transmissoesControleTransporte.:consultarCTe Retorno:" + e.toString());
        }
        System.err.println("-transmissoesControleTransporte.:consultarCTe Retorno:" + Resultado);
        return Resultado;
    }

    public String assinarCancCTe(String TipoCertificado, String Senha, String XML) throws Exception {
        System.err.println("- Tentando transmissoesControleTransporte.:assinarCancCTe");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Document docs = builder.parse(new File(
            // "c:/xml/430802017886010001735500000000010000030371-CTe.xml"));
            //System.err.println(getControleTransporteXML());
            Document doc = builder.parse(new ByteArrayInputStream(XML.getBytes("UTF-8")));
            //Document doc = builder.parse(new ByteArrayInputStream(getControleTransporteXML().toString().getBytes()));
            doc.setXmlStandalone(true);
            doc.getDocumentElement().removeAttribute("xmlns:ns2");
            //NodeList elements = doc.getElementsByTagName("infCanc");
            //Node element = doc.getDocumentElement().getFirstChild().getNextSibling();
            Node element = doc.getDocumentElement().getFirstChild();

            // elements.getLength();
            Element el = (Element) element;
            // Element el =
            // doc.getDocumentElement().getFirstChild().getChildNodes();
            String id = el.getAttribute("Id");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.          
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            // Create a Reference to the enveloped document (in this case,
            // you are signing the whole document, so a URI of "" signifies
            // that, and also specify the SHA1 digest algorithm and
            // the ENVELOPED Transform.
            ArrayList transformList = new ArrayList();
            TransformParameterSpec tps = null;
            Transform envelopedTransform = fac.newTransform(Transform.ENVELOPED, tps);
            Transform c14NTransform = fac.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);

            transformList.add(envelopedTransform);
            transformList.add(c14NTransform);
            // Load the KeyStore and get the signing key and certificate.
            KeyStore ks = KeyStore.getInstance("PKCS12");
            char[] pin;
            p = null;
            Provider p2[];
            //System.err.println("Teste 01 ");            

            configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
            stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
            //this.buscarDadosCertificado(TipoCertificado, SenhaCertificado);           
            if (getTipoCertificado().equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {
                configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
                Provider p = new sun.security.pkcs11.SunPKCS11(stream);
                //p = new sun.security.pkcs11.SunPKCS11("SunPKCS11-SmartCard");               
                // procura e remove o ultimo provider               
                Security.addProvider(p);
                /*if (Security.getProviders().length > 0)
                {
                System.err.println("Verifica providers");
                p2 = Security.getProviders();
                for (int i =0; i < p2.length; i++)
                {
                System.err.println(p2[0].getInfo());
                if (p2[0].getName().equals(p.getName()))
                {
                System.err.println(p.getName());
                }
                //Security.removeProvider(p2[0].getName());
                }
                }*/

//                pin = getSenhaCertificado().toCharArray();
                //ks = KeyStore.getInstance("PKCS11", p);
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

            KeyStore.PrivateKeyEntry pkEntry = null;
            Enumeration aliasesEnum = ks.aliases();
            PrivateKey privateKey = null;

            while (aliasesEnum.hasMoreElements()) {
                String alias = (String) aliasesEnum.nextElement();
                if (ks.isKeyEntry(alias)) {
                    pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(
                            getSenhaCertificado().toCharArray()));
                    privateKey = pkEntry.getPrivateKey();
                    break;
                }
            }
            X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
            //System.err.println("Teste 03 ");
            // Create the KeyInfo containing the X509Data.
            KeyInfoFactory kif = fac.getKeyInfoFactory();
            List x509Content = new ArrayList();
            // x509Content.add(cert.getSubjectX500Principal().getName());
            x509Content.add(cert);
            X509Data xd = kif.newX509Data(x509Content);
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
            //System.err.println("Teste 04 ");
            // doc.getDocumentElement().removeAttribute("xmlns:ns2");
            // ((Element)
            // doc.getDocumentElement().getElementsByTagName("CTe").item(0))
            // .setAttribute("xmlns", "http://www.portalfiscal.inf.br/CTe");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.

            Reference ref = fac.newReference("#" + id, fac.newDigestMethod(
                    DigestMethod.SHA1, null), transformList, null, null);
            //System.err.println("Teste 05 ");
            // Create the SignedInfo.
            SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(
                    CanonicalizationMethod.INCLUSIVE,
                    (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                    Collections.singletonList(ref));

            // Create the XMLSignature, but don't sign it yet.
            XMLSignature signature = fac.newXMLSignature(si, ki);
            // Marshal, generate, and sign the enveloped signature.
            // Create a DOMSignContext and specify the RSA PrivateKey and
            // location of the resulting XMLSignature's parent element.
//            System.err.println(signature.toString());
//            System.err.println("-- CHAVE PRIVADA --");
//            System.err.println(privateKey.toString());
            DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());
            signature.sign(dsc);

            // Output the resulting document.
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();
            trans.transform(new DOMSource(doc), new StreamResult(os));

            //this.setControleTransporteXMLAssinada(new StringBuffer(os.toString()));
            if (!TipoCertificado.equals("A1")) {
                //Security.removeProvider(p.getName());
            }
            System.err.println("- *transmissoesControleTransporte.:assinarCancCTe Retorno OK");
            return os.toString();
        } catch (Exception e) {
            System.err.println("- -transmissoesControleTransporte.:assinarCancCTe Retorno:" + e.toString() + "  " + e.getCause().getMessage());
            e.printStackTrace();
            return "";
        }

    }
    //
    // Cancelar Nota Fiscal

    public String cancelarCTe(String chaveAcesso, String transmitidaProtocoloAutorizacao, String motivoCancelamento) {
        String Resultado = "0";
        System.err.println("- Tentando transmissoesControleTransporte.:cancelarCTe:");
        try {
            URL url = null;
            if (getConfiguracaoAmbienteEmissaoNf().equals("1")) {
                if (getTipo().equals("S")) {
                    url = new URL("https://www.scan.fazenda.gov.br/CTeCancelamento2/CTeCancelamento2.asmx");
                } else {
                    if (getEstado().equals("MG")) {
                        url = new URL("https://cte.fazenda.mg.gov.br/cte/services/CteCancelamento ");
                    } else if (getEstado().equals("MS")) {
                        url = new URL(" https://producao.cte.ms.gov.br/cteWEB/CteCancelamento.asmx");
                    } else if (getEstado().equals("MT")) {
                        url = new URL("https://cte.sefaz.mt.gov.br/ctews/services/CteCancelamento");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://cte.fazenda.pr.gov.br/cte/CteCancelamento");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://CTe.sefaz.rs.gov.br/ws/CTeCancelamento/CTeCancelamento2.asmx");
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://nfe.fazenda.sp.gov.br/cteWEB/services/cteCancelamento.asmx");
                    }
                }
            } else {
                if (getTipo().equals("S")) {

                    url = new URL("https://hom.CTe.fazenda.gov.br/SCAN/CTeCancelamento2/CTeCancelamento2.asmx");
                } else {

                    if (getEstado().equals("MT")) {
                        url = new URL("https://homologacao.sefaz.mt.gov.br/ctews/services/CteCancelamento");
                    } else if (getEstado().equals("MS")) {
                        url = new URL(" https://homologacao.cte.ms.gov.br/cteWEB/CteCancelamento.asmx");
                    } else if (getEstado().equals("MG")) {
                        url = new URL("https://hcte.fazenda.mg.gov.br/cte/services/CteCancelamento ");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://homologacao.cte.fazenda.pr.gov.br/cte/CteCancelamento");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://homologacao.cte.sefaz.rs.gov.br/ws/ctecancelamento/ctecancelamento.asmx");
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteCancelamento.asmx");
                    }

                }

            }
            // Realiza a conexao com WebService
            try {
                this.buscarDadosCertificado();
                /**
                 * Xml de Consulta.
                 */
                String cabecMsgEnvia = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "<cabecMsg xmlns=\"http://www.portalfiscal.inf.br/cte\" "
                        + "versao=\"1.02\">" + "<versaoDados>" + getConfiguracaoVersaoAmbiente() + "</versaoDados>"
                        + "</cabecMsg>";

                //versao=\"1.02\">"
                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\" ?> "
                        + "<cancCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"2.00\">"
                        + "<infCanc Id=\"ID" + chaveAcesso + "\">"
                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb> "
                        + "<xServ>CANCELAR</xServ> "
                        + "<chCTe>" + chaveAcesso + "</chCTe> "
                        + "<nProt>" + transmitidaProtocoloAutorizacao + "</nProt> "
                        + "<xJust>" + motivoCancelamento + "</xJust> "
                        + "</infCanc>"
                        + "</cancCTe>";

                try {
                    CteDadosMsg = this.assinarCancCTe(getTipoCertificado(), getSenhaCertificado(), CteDadosMsg);
                } catch (Exception e) {
                    System.err.println("- +Tentando transmissoesControleTransporte.:cancelarCTe: Retorno" + e.toString());
                    System.err.println(e.toString());
                }
                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
                CteCancelamentoStub.CteDadosMsg dadosMsg = new CteCancelamentoStub.CteDadosMsg();
                dadosMsg.setExtraElement(ome);

                CteCancelamentoStub.CteCabecMsg CteCabecMsg = new CteCancelamentoStub.CteCabecMsg();
                /**
                 * Código do Estado.
                 */
                CteCabecMsg.setCUF(getEmpresaCodEstado());
                /**
                 * Versao do XML
                 */
                CteCabecMsg.setVersaoDados("2.00");
                CteCancelamentoStub.CteCabecMsgE CteCabecMsgE = new CteCancelamentoStub.CteCabecMsgE();
                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

                CteCancelamentoStub stub = new CteCancelamentoStub(url.toString());
                CteCancelamentoStub.CteCancelamentoCTResult result = stub.cteCancelamentoCT(dadosMsg, CteCabecMsgE);

                Resultado = result.getExtraElement().toString();


            } catch (Exception e) {
                System.err.println("- **transmissoesControleTransporte.:cancelarCTe: Erro !");
                e.printStackTrace();

            }
        } catch (Exception e) {
            System.err.println("- *transmissoesControleTransporte.:cancelarCTe: Retorno:" + Resultado);
            System.err.println(e.toString());
        }

        System.err.println("- transmissoesControleTransporte.:cancelarCTe: Retorno:" + Resultado);
        return Resultado;
    }
    // Assinar Cancelamento Nota Fiscal

    public String assinarInutCTe(String TipoCertificado, String Senha, String XML) throws Exception {

        System.err.println("- Tentando transmissoesControleTransporte.:assinarInutCTe:");
        try {
//            setSenhaCertificado() = Senha;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Document docs = builder.parse(new File(
            // "c:/xml/430802017886010001735500000000010000030371-CTe.xml"));
            //System.err.println(getControleTransporteXML());
            Document doc = builder.parse(new ByteArrayInputStream(XML.getBytes("UTF-8")));
            //Document doc = builder.parse(new ByteArrayInputStream(getControleTransporteXML().toString().getBytes()));
            doc.setXmlStandalone(true);
            doc.getDocumentElement().removeAttribute("xmlns:ns2");
            //NodeList elements = doc.getElementsByTagName("infCanc");
            //Node element = doc.getDocumentElement().getFirstChild().getNextSibling();
            Node element = doc.getDocumentElement().getFirstChild();

            // elements.getLength();
            Element el = (Element) element;
            // Element el =
            // doc.getDocumentElement().getFirstChild().getChildNodes();
            String id = el.getAttribute("Id");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.            
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            // Create a Reference to the enveloped document (in this case,
            // you are signing the whole document, so a URI of "" signifies
            // that, and also specify the SHA1 digest algorithm and
            // the ENVELOPED Transform.
            ArrayList transformList = new ArrayList();
            TransformParameterSpec tps = null;
            Transform envelopedTransform = fac.newTransform(Transform.ENVELOPED, tps);
            Transform c14NTransform = fac.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);

            transformList.add(envelopedTransform);
            transformList.add(c14NTransform);
            // Load the KeyStore and get the signing key and certificate.
            KeyStore ks = KeyStore.getInstance("PKCS12");
            char[] pin;

            Provider p2[];

            configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
            stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
            //this.buscarDadosCertificado(TipoCertificado, SenhaCertificado);           

            if (getTipoCertificado().equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {
                configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
                Provider p = new sun.security.pkcs11.SunPKCS11(stream);
                //p = new sun.security.pkcs11.SunPKCS11("SunPKCS11-SmartCard");               
                // procura e remove o ultimo provider               
                Security.addProvider(p);
//                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new Exception("*Senha do Certificado Digital esta incorreta ou Certificado inválido.");
                }
            }

            KeyStore.PrivateKeyEntry pkEntry = null;
            Enumeration aliasesEnum = ks.aliases();
            PrivateKey privateKey = null;
            while (aliasesEnum.hasMoreElements()) {
                String alias = (String) aliasesEnum.nextElement();
                if (ks.isKeyEntry(alias)) {
                    pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(
                            getSenhaCertificado().toCharArray()));
                    privateKey = pkEntry.getPrivateKey();
                    break;
                }
            }
            X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
            // Create the KeyInfo containing the X509Data.
            KeyInfoFactory kif = fac.getKeyInfoFactory();
            List x509Content = new ArrayList();
            // x509Content.add(cert.getSubjectX500Principal().getName());
            x509Content.add(cert);
            X509Data xd = kif.newX509Data(x509Content);
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
            // doc.getDocumentElement().removeAttribute("xmlns:ns2");
            // ((Element)
            // doc.getDocumentElement().getElementsByTagName("CTe").item(0))
            // .setAttribute("xmlns", "http://www.portalfiscal.inf.br/CTe");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.

            Reference ref = fac.newReference("#" + id, fac.newDigestMethod(
                    DigestMethod.SHA1, null), transformList, null, null);
            // Create the SignedInfo.
            SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(
                    CanonicalizationMethod.INCLUSIVE,
                    (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                    Collections.singletonList(ref));

            // Create the XMLSignature, but don't sign it yet.

            XMLSignature signature = fac.newXMLSignature(si, ki);
            // Marshal, generate, and sign the enveloped signature.
            // Create a DOMSignContext and specify the RSA PrivateKey and
            // location of the resulting XMLSignature's parent element.
            // System.err.println(signature.toString());         
            DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());
            signature.sign(dsc);

            // Output the resulting document.
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();
            trans.transform(new DOMSource(doc), new StreamResult(os));

            //this.setControleTransporteXMLAssinada(new StringBuffer(os.toString()));
            if (!TipoCertificado.equals("A1")) {
                //Security.removeProvider(p.getName());
            }
            System.err.println("- transmissoesControleTransporte.:assinarInutCTe: retorno:" + os.toString());
            return os.toString();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("- +transmissoesControleTransporte.:assinarInutCTe: retorno:" + e.toString());
            return "";
        }

    }

    // Inutilizar Nota Fiscal
    public String inutilizaCTe(String numeracaoInicial, String numeracaoFinal, String motivoInutilizacao) {

        String Resultado = "0";
        System.err.println("- Tentando transmissoesControleTransporte.:inutilizaCTe ");

        try {

            URL url = null;
            if (getConfiguracaoAmbienteEmissaoNf().equals("1")) {
                if (getTipo().equals("S")) {
                    url = new URL("https://hom.CTe.fazenda.gov.br/SCAN/CTeCancelamento2/CTeCancelamento2.asmx");
                } else {
                    if (getEstado().equals("MG")) {
                        url = new URL("https://cte.fazenda.mg.gov.br/cte/services/CteInutilizacao");
                    } else if (getEstado().equals("MS")) {
                        url = new URL("https://producao.cte.ms.gov.br/cteWEB/CteInutilizacao.asmx");
                    } else if (getEstado().equals("MT")) {
                        url = new URL("https://cte.sefaz.mt.gov.br/ctews/services/CteInutilizacao");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://cte.fazenda.pr.gov.br/cte/CteInutilizacao");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://cte.sefaz.rs.gov.br/ws/cteinutilizacao/cteinutilizacao.asmx");
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://nfe.fazenda.sp.gov.br/cteWEB/services/cteInutilizacao.asmx");
                    }
                }
            } else {
                if (getTipo().equals("S")) {
                    url = new URL("https://hom.CTe.fazenda.gov.br/SCAN/CTeInutilizacao2/CTeInutilizacao2.asmx");
                } else {
                    if (getEstado().equals("MT")) {
                        url = new URL("https://homologacao.sefaz.mt.gov.br/ctews/services/CteInutilizacao");
                    } else if (getEstado().equals("MS")) {
                        url = new URL("https://homologacao.cte.ms.gov.br/cteWEB/CteInutilizacao.asmx");
                    } else if (getEstado().equals("MG")) {
                        url = new URL("https://hcte.fazenda.mg.gov.br/cte/services/CteInutilizacao ");
                    } else if (getEstado().equals("PR")) {
                        url = new URL("https://homologacao.cte.fazenda.pr.gov.br/cte/CteInutilizacao");
                    } else if (getEstado().equals("RS")) {
                        url = new URL("https://homologacao.cte.sefaz.rs.gov.br/ws/cteinutilizacao/cteinutilizacao.asmx");
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteInutilizacao.asmx");
                    }
                }

            }
            // Realiza a conexao com WebService
            try {
                this.buscarDadosCertificado();
                /**
                 * Xml de Consulta.
                 */
                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\" ?> "
                        + "<inutCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"" + getConfiguracaoVersaoAmbiente() + "\">"
                        + "<infInut Id=\"ID" + getEmpresaCodEstado() + (new SimpleDateFormat("yy").format(new Date())) + getEmpresaCnpj().replace(".", "").replace("-", "").replace("/", "").trim() + getConfiguracaoModeloNf() + _Funcoes.FormataString(getConfiguracaoSerieNf(), 3, "0", "E") + _Funcoes.FormataString(numeracaoInicial, 9, "0", "E") + _Funcoes.FormataString(numeracaoFinal, 9, "0", "E") + "\">"
                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb>"
                        + "<xServ>INUTILIZAR</xServ>"
                        + "<cUF>" + getEmpresaCodEstado() + "</cUF>"
                        + "<ano>" + new SimpleDateFormat("yy").format(new Date()) + "</ano>"
                        + "<CNPJ>" + getEmpresaCnpj().replace(".", "").replace("-", "").replace("/", "").trim() + "</CNPJ>"
                        + "<mod>" + getConfiguracaoModeloNf() + "</mod>"
                        + "<serie>" + getConfiguracaoSerieNf() + "</serie>"
                        + "<nCTIni>" + numeracaoInicial + "</nCTIni>"
                        + "<nCTFin>" + numeracaoFinal + "</nCTFin>"
                        + "<xJust>" + motivoInutilizacao + "</xJust>"
                        + "</infInut>"
                        + "</inutCTe>";
                try {
                    CteDadosMsg = this.assinarInutCTe(getTipoCertificado(), getSenhaCertificado(), CteDadosMsg);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("- +transmissoesControleTransporte.:inutilizaCTe Retorno:" + e.toString());
                }

                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
                CteInutilizacaoStub.CteDadosMsg dadosMsg = new CteInutilizacaoStub.CteDadosMsg();
                dadosMsg.setExtraElement(ome);

                CteInutilizacaoStub.CteCabecMsg CteCabecMsg = new CteInutilizacaoStub.CteCabecMsg();
                /**
                 * Código do Estado.
                 */
                CteCabecMsg.setCUF(getEmpresaCodEstado());
                /**
                 * Versao do XML
                 */
                CteCabecMsg.setVersaoDados("2.00");
                CteInutilizacaoStub.CteCabecMsgE CteCabecMsgE = new CteInutilizacaoStub.CteCabecMsgE();
                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

                CteInutilizacaoStub stub = new CteInutilizacaoStub(url.toString());
                CteInutilizacaoStub.CteInutilizacaoCTResult result = stub.cteInutilizacaoCT(dadosMsg, CteCabecMsgE);

                Resultado = result.getExtraElement().toString();
                System.err.println("- .transmissoesControleTransporte.:inutilizaCTe Retorno:" + result.getExtraElement().toString());

            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("- *transmissoesControleTransporte.:inutilizaCTe Retorno:" + e.toString());
            }
        } catch (Exception e) {
            System.err.println(e.toString());
            System.err.println("- -transmissoesControleTransporte.:inutilizaCTe Retorno:" + e.toString());

        }

        return Resultado;
    }
    // Assinar Inutilizacao Nota Fiscal

    public String assinarInutCTe() throws Exception {
        System.err.println("- Tentando transmissoesControleTransporte.:assinarInutCTe ");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Document docs = builder.parse(new File(
            // "c:/xml/430802017886010001735500000000010000030371-CTe.xml"));
            //System.err.println(getControleTransporteXML());
            Document doc = builder.parse(new ByteArrayInputStream(XML.getBytes("UTF-8")));
            //Document doc = builder.parse(new ByteArrayInputStream(getControleTransporteXML().toString().getBytes()));
            doc.setXmlStandalone(true);
            doc.getDocumentElement().removeAttribute("xmlns:ns2");
            //NodeList elements = doc.getElementsByTagName("infCanc");
            //Node element = doc.getDocumentElement().getFirstChild().getNextSibling();
            Node element = doc.getDocumentElement().getFirstChild();

            // elements.getLength();
            Element el = (Element) element;
            // Element el =
            // doc.getDocumentElement().getFirstChild().getChildNodes();
            String id = el.getAttribute("Id");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.           
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            // Create a Reference to the enveloped document (in this case,
            // you are signing the whole document, so a URI of "" signifies
            // that, and also specify the SHA1 digest algorithm and
            // the ENVELOPED Transform.
            ArrayList transformList = new ArrayList();
            TransformParameterSpec tps = null;
            Transform envelopedTransform = fac.newTransform(Transform.ENVELOPED, tps);
            Transform c14NTransform = fac.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);

            transformList.add(envelopedTransform);
            transformList.add(c14NTransform);
            // Load the KeyStore and get the signing key and certificate.
            KeyStore ks = KeyStore.getInstance("PKCS12");
            char[] pin;
            p = null;
            Provider p2[];

           if (getTipoCertificado().equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {
                configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
                Provider p = new sun.security.pkcs11.SunPKCS11(stream);
                //p = new sun.security.pkcs11.SunPKCS11("SunPKCS11-SmartCard");               
                // procura e remove o ultimo provider               
                Security.addProvider(p);
//                pin = getSenhaCertificado().toCharArray();
                //ks = KeyStore.getInstance("PKCS11", p);
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            KeyStore.PrivateKeyEntry pkEntry = null;
            Enumeration aliasesEnum = ks.aliases();
            PrivateKey privateKey = null;
            while (aliasesEnum.hasMoreElements()) {
                String alias = (String) aliasesEnum.nextElement();
                if (ks.isKeyEntry(alias)) {
                    pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(getSenhaCertificado().toCharArray()));
                    privateKey = pkEntry.getPrivateKey();
                    break;
                }
            }
            X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
            // Create the KeyInfo containing the X509Data.
            KeyInfoFactory kif = fac.getKeyInfoFactory();
            List x509Content = new ArrayList();
            // x509Content.add(cert.getSubjectX500Principal().getName());
            x509Content.add(cert);
            X509Data xd = kif.newX509Data(x509Content);
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
            //System.err.println("Teste 04 ");
            // doc.getDocumentElement().removeAttribute("xmlns:ns2");
            // ((Element)
            // doc.getDocumentElement().getElementsByTagName("CTe").item(0))
            // .setAttribute("xmlns", "http://www.portalfiscal.inf.br/CTe");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.

            Reference ref = fac.newReference("#" + id, fac.newDigestMethod(
                    DigestMethod.SHA1, null), transformList, null, null);
            //System.err.println("Teste 05 ");
            // Create the SignedInfo.
            SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(
                    CanonicalizationMethod.INCLUSIVE,
                    (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                    Collections.singletonList(ref));

            // Create the XMLSignature, but don't sign it yet.
            XMLSignature signature = fac.newXMLSignature(si, ki);
            // Marshal, generate, and sign the enveloped signature.
            // Create a DOMSignContext and specify the RSA PrivateKey and
            // location of the resulting XMLSignature's parent element.
            System.err.println(signature.toString());
            DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());
            signature.sign(dsc);

            // Output the resulting document.
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();
            trans.transform(new DOMSource(doc), new StreamResult(os));

            //this.setControleTransporteXMLAssinada(new StringBuffer(os.toString()));
            if (!getTipoCertificado().equals("A1")) {
                //Security.removeProvider(p.getName());
            }
            return os.toString();
        } catch (Exception e) {
            System.err.println("- transmissoesControleTransporte.:assinarInutCTe Retorno:" + e.toString() + "  " + e.getCause().getMessage());
            return "";
        }
    }

    public String assinarRaiz_CartaCorrecao() throws Exception {
        System.err.println("- Tentando transmissoesControleTransporte.:assinarRaiz_CartaCorrecao ");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Document docs = builder.parse(new File(
            // "c:/xml/430802017886010001735500000000010000030371-CTe.xml"));
            //System.err.println(getControleTransporteXML());            
            Document doc = builder.parse(new ByteArrayInputStream(XML.getBytes("UTF-8")));
            //Document doc = builder.parse(new ByteArrayInputStream(getControleTransporteXML().toString().getBytes()));
            doc.setXmlStandalone(true);
            doc.getDocumentElement().removeAttribute("xmlns:ns2");
            //NodeList elements = doc.getElementsByTagName("infCanc");
            //Node element = doc.getDocumentElement().getFirstChild().getNextSibling();
            NodeList elements = doc.getElementsByTagName("iCTevento");
            // elements.getLength();            
            //Element el = (Element) element;
            Element el = (Element) elements.item(0);
            // Element el =
            // doc.getDocumentElement().getFirstChild().getChildNodes();
            String id = el.getAttribute("Id");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.        
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            // Create a Reference to the enveloped document (in this case,
            // you are signing the whole document, so a URI of "" signifies
            // that, and also specify the SHA1 digest algorithm and
            // the ENVELOPED Transform.
            ArrayList transformList = new ArrayList();
            TransformParameterSpec tps = null;
            Transform envelopedTransform = fac.newTransform(Transform.ENVELOPED, tps);
            Transform c14NTransform = fac.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);

            transformList.add(envelopedTransform);
            transformList.add(c14NTransform);
            // Load the KeyStore and get the signing key and certificate.
            KeyStore ks = KeyStore.getInstance("PKCS12");
            char[] pin;
            p = null;
            Provider p2[];

            configuracaoCertificadoA3 = getConfiguracaoCertificadoA3().replace("<br>", "\n");
//        configuracaoCertificadoA3 = "name = EPASS2000\nlibrary = c:\\windows\\system32\\ngp11v211.dll";
            stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());

            if (getTipoCertificado().equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {

                p = new sun.security.pkcs11.SunPKCS11(stream);
                Security.addProvider(p);
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new Exception("-++ Senha do Certificado Digital esta incorreta ou Certificado inválido.");
                }
            }


            KeyStore.PrivateKeyEntry pkEntry = null;
            Enumeration aliasesEnum = ks.aliases();
            PrivateKey privateKey = null;


            while (aliasesEnum.hasMoreElements()) {
                String alias = (String) aliasesEnum.nextElement();
                if (ks.isKeyEntry(alias)) {
                    pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(
                            getSenhaCertificado().toCharArray()));
                    privateKey = pkEntry.getPrivateKey();
                    break;
                }
            }
            X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
            // Create the KeyInfo containing the X509Data.
            KeyInfoFactory kif = fac.getKeyInfoFactory();
            List x509Content = new ArrayList();
            // x509Content.add(cert.getSubjectX500Principal().getName());
            x509Content.add(cert);
            X509Data xd = kif.newX509Data(x509Content);
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
            // doc.getDocumentElement().removeAttribute("xmlns:ns2");
            // ((Element)
            // doc.getDocumentElement().getElementsByTagName("CTe").item(0))
            // .setAttribute("xmlns", "http://www.portalfiscal.inf.br/CTe");

            // Create a DOM XMLSignatureFactory that will be used to
            // generate the enveloped signature.

            Reference ref = fac.newReference("#" + id, fac.newDigestMethod(
                    DigestMethod.SHA1, null), transformList, null, null);
            // Create the SignedInfo.
            SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(
                    CanonicalizationMethod.INCLUSIVE,
                    (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                    Collections.singletonList(ref));

            // Create the XMLSignature, but don't sign it yet.
            XMLSignature signature = fac.newXMLSignature(si, ki);
            // Marshal, generate, and sign the enveloped signature.
            // Create a DOMSignContext and specify the RSA PrivateKey and
            // location of the resulting XMLSignature's parent element.
//            System.err.println(signature.toString());
//            System.err.println("-- CHAVE PRIVADA --");
//            System.err.println(privateKey.toString());
            DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());
            signature.sign(dsc);

            // Output the resulting document.
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer trans = tf.newTransformer();
            trans.transform(new DOMSource(doc), new StreamResult(os));

            //this.setControleTransporteXMLAssinada(new StringBuffer(os.toString()));
            if (!getTipoCertificado().equals("A1")) {
                Security.removeProvider(p.getName());
            }
            System.err.println("- transmissoesControleTransporte.:assinarRaiz_CartaCorrecao Retorno:" + os.toString());
            return os.toString();
        } catch (Exception e) {
            System.err.println("- -transmissoesControleTransporte.:assinarRaiz_CartaCorrecao Retorno:" + e.toString() + "  " + e.getCause().getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public void buscarDadosConfiguracaoEmpresa() {
        // Busca dados no NFeCacerts
        String Path = new crncomp.parametros._verificaParametro(11).getValorString();
        arquivoCacertsGeradoTodosOsEstados = Path + File.separator + "NFeCacerts";
        System.out.println("CAMINHO CONFIGURAÇÃO PARA NFECERTS: " + arquivoCacertsGeradoTodosOsEstados);

        //if (crncomp._sessao.hostServidor.equals(crncomp._sessao.hostPadraoVerificaEspecial.toLowerCase())) {
            arquivoCacertsGeradoTodosOsEstados = "C:\\PROJETO\\storeadmin\\NFeCacerts";
            configuracaoCertificadoA3 = "name = SmartCard<BR>library = c:\\windows\\system32\\aetpkss1.dll".replace("<BR>", "\n");
            senhaCertificado = "1234567890";
        //}

        System.out.println("CAMINHO ARQUIVO CADEIAS TODOS OS CERTIFICADOS (NFeCacerts): " + arquivoCacertsGeradoTodosOsEstados);
    }
    
    public String buscarDadosCertificado() {
        this.buscarDadosConfiguracaoEmpresa();
        String retorno = "";
        try {
            System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            X509Certificate certificate = null;
            PrivateKey privateKey = null;
            if ("A1".equals(tipoCertificado)) {
                try {
                    InputStream entrada = new FileInputStream(configuracaoCertificadoA1.replace("\\", "\\\\"));
                    ks = KeyStore.getInstance("pkcs12");
                    try {
                        ks.load(entrada, senhaCertificado.toCharArray());
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new Exception("Senha do Certificado Digital esta incorreta ou Certificado inválido.");
                    }
                    Enumeration<String> aliasesEnum = ks.aliases();
                    if (aliasCertificado.isEmpty()) {
                        while (aliasesEnum.hasMoreElements()) {
                            aliasCertificado = (String) aliasesEnum.nextElement();
                            certificate = (X509Certificate) ks.getCertificate(aliasCertificado);
                            privateKey = (PrivateKey) ks.getKey(aliasCertificado, senhaCertificado.toCharArray());
                            break;

                        }
                    } else {
                        certificate = (X509Certificate) ks.getCertificate(aliasCertificado);
                        privateKey = (PrivateKey) ks.getKey(aliasCertificado, senhaCertificado.toCharArray());
                    }

                    SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
                    socketFactoryDinamico.setFileCacerts(arquivoCacertsGeradoTodosOsEstados);
                    setProtocoloAdicionado(true);
                    Protocol protocol = new Protocol("https", socketFactoryDinamico, SSL_PORT);
                    Protocol.registerProtocol("https", protocol);
                    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
                    System.setProperty("javax.net.ssl.keyStore", configuracaoCertificadoA1.replace("\\", "\\\\"));
                    System.setProperty("javax.net.ssl.keyStorePassword", senhaCertificado);

                } catch (Exception e) {
                    e.printStackTrace();
                    retorno = e.toString();
                }
            } else {
                System.out.println(configuracaoCertificadoA3);
                stream = new ByteArrayInputStream(configuracaoCertificadoA3.getBytes());
//                System.out.println(configuracaoCertificadoA3);
//                System.out.println(senhaCertificado);
                p = new sun.security.pkcs11.SunPKCS11(stream);
                Security.addProvider(p);
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, senhaCertificado.toCharArray());
                } catch (Exception ex) {
                    System.out.println("PROBLEMA EM CARREGAR CERTIFICADO (SENHA) ");
                    ex.printStackTrace();
                }

                //String alias = "";
                Enumeration<String> aliasesEnum = ks.aliases();
                if (aliasCertificado.isEmpty()) {
                    while (aliasesEnum.hasMoreElements()) {
                        aliasCertificado = (String) aliasesEnum.nextElement();
                        certificate = (X509Certificate) ks.getCertificate(aliasCertificado);
                        privateKey = (PrivateKey) ks.getKey(aliasCertificado, senhaCertificado.toCharArray());
                        break;

                    }
                } else {
                    certificate = (X509Certificate) ks.getCertificate(aliasCertificado);
                    privateKey = (PrivateKey) ks.getKey(aliasCertificado, senhaCertificado.toCharArray());
                }

                System.setProperty("javax.net.ssl.keyStoreType", ks.getType());
                System.setProperty("javax.net.ssl.keyStoreProvider", ks.getProvider().getName());
                certificate = (X509Certificate) ks.getCertificate(aliasCertificado);
                privateKey = (PrivateKey) ks.getKey(aliasCertificado, senhaCertificado.toCharArray());
                SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
                socketFactoryDinamico.setFileCacerts(arquivoCacertsGeradoTodosOsEstados);
                setProtocoloAdicionado(true);
                Protocol protocol = new Protocol("https", socketFactoryDinamico, SSL_PORT);
                Protocol.registerProtocol("https", protocol);
                System.setProperty("javax.net.ssl.trustStoreType", "JKS");
                System.setProperty("javax.net.ssl.trustStore", arquivoCacertsGeradoTodosOsEstados);
            }
        } catch (Exception e) {
            e.printStackTrace();
            retorno = e.toString();
        }
        return retorno;
    }

    public String statusServico(String TipoCertificado, String senhaCertificado) {
        System.err.println("- transmissoesControleTransporte.:statusServico ");
        String Resultado = "0";

        try {
            String codigoDoEstado = "";
            URL url = null;
            if (getConfiguracaoAmbienteEmissaoNf().equals("2")) {

                url = new URL("https://www.scan.fazenda.gov.br/CTeStatusServico2/CTeStatusServico2.asmx");

                if (getEstado().equals("MG")) {
                    url = new URL("https://hcte.fazenda.mg.gov.br/cte/services/CteStatusServico ");
                } else if (getEstado().equals("MS")) {
                    url = new URL("https://homologacao.cte.ms.gov.br/cteWEB/CteStatusServico.asmx");
                } else if (getEstado().equals("MT")) {
                    url = new URL("https://homologacao.sefaz.mt.gov.br/ctews/services/CteStatusServico");
                } else if (getEstado().equals("PR")) {
                    url = new URL("https://homologacao.cte.fazenda.pr.gov.br/cte/CteStatusServico");
                } else if (getEstado().equals("RS")) {
                    url = new URL("https://homologacao.cte.sefaz.rs.gov.br/ws/cteStatusServico/cteStatusServico.asmx");
                } else if (getEstado().equals("SP")) {
                    url = new URL("https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteStatusServico.asmx");
                }
            } else {
                url = new URL("https://www.scan.fazenda.gov.br/CTeStatusServico2/CTeStatusServico2.asmx");

                if (getEstado().equals("MG")) {
                    url = new URL("https://cte.fazenda.mg.gov.br/cte/services/CteStatusServico ");
                } else if (getEstado().equals("MS")) {
                    url = new URL("https://producao.cte.ms.gov.br/cteWEB/CteStatusServico.asmx");
                } else if (getEstado().equals("MT")) {
                    url = new URL("https://cte.sefaz.mt.gov.br/ctews/services/CteStatusServico");
                } else if (getEstado().equals("PR")) {
                    url = new URL("https://cte.fazenda.pr.gov.br/cte/CteStatusServico");
                } else if (getEstado().equals("RS")) {
                    url = new URL("https://cte.sefaz.rs.gov.br/ws/cteStatusServico/cteStatusServico.asmx");
                } else if (getEstado().equals("SP")) {
                    url = new URL("https://nfe.fazenda.sp.gov.br/cteWEB/services/cteStatusServico.asmx");
                }
            }
            // Realiza a conexao com WebService
            try {
                this.buscarDadosCertificado();
                /**
                 * Xml de Consulta.
                 */
                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                        + "<consStatServ xmlns=\"http://www.portalfiscal.inf.br/cte\" " + " versao=\"" + getConfiguracaoVersaoAmbiente() + "\">"
                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb>"
                        + "<cUF>" + getEmpresaCodEstado() + "</cUF>"
                        + "<xServ>STATUS</xServ>"
                        + "</consStatServ>";

                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
                CteStatusServicoStub.CteDadosMsg dadosMsg = new CteStatusServicoStub.CteDadosMsg();
                dadosMsg.setExtraElement(ome);

                CteStatusServicoStub.CteCabecMsg CteCabecMsg = new CteStatusServicoStub.CteCabecMsg();
                /**
                 * Código do Estado.
                 */
                CteCabecMsg.setCUF(getEmpresaCodEstado());
                /* Versao do XML
                 */
                CteCabecMsg.setVersaoDados("2.00");
                CteStatusServicoStub.CteCabecMsgE CteCabecMsgE = new CteStatusServicoStub.CteCabecMsgE();
                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

                CteStatusServicoStub stub = new CteStatusServicoStub(url.toString());
                CteStatusServicoStub.CteStatusServicoCTResult result = stub.cteStatusServicoCT(dadosMsg, CteCabecMsgE);

                Resultado = (result.getExtraElement().toString());

            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("- +transmissoesControleTransporte.:statusServico Retorno" + e.toString());
            }
        } catch (Exception e) {
            System.err.println("- -transmissoesControleTransporte.:statusServico Retorno" + e.toString());
        }
        System.err.println("- *transmissoesControleTransporte.:statusServico Retorno" + Resultado);
        return Resultado;
    }

    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }

    public String getXMLAssinado() {
        return XMLAssinado;
    }

    public void setXMLAssinado(String XMLAssinado) {
        this.XMLAssinado = XMLAssinado;
    }

    public String getTipoCertificado() {
        return tipoCertificado;
    }

    public void setTipoCertificado(String tipoCertificado) {
        this.tipoCertificado = tipoCertificado;
    }

    public String getSenhaCertificado() {
        return senhaCertificado;
    }

    public void setSenhaCertificado(String senhaCertificado) {
        this.senhaCertificado = senhaCertificado;
    }

    public String getCaminhoCertificadoA1() {
        return configuracaoCertificadoA1;
    }

    public void setCaminhoCertificadoA1(String caminhoCertificadoA1) {
        this.configuracaoCertificadoA1 = caminhoCertificadoA1;
    }

    public String getConfiguracaoCertificadoA3() {
        return configuracaoCertificadoA3;
    }

    public void setConfiguracaoCertificadoA3(String configuracaoCertificadoA3) {
        this.configuracaoCertificadoA3 = configuracaoCertificadoA3;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConfiguracaoVersaoAmbiente() {
        return configuracaoVersaoAmbiente;
    }

    public void setConfiguracaoVersaoAmbiente(String confVersaoAmbiente) {
        this.configuracaoVersaoAmbiente = confVersaoAmbiente;
    }

    public String getConfiguracaoModeloNf() {
        return configuracaoModeloNf;
    }

    public void setConfiguracaoModeloNf(String confModeloNf) {
        this.configuracaoModeloNf = confModeloNf;
    }

    public String getConfiguracaoAmbienteEmissaoNf() {
        return configuracaoAmbienteEmissaoNf;
    }

    public void setConfiguracaoAmbienteEmissaoNf(String confAmbienteEmissaoNf) {
        this.configuracaoAmbienteEmissaoNf = confAmbienteEmissaoNf;
    }

    public String getEmpresaCodEstado() {
        return empresaCodEstado;
    }

    public void setEmpresaCodEstado(String empresaCodEstado) {
        this.empresaCodEstado = empresaCodEstado;
    }

    public String getEmpresaCnpj() {
        return empresaCnpj;
    }

    public void setEmpresaCnpj(String empresaCnpj) {
        this.empresaCnpj = empresaCnpj;
    }

    public String getConfiguracaoSerieNf() {
        return configuracaoSerieNf;
    }

    public void setConfiguracaoSerieNf(String confSerieNf) {
        this.configuracaoSerieNf = confSerieNf;
    }

    /**
     * @return the ProtocoloAdicionado
     */
    public boolean isProtocoloAdicionado() {
        return ProtocoloAdicionado;
    }

    /**
     * @param ProtocoloAdicionado the ProtocoloAdicionado to set
     */
    public void setProtocoloAdicionado(boolean ProtocoloAdicionado) {
        this.ProtocoloAdicionado = ProtocoloAdicionado;
    }

    public String getXMLEventoCCe() {
        return XMLEventoCCe;
    }

    public void setXMLEventoCCe(String XMLEventoCCe) {
        this.XMLEventoCCe = XMLEventoCCe;
    }
    
    public static void main(String[] args) {
        transmissoesCTe TCTE = new transmissoesCTe();
//        //String s = "<cteProc xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"1.03\">"
//        //        + "<CTe xmlns=\"http://www.portalfiscal.inf.br/cte\">"
//                String s = "<infCte Id=\"CTe99999704012799900349570040000165560001225662\" "
//                + "versao=\"1.03\"><ide><cUF>31</cUF><cCT>000122566</cCT><CFOP>6353</CFOP>"
//                + "<natOp>Transporte a estabelecimento comercial</natOp><forPag>1</forPag><mod>57</mod>"
//                + "<serie>4</serie><nCT>16556</nCT><dhEmi>2011-07-05T14:42:29</dhEmi><tpImp>1</tpImp>"
//                + "<tpEmis>2</tpEmis><cDV>2</cDV><tpAmb>2</tpAmb><tpCTe>0</tpCTe><procEmi>0</procEmi>"
//                + "<verProc>1.0</verProc><cMunEmi>3534401</cMunEmi><xMunEmi>OSASCO</xMunEmi>"
//                + "<UFEmi>SP</UFEmi><modal>01</modal><tpServ>0</tpServ><cMunIni>3534401</cMunIni>"
//                + "<xMunIni>OSASCO</xMunIni><UFIni>SP</UFIni><cMunFim>5300108</cMunFim><xMunFim>GAMA</xMunFim>"
//                + "<UFFim>DF</UFFim><retira>1</retira><toma03><toma>3</toma></toma03></ide><emit><CNPJ>00000000000100</CNPJ>"
//                + "<IE>12342322</IE><xNome>WebDANFE</xNome><enderEmit><xLgr>Rua TimÃ£o</xLgr><nro>42</nro>"
//                + "<xBairro>Terceira DivisÃ£o</xBairro><cMun>3534401</cMun><xMun>Sao Paulo</xMun>"
//                + "<CEP>08383015</CEP><UF>SP</UF><fone>01135556200</fone></enderEmit></emit><rem>"
//                + "<CNPJ>99999999999199</CNPJ><IE>42424242424</IE><xNome>Willy Wonka Chocolates S.A</xNome><enderReme>"
//                + "<xLgr>R do Folclore</xLgr><nro>928</nro><xBairro>CENTRO</xBairro><cMun>3522901</cMun>"
//                + "<xMun>Curupira</xMun><CEP>00000042</CEP><UF>XP</UF></enderReme><infNF><serie>U</serie>"
//                + "<nDoc>13387</nDoc><dEmi>2011-07-05</dEmi><vBC>921.90</vBC><vICMS>0.00</vICMS><vBCST>0.00</vBCST>"
//                + "<vST>0.00</vST><vProd>0.00</vProd><vNF>921.90</vNF><nCFOP>6353</nCFOP></infNF></rem>"
//                + "<exped><CNPJ>8422428306823</CNPJ><IE>321312412</IE><xNome>Zombie Factory LTDA</xNome>"
//                + "<fone>01155556200</fone><enderExped><xLgr>Rua dos 4 olhos</xLgr><nro>S/N</nro><xBairro>INDUSTRIAL</xBairro>"
//                + "<cMun>3534401</cMun><xMun>Zombieland</xMun><CEP>43234225</CEP><UF>ZX</UF></enderExped></exped>"
//                + "<dest><CNPJ>31415926535897</CNPJ><IE>31415926535897</IE><xNome>PI nÃºmeros transcedentais iLTDA</xNome>"
//                + "<fone>314159265</fone><enderDest><xLgr>Rua Transcedental</xLgr><nro>314</nro><xBairro>Real</xBairro>"
//                + "<cMun>5300108</cMun><xMun>Algebra</xMun><CEP>31415926</CEP><UF>PI</UF></enderDest></dest><vPrest>"
//                + "<vTPrest>50.13</vTPrest><vRec>50.13</vRec><Comp><xNome>IMPOSTO CLIENTE</xNome><vComp>3.51</vComp></Comp>"
//                + "<Comp><xNome>PEDAGIO</xNome><vComp>5.00</vComp></Comp><Comp><xNome>FRETE PESO</xNome>"
//                + "<vComp>41.62</vComp></Comp></vPrest><imp><ICMS><CST00><CST>00</CST><vBC>50.13</vBC>"
//                + "<pICMS>7.00</pICMS><vICMS>3.51</vICMS></CST00></ICMS></imp><infCTeNorm><infCarga>"
//                + "<vMerc>921.90</vMerc><proPred>DIVERSOS</proPred><infQ><cUnid>03</cUnid><tpMed>UNIDADE</tpMed>"
//                + "<qCarga>4</qCarga></infQ><infQ><cUnid>00</cUnid><tpMed>PESO CUBADO</tpMed><qCarga>0.3964</qCarga>"
//                + "</infQ><infQ><cUnid>01</cUnid><tpMed>PESO REAL</tpMed><qCarga>88.0000</qCarga>"
//                + "</infQ><infQ><cUnid>01</cUnid><tpMed>PESO BASE DE CALCULO</tpMed><qCarga>118.9200</qCarga>"
//                + "</infQ></infCarga><seg><respSeg>4</respSeg></seg><rodo><RNTRC>00000000123027</RNTRC>"
//                + "<dPrev>2011-07-11</dPrev><lota>0</lota></rodo></infCTeNorm></infCte>";
//                //
////                + "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">"
////                + "<SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\" />"
////                + "<SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\" />"
////                + "<Reference URI=\"#CTe99999999012744000349570040000165560001225662\">"
////                + "<Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\" />"
////                + "<Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\" /></Transforms>"
////                + "<DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\" />"
////                + "<DigestValue>eFWH/VAzwb+MQuBSp9NWZdzXdL4=</DigestValue></Reference></SignedInfo>"
////                + "<SignatureValue>hwwQxMPiydxhjYi14HCSRY5kpkj4SATXeqXQc8MHh9bH34xMEeTxXELTB8E2kVmKkdp8Wvm8uuEVxZv13qTCnX7k60xNSE0VWFvaYM5PJwKA5uOy3dX2jA40uzITRsy2Vlk=</SignatureValue>"
////                + "<KeyInfo><X509Data><X509Certificate>MIIGKzCCBROgAwIBAgIIZvfmQKTFNuAwDQYJKoZIhvcNAQEFBQAwTDELMAklDUC1CcmFzaWwxKDAmBgNVBAMTH1NFUkFTQSBDZXJ0aWZpY2Fkb3JhIERpZ2l0YWwgdjEwHhcNMTAwNzA5MTczNjU4WhcNMTEwNzA5MTczNjU4WjCB4zELMAkGA1UEBhMCQlIxEzARBgNVBAoTCklDUC1CcmFzaWwxFDASBgNVBAsTCyhFTSBCUkFOQ08pMRgwFgYDVQQLEw8wMDAwMDEwMDEyMjMyNzExFDASBgNVBAsTCyhFTSBCUkFOQ08pMRQwEgYDVQQLEwsoRU0gQlJBTkNPKTEUMBIGA1UECxMLKEVNIEJSQU5DTykxFDASBgNVBAsTCyhFTSBCUkFOQ08pMRQwEgYDVQQLEwsoRU0gQlJBTkNPKTEhMB8GA1UEAxMYWkVSTyBHUkFVIExPR0lTVElDQSBMVERBMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDJNvwUmMSz0Bn3wP5dbNr8HuaCHAx7jMaUNZtDu7XoxDw9SBr6sPncmgAToBKK6YXjciwIKQfqLbeR+OBfyNWMxPS3QW9MsVBHgMBJGH+wRq5dJ2/OVNJXKhehogclOasijdP+67qeSxnUe7Ado5NLzx6I97BL1F/kUDOGtPiETQIDAQABo4IC+zCCAvcwDgYDVR0PAQH/BAQDAgXgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDBDAfBgNVHSMEGDAWgBS3YKhb+bKmrgDtdOvVSsmWaGb1XDCBvgYDVR0RBIG2MIGzgR9BTEVYLlNBTlRBTkFAWkVST0dSQVVORVQuQ09NLkJSoDgGBWBMAQMEoC8TLTI3MDQxOTg2MDA3NTUxMTUxNzEwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMKAiBgVgTAEDAqAZExdBTEVYIE1PUkVJUkEgREUgU0FOVEFOQaAZBgVgTAEDA6AQEw4wNDAxMjc0NDAwMDE4N6AXBgVgTAEDB6AOEwwwMDAwMDAwMDAwMDAwVwYDVR0gBFAwTjBMBgZgTAECAQYwQjBABggrBgEFBQcCARY0aHR0cDovL3d3dy5jZXJ0aWZpY2Fkb2RpZ2l0YWwuY29tLmJyL3JlcG9zaXRvcmlvL2RwYzCB8AYDVR0fBIHoMIHlMEmgR6BFhkNodHRwOi8vd3d3LmNlcnRpZmljYWRvZGlnaXRhbC5jb20uYnIvcmVwb3NpdG9yaW8vbGNyL3NlcmFzYWNkdjEuY3JsMEOgQaA/hj1odHRwOi8vbGNyLmNlcnRpZmljYWRvcy5jb20uYnIvcmVwb3NpdG9yaW8vbGNyL3NlcmFzYWNkdjEuY3JsMFOgUaBPhk1odHRwOi8vcmVwb3NpdG9yaW8uaWNwYnJhc2lsLmdvdi5ici9sY3IvU2VyYXNhL3JlcG9zaXRvcmlvL2xjci9zZXJhc2FjZHYxLmNybDCBlwYIKwYBBQUHAQEEgYowgYcwPAYIKwYBBQUHMAGGMGh0dHA6Ly9vY3NwLmNlcnRpZmljYWRvZGlnaXRhbC5jb20uYnIvc2VyYXNhY2R2MTBHBggrBgEFBQcwAoY7aHR0cDovL3d3dy5jZXJ0aWZpY2Fkb2RpZ2l0YWwuY29tLmJyL2NhZGVpYXMvc2VyYXNhY2R2MS5wN2IwDQYJKoZIhvcNAQEFBQADggEBAE8EDj80dP82fIzJepftepPjk4RLBHHC4bpofvjovE+eJ0sFoQqTDrCP1gOstXvpAENjVb3cnSXyP46tjVUWaQkvyo14t0Bot/5uQvaah48BmxJ+MnctM2y5/qI+q7SSqE2kw/pGb7msq0Hdlh25nCFN514attL70N8YZNeB/tPhe8XfsP7w91IxDeS2jUBPDuD/8OeK7lYPand5IdOfX7lwPpwrp6PXTrp+bn78DIps25vbypFYukELvcDLnFP7uXcDe9ETYgfWQFiuCfWayaRDO39P/Sg6lB38biNIOkhzv+xgHYSO+WhITDRgIj9hutjPoQuFju1irFIc+9X3Rww=</X509Certificate></X509Data></KeyInfo></Signature></CTe>"
////                //
////                + "<protCTe versao=\"1.03\"><infProt><tpAmb>2</tpAmb><verAplic>SP_PL_CTe_103d</verAplic><chCTe>99999994018888000349570040000165560001225662</chCTe><dhRecbto>2011-07-05T14:42:56</dhRecbto><nProt>135110011494444</nProt><digVal>eFWH/VAzwb+MQuBSp9NWZdzXdL4=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso do CT-e</xMotivo></infProt>"
////                        + "</protCTe></cteProc>";
        String s = "<CTe xmlns=\"http://www.portalfiscal.inf.br/cte\"><infCte versao=\"1.04\" Id=\"CTe35121203195636000205570000000003051020962607\"><ide>"
                + "<cUF>35</cUF><cCT>02096260</cCT><CFOP>6353</CFOP><natOp>SERVICO DE TRANSPORTE</natOp><forPag>1</forPag><mod>57</mod><serie>0</serie>"
                + "<nCT>305</nCT><dhEmi>2012-12-20T17:08:00</dhEmi><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>7</cDV><tpAmb>2</tpAmb><tpCTe>0</tpCTe>"
                + "<procEmi>0</procEmi><verProc>1.01</verProc><cMunEnv>3550308</cMunEnv><xMunEnv>SAO PAULO</xMunEnv><UFEnv>SP</UFEnv>"
                + "<modal>01</modal><tpServ>0</tpServ><cMunIni>3548708</cMunIni><xMunIni>SAO BERNARDO DO CAMPO</xMunIni><UFIni>SP</UFIni>"
                + "<cMunFim>3106200</cMunFim><xMunFim>BELO HORIZONTE</xMunFim><UFFim>MG</UFFim><retira>1</retira><toma03>"
                + "<toma>3</toma></toma03></ide><compl><Entrega><semData><tpPer>0</tpPer></semData><semHora><tpHor>0</tpHor>"
                + "</semHora></Entrega><xObs>POR:JADER T:000000-055 G2 9 REG:BHZ-01</xObs></compl><emit><CNPJ>03195636000205</CNPJ>"
                + "<IE>149855297118</IE><xNome>CHANT INDUSTRIA COM E TRANSPORTES LTDA</xNome><enderEmit><xLgr>RUA BENITO MEANA,100 BOX 05</xLgr>"
                + "<nro>1</nro><xBairro>VILA SABRINA</xBairro><cMun>3550308</cMun><xMun>SAO PAULO</xMun><CEP>01139000</CEP>"
                + "<UF>SP</UF><fone>1122906244</fone></enderEmit></emit><rem><CNPJ>61075131000122</CNPJ><IE>635332733114</IE>"
                + "<xNome>CT-E EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xNome><fone>1143934500</fone><enderReme>"
                + "<xLgr>ESTRADA YAE MASSUMOTO,,353</xLgr><nro>1</nro><xBairro>COOPERATIVA</xBairro><cMun>3548708</cMun>"
                + "<xMun>SAO BERNARDO DO CAMPO</xMun><CEP>09842160</CEP><UF>SP</UF><cPais>1058</cPais><xPais>BRASIL</xPais>"
                + "</enderReme><email>acos@boeler.com.br</email><infNF><mod>01</mod><serie>1</serie><nDoc>000003</nDoc>"
                + "<dEmi>2012-12-20</dEmi><vBC>0.00</vBC><vICMS>0.00</vICMS><vBCST>0.00</vBCST><vST>0.00</vST><vProd>0.00</vProd>"
                + "<vNF>3.00</vNF><nCFOP>5101</nCFOP><nPeso>3.000</nPeso></infNF></rem><dest><CNPJ>25240938000290</CNPJ>"
                + "<IE>0625920020139</IE><xNome>CT-E EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xNome>"
                + "<fone>0000000031</fone><enderDest><xLgr>RUA SAO ROQUE,1280</xLgr><nro>1</nro><xBairro>SAGRADA FAMILIA</xBairro>"
                + "<cMun>3106200</cMun><xMun>BELO HORIZONTE</xMun><CEP>31035460</CEP><UF>MG</UF><cPais>1058</cPais><xPais>BRASIL</xPais>"
                + "</enderDest><email>romaplus@terra.com.br</email></dest><vPrest><vTPrest>32.97</vTPrest><vRec>32.97</vRec>"
                + "<Comp><xNome>Frete Peso/Vol</xNome><vComp>22.73</vComp></Comp><Comp><xNome>Frete Valor</xNome><vComp>0.01</vComp>"
                + "</Comp><Comp><xNome>SEC CAT</xNome><vComp>10.23</vComp></Comp></vPrest><imp><ICMS><ICMS00><CST>00</CST>"
                + "<vBC>32.97</vBC><pICMS>12.00</pICMS><vICMS>3.96</vICMS></ICMS00></ICMS></imp><infCTeNorm><infCarga><vCarga>3.00</vCarga>"
                + "<proPred>CONF.NF.</proPred><infQ><cUnid>01</cUnid><tpMed>Peso bruto (KG)</tpMed><qCarga>3.0000</qCarga></infQ><infQ>"
                + "<cUnid>03</cUnid><tpMed>VOLUMES</tpMed><qCarga>3.0000</qCarga></infQ><infQ><cUnid>01</cUnid><tpMed>PESO CUBADO</tpMed>"
                + "<qCarga>3.0000</qCarga></infQ></infCarga>"
                + ""
                + "<infModal versaoModal=\"1.04\"><rodo><RNTRC>12344445</RNTRC><dPrev>2012-12-25</dPrev><lota>0</lota></rodo></infModal></infCTeNorm></infCte></CTe>";
        try {
            //
            TCTE.setXML(s);
            TCTE.buscarDadosCertificado();
            //TCTE.assinarControleTransporte();
            
            
            System.out.println(TCTE.getXMLAssinado());
            TCTE.setConfiguracaoAmbienteEmissaoNf("1");
            TCTE.setEstado("MG");
            TCTE.setEmpresaCodEstado("31");
            TCTE.buscarDadosConfiguracaoEmpresa();
            TCTE.enviarControlesTransporte(1);
            //
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
