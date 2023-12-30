package com.example.etats_lot3.Utils;

import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class CsvExtractor {
    InputStream inputStreamligne;
    InputStream inputStreampam;

    public CsvExtractor(InputStream inputStreamligne, InputStream inputStreampam) {
        this.inputStreamligne = inputStreamligne;
        this.inputStreampam = inputStreampam;
    }

    public Map<String, Ligne> ReadLignes() throws IOException {
        Map<String,Ligne> ligneMap = new HashMap<>();
        Reader reader = new InputStreamReader(inputStreamligne);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        for (CSVRecord row : csvParser) {
            ligneMap.put(row.get(0).trim(),new Ligne(row.get(0).trim() ,row.get(1).trim(),row.get(2).trim(),row.get(3).trim(),row.get(4).trim(),row.get(5).trim(),row.get(6).trim(),row.get(7).trim(),row.get(8).trim(),row.get(9).trim(),row.get(10).trim(),row.get(11).trim()));
        }
        reader.close();
        inputStreamligne.close();
        return ligneMap;
    }


    public Map<String, Pam> ReadPams() throws IOException {
        Map<String, Pam> pamMap = new HashMap<>();
        Reader reader = new InputStreamReader(inputStreampam);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        for (CSVRecord row : csvParser) {
            pamMap.put(row.get(0).trim(),new Pam(row.get(0).trim() ,row.get(1).trim(),row.get(2).trim(),row.get(3).trim(),row.get(4).trim(),row.get(5).trim(),row.get(6).trim(),row.get(7).trim(),row.get(8).trim(),row.get(9).trim(),row.get(10).trim(),row.get(11).trim(),row.get(12).trim(),row.get(13).trim(),row.get(14).trim(),row.get(15).trim()));
        }
        inputStreampam.close();

        return pamMap;
    }



}
