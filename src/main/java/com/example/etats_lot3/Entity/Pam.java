package com.example.etats_lot3.Entity;

import java.util.Objects;

public class Pam {
    public String NODOSS;
    public String RFPRET_11;
    public String RFGRP_11;
    public String NOMINAL_12;
    public String CDPDT_12;
    public String VLDECADA4_11;
    public String RFTIERS_I09;
    public String DTACCOR_I12;
    public String DTFECH;
    public String IBAN_09;
    public String NOMTIR_21IT;
    public String RIBTIR_21IT;
    public String NUMREM_21CE;
    public String REFIRIS_21CE;
    public String DATE_REMISE;
    public String Compte_CNT;
    public String TAUX;

    public Pam(String NODOSS, String RFPRET_11, String RFGRP_11, String NOMINAL_12, String CDPDT_12, String VLDECADA4_11, String RFTIERS_I09, String DTACCOR_I12, String DTFECH, String IBAN_09, String NOMTIR_21IT, String RIBTIR_21IT, String NUMREM_21CE, String REFIRIS_21CE, String DATE_REMISE, String compte_CNT , String Taux) {
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
        this.NOMTIR_21IT = NOMTIR_21IT.trim().replaceAll("\"", "").replaceAll(",", "").trim();
        this.RIBTIR_21IT = RIBTIR_21IT.trim();
        this.NUMREM_21CE = NUMREM_21CE.trim();
        this.REFIRIS_21CE = REFIRIS_21CE.trim();
        this.DATE_REMISE = DATE_REMISE.trim();
        this.Compte_CNT = compte_CNT.trim();
        this.TAUX = Taux.trim();
    }

    public String toString() {
        return this.NODOSS + ";" + this.RFPRET_11 + ";" + this.RFGRP_11 + ";" + this.NOMINAL_12 + ";" + this.CDPDT_12 + ";" + this.VLDECADA4_11 + ";" + this.RFTIERS_I09 + ";" + this.DTACCOR_I12 + ";" + this.DTFECH + ";" + this.IBAN_09 + ";" + this.NOMTIR_21IT + ";" + this.RIBTIR_21IT + ";" + this.REFIRIS_21CE + ";" + this.DATE_REMISE + ";" + this.Compte_CNT+";"+ this.TAUX;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Pam pam = (Pam)o;
            if (!Objects.equals(this.NODOSS, pam.NODOSS)) {
                return false;
            } else if (!Objects.equals(this.RFPRET_11, pam.RFPRET_11)) {
                return false;
            } else if (!Objects.equals(this.RFGRP_11, pam.RFGRP_11)) {
                return false;
            } else if (!Objects.equals(this.NOMINAL_12, pam.NOMINAL_12)) {
                return false;
            } else if (!Objects.equals(this.CDPDT_12, pam.CDPDT_12)) {
                return false;
            } else if (!Objects.equals(this.VLDECADA4_11, pam.VLDECADA4_11)) {
                return false;
            } else if (!Objects.equals(this.RFTIERS_I09, pam.RFTIERS_I09)) {
                return false;
            } else if (!Objects.equals(this.DTACCOR_I12, pam.DTACCOR_I12)) {
                return false;
            } else if (!Objects.equals(this.DTFECH, pam.DTFECH)) {
                return false;
            } else if (!Objects.equals(this.IBAN_09, pam.IBAN_09)) {
                return false;
            }
            else if (!Objects.equals(this.TAUX, pam.TAUX)) {
                return false;
            }
            else if (!Objects.equals(this.NOMTIR_21IT, pam.NOMTIR_21IT)) {
                return false;
            } else if (!Objects.equals(this.RIBTIR_21IT, pam.RIBTIR_21IT)) {
                return false;
            } else if (!Objects.equals(this.REFIRIS_21CE, pam.REFIRIS_21CE)) {
                return false;
            } else {
                return Objects.equals(this.DATE_REMISE, pam.DATE_REMISE) && Objects.equals(this.Compte_CNT, pam.Compte_CNT);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.NODOSS != null ? this.NODOSS.hashCode() : 0;
        result = 31 * result + (this.RFPRET_11 != null ? this.RFPRET_11.hashCode() : 0);
        result = 31 * result + (this.RFGRP_11 != null ? this.RFGRP_11.hashCode() : 0);
        result = 31 * result + (this.NOMINAL_12 != null ? this.NOMINAL_12.hashCode() : 0);
        result = 31 * result + (this.CDPDT_12 != null ? this.CDPDT_12.hashCode() : 0);
        result = 31 * result + (this.VLDECADA4_11 != null ? this.VLDECADA4_11.hashCode() : 0);
        result = 31 * result + (this.RFTIERS_I09 != null ? this.RFTIERS_I09.hashCode() : 0);
        result = 31 * result + (this.DTACCOR_I12 != null ? this.DTACCOR_I12.hashCode() : 0);
        result = 31 * result + (this.DTFECH != null ? this.DTFECH.hashCode() : 0);
        result = 31 * result + (this.IBAN_09 != null ? this.IBAN_09.hashCode() : 0);
        result = 31 * result + (this.NOMTIR_21IT != null ? this.NOMTIR_21IT.hashCode() : 0);
        result = 31 * result + (this.RIBTIR_21IT != null ? this.RIBTIR_21IT.hashCode() : 0);
        result = 31 * result + (this.NUMREM_21CE != null ? this.NUMREM_21CE.hashCode() : 0);
        result = 31 * result + (this.REFIRIS_21CE != null ? this.REFIRIS_21CE.hashCode() : 0);
        result = 31 * result + (this.DATE_REMISE != null ? this.DATE_REMISE.hashCode() : 0);
        result = 31 * result + (this.Compte_CNT != null ? this.Compte_CNT.hashCode() : 0);
        return result;
    }

    public Pam generateDiff(Pam l) {
        return new Pam(this.NODOSS.equals(l.NODOSS) ? this.NODOSS : "awb " + this.NODOSS + "|| LS " + l.NODOSS, this.RFPRET_11.equals(l.RFPRET_11) ? this.RFPRET_11 : "awb " + this.RFPRET_11 + " || LS " + l.RFPRET_11, this.RFGRP_11.equals(l.RFGRP_11) ? this.RFGRP_11 : "awb " + this.RFGRP_11 + "|| LS " + l.RFGRP_11, this.NOMINAL_12.equals(l.NOMINAL_12) ? this.NOMINAL_12 : "awb " + this.NOMINAL_12 + "|| LS " + l.NOMINAL_12, this.CDPDT_12.equals(l.CDPDT_12) ? this.CDPDT_12 : "awb " + this.CDPDT_12 + " || LS " + l.CDPDT_12, this.VLDECADA4_11.equals(l.VLDECADA4_11) ? this.VLDECADA4_11 : "awb " + this.VLDECADA4_11 + " || LS " + l.RFTIERS_I09, this.RFTIERS_I09.equals(l.RFTIERS_I09) ? this.RFTIERS_I09 : "awb " + this.RFTIERS_I09 + " || LS " + l.RFTIERS_I09, this.DTACCOR_I12.equals(l.DTACCOR_I12) ? this.DTACCOR_I12 : "awb " + this.DTACCOR_I12 + " || LS " + l.DTACCOR_I12, this.DTFECH.equals(l.DTFECH) ? this.DTFECH : "awb " + this.DTFECH + " || LS " + l.DTFECH, this.IBAN_09.equals(l.IBAN_09) ? this.IBAN_09 : "awb " + this.IBAN_09 + " || LS " + l.IBAN_09, this.NOMTIR_21IT.equals(l.NOMTIR_21IT) ? this.NOMTIR_21IT : "awb " + this.NOMTIR_21IT + " || LS " + l.NOMTIR_21IT, this.RIBTIR_21IT.equals(l.RIBTIR_21IT) ? this.RIBTIR_21IT : "awb " + this.RIBTIR_21IT + " || LS " + l.RIBTIR_21IT, this.NUMREM_21CE.equals(l.NUMREM_21CE) ? this.NUMREM_21CE : "awb " + this.NUMREM_21CE + " || LS " + l.NUMREM_21CE, this.REFIRIS_21CE.equals(l.REFIRIS_21CE) ? this.REFIRIS_21CE : "awb " + this.REFIRIS_21CE + " || LS " + l.REFIRIS_21CE, this.DATE_REMISE.equals(l.DATE_REMISE) ? this.DATE_REMISE : "awb " + this.DATE_REMISE + " || LS " + l.DATE_REMISE, this.Compte_CNT.equals(l.Compte_CNT) ? this.Compte_CNT : "awb " + this.Compte_CNT + " || LS " + l.Compte_CNT, this.TAUX.equals(l.TAUX) ? this.TAUX : "awb " + this.TAUX + " || LS " + l.TAUX);
    }
}