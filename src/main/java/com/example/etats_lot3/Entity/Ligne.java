package com.example.etats_lot3.Entity;

import java.util.Objects;

public class Ligne {
    public String NODOSS;
    public String RFPRET_11;
    public String MTAUTO_I80;
    public String CDPDT_80;
    public String VLDECADA4_11;
    public String RFTIERS_I09;
    public String IBAN_09;
    public String DTPEF_I80;
    public String DTPEF_I81;
    public String DTFUTIL_I81;
    public String TXOUTRV;
    public String DECEDEN_21ED;

    public Ligne(String NODOSS, String RFPRET_11, String MTAUTO_I80, String CDPDT_80, String VLDECADA4_11, String RFTIERS_I09, String IBAN_09, String DTPEF_I80, String DTPEF_I81, String DTFUTIL_I81, String TXOUTRV, String DECEDEN_21ED) {
        this.NODOSS = NODOSS.trim();
        this.RFPRET_11 = RFPRET_11.trim();
        this.MTAUTO_I80 = MTAUTO_I80.trim();
        this.CDPDT_80 = CDPDT_80.trim();
        this.VLDECADA4_11 = VLDECADA4_11.trim();
        this.RFTIERS_I09 = RFTIERS_I09.trim();
        this.IBAN_09 = IBAN_09.trim();
        this.DTPEF_I80 = DTPEF_I80.trim();
        this.DTPEF_I81 = DTPEF_I81.trim();
        this.DTFUTIL_I81 = DTFUTIL_I81.trim();
        this.TXOUTRV = TXOUTRV.trim();
        this.DECEDEN_21ED = DECEDEN_21ED.trim();
    }

    public String toString() {
        return this.NODOSS + ";" + this.RFPRET_11 + ";" + this.MTAUTO_I80 + ";" + this.CDPDT_80 + ";" + this.VLDECADA4_11 + ";" + this.RFTIERS_I09 + ";" + this.IBAN_09 + ";" + this.DTPEF_I80 + ";" + this.DTPEF_I81 + ";" + this.DTFUTIL_I81 + ";" + this.TXOUTRV + ";" + this.DECEDEN_21ED;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Ligne ligne = (Ligne)o;
            if (!Objects.equals(this.NODOSS, ligne.NODOSS)) {
                return false;
            } else if (!Objects.equals(this.RFPRET_11, ligne.RFPRET_11)) {
                return false;
            } else if (!Objects.equals(this.MTAUTO_I80, ligne.MTAUTO_I80)) {
                return false;
            } else if (!Objects.equals(this.CDPDT_80, ligne.CDPDT_80)) {
                return false;
            } else if (!Objects.equals(this.VLDECADA4_11, ligne.VLDECADA4_11)) {
                return false;
            } else if (!Objects.equals(this.RFTIERS_I09, ligne.RFTIERS_I09)) {
                return false;
            } else if (!Objects.equals(this.IBAN_09, ligne.IBAN_09)) {
                return false;
            } else if (!Objects.equals(this.DTPEF_I80, ligne.DTPEF_I80)) {
                return false;
            } else if (!Objects.equals(this.DTPEF_I81, ligne.DTPEF_I81)) {
                return false;
            } else if (!Objects.equals(this.DTFUTIL_I81, ligne.DTFUTIL_I81)) {
                return false;
            } else {
                return Objects.equals(this.TXOUTRV, ligne.TXOUTRV) && Objects.equals(this.DECEDEN_21ED, ligne.DECEDEN_21ED);
            }
        } else {
            return false;
        }
    }

    public Ligne generateDiff(Ligne l) {
        return new Ligne(this.NODOSS.equals(l.NODOSS) ? this.NODOSS : "awb " + this.NODOSS + " || LS " + l.NODOSS, this.RFPRET_11.equals(l.RFPRET_11) ? this.RFPRET_11 : "awb " + this.RFPRET_11 + " || LS " + l.RFPRET_11, this.MTAUTO_I80.equals(l.MTAUTO_I80) ? this.MTAUTO_I80 : "awb " + this.MTAUTO_I80 + " || LS " + l.MTAUTO_I80, this.CDPDT_80.equals(l.CDPDT_80) ? this.CDPDT_80 : "awb " + this.CDPDT_80 + " || LS " + l.CDPDT_80, this.VLDECADA4_11.equals(l.VLDECADA4_11) ? this.VLDECADA4_11 : "awb " + this.VLDECADA4_11 + " || LS " + l.VLDECADA4_11, this.RFTIERS_I09.equals(l.RFTIERS_I09) ? this.RFTIERS_I09 : "awb " + this.RFTIERS_I09 + " || LS " + l.RFTIERS_I09, this.IBAN_09.equals(l.IBAN_09) ? this.IBAN_09 : "awb " + this.IBAN_09 + " || LS " + l.IBAN_09, this.DTPEF_I80.equals(l.DTPEF_I80) ? this.DTPEF_I80 : "awb " + this.DTPEF_I80 + " || LS " + l.DTPEF_I80, this.DTPEF_I81.equals(l.DTPEF_I81) ? this.DTPEF_I81 : "awb " + this.DTPEF_I81 + " || LS " + l.DTPEF_I81, this.DTFUTIL_I81.equals(l.DTFUTIL_I81) ? this.DTFUTIL_I81 : "awb " + this.DTFUTIL_I81 + " || LS " + l.DTFUTIL_I81, this.TXOUTRV.equals(l.TXOUTRV) ? this.TXOUTRV : "awb " + this.TXOUTRV + " || LS " + l.TXOUTRV, this.DECEDEN_21ED.equals(l.DECEDEN_21ED) ? this.DECEDEN_21ED : "awb " + this.DECEDEN_21ED + " || LS " + l.DECEDEN_21ED);
    }
}