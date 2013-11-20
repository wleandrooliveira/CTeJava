/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.controller;

import br.com.moveti.erpmove.transporte.cte.model.Entrega;
import br.com.moveti.erpmove.transporte.cte.model.compl;
import br.com.moveti.erpmove.transporte.cte.model.docAnt;
import br.com.moveti.erpmove.transporte.cte.model.emit;
import br.com.moveti.erpmove.transporte.cte.model.enderEmit;
import br.com.moveti.erpmove.transporte.cte.model.enderReme;
import br.com.moveti.erpmove.transporte.cte.model.ide;
import br.com.moveti.erpmove.transporte.cte.model.infCTeNorm;
import br.com.moveti.erpmove.transporte.cte.model.infCarga;
import br.com.moveti.erpmove.transporte.cte.model.infCte;
import br.com.moveti.erpmove.transporte.cte.model.infDoc;
import br.com.moveti.erpmove.transporte.cte.model.infNFe;
import br.com.moveti.erpmove.transporte.cte.model.moto;
import br.com.moveti.erpmove.transporte.cte.model.rem;
import br.com.moveti.erpmove.transporte.cte.model.rodo;
import br.com.moveti.erpmove.transporte.cte.model.semData;
import br.com.moveti.erpmove.transporte.cte.model.semHora;
import br.com.moveti.erpmove.transporte.cte.model.toma03;
import br.com.moveti.erpmove.transporte.cte.model.veic;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 *
 * @author Geraldo Henrique Lacerda Pinto
 */
public class Teste {

//    public static void main(String[] args) {
//        Path path = Paths.get("C:\\Modified");
//        WatchService watchService = null;
//        try {
//            watchService = FileSystems.getDefault().newWatchService();
//            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
//                    StandardWatchEventKinds.ENTRY_MODIFY,
//                    StandardWatchEventKinds.ENTRY_DELETE);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//
//        WatchKey key = null;
//        while (true) {
//            try {
//                key = watchService.take();
//                for (WatchEvent<?> event : key.pollEvents()) {
//                    Kind<?> kind = event.kind();
//                    System.out.println("Evento em " + event.context().toString() + " " + kind);
//                }
//            } catch (Exception e) {
//                System.out.println(e.toString());
//            }
//            boolean reset = key.reset();
//            if (!reset) {
//                break;
//            }
//        }
//    }
    public static void main(String[] args) {
        infCte infCte = new infCte();
        infCte.setId("CTe35121268252816000146570010000016161002008470" );
        infCte.setVersao("2.00");
        
        ide ide = new ide();    
        ide.setcUF("35");
        ide.setcCT("00200847");
        ide.setCFOP("5353");
        ide.setNatOp("PREST. DE SERV. TRANSPORTE A ESTAB. COMERCIAL");
        ide.setForPag("0");
        ide.setMod("57");
        ide.setSerie("1");
        ide.setnCT("1616");
        ide.setDhEmi("2012-12-01T15:01:00");
        ide.setTpImp("1");
        ide.setTpEmis("1");
        ide.setcDV("0");
        ide.setTpAmb("1");
        ide.setTpCTe("0");
        ide.setProcEmi("3");
        ide.setVerProc("1.2.0");
        ide.setcMunEnv("3524402");
        ide.setxMunEnv("Jacarei");
        ide.setUFEnv("SP");
        ide.setModal("01");
        ide.setTpServ("0");
        ide.setcMunIni("3512209");
        ide.setxMunIni("Conchal");
        ide.setUFIni("SP");
        ide.setCMunFim("3524402");
        ide.setxMunFim("Jacarei");
        ide.setUFFim("SP");
        ide.setRetira("1");
                      
        toma03 toma03 = new toma03();
        toma03.setToma(0);
        ide.setToma03(toma03);
        

        compl compl = new compl();
        compl.setxEmi("Jose Darcilio dos Re");
        

        Entrega Entrega = new Entrega();
        semData semData = new semData();
        semData.setTpPer("0");
        semHora semHora = new semHora();
        semHora.setTpHor("0");
        
        Entrega.setSemData(semData);
        Entrega.setSemHora(semHora);
        
        compl.setEntrega(Entrega);
                        
                        
        emit emit = new emit();
        emit.setCNPJ("68252816000146");
        emit.setIE("392242719111");
        emit.setxNome("Friozer Comercio, Distribuicao e Logistica Ltda");
        
        enderEmit enderEmit = new enderEmit();
        enderEmit.setxLgr("Industrial");
        enderEmit.setNro("697");
        enderEmit.setxBairro("Jardim Emilia");
        enderEmit.setcMun("3524402");
        enderEmit.setxMun("Jacarei");
        enderEmit.setCEP("12321500");
        enderEmit.setUF("SP");
        enderEmit.setFone("1239515344");
        emit.setEnderEmit(enderEmit);

        infCte.setEmit(emit);
        
        rem rem = new rem();
        rem.setCNPJ("85782878000855");
        rem.setIE("270020518119");
        rem.setxNome("Frigorifico Riosulense s a");
        rem.setxFant("Pamplona Conchal");
        
        enderReme enderReme = new enderReme();
        enderReme.setxLgr("Av Prefeito Nelson Cunha");
        enderReme.setNro("798");
        enderReme.setxCpl("Sala c");
        enderReme.setxBairro("sao Joaoda Figueira");
        enderReme.setcMun("3512209");
        enderReme.setxMun("Conchal");
        enderReme.setCEP("13835000");
        enderReme.setUF("SP");
        enderReme.setcPais("1058");
        enderReme.setxPais("BRASIL");

        
        
        
        infCTeNorm infCTeNorm = new infCTeNorm();
        infCarga infCarga = new infCarga();
        infDoc infDoc = new infDoc();
        infNFe infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002211151664026");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002641607831237");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002651958710901");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002661633113251");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002671566266346");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002681618839152");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002691800012907");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002701082219507");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002711199746229");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002721949114239");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002731383810958");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002741402547720");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002751640262800");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002761762144320");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002771772821224");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002781425698472");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002791476277080");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002801683645647");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002811672962015");
        infDoc.addInfNFe(infNFe);
        infNFe = new infNFe();
        infNFe.setChave("35121185782878000855550010000002821590931504");
        infDoc.addInfNFe(infNFe);
        
        
        infCTeNorm.setInfDoc(infDoc);
        infCte.setInfCTeNorm(infCTeNorm);
        
//</rem>
//<dest>
//<CNPJ>68252816000146</CNPJ>
//<IE>392242719111</IE>
//<xNome>Friozer Comercio, Distribuicao e Logistica Ltda</xNome>
//<fone>1239515344</fone>
//<enderDest>
//<xLgr>Industrial</xLgr>
//<nro>697</nro>
//<xBairro>Jardim Emilia</xBairro>
//<cMun>3524402</cMun>
//<xMun>Jacarei</xMun>
//<CEP>12321500</CEP>
//<UF>SP</UF>
//<cPais>1058</cPais>
//<xPais>BRASIL</xPais>
//</enderDest>
//</dest>
//<vPrest>
//<vTPrest>1118.35</vTPrest>
//<vRec>1118.35</vRec>
//<Comp><xNome>84, 2 - COLETA</xNome>
//<vComp>1118.35</vComp>
//</Comp>
//</vPrest>
//<imp>
//<ICMS>
//<ICMS00>
//<CST>00</CST>
//<vBC>1118.35</vBC>
//<pICMS>12.00</pICMS>
//<vICMS>134.20</vICMS>
//</ICMS00>
//</ICMS>
//</imp>
//<infCTeNorm>
//<infCarga>
//<vCarga>1.00</vCarga>
//<proPred>suinos</proPred>
//<infQ>
//<cUnid>03</cUnid>
//<tpMed>VOLUMES</tpMed>
//<qCarga>463.0000</qCarga>
//</infQ>
//<infQ>
//<cUnid>01</cUnid>
//<tpMed>VOLUMES-PL</tpMed>
//<qCarga>6713.6400</qCarga>
//</infQ>
//<infQ>
//<cUnid>01</cUnid>
//<tpMed>VOLUMES-PB</tpMed>
//<qCarga>7018.4350</qCarga>
//</infQ>
//</infCarga>
//<infModal versaoModal="1.04">

        //<rodo>
        rodo rodo = new rodo();
        
        rodo.setRNTRC("44501745");
        rodo.setdPrev("2012-12-01");
        rodo.setLota("0");

        veic veic = new veic();
        veic.setcInt("9");
        veic.setRENAVAM("378016369");
        veic.setPlaca("CVN9852");
        veic.setTara("0");
        veic.setCapKG("0");
        veic.setCapM3("0");
        veic.setTpProp("P");
        veic.setTpVeic("0");
        veic.setTpRod("00");
        veic.setTpCar("00");
        veic.setUF("SP");


        moto moto = new moto();
        moto.setxNome("Marcio Lopes do Prado (motorista)");
        moto.setCPF("09864451855");

//</rodo>
//</infModal>
//</infCTeNorm>
//</infCte>
                                                                

        infCte.setIde(ide);
        infCte.setCompl(compl);
        
        
        
        XStream xStream = new XStream(new DomDriver());  
        
        String xml = xStream.toXML(infCte);  
        System.out.println(xml);
    }
}
