package com.example.etats_lot3.Utils;

import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PddExtract {
    Map<String, String> data_3 = new HashMap();
    Map<String, String> data_4 = new HashMap();
    Map<String, String> data_5ED = new HashMap();

    Map<String, String> data_30 = new HashMap();
    Map<String, String> data_28 = new HashMap();
    Map<String, String> data_31 = new HashMap();
    Map<String, String> data_1 = new HashMap();
    Map<String, String> data_5IT = new HashMap();
    Map<String, String> data_5CE = new HashMap();

    public PddExtract(InputStream pdd_file) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(pdd_file));

        String line;
        while((line = bufferReader.readLine()) != null) {
            String NODOSS = line.substring(26, 60).trim();
            String code_enregistrement = line.substring(134, 136);
            byte var7 = -1;
            if(code_enregistrement.equals("28")){
                this.data_28.put(NODOSS, line);
            }
            switch(code_enregistrement.hashCode()) {
                case 1537:
                    if (code_enregistrement.equals("01")) {
                        var7 = 0;
                    }
                    break;
                case 1539:
                    if (code_enregistrement.equals("03")) {
                        var7 = 1;
                    }
                    break;
                case 1540:
                    if (code_enregistrement.equals("04")) {
                        var7 = 2;
                    }
                    break;
                case 1541:
                    if (code_enregistrement.equals("05")) {
                        var7 = 5;
                    }
                    break;
                case 1629:
                    if (code_enregistrement.equals("30")) {
                        var7 = 3;
                    }
                    break;
                case 1630:
                    if (code_enregistrement.equals("31")) {
                        var7 = 4;
                    }
            }

            switch(var7) {
                case 0:
                    this.data_1.put(NODOSS, line);
                    break;
                case 1:
                    this.data_3.put(NODOSS, line);
                    break;
                case 2:
                    if (line.substring(136, 138).startsWith("01")) {
                        this.data_4.put(NODOSS, line);
                    }
                    break;
                case 3:
                    this.data_30.put(NODOSS, line);
                    break;
                case 4:
                    this.data_31.put(NODOSS, line);
                    break;
                case 5:
                    String type_block = line.substring(223, 225).trim();
                    byte var10 = -1;
                    switch(type_block.hashCode()) {
                        case 2146:
                            if (type_block.equals("CE")) {
                                var10 = 2;
                            }
                            break;
                        case 2207:
                            if (type_block.equals("ED")) {
                                var10 = 0;
                            }
                            break;
                        case 2347:
                            if (type_block.equals("IT")) {
                                var10 = 1;
                            }
                    }

                    switch(var10) {
                        case 0:
                            this.data_5ED.put(NODOSS, line);
                            break;
                        case 1:
                            this.data_5IT.put(NODOSS, line);
                            break;
                        case 2:
                            this.data_5CE.put(NODOSS, line);
                    }
            }
        }

        bufferReader.close();
        pdd_file.close();
    }

    public Map<String, Ligne> extract_ligne() {
        Map<String, Ligne> result = new HashMap();
        Iterator var2 = this.data_30.entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, String> entry = (Entry)var2.next();
            if (entry.getValue().startsWith("12", 131)) {
                result.put(entry.getKey(), new Ligne(entry.getKey(), this.data_3.get(entry.getKey()) != null ? this.data_3.get(entry.getKey()).substring(277, 308) : "", this.data_30.get(entry.getKey()) != null ? this.data_30.get(entry.getKey()).substring(406, 424) : "", this.data_30.get(entry.getKey()) != null ? this.data_30.get(entry.getKey()).substring(301, 306) : "", this.data_3.get(entry.getKey()) != null ? this.data_3.get(entry.getKey()).substring(267, 275) : "", this.data_3.get(entry.getKey()) != null ? this.data_3.get(entry.getKey()).substring(223, 243) : "", this.data_4.get(entry.getKey()) != null ? this.data_4.get(entry.getKey()).substring(244, 259) : "", this.data_30.get(entry.getKey()) != null ? this.data_30.get(entry.getKey()).substring(372, 382) : "", this.data_30.get(entry.getKey()) != null ? this.data_30.get(entry.getKey()).substring(372, 382) : "", this.data_31.get(entry.getKey()) != null ? this.data_31.get(entry.getKey()).substring(263, 273) : "", this.data_5ED.get(entry.getKey()) != null ? this.data_5ED.get(entry.getKey()).substring(272, 280) : "", this.data_5ED.get(entry.getKey()) != null ? this.data_5ED.get(entry.getKey()).substring(251, 258) : ""));
            }
        }

        return result;
    }

    public Map<String, Pam> extract_pam() {
        Map<String, Pam> result = new HashMap();
        Iterator var2 = this.data_3.entrySet().iterator();
        while(var2.hasNext()) {
            Entry<String, String> entry = (Entry)var2.next();
            if (entry.getValue().startsWith("07", 131)) {
                result.put(entry.getKey(), new Pam(entry.getKey(), this.data_3.get(entry.getKey()) != null ? this.data_3.get(entry.getKey()).substring(276, 308) : "", this.data_3.get(entry.getKey()) != null ? this.data_3.get(entry.getKey()).substring(326, 346) : "", this.data_1.get(entry.getKey()) != null ? this.data_1.get(entry.getKey()).substring(244, 262) : "", this.data_1.get(entry.getKey()) != null ? this.data_1.get(entry.getKey()).substring(223, 228) : "", this.data_3.get(entry.getKey()) != null ? this.data_3.get(entry.getKey()).substring(267, 275) : "", this.data_3.get(entry.getKey()) != null ? this.data_3.get(entry.getKey()).substring(223, 243) : "", this.data_1.get(entry.getKey()) != null ? this.data_1.get(entry.getKey()).substring(297, 307) : "", this.data_1.get(entry.getKey()) != null ? this.data_1.get(entry.getKey()).substring(275, 285) : "", this.data_4.get(entry.getKey()) != null ? this.data_4.get(entry.getKey()).substring(244, 277) : "", this.data_5IT.get(entry.getKey()) != null ? this.data_5IT.get(entry.getKey()).substring(249, 271) : "", this.data_5IT.get(entry.getKey()) != null ? this.data_5IT.get(entry.getKey()).substring(225, 245) : "", this.data_5CE.get(entry.getKey()) != null ? this.data_5CE.get(entry.getKey()).substring(328, 336) : "", this.data_5CE.get(entry.getKey()) != null ? this.data_5CE.get(entry.getKey()).substring(316, 326) : "", this.data_1.get(entry.getKey()) != null ? this.data_1.get(entry.getKey()).substring(297, 307) : "", "", this.data_28.get(entry.getKey()) != null ? this.data_28.get(entry.getKey()).substring(247, 256) : ""));
            }
        }

        return result;
    }
}