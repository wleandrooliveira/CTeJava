/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.cte;

import br.com.moveti.erpmove.transporte.controller.SocketFactoryDinamico;
import br.com.moveti.erpmove.transporte.controller._Funcoes;
import br.com.moveti.erpmove.transporte.cte.comunicacao.Cancelamento.CteCancelamentoStub;
import br.com.moveti.erpmove.transporte.cte.comunicacao.Consulta.CteConsultaStub;
import br.com.moveti.erpmove.transporte.cte.comunicacao.Inutilizacao.CteInutilizacaoStub;
import br.com.moveti.erpmove.transporte.cte.comunicacao.Recepcao.CteRecepcaoStub;
import br.com.moveti.erpmove.transporte.cte.comunicacao.RetRecepcao.CteRetRecepcaoStub;
import br.com.moveti.erpmove.transporte.cte.comunicacao.StatusServico.CteStatusServicoStub;
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
    private String caminhoCertificadoA1 = "";
    private String configuracaoCertificadoA3 = "";
    private String CaminhoKeyStoreTodos = "key.jks";
    private InputStream stream = null;
    private String configuracaoVersaoAmbiente = "";
    private String configuracaoModeloNf = "";
    private String configuracaoSerieNf = "";
    private String configuracaoAmbienteEmissaoNf = "";
    private String empresaCodEstado = "";
    private String empresaCnpj = "";
    private String CaminhoConfiguracaoToken = "";
    private String estado = "";
    private String tipo = "";
    private boolean ProtocoloAdicionado = false;

    // Assinar Nota Fiscal
    public boolean assinarControleTransporte() throws Exception {

        System.err.println(" - Tentando transmissoesControleTransporte.:assinarControleTransporte");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(getXML().toString().getBytes("UTF-8")));
            //Document doc = builder.parse(new ByteArrayInputStream(getControleTransporteXML().toString().getBytes()));
            doc.setXmlStandalone(true);
            doc.getDocumentElement().removeAttribute("xmlns:ns2");
            // NodeList elements = doc.getElementsByTagName("infCTe");
            //Node element = doc.getDocumentElement().getFirstChild().getNextSibling();
            NodeList elements = doc.getElementsByTagName("infCte");
            // elements.getLength();            
            //Element el = (Element) element;
            Element el = (Element) elements.item(0);
            // Element el =
            // doc.getDocumentElement().getFirstChild().getChildNodes();
            //String id = el.getAttribute("Id");
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
            stream = new ByteArrayInputStream(CaminhoConfiguracaoToken.getBytes());
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
                CaminhoConfiguracaoToken = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(CaminhoConfiguracaoToken.getBytes());
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
            System.err.println(" - =Tentando transmissoesControleTransporte.:assinarControleTransporte Retorno:"+e.toString() + "  " + e.getCause().getMessage());
            return false;
        }
    }

    private void assinarCTe(XMLSignatureFactory fac, ArrayList transformList, PrivateKey privateKey, KeyInfo ki, Document doc, int i) throws Exception {
        // Obtem elemento do documento a ser assinado, será criado uma
        // REFERENCE para o mesmo
        System.err.println(" - Tentando transmissoesControleTransporte.:assinarCTe");
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
            System.err.println(" - *Tentando transmissoesControleTransporte.:assinarCTe Retorno:OK");           
            return "OK";
        } catch (ParserConfigurationException e) {         
            System.err.println(" - +Tentando transmissoesControleTransporte.:assinarCTe Erro :"+e.getMessage());           
            return e.getMessage();
        } catch (SAXException e) {        
            System.err.println(" - -Tentando transmissoesControleTransporte.:assinarCTe Erro :"+e.getMessage());           
            return e.getMessage();
        } catch (IOException e) {
            // exception handling
            System.err.println(e.getMessage());
            return e.getMessage();
        }
    }

    public String enviarControlesTransporte(int numeracaoLote) {
        System.err.println("- Tentando transmissoesControleTransporte.:enviarControlesTransporte ");
        String Resultado = "0";
        try {
            URL url = null;
            if (getConfiguracaoAmbienteEmissaoNf().equals("2")) {
                if (getTipo().equals("S")) {
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
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx");
                    } 
                }
            } else {
                if (getTipo().equals("S")) {
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
                    } else if (getEstado().equals("SP")) {
                        url = new URL("https://nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx");
                    } 
                }
            }
            // Realiza a conexao com WebService
            try {
//                this.buscarDadosCertificado();
//
//                /**
//                 * Xml de Consulta.
//                 * 
//                 */
//                String xml = getXMLAssinado().replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>", "");
//                xml = xml.replace("xmlns=\"http://www.portalfiscal.inf.br/cte\"", "");
//                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
//                        + "<enviCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"2.00\">"
//                        + "<idLote>" + numeracaoLote + "</idLote>"
//                        + getXMLAssinado().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "").replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>", "").replace("xmlns=\"http://www.portalfiscal.inf.br/cte\"", "")
//                        + "</enviCTe>";
//
//                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
//                CteRecepcaoStub.CteDadosMsg dadosMsg = new CteRecepcaoStub.CteDadosMsg();
//                dadosMsg.setExtraElement(ome);
//
//                CteRecepcaoStub.CteCabecMsg CteCabecMsg = new CteRecepcaoStub.CteCabecMsg();
//                /**
//                 * Código do Estado.
//                 */
//                CteCabecMsg.setCUF(getEmpresaCodEstado());
//                /**
//                 * Versao do XML
//                 */
//                CteCabecMsg.setVersaoDados("2.00");
//                CteRecepcaoStub.CteCabecMsgE CteCabecMsgE = new CteRecepcaoStub.CteCabecMsgE();
//                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);
//
//                CteRecepcaoStub stub = new CteRecepcaoStub(url.toString());
//                CteRecepcaoStub.CteRecepcaoLoteResult result = stub.cteRecepcaoLote(dadosMsg, CteCabecMsgE);
//
//                Resultado = result.getExtraElement().toString();

            } catch (Exception e) {
                e.printStackTrace();

            }
        } catch (Exception e) {
            System.err.println("- +transmissoesControleTransporte.:enviarControlesTransporte retorno:" + e.toString());
            System.err.println(e.toString());
            e.printStackTrace();
        }
        System.err.println("- transmissoesControleTransporte.:enviarControlesTransporte retorno:" + Resultado);
        return Resultado;
    }

    public boolean assinarEnviCTe() throws Exception {
        try {
            System.err.println("- Tentando transmissoesControleTransporte.:assinarEnviCTe");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Document docs = builder.parse(new File(
            // "c:/xml/430802017886010001735500000000010000030371-CTe.xml"));            
            Document doc = builder.parse(new ByteArrayInputStream(getXML().getBytes("UTF-8")));
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
                //pin = senhaCertificado.toCharArray();
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
                //ks.load(new FileInputStream("Certificado_Metais_Safari.pfx"), pin);
            } else {
                //System.err.println("Teste 02 ");
                p = new sun.security.pkcs11.SunPKCS11(getConfiguracaoCertificadoA3());
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
            //this.setControleTransporteXMLAssinada(new StringBuffer(os.toString()));         
            if (!getTipoCertificado().equals("A1")) {
                //Security.removeProvider(p.getName());
            }
            return true;
        } catch (Exception e) {          
            System.err.println("- *Tentando transmissoesControleTransporte.:assinarCancCTe Retorno :"+e.toString() + "  " + e.getCause().getMessage());

            return false;
        }
    }

    public String retornoEnviaCTe(String transmitidaNumeroRecibo) {
        System.err.println("- Tentando transmissoesControleTransporte.:retornoEnviaCTe");
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
//                this.buscarDadosCertificado();
//                /**
//                 * Xml de Consulta.
//                 */
//                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
//                        + "<consReciCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"2.00\">"
//                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb>"
//                        + "<nRec>" + transmitidaNumeroRecibo  + "</nRec>"
//                        + "</consReciCTe>";               
//
//                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
//                CteRetRecepcaoStub.CteDadosMsg dadosMsg = new CteRetRecepcaoStub.CteDadosMsg();
//                dadosMsg.setExtraElement(ome);
//
//                CteRetRecepcaoStub.CteCabecMsg CteCabecMsg = new CteRetRecepcaoStub.CteCabecMsg();
//                /**
//                 * Código do Estado.
//                 */
//                CteCabecMsg.setCUF(getEmpresaCodEstado());
//                /**
//                 * Versao do XML
//                 */
//                CteCabecMsg.setVersaoDados("2.00");
//                CteRetRecepcaoStub.CteCabecMsgE CteCabecMsgE = new CteRetRecepcaoStub.CteCabecMsgE();
//                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);
//
//                CteRetRecepcaoStub stub = new CteRetRecepcaoStub(url.toString());
//                CteRetRecepcaoStub.CteRetRecepcaoResult result = stub.cteRetRecepcao(dadosMsg, CteCabecMsgE);
//
//
//                Resultado = result.getExtraElement().toString();

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
//                this.buscarDadosCertificado();
//                /**
//                 * Xml de Consulta.
//                 */
//                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\" ?> "
//                        //                        + "<consSitCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"" + Login._sessao.configuracao.getVersaoAmbiente() + "\">"
//                        + "<consSitCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"2.01\">"
//                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb> "
//                        + "<xServ>CONSULTAR</xServ> "
//                        + "<chCTe>" + chaveAcesso + "</chCTe> "
//                        + "</consSitCTe>";
//
//                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
//                CteConsultaStub.CteDadosMsg dadosMsg = new CteConsultaStub.CteDadosMsg();
//                dadosMsg.setExtraElement(ome);
//
//                CteConsultaStub.CteCabecMsg CteCabecMsg = new CteConsultaStub.CteCabecMsg();
//                /**
//                 * Código do Estado.
//                 */
//                CteCabecMsg.setCUF(getEmpresaCodEstado());
//                /**
//                 * Versao do XML
//                 */
//                CteCabecMsg.setVersaoDados("2.01");
//                CteConsultaStub.CteCabecMsgE CteCabecMsgE = new CteConsultaStub.CteCabecMsgE();
//                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);
//
//                CteConsultaStub stub = new CteConsultaStub(url.toString());
//                CteConsultaStub.CteConsultaCTResult result = stub.cteConsultaCT(dadosMsg, CteCabecMsgE);
//
//                Resultado = result.getExtraElement().toString();

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

            CaminhoConfiguracaoToken = getConfiguracaoCertificadoA3().replace("<br>", "\n");
            stream = new ByteArrayInputStream(CaminhoConfiguracaoToken.getBytes());
            //this.buscarDadosCertificado(TipoCertificado, SenhaCertificado);           
            if (TipoCertificado.equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {
                //System.err.println("Teste 02 ");
                p = new sun.security.pkcs11.SunPKCS11(stream);
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
//                this.buscarDadosCertificado();
//                /**
//                 * Xml de Consulta.
//                 */
//                String cabecMsgEnvia = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "<cabecMsg xmlns=\"http://www.portalfiscal.inf.br/cte\" "
//                        + "versao=\"1.02\">" + "<versaoDados>" + getConfiguracaoVersaoAmbiente() + "</versaoDados>"
//                        + "</cabecMsg>";
//
//                //versao=\"1.02\">"
//                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\" ?> "
//                        + "<cancCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"2.00\">"
//                        + "<infCanc Id=\"ID" + chaveAcesso + "\">"
//                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb> "
//                        + "<xServ>CANCELAR</xServ> "
//                        + "<chCTe>" + chaveAcesso + "</chCTe> "
//                        + "<nProt>" + transmitidaProtocoloAutorizacao + "</nProt> "
//                        + "<xJust>" + motivoCancelamento + "</xJust> "
//                        + "</infCanc>"
//                        + "</cancCTe>";
//
//                try {
//                    CteDadosMsg = this.assinarCancCTe(getTipoCertificado(), getSenhaCertificado(), CteDadosMsg);
//                } catch (Exception e) {
//                    System.err.println("- +Tentando transmissoesControleTransporte.:cancelarCTe: Retorno"+e.toString());
//                    System.err.println(e.toString());
//                }               
//                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
//                CteCancelamentoStub.CteDadosMsg dadosMsg = new CteCancelamentoStub.CteDadosMsg();
//                dadosMsg.setExtraElement(ome);
//
//                CteCancelamentoStub.CteCabecMsg CteCabecMsg = new CteCancelamentoStub.CteCabecMsg();
//                /**
//                 * Código do Estado.
//                 */
//                CteCabecMsg.setCUF(getEmpresaCodEstado());
//                /**
//                 * Versao do XML
//                 */
//                CteCabecMsg.setVersaoDados("2.00");
//                CteCancelamentoStub.CteCabecMsgE CteCabecMsgE = new CteCancelamentoStub.CteCabecMsgE();
//                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);
//
//                CteCancelamentoStub stub = new CteCancelamentoStub(url.toString());
//                CteCancelamentoStub.CteCancelamentoCTResult result = stub.cteCancelamentoCT(dadosMsg, CteCabecMsgE);
//
//                Resultado = result.getExtraElement().toString();           
                

            } catch (Exception e) {
                System.err.println("- **transmissoesControleTransporte.:cancelarCTe: Erro !");
                e.printStackTrace();

            }
        } catch (Exception e) {
            System.err.println("- *transmissoesControleTransporte.:cancelarCTe: Retorno:"+Resultado);
            System.err.println(e.toString());
        }

        System.err.println("- transmissoesControleTransporte.:cancelarCTe: Retorno:"+Resultado);
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

            CaminhoConfiguracaoToken = getConfiguracaoCertificadoA3().replace("<br>", "\n");
            stream = new ByteArrayInputStream(CaminhoConfiguracaoToken.getBytes());
            //this.buscarDadosCertificado(TipoCertificado, SenhaCertificado);           

            if (TipoCertificado.equals("A1")) {
                pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("PKCS12");
                ks.load(new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\")), pin);
            } else {
              
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
            System.err.println("- transmissoesControleTransporte.:assinarInutCTe: retorno:"+os.toString());
            return os.toString();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("- +transmissoesControleTransporte.:assinarInutCTe: retorno:"+e.toString());
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
//                this.buscarDadosCertificado();
//                /**
//                 * Xml de Consulta.
//                 */
//                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\" ?> "
//                        + "<inutCTe xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"" + getConfiguracaoVersaoAmbiente() + "\">"
//                        + "<infInut Id=\"ID" + getEmpresaCodEstado() + (new SimpleDateFormat("yy").format(new Date())) + getEmpresaCnpj().replace(".", "").replace("-", "").replace("/", "").trim() + getConfiguracaoModeloNf() + _Funcoes.FormataString(getConfiguracaoSerieNf(), 3, "0", "E") + _Funcoes.FormataString(numeracaoInicial, 9, "0", "E") + _Funcoes.FormataString(numeracaoFinal, 9, "0", "E") + "\">"
//                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb>"
//                        + "<xServ>INUTILIZAR</xServ>"
//                        + "<cUF>" + getEmpresaCodEstado() + "</cUF>"
//                        + "<ano>" + new SimpleDateFormat("yy").format(new Date()) + "</ano>"
//                        + "<CNPJ>" + getEmpresaCnpj().replace(".", "").replace("-", "").replace("/", "").trim() + "</CNPJ>"
//                        + "<mod>" + getConfiguracaoModeloNf() + "</mod>"
//                        + "<serie>" + getConfiguracaoSerieNf() + "</serie>"
//                        + "<nCTIni>" + numeracaoInicial + "</nCTIni>"
//                        + "<nCTFin>" + numeracaoFinal + "</nCTFin>"
//                        + "<xJust>" + motivoInutilizacao + "</xJust>"
//                        + "</infInut>"
//                        + "</inutCTe>";                
//                try {                   
//                    CteDadosMsg = this.assinarInutCTe(getTipoCertificado(), getSenhaCertificado(), CteDadosMsg);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    System.err.println("- +transmissoesControleTransporte.:inutilizaCTe Retorno:"+e.toString()); 
//                }
//
//                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
//                CteInutilizacaoStub.CteDadosMsg dadosMsg = new CteInutilizacaoStub.CteDadosMsg();
//                dadosMsg.setExtraElement(ome);
//
//                CteInutilizacaoStub.CteCabecMsg CteCabecMsg = new CteInutilizacaoStub.CteCabecMsg();
//                /**
//                 * Código do Estado.
//                 */
//                CteCabecMsg.setCUF(getEmpresaCodEstado());
//                /**
//                 * Versao do XML
//                 */
//                CteCabecMsg.setVersaoDados("2.00");
//                CteInutilizacaoStub.CteCabecMsgE CteCabecMsgE = new CteInutilizacaoStub.CteCabecMsgE();
//                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);
//
//                CteInutilizacaoStub stub = new CteInutilizacaoStub(url.toString());
//                CteInutilizacaoStub.CteInutilizacaoCTResult result = stub.cteInutilizacaoCT(dadosMsg, CteCabecMsgE);
//
//                Resultado = result.getExtraElement().toString();
//                System.err.println("- .transmissoesControleTransporte.:inutilizaCTe Retorno:"+result.getExtraElement().toString());               

            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("- *transmissoesControleTransporte.:inutilizaCTe Retorno:"+e.toString()); 
            }
        } catch (Exception e) {
            System.err.println(e.toString());
            System.err.println("- -transmissoesControleTransporte.:inutilizaCTe Retorno:"+e.toString()); 

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
                p = new sun.security.pkcs11.SunPKCS11(getConfiguracaoCertificadoA3());
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
            System.err.println("- transmissoesControleTransporte.:assinarInutCTe Retorno:"+e.toString() + "  " + e.getCause().getMessage());           
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
            
            CaminhoConfiguracaoToken = getConfiguracaoCertificadoA3().replace("<br>", "\n");
//        CaminhoConfiguracaoToken = "name = EPASS2000\nlibrary = c:\\windows\\system32\\ngp11v211.dll";
            stream = new ByteArrayInputStream(CaminhoConfiguracaoToken.getBytes());    
            
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
            System.err.println("- transmissoesControleTransporte.:assinarRaiz_CartaCorrecao Retorno:"+os.toString());
            return os.toString();
        } catch (Exception e) {
            System.err.println("- -transmissoesControleTransporte.:assinarRaiz_CartaCorrecao Retorno:"+e.toString() + "  " + e.getCause().getMessage());
            e.printStackTrace();
            return "";
        }
    }

   /* public void buscarDadosCertificado() {
        System.err.println("- transmissoesControleTransporte.:buscarDadosCertificado ");
      
        Provider[] A = Security.getProviders();
              
        String Path = new crncomp.parametros._verificaParametro(11).getValorString();      
        String arquivoCacertsGeradoTodosOsEstados = Path + "/CTeCacerts";
        try {
//            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
//            System.clearProperty("javax.net.ssl.keyStore");  
//            System.clearProperty("javax.net.ssl.keyStorePassword");  
//            System.clearProperty("javax.net.ssl.trustStore");  
            System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

            if (getTipoCertificado().equals("A1")) {
                try {    
                    InputStream entrada = new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\"));
                    ks = KeyStore.getInstance("pkcs12");
                    try {
                        ks.load(entrada, getSenhaCertificado().toCharArray());
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new Exception("Senha do Certificado Digital esta incorreta ou Certificado inválido.");
                    }
                    String alias = "";
                    Enumeration<String> aliasesEnum = ks.aliases();
                    while (aliasesEnum.hasMoreElements()) {
                        alias = (String) aliasesEnum.nextElement();
                        if (ks.isKeyEntry(alias)) {
                            break;
                        }
                    }
                    X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);
                    PrivateKey privateKey = (PrivateKey) ks.getKey(alias, getSenhaCertificado().toCharArray());
                    SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
                    socketFactoryDinamico.setFileCacerts(arquivoCacertsGeradoTodosOsEstados);

                    //if (isProtocoloAdicionado() == false) {
                    setProtocoloAdicionado(true);
                    Protocol protocol = new Protocol("https", socketFactoryDinamico, SSL_PORT);
                    Protocol.registerProtocol("https", protocol);
                    //}

                    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
                    System.setProperty("javax.net.ssl.keyStore", getCaminhoCertificadoA1().replace("\\", "\\\\"));
                    System.setProperty("javax.net.ssl.keyStorePassword", getSenhaCertificado());                 
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("- transmissoesControleTransporte.:buscarDadosCertificado Retorno:"+e.toString());
                }
            } else {

                CaminhoConfiguracaoToken = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(CaminhoConfiguracaoToken.getBytes());
                //this.buscarDadosCertificado(TipoCertificado, SenhaCertificado);              
                p = new sun.security.pkcs11.SunPKCS11(stream);
                //p = new sun.security.pkcs11.SunPKCS11("SunPKCS11-SmartCard");

                // procura e remove o ultimo provider               
                Security.addProvider(p);                
//                char[] pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (Exception ex) {                    
                    ex.printStackTrace();
                    System.err.println("- +transmissoesControleTransporte.:buscarDadosCertificado Retorno:"+ex.toString());
                }
                String alias = "";
                Enumeration<String> aliasesEnum = ks.aliases();
                while (aliasesEnum.hasMoreElements()) {
                    alias = (String) aliasesEnum.nextElement();
                    if (ks.isKeyEntry(alias)) {
                        break;
                    }
                }
                System.setProperty("javax.net.ssl.keyStoreType", ks.getType());
                System.setProperty("javax.net.ssl.keyStoreProvider", ks.getProvider().getName());
//                System.setProperty("javax.net.ssl.keyStorePassword", getSenhaCertificado().toCharArray().toString());
                X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);
                PrivateKey privateKey = (PrivateKey) ks.getKey(alias, getSenhaCertificado().toCharArray());
                SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
                socketFactoryDinamico.setFileCacerts(arquivoCacertsGeradoTodosOsEstados);

                setProtocoloAdicionado(true);
                Protocol protocol = new Protocol("https", socketFactoryDinamico, SSL_PORT);
                Protocol.registerProtocol("https", protocol);
                System.setProperty("javax.net.ssl.trustStoreType", "JKS");
                System.setProperty("javax.net.ssl.trustStore", arquivoCacertsGeradoTodosOsEstados);
            }
            //System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
        } catch (Exception e) {
            System.err.println("- *transmissoesControleTransporte.:buscarDadosCertificado Retorno:"+e.toString());
            e.printStackTrace();
        }
        System.err.println("- transmissoesControleTransporte.:buscarDadosCertificado OK:");
    }*/
    
    public void buscarDadosCertificado() {
        /*
         * op = new com.sun.net.ssl.internal.ssl.Provider();
         * java.security.Security.addProvider(op);
         */
        Provider[] A = Security.getProviders();
        System.out.println("*SIZE: " + A.length);

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        String Path = new crncomp.parametros._verificaParametro(11).getValorString();
            System.out.println("Path Schema"+Path);
        String arquivoCacertsGeradoTodosOsEstados = Path+"/CTeCacerts";
        try {
//            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
//            System.clearProperty("javax.net.ssl.keyStore");  
//            System.clearProperty("javax.net.ssl.keyStorePassword");  
//            System.clearProperty("javax.net.ssl.trustStore");  
            System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

            if (getTipoCertificado().equals("A1")) {
                try {
                    System.out.println("entrei no A1");
                    InputStream entrada = new FileInputStream(getCaminhoCertificadoA1().replace("\\", "\\\\"));
                    ks = KeyStore.getInstance("pkcs12");
                    try {
                        ks.load(entrada, getSenhaCertificado().toCharArray());
                    } catch (IOException e) {
                        e.printStackTrace();
                        throw new Exception("Senha do Certificado Digital esta incorreta ou Certificado inválido.");
                    }
                    String alias = "";
                    Enumeration<String> aliasesEnum = ks.aliases();
                    while (aliasesEnum.hasMoreElements()) {
                        alias = (String) aliasesEnum.nextElement();
                        if (ks.isKeyEntry(alias)) {
                            break;
                        }
                    }
                    X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);
                    PrivateKey privateKey = (PrivateKey) ks.getKey(alias, getSenhaCertificado().toCharArray());
                    SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
                    socketFactoryDinamico.setFileCacerts(arquivoCacertsGeradoTodosOsEstados);

                    //if (isProtocoloAdicionado() == false) {
                    setProtocoloAdicionado(true);
                    Protocol protocol = new Protocol("https", socketFactoryDinamico, SSL_PORT);
                    Protocol.registerProtocol("https", protocol);
                    //}

                    System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
                    System.setProperty("javax.net.ssl.keyStore", getCaminhoCertificadoA1().replace("\\", "\\\\"));
                    System.setProperty("javax.net.ssl.keyStorePassword", getSenhaCertificado());
                    System.out.println("saiu do A1");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                
                System.out.println("Configuracao Nome Token Caminho 2 :" + getConfiguracaoCertificadoA3());
                CaminhoConfiguracaoToken = getConfiguracaoCertificadoA3().replace("<br>", "\n");
                stream = new ByteArrayInputStream(CaminhoConfiguracaoToken.getBytes());
                //this.buscarDadosCertificado(TipoCertificado, SenhaCertificado);
                System.out.println(getSenhaCertificado());
                p = new sun.security.pkcs11.SunPKCS11(stream);
                //p = new sun.security.pkcs11.SunPKCS11("SunPKCS11-SmartCard");

                // procura e remove o ultimo provider
                System.out.println("Tamanho Providers: " + Security.getProviders().length);
                Security.addProvider(p);
                System.out.println("Tamanho Providers 2: **" + Security.getProviders().length);
//                char[] pin = getSenhaCertificado().toCharArray();
                ks = KeyStore.getInstance("pkcs11");
                try {
                    ks.load(null, getSenhaCertificado().toCharArray());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                String alias = "";
                Enumeration<String> aliasesEnum = ks.aliases();
                while (aliasesEnum.hasMoreElements()) {
                    alias = (String) aliasesEnum.nextElement();
                    if (ks.isKeyEntry(alias)) {
                        break;
                    }
                }
                System.setProperty("javax.net.ssl.keyStoreType", ks.getType());
                System.setProperty("javax.net.ssl.keyStoreProvider", ks.getProvider().getName());
//                System.setProperty("javax.net.ssl.keyStorePassword", getSenhaCertificado().toCharArray().toString());
                X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);
                PrivateKey privateKey = (PrivateKey) ks.getKey(alias, getSenhaCertificado().toCharArray());
                SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
                socketFactoryDinamico.setFileCacerts(arquivoCacertsGeradoTodosOsEstados);

                setProtocoloAdicionado(true);
                Protocol protocol = new Protocol("https", socketFactoryDinamico, SSL_PORT);
                Protocol.registerProtocol("https", protocol);
                System.setProperty("javax.net.ssl.trustStoreType", "JKS");
                System.setProperty("javax.net.ssl.trustStore", arquivoCacertsGeradoTodosOsEstados);
            }
            //System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
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
            }else{
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
//                this.buscarDadosCertificado();
//                /**
//                 * Xml de Consulta.
//                 */
//                String CteDadosMsg = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
//                        + "<consStatServ xmlns=\"http://www.portalfiscal.inf.br/cte\" " + " versao=\"" + getConfiguracaoVersaoAmbiente() + "\">"
//                        + "<tpAmb>" + getConfiguracaoAmbienteEmissaoNf() + "</tpAmb>"
//                        + "<cUF>" + getEmpresaCodEstado() + "</cUF>"                 
//                        + "<xServ>STATUS</xServ>"
//                        + "</consStatServ>";
//
//                OMElement ome = AXIOMUtil.stringToOM(CteDadosMsg);
//                CteStatusServicoStub.CteDadosMsg dadosMsg = new CteStatusServicoStub.CteDadosMsg();
//                dadosMsg.setExtraElement(ome);
//
//                CteStatusServicoStub.CteCabecMsg CteCabecMsg = new CteStatusServicoStub.CteCabecMsg();
//                /**
//                 * Código do Estado.
//                 */
//                CteCabecMsg.setCUF(getEmpresaCodEstado());
//                /* Versao do XML
//                 */
//                CteCabecMsg.setVersaoDados("2.00");
//                CteStatusServicoStub.CteCabecMsgE CteCabecMsgE = new CteStatusServicoStub.CteCabecMsgE();
//                CteCabecMsgE.setCteCabecMsg(CteCabecMsg);
//
//                CteStatusServicoStub stub = new CteStatusServicoStub(url.toString());
//                CteStatusServicoStub.CteStatusServicoCTResult result = stub.cteStatusServicoCT(dadosMsg, CteCabecMsgE);
//
//                Resultado = (result.getExtraElement().toString());

            } catch (Exception e) {
                e.printStackTrace();
                 System.err.println("- +transmissoesControleTransporte.:statusServico Retorno"+e.toString());
            }
        } catch (Exception e) {
           System.err.println("- -transmissoesControleTransporte.:statusServico Retorno"+e.toString());
        }
         System.err.println("- *transmissoesControleTransporte.:statusServico Retorno"+Resultado);
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
        return caminhoCertificadoA1;
    }

    public void setCaminhoCertificadoA1(String caminhoCertificadoA1) {
        this.caminhoCertificadoA1 = caminhoCertificadoA1;
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
}
