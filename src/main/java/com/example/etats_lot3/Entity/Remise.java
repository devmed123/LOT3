package com.example.etats_lot3.Entity;

public class Remise {
    private String NODOSS;
    private String NUMREM;
    private String DATREM;
    private String MNTREM;
    private String TXREM;
    private String NBRVAL;
    private String RFGRP_11;

    public Remise() {
    }

    public Remise(String NODOSS, String NUMREM, String DATREM, String MNTREM, String TXREM, String NBRVAL, String RFGRP_11) {
        this.NODOSS = NODOSS;
        this.NUMREM = NUMREM;
        this.DATREM = DATREM;
        this.MNTREM = MNTREM;
        this.TXREM = TXREM;
        this.NBRVAL = NBRVAL;
        this.RFGRP_11 = RFGRP_11;
        this.RFGRP_11 = RFGRP_11;
    }

    public String getNODOSS() {
        return NODOSS;
    }

    public String getNUMREM() {
        return NUMREM;
    }

    public String getDATREM() {
        return DATREM;
    }

    public String getMNTREM() {
        return MNTREM;
    }

    public String getTXREM() {
        return TXREM;
    }

    public String getNBRVAL() {
        return NBRVAL;
    }

    public String getRFGRP_11() {
        return RFGRP_11;
    }

    public void setNODOSS(String NODOSS) {
        this.NODOSS = NODOSS;
    }

    public void setNUMREM(String NUMREM) {
        this.NUMREM = NUMREM;
    }

    public void setDATREM(String DATREM) {
        this.DATREM = DATREM;
    }

    public void setMNTREM(String MNTREM) {
        this.MNTREM = MNTREM;
    }

    public void setTXREM(String TXREM) {
        this.TXREM = TXREM;
    }

    public void setNBRVAL(String NBRVAL) {
        this.NBRVAL = NBRVAL;
    }

    public void setRFGRP_11(String RFGRP_11) {
        this.RFGRP_11 = RFGRP_11;
    }

    @Override
    public String toString() {
        return "Remise{" +
                "NODOSS='" + NODOSS + '\'' +
                ", NUMREM='" + NUMREM + '\'' +
                ", DATREM='" + DATREM + '\'' +
                ", MNTREM='" + MNTREM + '\'' +
                ", TXREM='" + TXREM + '\'' +
                ", NBRVAL='" + NBRVAL + '\'' +
                ", RFGRP_11='" + RFGRP_11 + '\'' +
                '}';
    }
}
