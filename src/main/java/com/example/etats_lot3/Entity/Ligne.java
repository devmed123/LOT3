package com.example.etats_lot3.Entity;
import java.util.Objects;

public class Ligne {
  public  String NODOSS;
  public  String RFPRET_11;
  public  String MTAUTO_I80;
  public  String CDPDT_80;
    public  String VLDECADA4_11;
    public  String RFTIERS_I09;
    public  String IBAN_09;
    public  String DTPEF_I80;
    public  String DTPEF_I81;
    public  String DTFUTIL_I81;
    public  String TXOUTRV;
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

    @Override
    public String toString() {
        return "Ligne{" +
                "NODOSS='" + NODOSS + '\'' +
                ", RFPRET_11='" + RFPRET_11 + '\'' +
                ", MTAUTO_I80='" + MTAUTO_I80 + '\'' +
                ", CDPDT_80='" + CDPDT_80 + '\'' +
                ", VLDECADA4_11='" + VLDECADA4_11 + '\'' +
                ", RFTIERS_I09='" + RFTIERS_I09 + '\'' +
                ", IBAN_09='" + IBAN_09 + '\'' +
                ", DTPEF_I80='" + DTPEF_I80 + '\'' +
                ", DTPEF_I81='" + DTPEF_I81 + '\'' +
                ", DTFUTIL_I81='" + DTFUTIL_I81 + '\'' +
                ", TXOUTRV='" + TXOUTRV + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ligne ligne = (Ligne) o;

        if (!Objects.equals(NODOSS, ligne.NODOSS)) return false;
        if (!Objects.equals(RFPRET_11, ligne.RFPRET_11)) return false;
        if (!Objects.equals(MTAUTO_I80, ligne.MTAUTO_I80)) return false;
        if (!Objects.equals(CDPDT_80, ligne.CDPDT_80)) return false;
        if (!Objects.equals(VLDECADA4_11, ligne.VLDECADA4_11)) return false;
        if (!Objects.equals(RFTIERS_I09, ligne.RFTIERS_I09)) return false;
        if (!Objects.equals(IBAN_09, ligne.IBAN_09)) return false;
        if (!Objects.equals(DTPEF_I80, ligne.DTPEF_I80)) return false;
        if (!Objects.equals(DTPEF_I81, ligne.DTPEF_I81)) return false;
        if (!Objects.equals(DTFUTIL_I81, ligne.DTFUTIL_I81)) return false;
        if (!Objects.equals(TXOUTRV, ligne.TXOUTRV)) return false;
        return Objects.equals(DECEDEN_21ED, ligne.DECEDEN_21ED);
    }

    public Ligne generateDiff(Ligne l){
        return new Ligne(
                NODOSS.equals(l.NODOSS) ? NODOSS : "awb "+NODOSS + " || LS " +l.NODOSS,
                RFPRET_11.equals(l.RFPRET_11) ? RFPRET_11 : "awb "+RFPRET_11 + " || LS " +l.RFPRET_11,
                MTAUTO_I80.equals(l.MTAUTO_I80) ? MTAUTO_I80 : "awb "+MTAUTO_I80 + " || LS " +l.MTAUTO_I80,
                CDPDT_80.equals(l.CDPDT_80) ? CDPDT_80 : "awb "+CDPDT_80 + " || LS " +l.CDPDT_80,
                VLDECADA4_11.equals(l.VLDECADA4_11) ? VLDECADA4_11 : "awb "+VLDECADA4_11 + " || LS " +l.VLDECADA4_11,
                RFTIERS_I09.equals(l.RFTIERS_I09) ? RFTIERS_I09 : "awb "+RFTIERS_I09 + " || LS " +l.RFTIERS_I09,
                IBAN_09.equals(l.IBAN_09) ? IBAN_09 : "awb "+IBAN_09 + " || LS " +l.IBAN_09,
                DTPEF_I80.equals(l.DTPEF_I80) ? DTPEF_I80 : "awb "+DTPEF_I80 + " || LS " +l.DTPEF_I80,
                DTPEF_I81.equals(l.DTPEF_I81) ? DTPEF_I81 : "awb "+DTPEF_I81 + " || LS " +l.DTPEF_I81,
                DTFUTIL_I81.equals(l.DTFUTIL_I81) ? DTFUTIL_I81 : "awb "+DTFUTIL_I81 + " || LS " +l.DTFUTIL_I81,
                TXOUTRV.equals(l.TXOUTRV) ? TXOUTRV : "awb "+TXOUTRV + " || LS " +l.TXOUTRV,
                DECEDEN_21ED.equals(l.DECEDEN_21ED) ? DECEDEN_21ED : "awb "+DECEDEN_21ED + " || LS " +l.DECEDEN_21ED
        );
    }
}
