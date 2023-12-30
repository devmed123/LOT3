package com.example.etats_lot3.Entity;

import java.util.Objects;

public class Pam {
   public  String NODOSS;
   public  String RFPRET_11;
   public  String RFGRP_11;
   public  String NOMINAL_12;
   public  String CDPDT_12;
   public  String VLDECADA4_11;
   public  String RFTIERS_I09;
   public  String DTACCOR_I12;
   public  String DTFECH;
   public  String IBAN_09;
   public  String NOMTIR_21IT;
   public  String RIBTIR_21IT;
   public  String NUMREM_21CE;
   public  String REFIRIS_21CE;
   public  String DATE_REMISE;
   public  String Compte_CNT;

    public Pam(String NODOSS, String RFPRET_11, String RFGRP_11, String NOMINAL_12, String CDPDT_12, String VLDECADA4_11, String RFTIERS_I09, String DTACCOR_I12, String DTFECH, String IBAN_09, String NOMTIR_21IT, String RIBTIR_21IT, String NUMREM_21CE, String REFIRIS_21CE, String DATE_REMISE, String compte_CNT) {
        this.NODOSS = NODOSS.trim();
        this.RFPRET_11 = RFPRET_11.trim();
        this.RFGRP_11 = RFGRP_11.trim();
        this.NOMINAL_12 = NOMINAL_12.trim();
        this.CDPDT_12 = CDPDT_12.trim();
        this.VLDECADA4_11 = VLDECADA4_11.trim();
        this.RFTIERS_I09 = RFTIERS_I09.trim();
        this.DTACCOR_I12 = DTACCOR_I12.trim();
        this.DTFECH = DTFECH.trim();
        this.IBAN_09 = IBAN_09.trim();
        this.NOMTIR_21IT = NOMTIR_21IT.trim();
        this.RIBTIR_21IT = RIBTIR_21IT.trim();
        this.NUMREM_21CE = NUMREM_21CE.trim();
        this.REFIRIS_21CE = REFIRIS_21CE.trim();
        this.DATE_REMISE = DATE_REMISE.trim();
        this.Compte_CNT = compte_CNT.trim();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pam pam = (Pam) o;

        if (!Objects.equals(NODOSS, pam.NODOSS)) return false;
        if (!Objects.equals(RFPRET_11, pam.RFPRET_11)) return false;
        if (!Objects.equals(RFGRP_11, pam.RFGRP_11)) return false;
        if (!Objects.equals(NOMINAL_12, pam.NOMINAL_12)) return false;
        if (!Objects.equals(CDPDT_12, pam.CDPDT_12)) return false;
        if (!Objects.equals(VLDECADA4_11, pam.VLDECADA4_11)) return false;
        if (!Objects.equals(RFTIERS_I09, pam.RFTIERS_I09)) return false;
        if (!Objects.equals(DTACCOR_I12, pam.DTACCOR_I12)) return false;
        if (!Objects.equals(DTFECH, pam.DTFECH)) return false;
        if (!Objects.equals(IBAN_09, pam.IBAN_09)) return false;
        if (!Objects.equals(NOMTIR_21IT, pam.NOMTIR_21IT)) return false;
        if (!Objects.equals(RIBTIR_21IT, pam.RIBTIR_21IT)) return false;
        if (!Objects.equals(NUMREM_21CE, pam.NUMREM_21CE)) return false;
        if (!Objects.equals(REFIRIS_21CE, pam.REFIRIS_21CE)) return false;
        if (!Objects.equals(DATE_REMISE, pam.DATE_REMISE)) return false;
        return Objects.equals(Compte_CNT, pam.Compte_CNT);
    }

    @Override
    public int hashCode() {
        int result = NODOSS != null ? NODOSS.hashCode() : 0;
        result = 31 * result + (RFPRET_11 != null ? RFPRET_11.hashCode() : 0);
        result = 31 * result + (RFGRP_11 != null ? RFGRP_11.hashCode() : 0);
        result = 31 * result + (NOMINAL_12 != null ? NOMINAL_12.hashCode() : 0);
        result = 31 * result + (CDPDT_12 != null ? CDPDT_12.hashCode() : 0);
        result = 31 * result + (VLDECADA4_11 != null ? VLDECADA4_11.hashCode() : 0);
        result = 31 * result + (RFTIERS_I09 != null ? RFTIERS_I09.hashCode() : 0);
        result = 31 * result + (DTACCOR_I12 != null ? DTACCOR_I12.hashCode() : 0);
        result = 31 * result + (DTFECH != null ? DTFECH.hashCode() : 0);
        result = 31 * result + (IBAN_09 != null ? IBAN_09.hashCode() : 0);
        result = 31 * result + (NOMTIR_21IT != null ? NOMTIR_21IT.hashCode() : 0);
        result = 31 * result + (RIBTIR_21IT != null ? RIBTIR_21IT.hashCode() : 0);
        result = 31 * result + (NUMREM_21CE != null ? NUMREM_21CE.hashCode() : 0);
        result = 31 * result + (REFIRIS_21CE != null ? REFIRIS_21CE.hashCode() : 0);
        result = 31 * result + (DATE_REMISE != null ? DATE_REMISE.hashCode() : 0);
        result = 31 * result + (Compte_CNT != null ? Compte_CNT.hashCode() : 0);
        return result;
    }

    public Pam generateDiff(Pam l){
        return new Pam(
                NODOSS.equals(l.NODOSS) ? NODOSS : "awb "+NODOSS + "|| LS " +l.NODOSS,
                RFPRET_11.equals(l.RFPRET_11) ? RFPRET_11 : "awb "+RFPRET_11 + " || LS " +l.RFPRET_11,
                RFGRP_11.equals(l.RFGRP_11) ? RFGRP_11 : "awb "+RFGRP_11 + "|| LS " +l.RFGRP_11,
                NOMINAL_12.equals(l.NOMINAL_12) ? NOMINAL_12 : "awb "+NOMINAL_12 + "|| LS " +l.NOMINAL_12,
                CDPDT_12.equals(l.CDPDT_12) ? CDPDT_12 : "awb "+CDPDT_12 + " || LS " +l.CDPDT_12,
                VLDECADA4_11.equals(l.VLDECADA4_11) ? VLDECADA4_11 : "awb "+VLDECADA4_11 + " || LS " +l.RFTIERS_I09,
                RFTIERS_I09.equals(l.RFTIERS_I09) ? RFTIERS_I09 : "awb "+RFTIERS_I09 + " || LS " +l.RFTIERS_I09,
                DTACCOR_I12.equals(l.DTACCOR_I12) ? DTACCOR_I12 : "awb "+DTACCOR_I12 + " || LS " +l.DTACCOR_I12,
                DTFECH.equals(l.DTFECH) ? DTFECH : "awb "+DTFECH + " || LS " +l.DTFECH,
                IBAN_09.equals(l.IBAN_09) ? IBAN_09 : "awb "+IBAN_09 + " || LS " +l.IBAN_09,
                NOMTIR_21IT.equals(l.NOMTIR_21IT) ? NOMTIR_21IT : "awb "+NOMTIR_21IT + " || LS " +l.NOMTIR_21IT,
                RIBTIR_21IT.equals(l.RIBTIR_21IT) ? RIBTIR_21IT : "awb "+RIBTIR_21IT + " || LS " +l.RIBTIR_21IT,
                NUMREM_21CE.equals(l.NUMREM_21CE) ? NUMREM_21CE : "awb "+NUMREM_21CE + " || LS " +l.NUMREM_21CE,
                REFIRIS_21CE.equals(l.REFIRIS_21CE) ? REFIRIS_21CE : "awb "+REFIRIS_21CE + " || LS " +l.REFIRIS_21CE,
                DATE_REMISE.equals(l.DATE_REMISE) ? DATE_REMISE : "awb "+DATE_REMISE + " || LS " +l.DATE_REMISE,
                Compte_CNT.equals(l.Compte_CNT) ? Compte_CNT : "awb "+Compte_CNT + " || LS " +l.Compte_CNT
        );
    }
}
