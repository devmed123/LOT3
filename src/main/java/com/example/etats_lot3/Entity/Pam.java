package com.example.etats_lot3.Entity;

public class Pam {
   private  String NODOSS;
   private  String RFPRET_11;
   private  String RFGRP_11;
   private  String NOMINAL_12;
   private  String CDPDT_12;
   private  String VLDECADA4_11;
   private  String RFTIERS_I09;
   private  String DTACCOR_I12;
   private  String DTFECH;
   private  String IBAN_09;
   private  String NOMTIR_21IT;
   private  String RIBTIR_21IT;
   private  String NUMREM_21CE;
   private  String REFIRIS_21CE;

    public Pam() {
    }

    public Pam(String NODOSS, String RFPRET_11, String RFGRP_11, String NOMINAL_12, String CDPDT_12, String VLDECADA4_11, String RFTIERS_I09, String DTACCOR_I12, String DTFECH, String IBAN_09, String NOMTIR_21IT, String RIBTIR_21IT, String NUMREM_21CE, String REFIRIS_21CE) {
        this.NODOSS = NODOSS;
        this.RFPRET_11 = RFPRET_11;
        this.RFGRP_11 = RFGRP_11;
        this.NOMINAL_12 = NOMINAL_12;
        this.CDPDT_12 = CDPDT_12;
        this.VLDECADA4_11 = VLDECADA4_11;
        this.RFTIERS_I09 = RFTIERS_I09;
        this.DTACCOR_I12 = DTACCOR_I12;
        this.DTFECH = DTFECH;
        this.IBAN_09 = IBAN_09;
        this.NOMTIR_21IT = NOMTIR_21IT;
        this.RIBTIR_21IT = RIBTIR_21IT;
        this.NUMREM_21CE = NUMREM_21CE;
        this.REFIRIS_21CE = REFIRIS_21CE;
    }

    public String getNODOSS() {
        return NODOSS;
    }

    public String getRFPRET_11() {
        return RFPRET_11;
    }

    public String getRFGRP_11() {
        return RFGRP_11;
    }

    public String getNOMINAL_12() {
        return NOMINAL_12;
    }

    public String getCDPDT_12() {
        return CDPDT_12;
    }

    public String getVLDECADA4_11() {
        return VLDECADA4_11;
    }

    public String getRFTIERS_I09() {
        return RFTIERS_I09;
    }

    public String getDTACCOR_I12() {
        return DTACCOR_I12;
    }

    public String getDTFECH() {
        return DTFECH;
    }

    public String getIBAN_09() {
        return IBAN_09;
    }

    public String getNOMTIR_21IT() {
        return NOMTIR_21IT;
    }

    public String getRIBTIR_21IT() {
        return RIBTIR_21IT;
    }

    public String getNUMREM_21CE() {
        return NUMREM_21CE;
    }

    public String getREFIRIS_21CE() {
        return REFIRIS_21CE;
    }

    public void setNODOSS(String NODOSS) {
        this.NODOSS = NODOSS;
    }

    public void setRFPRET_11(String RFPRET_11) {
        this.RFPRET_11 = RFPRET_11;
    }

    public void setRFGRP_11(String RFGRP_11) {
        this.RFGRP_11 = RFGRP_11;
    }

    public void setNOMINAL_12(String NOMINAL_12) {
        this.NOMINAL_12 = NOMINAL_12;
    }

    public void setCDPDT_12(String CDPDT_12) {
        this.CDPDT_12 = CDPDT_12;
    }

    public void setVLDECADA4_11(String VLDECADA4_11) {
        this.VLDECADA4_11 = VLDECADA4_11;
    }

    public void setRFTIERS_I09(String RFTIERS_I09) {
        this.RFTIERS_I09 = RFTIERS_I09;
    }

    public void setDTACCOR_I12(String DTACCOR_I12) {
        this.DTACCOR_I12 = DTACCOR_I12;
    }

    public void setDTFECH(String DTFECH) {
        this.DTFECH = DTFECH;
    }

    public void setIBAN_09(String IBAN_09) {
        this.IBAN_09 = IBAN_09;
    }

    public void setNOMTIR_21IT(String NOMTIR_21IT) {
        this.NOMTIR_21IT = NOMTIR_21IT;
    }

    public void setRIBTIR_21IT(String RIBTIR_21IT) {
        this.RIBTIR_21IT = RIBTIR_21IT;
    }

    public void setNUMREM_21CE(String NUMREM_21CE) {
        this.NUMREM_21CE = NUMREM_21CE;
    }

    public void setREFIRIS_21CE(String REFIRIS_21CE) {
        this.REFIRIS_21CE = REFIRIS_21CE;
    }

    @Override
    public String toString() {
        return "Pam{" +
                "NODOSS='" + NODOSS + '\'' +
                ", RFPRET_11='" + RFPRET_11 + '\'' +
                ", RFGRP_11='" + RFGRP_11 + '\'' +
                ", NOMINAL_12='" + NOMINAL_12 + '\'' +
                ", CDPDT_12='" + CDPDT_12 + '\'' +
                ", VLDECADA4_11='" + VLDECADA4_11 + '\'' +
                ", RFTIERS_I09='" + RFTIERS_I09 + '\'' +
                ", DTACCOR_I12='" + DTACCOR_I12 + '\'' +
                ", DTFECH='" + DTFECH + '\'' +
                ", IBAN_09='" + IBAN_09 + '\'' +
                ", NOMTIR_21IT='" + NOMTIR_21IT + '\'' +
                ", RIBTIR_21IT='" + RIBTIR_21IT + '\'' +
                ", NUMREM_21CE='" + NUMREM_21CE + '\'' +
                ", REFIRIS_21CE='" + REFIRIS_21CE + '\'' +
                '}';
    }
}
