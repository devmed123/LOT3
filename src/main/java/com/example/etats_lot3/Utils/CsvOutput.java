package com.example.etats_lot3.Utils;

import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.lang.reflect.Field;
import java.util.Map;

public class CsvOutput {
    Map<String, Ligne> list_lignes;
    Map<String, Ligne> list_lignes_nv;
    Map<String, Pam> list_pams;
    Map<String, Pam> list_pams_nv;

    public CsvOutput(Map<String, Ligne> list_lignes, Map<String, Ligne> list_lignes_nv, Map<String, Pam> list_pams, Map<String, Pam> list_pams_nv) {
        this.list_lignes = list_lignes;
        this.list_lignes_nv = list_lignes_nv;
        this.list_pams = list_pams;
        this.list_pams_nv = list_pams_nv;
    }

    public Workbook exportAsCsv() throws IllegalAccessException {
        Workbook workbook=new XSSFWorkbook();
        CellStyle yellow_style = workbook.createCellStyle();
        yellow_style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        yellow_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);


        CellStyle red_style = workbook.createCellStyle();
        red_style.setFillForegroundColor(IndexedColors.RED.getIndex());
        red_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        Sheet ligne_sheet = workbook.createSheet("lignes certifié");
        Class ligne_class= Ligne.class;
        Row headerRow = ligne_sheet.createRow(0);
        int j=0;
        for (Field field : ligne_class.getFields()) {
            headerRow.createCell(j).setCellValue(field.getName());
            headerRow.getCell(j).setCellStyle(yellow_style);
            j++;
        }
        j=1;
        for(Map.Entry<String ,Ligne> entry : list_lignes.entrySet()){
            Row row = ligne_sheet.createRow(j);

            int t=0;
            for (Field field : ligne_class.getFields()) {
                ligne_sheet.autoSizeColumn(t);
                row.createCell(t).setCellValue((String)field.get(entry.getValue()));
                t++;
            }
            j++;
        }
        Sheet pam_valid_sheet = workbook.createSheet("pam cértifié");
        Row pamheaderRow = pam_valid_sheet.createRow(0);
        Class pam_class= Pam.class;
        int a=0;
        for (Field field : pam_class.getFields()) {
            pamheaderRow.createCell(a).setCellValue(field.getName());
            pamheaderRow.getCell(a).setCellStyle(yellow_style);

            a++;
        }
        a=1;
        for(Map.Entry<String, Pam> entry : list_pams.entrySet()){
            Row row = pam_valid_sheet.createRow(a);
            int b=0;
            for (Field field : pam_class.getFields()) {
                pam_valid_sheet.autoSizeColumn(b);
                row.createCell(b).setCellValue((String)field.get(entry.getValue()));
                b++;
            }
            a++;
        }



        Sheet ligne_sheet_non = workbook.createSheet("lignes non certifié");
        Row lnheaderRow = ligne_sheet_non.createRow(0);
        j=0;
        for (Field field : ligne_class.getFields()) {
            lnheaderRow.createCell(j).setCellValue(field.getName());
            lnheaderRow.getCell(j).setCellStyle(yellow_style);
            j++;
        }
        j=1;
        for(Map.Entry<String ,Ligne> entry : list_lignes_nv.entrySet()){
            Row row = ligne_sheet_non.createRow(j);
            int t=0;
            for (Field field : ligne_class.getFields()) {
                ligne_sheet_non.autoSizeColumn(t);
                row.createCell(t).setCellValue((String)field.get(entry.getValue()));
                if(((String) field.get(entry.getValue())).contains("||")){
                    row.getCell(t).setCellStyle(red_style);
                }
                t++;
            }
            j++;
        }



        Sheet pam_valid_sheet_nv = workbook.createSheet("pam non cértifié");
        Row pamheaderRow_nv = pam_valid_sheet_nv.createRow(0);
        a=0;
        for (Field field : pam_class.getFields()) {
            pamheaderRow_nv.createCell(a).setCellValue(field.getName());
            pamheaderRow_nv.getCell(a).setCellStyle(yellow_style);

            a++;
        }
        a=1;
        for(Map.Entry<String, Pam> entry : list_pams_nv.entrySet()){
            Row row = pam_valid_sheet_nv.createRow(a);
            int b=0;
            for (Field field : pam_class.getFields()) {
                pam_valid_sheet_nv.autoSizeColumn(b);
                row.createCell(b).setCellValue((String)field.get(entry.getValue()));
                if(((String) field.get(entry.getValue())).contains("||")){
                    row.getCell(b).setCellStyle(red_style);
                }
                b++;
            }
            a++;
        }


        return workbook ;
    }
}
