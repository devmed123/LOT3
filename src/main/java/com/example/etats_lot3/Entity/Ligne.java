package com.example.etats_lot3.Entity;

public class Ligne {
  private  String NODOSS;
  private  String RFPRET_11;
  private  String MTAUTO_I80;
  private  String CDPDT_80;
  private  String VLDECADA4_11;
  private  String RFTIERS_I09;
  private  String IBAN_09;
  private  String DTPEF_I80;
  private  String DTPEF_I81;
  private  String DTFUTIL_I81;
  private  String TXOUTRV;

    public Ligne(String NODOSS, String RFPRET_11, String MTAUTO_I80, String CDPDT_80, String VLDECADA4_11, String RFTIERS_I09, String IBAN_09, String DTPEF_I80, String DTPEF_I81, String DTFUTIL_I81, String TXOUTRV) {
        this.NODOSS = NODOSS;
        this.RFPRET_11 = RFPRET_11;
        this.MTAUTO_I80 = MTAUTO_I80;
        this.CDPDT_80 = CDPDT_80;
        this.VLDECADA4_11 = VLDECADA4_11;
        this.RFTIERS_I09 = RFTIERS_I09;
        this.IBAN_09 = IBAN_09;
        this.DTPEF_I80 = DTPEF_I80;
        this.DTPEF_I81 = DTPEF_I81;
        this.DTFUTIL_I81 = DTFUTIL_I81;
        this.TXOUTRV = TXOUTRV;
    }

    public Ligne() {
    }


    public String getNODOSS() {
        return NODOSS;
    }

    public String getRFPRET_11() {
        return RFPRET_11;
    }

    public String getMTAUTO_I80() {
        return MTAUTO_I80;
    }

    public String getCDPDT_80() {
        return CDPDT_80;
    }

    public String getVLDECADA4_11() {
        return VLDECADA4_11;
    }

    public String getRFTIERS_I09() {
        return RFTIERS_I09;
    }

    public String getIBAN_09() {
        return IBAN_09;
    }

    public String getDTPEF_I80() {
        return DTPEF_I80;
    }

    public String getDTPEF_I81() {
        return DTPEF_I81;
    }

    public String getDTFUTIL_I81() {
        return DTFUTIL_I81;
    }

    public String getTXOUTRV() {
        return TXOUTRV;
    }

    public void setNODOSS(String NODOSS) {
        this.NODOSS = NODOSS;
    }

    public void setRFPRET_11(String RFPRET_11) {
        this.RFPRET_11 = RFPRET_11;
    }

    public void setMTAUTO_I80(String MTAUTO_I80) {
        this.MTAUTO_I80 = MTAUTO_I80;
    }

    public void setCDPDT_80(String CDPDT_80) {
        this.CDPDT_80 = CDPDT_80;
    }

    public void setVLDECADA4_11(String VLDECADA4_11) {
        this.VLDECADA4_11 = VLDECADA4_11;
    }

    public void setRFTIERS_I09(String RFTIERS_I09) {
        this.RFTIERS_I09 = RFTIERS_I09;
    }

    public void setIBAN_09(String IBAN_09) {
        this.IBAN_09 = IBAN_09;
    }

    public void setDTPEF_I80(String DTPEF_I80) {
        this.DTPEF_I80 = DTPEF_I80;
    }

    public void setDTPEF_I81(String DTPEF_I81) {
        this.DTPEF_I81 = DTPEF_I81;
    }

    public void setDTFUTIL_I81(String DTFUTIL_I81) {
        this.DTFUTIL_I81 = DTFUTIL_I81;
    }

    public void setTXOUTRV(String TXOUTRV) {
        this.TXOUTRV = TXOUTRV;
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
}
