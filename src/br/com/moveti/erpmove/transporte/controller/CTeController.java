/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.moveti.erpmove.transporte.controller;

import br.com.moveti.erpmove.transporte.cte.xml.CTe;
import br.com.moveti.erpmove.transporte.cte.xml.Comp;
import br.com.moveti.erpmove.transporte.cte.xml.DigestMethod;
import br.com.moveti.erpmove.transporte.cte.xml.Entrega;
import br.com.moveti.erpmove.transporte.cte.xml.ICMS;
import br.com.moveti.erpmove.transporte.cte.xml.ICMS00;
import br.com.moveti.erpmove.transporte.cte.xml.ICMS20;
import br.com.moveti.erpmove.transporte.cte.xml.ICMS40;
import br.com.moveti.erpmove.transporte.cte.xml.ICMS45;
import br.com.moveti.erpmove.transporte.cte.xml.ICMS60;
import br.com.moveti.erpmove.transporte.cte.xml.ICMS90;
import br.com.moveti.erpmove.transporte.cte.xml.ICMSComp;
import br.com.moveti.erpmove.transporte.cte.xml.ICMSOutraUF;
import br.com.moveti.erpmove.transporte.cte.xml.ICMSSN;
import br.com.moveti.erpmove.transporte.cte.xml.KeyInfo;
import br.com.moveti.erpmove.transporte.cte.xml.ObsCont;
import br.com.moveti.erpmove.transporte.cte.xml.ObsFisco;
import br.com.moveti.erpmove.transporte.cte.xml.Signature;
import br.com.moveti.erpmove.transporte.cte.xml.SignatureMethod;
import br.com.moveti.erpmove.transporte.cte.xml.SignedInfo;
import br.com.moveti.erpmove.transporte.cte.xml.Transforms;
import br.com.moveti.erpmove.transporte.cte.xml.X509Data;
import br.com.moveti.erpmove.transporte.cte.xml.aereo;
import br.com.moveti.erpmove.transporte.cte.xml.aquav;
import br.com.moveti.erpmove.transporte.cte.xml.balsa;
import br.com.moveti.erpmove.transporte.cte.xml.cobr;
import br.com.moveti.erpmove.transporte.cte.xml.comData;
import br.com.moveti.erpmove.transporte.cte.xml.comHora;
import br.com.moveti.erpmove.transporte.cte.xml.compComp;
import br.com.moveti.erpmove.transporte.cte.xml.compl;
import br.com.moveti.erpmove.transporte.cte.xml.consReciCTe;
import br.com.moveti.erpmove.transporte.cte.xml.consSitCTe;
import br.com.moveti.erpmove.transporte.cte.xml.contQt;
import br.com.moveti.erpmove.transporte.cte.xml.contVag;
import br.com.moveti.erpmove.transporte.cte.xml.cteProc;
import br.com.moveti.erpmove.transporte.cte.xml.dest;
import br.com.moveti.erpmove.transporte.cte.xml.detCont;
import br.com.moveti.erpmove.transporte.cte.xml.docAnt;
import br.com.moveti.erpmove.transporte.cte.xml.dup;
import br.com.moveti.erpmove.transporte.cte.xml.duto;
import br.com.moveti.erpmove.transporte.cte.xml.emiDocAnt;
import br.com.moveti.erpmove.transporte.cte.xml.emiOcc;
import br.com.moveti.erpmove.transporte.cte.xml.emit;
import br.com.moveti.erpmove.transporte.cte.xml.enderDest;
import br.com.moveti.erpmove.transporte.cte.xml.enderEmit;
import br.com.moveti.erpmove.transporte.cte.xml.enderExped;
import br.com.moveti.erpmove.transporte.cte.xml.enderFerro;
import br.com.moveti.erpmove.transporte.cte.xml.enderReceb;
import br.com.moveti.erpmove.transporte.cte.xml.enderReme;
import br.com.moveti.erpmove.transporte.cte.xml.enderToma;
import br.com.moveti.erpmove.transporte.cte.xml.enviCTe;
import br.com.moveti.erpmove.transporte.cte.xml.exped;
import br.com.moveti.erpmove.transporte.cte.xml.fat;
import br.com.moveti.erpmove.transporte.cte.xml.ferroEnv;
import br.com.moveti.erpmove.transporte.cte.xml.ferrov;
import br.com.moveti.erpmove.transporte.cte.xml.fluxo;
import br.com.moveti.erpmove.transporte.cte.xml.idDocAnt;
import br.com.moveti.erpmove.transporte.cte.xml.idDocAntEle;
import br.com.moveti.erpmove.transporte.cte.xml.idDocAntPap;
import br.com.moveti.erpmove.transporte.cte.xml.ide;
import br.com.moveti.erpmove.transporte.cte.xml.imp;
import br.com.moveti.erpmove.transporte.cte.xml.impComp;
import br.com.moveti.erpmove.transporte.cte.xml.infCte;
import br.com.moveti.erpmove.transporte.cte.xml.infCTeNorm;
import br.com.moveti.erpmove.transporte.cte.xml.infCarga;
import br.com.moveti.erpmove.transporte.cte.xml.infCteAnu;
import br.com.moveti.erpmove.transporte.cte.xml.infCteComp;
import br.com.moveti.erpmove.transporte.cte.xml.infCteSub;
import br.com.moveti.erpmove.transporte.cte.xml.infDoc;
import br.com.moveti.erpmove.transporte.cte.xml.infInut;
import br.com.moveti.erpmove.transporte.cte.xml.infModal;
import br.com.moveti.erpmove.transporte.cte.xml.infNF;
import br.com.moveti.erpmove.transporte.cte.xml.infNF_;
import br.com.moveti.erpmove.transporte.cte.xml.infCte;
import br.com.moveti.erpmove.transporte.cte.xml.infNFe;
import br.com.moveti.erpmove.transporte.cte.xml.infOutros;
import br.com.moveti.erpmove.transporte.cte.xml.infProt;
import br.com.moveti.erpmove.transporte.cte.xml.infQ;
import br.com.moveti.erpmove.transporte.cte.xml.infRec;
import br.com.moveti.erpmove.transporte.cte.xml.inutCTe;
import br.com.moveti.erpmove.transporte.cte.xml.lacContQt;
import br.com.moveti.erpmove.transporte.cte.xml.lacDetVag;
import br.com.moveti.erpmove.transporte.cte.xml.lacRodo;
import br.com.moveti.erpmove.transporte.cte.xml.lacre;
import br.com.moveti.erpmove.transporte.cte.xml.locEnt;
import br.com.moveti.erpmove.transporte.cte.xml.locRet;
import br.com.moveti.erpmove.transporte.cte.xml.moto;
import br.com.moveti.erpmove.transporte.cte.xml.natCarga;
import br.com.moveti.erpmove.transporte.cte.xml.noInter;
import br.com.moveti.erpmove.transporte.cte.xml.noPeriodo;
import br.com.moveti.erpmove.transporte.cte.xml.occ;
import br.com.moveti.erpmove.transporte.cte.xml.pass;
import br.com.moveti.erpmove.transporte.cte.xml.peri;
import br.com.moveti.erpmove.transporte.cte.xml.procCancCTe;
import br.com.moveti.erpmove.transporte.cte.xml.procInutCTe;
import br.com.moveti.erpmove.transporte.cte.xml.prop;
import br.com.moveti.erpmove.transporte.cte.xml.protCTe;
import br.com.moveti.erpmove.transporte.cte.xml.ratNF;
import br.com.moveti.erpmove.transporte.cte.xml.ratVag;
import br.com.moveti.erpmove.transporte.cte.xml.receb;
import br.com.moveti.erpmove.transporte.cte.xml.refNF;
import br.com.moveti.erpmove.transporte.cte.xml.rem;
import br.com.moveti.erpmove.transporte.cte.xml.rodo;
import br.com.moveti.erpmove.transporte.cte.xml.seg;
import br.com.moveti.erpmove.transporte.cte.xml.semData;
import br.com.moveti.erpmove.transporte.cte.xml.semHora;
import br.com.moveti.erpmove.transporte.cte.xml.tarifa;
import br.com.moveti.erpmove.transporte.cte.xml.toma03;
import br.com.moveti.erpmove.transporte.cte.xml.toma04;
import br.com.moveti.erpmove.transporte.cte.xml.tomaICMS;
import br.com.moveti.erpmove.transporte.cte.xml.tomaNaoICMS;
import br.com.moveti.erpmove.transporte.cte.xml.trafMut;
import br.com.moveti.erpmove.transporte.cte.xml.vPresComp;
import br.com.moveti.erpmove.transporte.cte.xml.vPrest;
import br.com.moveti.erpmove.transporte.cte.xml.valePed;
import br.com.moveti.erpmove.transporte.cte.xml.veic;
import br.com.moveti.erpmove.transporte.cte.xml.veicNovos;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
//import crncomp.conexao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jéssica
 */
public class CTeController {
    
    public static String getCaminho() {
        return caminho;
    }

    public static void setCaminho(String aCaminho) {
        caminho = aCaminho;
    }
    private boolean importar = false;
    private String xml_importa = "";
    private byte[] array;
    private cteProc cteProc = new cteProc();
    enviCTe enviCTe = new enviCTe();
    private CTe CTe = new CTe();
    private String stringXML = "";
    private FileInputStream arquivo = null;
    private static String caminho = null;
    
    public CTe setaDadosXML(String idCte){
        CTe Cte = new CTe();
        conhecimentoTransporteEletronico cte = new conhecimentoTransporteEletronico();               
        cte.busca(idCte);      
        
        Cte.getInfCTe().setId(idCte);
        Cte.getInfCTe().setFluxo(idCte);
        Cte.getInfCTe().setIdTrem(idCte);
        Cte.getInfCTe().setVersao(idCte);        
        Cte.getInfCTe().setvFrete(idCte);        
        //COMPL
        Cte.getInfCTe().getCompl().setxEmi(idCte);
        Cte.getInfCTe().getCompl().setxObs(idCte);
        Cte.getInfCTe().getCompl().setxCaracAd(idCte);
        Cte.getInfCTe().getCompl().setxCaracSer(idCte);
        Cte.getInfCTe().getCompl().setxObs(idCte);
        Cte.getInfCTe().getCompl().setDestCalc(idCte);
        
        Cte.getInfCTe().getCompl().getFluxo().setPass(null);
        Cte.getInfCTe().getCompl().getFluxo().setxOrig(idCte);
        
        Cte.getInfCTe().getCompl().getEntrega().getComData().setTpPer(idCte);
        Cte.getInfCTe().getCompl().getEntrega().getComData().setdProg(idCte);
        
        Cte.getInfCTe().getCompl().getEntrega().getComHora().setTpHor(idCte);
        Cte.getInfCTe().getCompl().getEntrega().getComHora().sethProg(idCte);
        
        Cte.getInfCTe().getCompl().getEntrega().getNoInter().setTpHor(idCte);
        Cte.getInfCTe().getCompl().getEntrega().getNoInter().sethFim(idCte);
        Cte.getInfCTe().getCompl().getEntrega().getNoInter().sethIni(idCte);
        
        Cte.getInfCTe().getCompl().getEntrega().getNoPeriodo().setTpPer(idCte);
        Cte.getInfCTe().getCompl().getEntrega().getNoPeriodo().setdFim(idCte);
        Cte.getInfCTe().getCompl().getEntrega().getNoPeriodo().setdIni(idCte);
        
        Cte.getInfCTe().getCompl().getEntrega().getSemData().setTpPer(idCte);
        
        Cte.getInfCTe().getCompl().getObsCont().setxCampo(idCte);
        Cte.getInfCTe().getCompl().getObsCont().setxTexto(idCte);
        
        Cte.getInfCTe().getCompl().getObsFisco().setxCampo(idCte);
        Cte.getInfCTe().getCompl().getObsFisco().setxTexto(idCte);
        
        //DEST
        Cte.getInfCTe().getDest().setCNPJ(idCte);
        Cte.getInfCTe().getDest().setCPF(idCte);
        Cte.getInfCTe().getDest().setEmail(idCte);
        Cte.getInfCTe().getDest().setFone(idCte);
        Cte.getInfCTe().getDest().setIE(idCte);
        Cte.getInfCTe().getDest().setxNome(idCte);
        
        Cte.getInfCTe().getDest().getEnderDest().setCEP(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setNro(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setUF(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setcMun(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setcPais(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setxBairro(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setxCpl(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setxLgr(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setxMun(idCte);
        Cte.getInfCTe().getDest().getEnderDest().setxPais(idCte);
        
        Cte.getInfCTe().getDest().getLocEnt().setCNPJ(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setCPF(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setNro(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setUF(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setcMun(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setxBairro(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setxCpl(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setxLgr(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setxMun(idCte);
        Cte.getInfCTe().getDest().getLocEnt().setxNome(idCte);
        
        //Emit
        Cte.getInfCTe().getEmit().setCNPJ(idCte);        
        Cte.getInfCTe().getEmit().setIE(idCte);
        Cte.getInfCTe().getEmit().setxNome(idCte);
        
        Cte.getInfCTe().getEmit().getEnderEmit().setCEP(idCte);
        Cte.getInfCTe().getEmit().getEnderEmit().setNro(idCte);
        Cte.getInfCTe().getEmit().getEnderEmit().setUF(idCte);
        Cte.getInfCTe().getEmit().getEnderEmit().setcMun(idCte);        
        Cte.getInfCTe().getEmit().getEnderEmit().setxBairro(idCte);
        Cte.getInfCTe().getEmit().getEnderEmit().setxCpl(idCte);
        Cte.getInfCTe().getEmit().getEnderEmit().setxLgr(idCte);
        Cte.getInfCTe().getEmit().getEnderEmit().setxMun(idCte);    
        
        //Exped
        Cte.getInfCTe().getExped().setCNPJ(idCte);
        Cte.getInfCTe().getExped().setCPF(idCte);
        Cte.getInfCTe().getExped().setEmail(idCte);
        Cte.getInfCTe().getExped().setFone(idCte);
        Cte.getInfCTe().getExped().setIE(idCte);
        Cte.getInfCTe().getExped().setxNome(idCte);
        
        Cte.getInfCTe().getExped().getEnderExped().setCEP(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setNro(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setUF(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setcMun(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setcPais(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setxBairro(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setxCpl(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setxLgr(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setxMun(idCte);
        Cte.getInfCTe().getExped().getEnderExped().setxPais(idCte);
        
        //Rem
        Cte.getInfCTe().getRem().setCNPJ(idCte);
        Cte.getInfCTe().getRem().setCPF(idCte);
        Cte.getInfCTe().getRem().setEmail(idCte);
        Cte.getInfCTe().getRem().setFone(idCte);
        Cte.getInfCTe().getRem().setIE(idCte);
        Cte.getInfCTe().getRem().setxNome(idCte);
        
        Cte.getInfCTe().getRem().getEnderReme().setCEP(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setNro(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setUF(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setcMun(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setcPais(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setxBairro(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setxCpl(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setxLgr(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setxMun(idCte);
        Cte.getInfCTe().getRem().getEnderReme().setxPais(idCte);
        
        //Ide
        Cte.getInfCTe().getIde().setcDV(idCte);
        Cte.getInfCTe().getIde().setCFOP(idCte);
        Cte.getInfCTe().getIde().setDhEmi(idCte);
        Cte.getInfCTe().getIde().setForPag(idCte);
        Cte.getInfCTe().getIde().setMod(idCte);
        Cte.getInfCTe().getIde().setMod(idCte);
        Cte.getInfCTe().getIde().setModal(idCte);
        Cte.getInfCTe().getIde().setNatOp(idCte);
        Cte.getInfCTe().getIde().setProcEmi(idCte);
        Cte.getInfCTe().getIde().setRefCTE(idCte);
        Cte.getInfCTe().getIde().setRetira(idCte);
        Cte.getInfCTe().getIde().setSerie(idCte);
        Cte.getInfCTe().getIde().setTpAmb(idCte);
        Cte.getInfCTe().getIde().setTpCTe(idCte);
        Cte.getInfCTe().getIde().setTpEmis(idCte);
        Cte.getInfCTe().getIde().setTpImp(idCte);
        Cte.getInfCTe().getIde().setTpServ(idCte);
        Cte.getInfCTe().getIde().setUFEnv(idCte);
        Cte.getInfCTe().getIde().setUFFim(idCte);
        Cte.getInfCTe().getIde().setUFIni(idCte);
        Cte.getInfCTe().getIde().setVerProc(idCte);
        Cte.getInfCTe().getIde().setXDetRetira(idCte);
        Cte.getInfCTe().getIde().setXMunFim(idCte);
        Cte.getInfCTe().getIde().setcCT(idCte);
        Cte.getInfCTe().getIde().setcMunEnv(idCte);
        Cte.getInfCTe().getIde().setcMunIni(idCte);
        Cte.getInfCTe().getIde().setcUF(idCte);
        Cte.getInfCTe().getIde().setnCT(idCte);
        Cte.getInfCTe().getIde().setxMunEnv(idCte);
        Cte.getInfCTe().getIde().setxMunIni(idCte);        
        
        //Ide/Toma03
        Cte.getInfCTe().getIde().getToma03().setToma(idCte);
        //Ide/Toma04
        Cte.getInfCTe().getIde().getToma04().setCNPJ(idCte);
        Cte.getInfCTe().getIde().getToma04().setCPF(idCte);
        Cte.getInfCTe().getIde().getToma04().setFone(idCte);
        Cte.getInfCTe().getIde().getToma04().setIE(idCte);
        Cte.getInfCTe().getIde().getToma04().setToma(idCte);
        Cte.getInfCTe().getIde().getToma04().setxFant(idCte);
        Cte.getInfCTe().getIde().getToma04().setxNome(idCte);
        //Ide/Toma04/EnderToma
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setCEP(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setNro(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setUF(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setcMun(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setcPais(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setxBairro(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setxCpl(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setxLgr(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setxMun(idCte);
        Cte.getInfCTe().getIde().getToma04().getEnderToma().setxPais(idCte);                        
        
        Cte.getInfCTe().getImp().getICMS().getICMS00().setCST(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS00().setModBC(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS00().setOrig(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS00().setpICMS(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS00().setvBC(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS00().setvICMS(idCte);
        
        Cte.getInfCTe().getImp().getICMS().getICMS20().setCST(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS20().setModBC(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS20().setOrig(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS20().setpICMS(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS20().setvBC(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS20().setvICMS(idCte);

        Cte.getInfCTe().getImp().getICMS().getICMS40().setCST(idCte);

        Cte.getInfCTe().getImp().getICMS().getICMS40().setOrig(idCte);

        Cte.getInfCTe().getImp().getICMS().getICMS45().setCST(idCte);
        
        Cte.getInfCTe().getImp().getICMS().getICMS60().setCST(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS60().setOrig(idCte);

        Cte.getInfCTe().getImp().getICMS().getICMS90().setCST(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setModBC(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setOrig(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setpICMS(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setvBC(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setvBCST(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setvICMS(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setvICMSST(idCte);
        Cte.getInfCTe().getImp().getICMS().getICMS90().setModBCST(idCte);

        //InfCTe/InfCTeNorm/ContQt
        Cte.getInfCTe().getInfCTeNorm().getContQt().setdPrev(idCte);
        Cte.getInfCTe().getInfCTeNorm().getContQt().setnCont(idCte);
        //InfCTe/InfCTeNorm/ContQt/LacContQt
        Cte.getInfCTe().getInfCTeNorm().getContQt().getLacContQt().setnLacre(idCte);
        Cte.getInfCTe().getInfCTeNorm().getContQt().getLacContQt().setnLacre(idCte);
        //InfCTe/InfCTeNorm/DocAnt/EmiDocAnt
        Cte.getInfCTe().getInfCTeNorm().getDocAnt().getEmiDocAnt().setCNPJ(idCte);
        Cte.getInfCTe().getInfCTeNorm().getDocAnt().getEmiDocAnt().setCPF(idCte);
        Cte.getInfCTe().getInfCTeNorm().getDocAnt().getEmiDocAnt().setIE(idCte);
        Cte.getInfCTe().getInfCTeNorm().getDocAnt().getEmiDocAnt().setUF(idCte);
        Cte.getInfCTe().getInfCTeNorm().getDocAnt().getEmiDocAnt().setxNome(idCte);
        //InfCTe/InfCTeNorm/InfCarga
        Cte.getInfCTe().getInfCTeNorm().getInfCarga().setProPred(idCte);
        Cte.getInfCTe().getInfCTeNorm().getInfCarga().setvCarga(idCte);
        Cte.getInfCTe().getInfCTeNorm().getInfCarga().setxOutCat(idCte);
        //InfCTe/InfCTeNorm/InfCarga/InfQ
        Cte.getInfCTe().getInfCTeNorm().getInfCarga().getInfQ().setTpMed(idCte);
        Cte.getInfCTe().getInfCTeNorm().getInfCarga().getInfQ().setcUnid(idCte);
        Cte.getInfCTe().getInfCTeNorm().getInfCarga().getInfQ().setqCarga(idCte);        
        //InfCTe/InfCTeNorm/Seg
        Cte.getInfCTe().getInfCTeNorm().getSeg().setRespSeg(idCte);
        Cte.getInfCTe().getInfCTeNorm().getSeg().setnApol(idCte);
        Cte.getInfCTe().getInfCTeNorm().getSeg().setnAver(idCte);
        Cte.getInfCTe().getInfCTeNorm().getSeg().setvCarga(idCte);
        Cte.getInfCTe().getInfCTeNorm().getSeg().setxSeg(idCte);
        //InfCTe/InfCteAnu/
        Cte.getInfCTe().getInfCteAnu().setChCte(idCte);
        Cte.getInfCTe().getInfCteAnu().setdEmi(idCte);
        //InfCTe/InfCteComp/
        Cte.getInfCTe().getInfCteComp().setChave(idCte);
        //InfCTe/Receb/
        Cte.getInfCTe().getReceb().setCNPJ(idCte);
        Cte.getInfCTe().getReceb().setCPF(idCte);
        Cte.getInfCTe().getReceb().setEmail(idCte);
        Cte.getInfCTe().getReceb().setFone(idCte);
        Cte.getInfCTe().getReceb().setIE(idCte);
        Cte.getInfCTe().getReceb().setxNome(idCte);
        //InfCTe/Receb/EnderReceb
        Cte.getInfCTe().getReceb().getEnderReceb().setCEP(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setNro(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setUF(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setcMun(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setcPais(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setxBairro(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setxCpl(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setxLgr(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setxMun(idCte);
        Cte.getInfCTe().getReceb().getEnderReceb().setxPais(idCte);
        
        //Signature
        Cte.getSignature().setSignatureValue(idCte);
        Cte.getSignature().setXmlns(idCte);
        
        Cte.getSignature().getKeyInfo().getX509Data().setX509Certificate(idCte);
        
        Cte.getSignature().getSignedInfo().getCanonicalizationMethod().setAlgorithm(idCte);
        
        Cte.getSignature().getSignedInfo().getReference().setDigestValue(idCte);
        Cte.getSignature().getSignedInfo().getReference().setURI(idCte);
        
        Cte.getSignature().getSignedInfo().getReference().getDigestMethod().setAlgorithm(idCte);
        
        Cte.getSignature().getSignedInfo().getReference().getTransforms().getTransform().get(0).setAlgorithm(idCte);
        Cte.getSignature().getSignedInfo().getSignatureMethod().setAlgorithm(idCte);
        
        return Cte;
    }
    
    public String GerarXML(String idCte) {        
        ResultSet RS = null;
        XStream xstream= new XStream();
        String  xml = xstream.toXML(setaDadosXML(idCte));
        System.out.println("XML GERADO :"+xml);
        return xml;
    }
    
    public void importar() throws FileNotFoundException, IOException {       
       
        if (getCaminho() != null) {
            setArquivo(new FileInputStream(getCaminho()));
        }   

        XStream x = new XStream(new DomDriver());
        x.useAttributeFor(infCte.class, "Id");
        x.useAttributeFor(infCte.class, "versao");

        x.processAnnotations(enviCTe.class);
        x.processAnnotations(cteProc.class);
        x.processAnnotations(CTe.class);
        x.processAnnotations(infCte.class);
        x.processAnnotations(infProt.class);
        x.processAnnotations(emit.class);
        x.processAnnotations(dest.class);                    
        x.processAnnotations(Comp.class);
        x.processAnnotations(DigestMethod.class);
        x.processAnnotations(Entrega.class);
        x.processAnnotations(ICMS.class);
        x.processAnnotations(ICMS00.class);
        x.processAnnotations(ICMS20.class);
        x.processAnnotations(ICMS40.class);
        x.processAnnotations(ICMS45.class);
        x.processAnnotations(ICMS60.class);
        x.processAnnotations(ICMS90.class);
        x.processAnnotations(ICMSComp.class);
        x.processAnnotations(ICMSOutraUF.class);
        x.processAnnotations(ICMSSN.class);        
        x.processAnnotations(ICMSOutraUF.class);
        x.processAnnotations(ICMSSN.class);
        x.processAnnotations(KeyInfo.class);
        x.processAnnotations(ObsCont.class);
        x.processAnnotations(ObsFisco.class);
        x.processAnnotations(Reference.class);
        x.processAnnotations(Signature.class);
        x.processAnnotations(SignatureMethod.class);                
        x.processAnnotations(SignedInfo.class);
        x.processAnnotations(Transforms.class);
        x.processAnnotations(X509Data.class);
        x.processAnnotations(aereo.class);
        x.processAnnotations(aquav.class);
        x.processAnnotations(balsa.class);
        x.processAnnotations(cobr.class);        
        x.processAnnotations(comData.class);
        x.processAnnotations(comHora.class);
        x.processAnnotations(compComp.class);
        x.processAnnotations(compl.class);
        x.processAnnotations(consReciCTe.class);
        x.processAnnotations(consSitCTe.class);       
        x.processAnnotations(contQt.class);
        x.processAnnotations(contVag.class);
        x.processAnnotations(detCont.class);
        x.processAnnotations(docAnt.class);
        x.processAnnotations(dup.class);
        x.processAnnotations(duto.class);
        x.processAnnotations(emiDocAnt.class);
        x.processAnnotations(emiOcc.class);
        x.processAnnotations(emit.class);
        x.processAnnotations(enderDest.class);
        x.processAnnotations(enderEmit.class);
        x.processAnnotations(enderExped.class);
        x.processAnnotations(enderFerro.class);
        x.processAnnotations(enderReceb.class);
        x.processAnnotations(enderReme.class);
        x.processAnnotations(enderToma.class);
        x.processAnnotations(exped.class);
        x.processAnnotations(fat.class);
        x.processAnnotations(ferroEnv.class);
        x.processAnnotations(ferrov.class);
        x.processAnnotations(fluxo.class);
        x.processAnnotations(idDocAnt.class);
        x.processAnnotations(idDocAntEle.class);
        x.processAnnotations(idDocAntPap.class);
        x.processAnnotations(ide.class);
        x.processAnnotations(imp.class);
        x.processAnnotations(impComp.class);
        x.processAnnotations(infCTeNorm.class);
        x.processAnnotations(infCarga.class);
        x.processAnnotations(infCteAnu.class);
        x.processAnnotations(infCteComp.class);
        x.processAnnotations(infCteSub.class);
        x.processAnnotations(infDoc.class);
        x.processAnnotations(infInut.class);
        x.processAnnotations(infModal.class);
        x.processAnnotations(infNF.class);
        x.processAnnotations(infNFe.class);
//        x.processAnnotations(infNF_.class);
        x.processAnnotations(infCte.class);
        x.processAnnotations(infOutros.class);
        x.processAnnotations(infProt.class);
        x.processAnnotations(infQ.class);
        x.processAnnotations(infRec.class);
        x.processAnnotations(inutCTe.class);
        x.processAnnotations(lacContQt.class);
        x.processAnnotations(lacDetVag.class);
        x.processAnnotations(lacRodo.class);
        x.processAnnotations(lacre.class);
        x.processAnnotations(locEnt.class);
        x.processAnnotations(locRet.class);
        x.processAnnotations(moto.class);
        x.processAnnotations(natCarga.class);
        x.processAnnotations(noInter.class);
        x.processAnnotations(noPeriodo.class);
        x.processAnnotations(occ.class);
        x.processAnnotations(pass.class);
        x.processAnnotations(peri.class);
        x.processAnnotations(procCancCTe.class);
        x.processAnnotations(procInutCTe.class);
        x.processAnnotations(prop.class);
        x.processAnnotations(protCTe.class);
        x.processAnnotations(ratNF.class);
        x.processAnnotations(ratVag.class);
        x.processAnnotations(receb.class);
        x.processAnnotations(refNF.class);
        x.processAnnotations(rem.class);
        x.processAnnotations(rodo.class);
        x.processAnnotations(seg.class);
        x.processAnnotations(semData.class);
        x.processAnnotations(semHora.class);
        x.processAnnotations(tarifa.class);
        x.processAnnotations(toma03.class);
        x.processAnnotations(toma04.class);
        x.processAnnotations(tomaICMS.class);
        x.processAnnotations(tomaNaoICMS.class);
        x.processAnnotations(trafMut.class);
        x.processAnnotations(vPresComp.class);
        x.processAnnotations(vPrest.class);
        x.processAnnotations(valePed.class);
        x.processAnnotations(veic.class);
        x.processAnnotations(veicNovos.class);   
        
        if (importar) {
            System.out.println("xml importa :"+xml_importa);
            setCteProc((cteProc) x.fromXML(xml_importa));
        } else if (getCaminho() != null) {
            setArquivo(new FileInputStream(getCaminho()));
            System.out.println("ARQUIVO:" + getArquivo());
            setCteProc((cteProc) x.fromXML(getArquivo()));
        }
        
//        try {
//            if (getCaminho() != null) {
//                arquivo = new FileInputStream(getCaminho());
//            }
//            if (arquivo != null) {
//                System.out.println("Entrada aqui 1");
//                enviCTe = (enviCTe) x.fromXML(arquivo);
//            } else {
//                System.out.println("Entrada aqui 2");
//                enviCTe = (enviCTe) x.fromXML(getStringXML());
//            }
//            setCTe(enviCTe.getCte());
//           
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            try {
//                if (getCaminho() != null) {
//                    System.out.println("Entrada aqui 3");
//                    arquivo = new FileInputStream(getCaminho());
//                }
//                if (arquivo != null) {
//                    System.out.println("Entrada aqui 4");
//                    cteProc = (cteProc) x.fromXML(arquivo);
//                } else {
//                    System.out.println("Entrada aqui 5");
//                    cteProc = (cteProc) x.fromXML(getStringXML());
//                }
//                setCTe(cteProc.getCTe());
//                System.out.println("CH Acss cteProc :" + cteProc.getCTe().getInfCTe().getId());
//            } catch (Exception e2) {
//                System.out.println(e2.toString());
//                try {
//                    if (getCaminho() != null) {
//                        System.out.println("Entrada aqui 6");
//                        arquivo = new FileInputStream(getCaminho());
//                    }
//                    if (arquivo != null) {
//                        System.out.println("Entrada aqui 7");
//                        setCTe((CTe) x.fromXML(arquivo));
//                    } else {
//                        System.out.println("Entrada aqui 8");
//                        setCTe((CTe) x.fromXML(getStringXML()));
//                    }
//                    System.out.println("CH Acss CTe :" + getCTe().getInfCTe().getId());
//                } catch (Exception e3) {
//                    System.out.println(e3.toString());
//                }
//            }
//        }
}
    
    public int gravaCTeXml(){        
//        int ret;
//        String  sql = "INSERT INTO cte_xml_importa ("
//                    + "numero_cte, chave_acesso, "
//                    + "arquivo, data_emissao, "
//                    + "emitente_nome,destinatario_nome, valor) "
//                    + "VALUES (?,?,?,?,?,?,?)";        
//         conexao conn = new conexao();
//         try {
//
//                PreparedStatement stm = (PreparedStatement) conn.prepareStatement(sql);
//
//                stm.setString(1, cteProc.getCTe().getInfCTe().getIde().getnCT());
//                stm.setString(2, cteProc.getCTe().getInfCTe().getId().substring(3));
//                stm.setBytes(3, array);
//                stm.setNString(4, cteProc.getCTe().getInfCTe().getIde().getDhEmi());
//                stm.setString(5, cteProc.getCTe().getInfCTe().getEmit().getxNome());
//                stm.setString(6, cteProc.getCTe().getInfCTe().getDest().getxNome());
//                stm.setString(7, cteProc.getCTe().getInfCTe().getvPrest().getvTPrest());
//
//                stm.execute();
//                stm.close();
//                conn.close();
//                ret = 1;
//            } catch (Exception e) {
//                e.printStackTrace();
//                ret = 0;
//            }   
//         return ret;
        return 0;
    }

    public CTe getCTe() {
        return CTe;
    }

    public void setCTe(CTe CTe) {
        this.CTe = CTe;
    }

    public String getStringXML() {
        return stringXML;
    }

    public void setStringXML(String stringXML) {
        this.stringXML = stringXML;
    }

    public cteProc getCteProc() {
        return cteProc;
    }

    public void setCteProc(cteProc cteProc) {
        this.cteProc = cteProc;
    }

    public void setArray(byte[] array) {
        this.array = array;
    }

    public FileInputStream getArquivo() {
        return arquivo;
    }

    public void setArquivo(FileInputStream arquivo) {
        this.arquivo = arquivo;
    }

    public void setImportar(boolean importar) {
        this.importar = importar;
    }

    public void setXml_importa(String xml_importa) {
        this.xml_importa = xml_importa;
    }
    
}
