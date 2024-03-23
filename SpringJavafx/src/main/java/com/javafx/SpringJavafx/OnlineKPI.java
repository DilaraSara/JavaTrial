/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafx.SpringJavafx;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.springframework.stereotype.Component;

/**
 *
 * @author dilarasara
 */
@Component
 @XmlRootElement(name = "OnlineKPI")

public class OnlineKPI {

    private String machine;
    private String operatorAdi;
    private String parcaKodu;
    private int netCevrim;
    private String isEmriNo;
    private String yardimciOperator1;
    private String yardimciOperator2;
    private String operasyonAdi;
    private int vardiyaPerformans;
    private int vardiyaOEE;
    private int vardiyaKullanilabilirlik;
    private String planlananMiktar;
    private int yapilabilirAdet;
    private int yapilanAdet;
    private String durusAdi;
    private String durusSure;
    private String durusKodu;
    private String teknisyenGrubu;
    private String teknisyenAdi;
    private String teknisyenCagriGrubu;
    private String teknisyenArizayaIntikal;
    private String vardiyaToplamDurus;
    private String teknisyenMudahale;
    private String planBaslangicZamani;
    private String planlananSure;
    private String kalanAdet;
    

    @XmlElement(name = "Machine")
    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    @XmlElement(name = "OperatorAdi")
    public String getOperatorAdi() {
        return operatorAdi;
    }

    public void setOperatorAdi(String operatorAdi) {
        this.operatorAdi = operatorAdi;
    }

    @XmlElement(name = "ParcaKodu")
    public String getParcaKodu() {
        return parcaKodu;
    }

    public void setParcaKodu(String parcaKodu) {
        this.parcaKodu = parcaKodu;
    }

    @XmlElement(name = "NetCevrim")
    public int getNetCevrim() {
        return netCevrim;
    }

    public void setNetCevrim(int netCevrim) {
        this.netCevrim = netCevrim;
    }

    @XmlElement(name = "IsEmriNo")
    public String getIsEmriNo() {
        return isEmriNo;
    }

    public void setIsEmriNo(String isEmriNo) {
        this.isEmriNo = isEmriNo;
    }
    @XmlElement(name = "YardimciOperator1")
    public String getYardimciOperator1() {
        return yardimciOperator1;
    }

    public void setYardimciOperator1(String yardimciOperator1) {
        this.yardimciOperator1 = yardimciOperator1;
    }
    @XmlElement(name = "YardimciOperator2")
    public String getYardimciOperator2() {
        return yardimciOperator2;
    }

    public void setYardimciOperator2(String yardimciOperator2) {
        this.yardimciOperator2 = yardimciOperator2;
    }
    @XmlElement(name = "OperasyonAdi")
    public String getOperasyonAdi() {
        return operasyonAdi;
    }

    public void setOperasyonAdi(String operasyonAdi) {
        this.operasyonAdi = operasyonAdi;
    }
    @XmlElement(name = "VardiyaPerformans")
    public int getVardiyaPerformans() {
        return vardiyaPerformans;
    }

    public void setVardiyaPerformans(int vardiyaPerformans) {
        this.vardiyaPerformans = vardiyaPerformans;
    }
    @XmlElement(name = "VardiyaOEE")
    public int getVardiyaOEE() {
        return vardiyaOEE;
    }

    public void setVardiyaOEE(int vardiyaOEE) {
        this.vardiyaOEE = vardiyaOEE;
    }
    @XmlElement(name = "VardiyaKullanilabilirlik")
    public int getVardiyaKullanilabilirlik() {
        return vardiyaKullanilabilirlik;
    }

    public void setVardiyaKullanilabilirlik(int vardiyaKullanilabilirlik) {
        this.vardiyaKullanilabilirlik = vardiyaKullanilabilirlik;
    }
    @XmlElement(name = "PlanlananMiktar")
    public String getPlanlananMiktar() {
        return planlananMiktar;
    }

    public void setPlanlananMiktar(String planlananMiktar) {
        this.planlananMiktar = planlananMiktar;
    }
    @XmlElement(name = "YapilabilirAdet")
    public int getYapilabilirAdet() {
        return yapilabilirAdet;
    }

    public void setYapilabilirAdet(int yapilabilirAdet) {
        this.yapilabilirAdet = yapilabilirAdet;
    }
    @XmlElement(name = "YapilanAdet")
    public int getYapilanAdet() {
        return yapilanAdet;
    }

    public void setYapilanAdet(int yapilanAdet) {
        this.yapilanAdet = yapilanAdet;
    }
    @XmlElement(name = "DurusAdi")
    public String getDurusAdi() {
        return durusAdi;
    }

    public void setDurusAdi(String durusAdi) {
        this.durusAdi = durusAdi;
    }
    @XmlElement(name = "DurusSure")
    public String getDurusSure() {
        return durusSure;
    }

    public void setDurusSure(String durusSure) {
        this.durusSure = durusSure;
    }
    @XmlElement(name = "DurusKodu")
    public String getDurusKodu() {
        return durusKodu;
    }

    public void setDurusKodu(String durusKodu) {
        this.durusKodu = durusKodu;
    }
    @XmlElement(name = "TeknisyenGrubu")
    public String getTeknisyenGrubu() {
        return teknisyenGrubu;
    }

    public void setTeknisyenGrubu(String teknisyenGrubu) {
        this.teknisyenGrubu = teknisyenGrubu;
    }
    @XmlElement(name = "TeknisyenAdi")
    public String getTeknisyenAdi() {
        return teknisyenAdi;
    }

    public void setTeknisyenAdi(String teknisyenAdi) {
        this.teknisyenAdi = teknisyenAdi;
    }
    @XmlElement(name = "TeknisyenCagriGrubu")
    public String getTeknisyenCagriGrubu() {
        return teknisyenCagriGrubu;
    }

    public void setTeknisyenCagriGrubu(String teknisyenCagriGrubu) {
        this.teknisyenCagriGrubu = teknisyenCagriGrubu;
    }
    @XmlElement(name = "TeknisyenArizayaIntikal")
    public String getTeknisyenArizayaIntikal() {
        return teknisyenArizayaIntikal;
    }

    public void setTeknisyenArizayaIntikal(String teknisyenArizayaIntikal) {
        this.teknisyenArizayaIntikal = teknisyenArizayaIntikal;
    }
    @XmlElement(name = "VardiyaToplamDurus")
    public String getVardiyaToplamDurus() {
        return vardiyaToplamDurus;
    }

    public void setVardiyaToplamDurus(String vardiyaToplamDurus) {
        this.vardiyaToplamDurus = vardiyaToplamDurus;
    }
    @XmlElement(name = "TeknisyenMudahale")
    public String getTeknisyenMudahale() {
        return teknisyenMudahale;
    }

    public void setTeknisyenMudahale(String teknisyenMudahale) {
        this.teknisyenMudahale = teknisyenMudahale;
    }
    @XmlElement(name = "PlanBaslangicZamani")
    public String getPlanBaslangicZamani() {
        return planBaslangicZamani;
    }

    public void setPlanBaslangicZamani(String planBaslangicZamani) {
        this.planBaslangicZamani = planBaslangicZamani;
    }
    @XmlElement(name = "PlanlananSure")
    public String getPlanlananSure() {
        return planlananSure;
    }

    public void setPlanlananSure(String planlananSure) {
        this.planlananSure = planlananSure;
    }
    @XmlElement(name = "KalanAdet")
    public String getKalanAdet() {
        return kalanAdet;
    }

    public void setKalanAdet(String kalanAdet) {
        this.kalanAdet = kalanAdet;
    }

   
}
