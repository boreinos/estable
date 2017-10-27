package com.afilon.mayor.v11.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccano on 10/24/2017.
 */

public class PartySummaryReport {

    private String titleA;
    private String titleB;
    private String titleC;

    private String footerA;
    private String footerB;

    private String partyName;

    private List<String> columnA = new ArrayList<>();
    private List<String> columnB = new ArrayList<>();
    private List<String> columnC = new ArrayList<>();
    private List<String> columnD = new ArrayList<>();
    private List<String> columnE = new ArrayList<>();
    private List<String> columnF = new ArrayList<>();
    private List<String> columnG = new ArrayList<>();
    private List<String> columnH = new ArrayList<>();

    public PartySummaryReport(String titleA, String titleB, String titleC,
                              String footerA, String footerB, String partyName,
                              List<String> columnA, List<String> columnB,
                              List<String> columnC, List<String> columnD,
                              List<String> columnE, List<String> columnF,
                              List<String> columnG, List<String> columnH) {
        this.titleA = titleA;
        this.titleB = titleB;
        this.titleC = titleC;
        this.footerA = footerA;
        this.footerB = footerB;
        this.partyName = partyName;
        this.columnA = columnA;
        this.columnB = columnB;
        this.columnC = columnC;
        this.columnD = columnD;
        this.columnE = columnE;
        this.columnF = columnF;
        this.columnG = columnG;
        this.columnH = columnH;
    }

    public String getTitleA() {
        return titleA;
    }

    public void setTitleA(String titleA) {
        this.titleA = titleA;
    }

    public String getTitleB() {
        return titleB;
    }

    public void setTitleB(String titleB) {
        this.titleB = titleB;
    }

    public String getTitleC() {
        return titleC;
    }

    public void setTitleC(String titleC) {
        this.titleC = titleC;
    }

    public String getFooterA() {
        return footerA;
    }

    public void setFooterA(String footerA) {
        this.footerA = footerA;
    }

    public String getFooterB() {
        return footerB;
    }

    public void setFooterB(String footerB) {
        this.footerB = footerB;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public List<String> getColumnA() {
        return columnA;
    }

    public void setColumnA(List<String> columnA) {
        this.columnA = columnA;
    }

    public List<String> getColumnB() {
        return columnB;
    }

    public void setColumnB(List<String> columnB) {
        this.columnB = columnB;
    }

    public List<String> getColumnC() {
        return columnC;
    }

    public void setColumnC(List<String> columnC) {
        this.columnC = columnC;
    }

    public List<String> getColumnD() {
        return columnD;
    }

    public void setColumnD(List<String> columnD) {
        this.columnD = columnD;
    }

    public List<String> getColumnE() {
        return columnE;
    }

    public void setColumnE(List<String> columnE) {
        this.columnE = columnE;
    }

    public List<String> getColumnF() {
        return columnF;
    }

    public void setColumnF(List<String> columnF) {
        this.columnF = columnF;
    }

    public List<String> getColumnG() {
        return columnG;
    }

    public void setColumnG(List<String> columnG) {
        this.columnG = columnG;
    }

    public List<String> getColumnH() {
        return columnH;
    }

    public void setColumnH(List<String> columnH) {
        this.columnH = columnH;
    }

    @Override
    public String toString() {
        return "PartySummaryReport{" +
                "titleA='" + titleA + '\'' +
                ", titleB='" + titleB + '\'' +
                ", titleC='" + titleC + '\'' +
                ", footerA='" + footerA + '\'' +
                ", footerB='" + footerB + '\'' +
                ", partyName='" + partyName + '\'' +
                ", columnA=" + columnA +
                ", columnB=" + columnB +
                ", columnC=" + columnC +
                ", columnD=" + columnD +
                ", columnE=" + columnE +
                ", columnF=" + columnF +
                ", columnG=" + columnG +
                ", columnH=" + columnH +
                '}';
    }
}
