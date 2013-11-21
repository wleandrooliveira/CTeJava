/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.controller;

import br.com.moveti.erpmove.transporte.cte.model.CTe;
import br.com.moveti.erpmove.transporte.cte.model.Comp;
import br.com.moveti.erpmove.transporte.cte.model.Entrega;
import br.com.moveti.erpmove.transporte.cte.model.ICMS;
import br.com.moveti.erpmove.transporte.cte.model.ICMS00;
import br.com.moveti.erpmove.transporte.cte.model.ICMS20;
import br.com.moveti.erpmove.transporte.cte.model.ICMS45;
import br.com.moveti.erpmove.transporte.cte.model.ICMS60;
import br.com.moveti.erpmove.transporte.cte.model.ICMS90;
import br.com.moveti.erpmove.transporte.cte.model.ICMSOutraUF;
import br.com.moveti.erpmove.transporte.cte.model.ICMSSN;
import br.com.moveti.erpmove.transporte.cte.model.ObsCont;
import br.com.moveti.erpmove.transporte.cte.model.ObsFisco;
import br.com.moveti.erpmove.transporte.cte.model.comData;
import br.com.moveti.erpmove.transporte.cte.model.comHora;
import br.com.moveti.erpmove.transporte.cte.model.compl;
import br.com.moveti.erpmove.transporte.cte.model.dest;
import br.com.moveti.erpmove.transporte.cte.model.docAnt;
import br.com.moveti.erpmove.transporte.cte.model.emit;
import br.com.moveti.erpmove.transporte.cte.model.enderDest;
import br.com.moveti.erpmove.transporte.cte.model.enderEmit;
import br.com.moveti.erpmove.transporte.cte.model.enderExped;
import br.com.moveti.erpmove.transporte.cte.model.enderReceb;
import br.com.moveti.erpmove.transporte.cte.model.enderReme;
import br.com.moveti.erpmove.transporte.cte.model.enderToma;
import br.com.moveti.erpmove.transporte.cte.model.enuns.TipoPeriodoData;
import br.com.moveti.erpmove.transporte.cte.model.enuns.TipoPeriodoHora;
import br.com.moveti.erpmove.transporte.cte.model.exped;
import br.com.moveti.erpmove.transporte.cte.model.fluxo;
import br.com.moveti.erpmove.transporte.cte.model.ide;
import br.com.moveti.erpmove.transporte.cte.model.imp;
import br.com.moveti.erpmove.transporte.cte.model.infCTeNorm;
import br.com.moveti.erpmove.transporte.cte.model.infCarga;
import br.com.moveti.erpmove.transporte.cte.model.infCte;
import br.com.moveti.erpmove.transporte.cte.model.infDoc;
import br.com.moveti.erpmove.transporte.cte.model.infNFe;
import br.com.moveti.erpmove.transporte.cte.model.locColeta;
import br.com.moveti.erpmove.transporte.cte.model.locEnt;
import br.com.moveti.erpmove.transporte.cte.model.moto;
import br.com.moveti.erpmove.transporte.cte.model.noInter;
import br.com.moveti.erpmove.transporte.cte.model.noPeriodo;
import br.com.moveti.erpmove.transporte.cte.model.receb;
import br.com.moveti.erpmove.transporte.cte.model.rem;
import br.com.moveti.erpmove.transporte.cte.model.rodo;
import br.com.moveti.erpmove.transporte.cte.model.semData;
import br.com.moveti.erpmove.transporte.cte.model.semHora;
import br.com.moveti.erpmove.transporte.cte.model.toma03;
import br.com.moveti.erpmove.transporte.cte.model.toma4;
import br.com.moveti.erpmove.transporte.cte.model.vPresComp;
import br.com.moveti.erpmove.transporte.cte.model.vPrest;
import br.com.moveti.erpmove.transporte.cte.model.veic;
import br.com.moveti.erpmove.transporte.cte.transmissoesCTe;
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
import javax.swing.JOptionPane;

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
        CTe CTe = new CTe();
        infCte infCte = new infCte();
        infCte.setId("CTe35121268252816000146570010000016161002008470");
        infCte.setVersao("2.00");
        //
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
        ide.setRefCTE(null);
        ide.setcMunEnv("3524402");
        ide.setxMunEnv("Jacarei");
        ide.setUFEnv("SP");
        ide.setModal("01");
        ide.setTpServ("0");
        ide.setcMunIni("3512209");
        ide.setxMunIni("Conchal");
        ide.setUFIni("SP");
        ide.setcMunFim("3524402");
        ide.setxMunFim("Jacarei");
        ide.setUFFim("SP");
        ide.setRetira("1");
        ide.setXDetRetira(null);
//        infCte.setxPais(null)
//                ide.setxJust //
        toma03 toma03 = new toma03();
        toma03.setToma(0);
        ide.setToma03(toma03);

        toma4 toma4 = new toma4();
//        toma4.setToma(null);
        toma4.setCNPJ(null);
        toma4.setCPF(null);
        toma4.setIE(null);
        toma4.setxNome(null);
        toma4.setxFant(null);
//        toma4.setFone(null);
        
        enderToma enderToma = new enderToma();
        enderToma.setxLgr(null);
        enderToma.setNro(null);
        enderToma.setxCpl(null);
        enderToma.setxBairro(null);
        enderToma.setcMun(null);
        enderToma.setxMun(null);
        enderToma.setCEP(null);
        enderToma.setUF(null);
        enderToma.setcPais(null);
        toma4.setEnderToma(enderToma);
        toma4.setEmail(null);

        compl compl = new compl();
        compl.setxCaracAd(null);
        compl.setxCaracSer(null);
        compl.setxEmi("Jose Darcilio dos Re");

        fluxo fluxo = new fluxo();
        fluxo.setxOrig(null);
        fluxo.setxDest(null);
        fluxo.setxRota(null);


        Entrega Entrega = new Entrega();

        semData semData = new semData();
        semData.setTpPer(TipoPeriodoData.SEM_DATA_DEFINIDA);

        comData comData = new comData();
        comData.setTpPer(null);
        comData.setdProg(null);
        noPeriodo noPeriodo = new noPeriodo();
        noPeriodo.setTpPer(null);
        noPeriodo.setdIni(null);
        noPeriodo.setdFim(null);

        semHora semHora = new semHora();
        semHora.setTpHor(TipoPeriodoHora.SEM_HORA_DEFINIDA);
        comHora comHora = new comHora();
        comHora.setTpHor(null);
        comHora.sethProg(null);
        
        noInter noInter = new noInter();
        noInter.setTpHor(null);
        noInter.sethIni(null);
        noInter.sethFim(null);
        
        Entrega.setSemData(semData);
        Entrega.setSemHora(semHora);

        compl.setOrigCalc(null);
        compl.setDestCalc(null);
        compl.setxObs(null);

        ObsCont ObsCont = new ObsCont();
        ObsCont.setxCampo(null);
        ObsCont.setxTexto(null);

        ObsFisco ObsFisco = new ObsFisco();
        ObsFisco.setxCampo(null);
        ObsFisco.setxTexto(null);


        compl.setEntrega(Entrega);

        // Dados do Emitente                
        emit emit = new emit();
        emit.setCNPJ("68252816000146");
        emit.setIE("392242719111");
        emit.setxNome("Friozer Comercio, Distribuicao e Logistica Ltda");
        emit.setxFant(null);
        //
        enderEmit enderEmit = new enderEmit();
        enderEmit.setxLgr("Industrial");
        enderEmit.setNro("697");
        enderEmit.setxCpl(null);
        enderEmit.setxBairro("Jardim Emilia");
        enderEmit.setcMun("3524402");
        enderEmit.setxMun("Jacarei");
        enderEmit.setCEP("12321500");
        enderEmit.setUF("SP");
        enderEmit.setFone("1239515344");
        emit.setEnderEmit(enderEmit);


        infCte.setEmit(emit);
        // Dados do Remetente
        rem rem = new rem();
        rem.setCNPJ("85782878000855");
        rem.setCPF(null);
        rem.setIE("270020518119");
        rem.setxNome("Frigorifico Riosulense s a");
        rem.setxFant("Pamplona Conchal");
        rem.setFone(null);
        //        
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
        rem.setEmail(null);

        locColeta locColeta = new locColeta();
        locColeta.setCNPJ(null);
        locColeta.setCPF(null);
        locColeta.setxNome(null);
        locColeta.setxLgr(null);
        locColeta.setNro(null);
        locColeta.setxCpl(null);
        locColeta.setxBairro(null);
        locColeta.setcMun(null);
        locColeta.setxMun(null);
        locColeta.setUF(null);

        exped exped = new exped();
        exped.setCNPJ(null);
        exped.setCPF(null);
        exped.setIE(null);
        exped.setxNome(null);
        exped.setFone(null);
        //
        enderExped enderExped = new enderExped();
        enderExped.setxLgr(null);
        enderExped.setNro(null);
        enderExped.setxCpl(null);
        enderExped.setxBairro(null);
        enderExped.setcMun(null);
        enderExped.setxMun(null);
        enderExped.setCEP(null);
        enderExped.setUF(null);
        enderExped.setcPais(null);
        enderExped.setxPais(null);
        exped.setEmail(null);

        receb receb = new receb();
        receb.setCNPJ(null);
        receb.setCPF(null);
        receb.setIE(null);
        receb.setxNome(null);
        receb.setFone(null);
        //
        enderReceb enderReceb = new enderReceb();
        enderReceb.setxLgr(null);
        enderReceb.setNro(null);
        enderReceb.setxCpl(null);
        enderReceb.setxBairro(null);
        enderReceb.setcMun(null);
        enderReceb.setxMun(null);
        enderReceb.setCEP(null);
        enderReceb.setUF(null);
        enderReceb.setcPais(null);
        enderReceb.setxPais(null);
        receb.setEmail(null);
        //
        dest dest = new dest();
        dest.setCNPJ("68252816000146");
        dest.setCPF(null);
        dest.setIE("392242719111");
        dest.setxNome("Friozer Comercio, Distribuicao e Logistica Ltda");
        dest.setFone("1239515344");
        dest.setISUF(null);
        //
        enderDest enderDest = new enderDest();
        enderDest.setxLgr("Industrial");
        enderDest.setNro("697");
        enderDest.setxCpl(null);
        enderDest.setxBairro("Jardim Emilia");
        enderDest.setcMun("3524402");
        enderDest.setxMun("Jacarei");
        enderDest.setCEP("12321500");
        enderDest.setUF("SP");
        enderDest.setcPais("1058");
        enderDest.setxPais("BRASIL");
        dest.setEmail(null);
        //
        locEnt locEnt = new locEnt();
        locEnt.setCNPJ(null);
        locEnt.setCPF(null);
        locEnt.setxNome(null);
        locEnt.setxLgr(null);
        locEnt.setNro(null);
        locEnt.setxCpl(null);
        locEnt.setxBairro(null);
        locEnt.setcMun(null);
        locEnt.setxMun(null);
        locEnt.setUF(null);
 
        // Valor da Prestação de Serviço
        vPrest vPrest = new vPrest();
        vPrest.setvTPrest(1118.35);
        vPrest.setvRec(1118.35);
        
        //
        Comp Comp = new Comp();
        Comp.setxNome("84,2 - COLETA");
        Comp.setvComp(1118.35);
        
        vPrest.setComp(null);
        infCte.setvPrest(vPrest);
        
        imp imp = new imp();
        ICMS ICMS = new ICMS();
        //
        ICMS00 ICMS00 = new ICMS00();
        ICMS00.setCST("00");
        ICMS00.setvBC(1118.35);
        ICMS00.setpICMS(12.00);
        ICMS00.setvICMS(134.20);
        ICMS.setICMS00(ICMS00);
        //
        ICMS20 ICMS20 = new ICMS20();
        ICMS20.setCST(null);
        ICMS20.setpRedBC(null);
        ICMS20.setvBC(null);
        ICMS20.setpICMS(null);
        ICMS20.setvICMS(null);
        ICMS.setICMS20(ICMS20);
        //
        ICMS45 ICMS45 = new ICMS45();
        ICMS45.setCST(null);
        ICMS.setICMS45(ICMS45);
        //
        ICMS60 ICMS60 = new ICMS60();
        ICMS60.setCST(null);
        ICMS60.setvBCSTRet(null);
        ICMS60.setvICMSSTRet(null);
        ICMS60.setpICMSSTRet(null);
        ICMS60.setvCred(null);
        ICMS.setICMS60(ICMS60);
        //
        ICMS90 ICMS90 = new ICMS90();
        ICMS90.setCST(null);
        ICMS90.setpRedBC(null);
        ICMS90.setvBC(null);
        ICMS90.setpICMS(null);
        ICMS90.setvICMS(null);
        ICMS90.setvCred(null);
        ICMS.setICMS90(ICMS90);
        //
        ICMSOutraUF ICMSOutraUF = new ICMSOutraUF();
        ICMSOutraUF.setCST(null);
        ICMSOutraUF.setpRedBCOutraUF(null);
        ICMSOutraUF.setvBCOutraUF(null);
        ICMSOutraUF.setpICMSOutraUF(null);
        ICMSOutraUF.setvICMSOutraUF(null);
        ICMS.setICMSOutraUF(ICMSOutraUF);
        //
        ICMSSN ICMSSN = new ICMSSN();
        ICMSSN.setIndSN(null);
        ICMS.setICMSSN(ICMSSN);
        //
        imp.setICMS(ICMS);
        imp.setvTotTrib(null);
        imp.setInfAdFisco(null);
        infCte.setImp(imp);
        
        //</ICMS00>
        //</ICMS>
        //</imp>
        //<infCTeNorm>
//<infCarga>
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


//        infCarga infCarga = new infCarga();
//        infCarga.setvCarga(1.00);
//        infCarga.setProPred("suinos");
//        //<infQ>
//        infQ infQ = new infQ();
//        infQ.setcUnid(03);
//        infQ.settpMed("VOLUMES");
//        infQ.setqCarga(463.0000);
//        //</infQ>
//        //<infQ>
//        infQ.setcUnid("01");
//        infQ.settpMed("VOLUMES - PL");
//        infQ.setqCarga(6713.6400);
//        //</infQ>
//        //<infQ>
//        infQ.setcUnid("01");
//        infQ.settpMed("VOLUMES - PB");
//        infQ.setqCarga(7018.4350);
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
        
        CTe.setInfCte(infCte);



        XStream xStream = new XStream(new DomDriver());

        
        xStream.useAttributeFor(CTe.class, "xmlns");        
        xStream.useAttributeFor(infCte.class, "Id");
        xStream.useAttributeFor(infCte.class, "versao");
        
        xStream.alias("CTe", CTe.class);
        xStream.alias("infCte", infCte.class);
        xStream.alias("infNFe", infNFe.class);
        
        String xml = xStream.toXML(CTe);
        System.out.println(xml.trim());
        
        transmissoesCTe TCTE = new transmissoesCTe();
        System.out.println(TCTE.validarXMLCTe("Cte", xml));
        
    }
}
