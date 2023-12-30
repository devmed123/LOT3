package com.example.etats_lot3.Utils;

import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class PddExtract {

    Map<String ,String> data_3;
    Map<String ,String> data_4;
    Map<String ,String> data_5ED;
    Map<String ,String> data_11;
    Map<String ,String> data_18;
    Map<String ,String> data_30;
    Map<String ,String> data_31;
    Map<String ,String> data_37;
    Map<String ,String> data_51;
    Map<String ,String> data_1;
    Map<String ,String> data_5IT;
    Map<String ,String> data_5CE;
    public PddExtract(InputStream pdd_file) throws IOException {
       data_3=new HashMap<>();
       data_4=new HashMap<>();
        data_5ED=new HashMap<>();
         data_11=new HashMap<>();
        data_18=new HashMap<>();
            data_30=new HashMap<>();
            data_31=new HashMap<>();
         data_37=new HashMap<>();
         data_51=new HashMap<>();
         data_1=new HashMap<>();
         data_5IT=new HashMap<>();
         data_5CE=new HashMap<>();
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(pdd_file));
        String line;
        while ((line = bufferReader.readLine()) != null) {
                String NODOSS = line.substring(26, 60).trim();
                String code_enregistrement=line.substring(134, 136);
                switch (code_enregistrement){
                    case "01":
                        data_1.put(NODOSS, line);
                        break;
                    case "03":
                        data_3.put(NODOSS, line);
                        break;
                    case "04":
                        data_4.put(NODOSS, line);
                        break;
                    case "30":
                        data_30.put(NODOSS, line);
                        break;
                    case "05":
                        String type_block=line.substring(223, 225).trim();
                        switch (type_block){
                            case "ED":
                                data_5ED.put( NODOSS, line);
                                break;
                            case "IT":
                                data_5IT.put( NODOSS, line);
                                break;
                            case "CE":
                                data_5CE.put( NODOSS, line);
                                break;
                        }
                        break;
                }
        }
        bufferReader.close();
        pdd_file.close();
    }
    public Map<String,Ligne>  extract_ligne() {
        Map<String, Ligne> result=new HashMap<>();
            for (Map.Entry<String, String> entry : data_30.entrySet() ) {
                if(entry.getValue().startsWith("09", 131) ){
                    result.put(entry.getKey(),new Ligne( entry.getKey(),
                            (data_3.get(entry.getKey())!=null)  ?  data_3.get(entry.getKey()).substring(276,308) : "",
                            (data_30.get(entry.getKey())!=null ) ? data_30.get(entry.getKey()).substring(406,424) : "",
                            (data_30.get(entry.getKey())!=null)? data_30.get(entry.getKey()).substring(223,228) : "",
                            (data_3.get(entry.getKey())!=null) ? data_3.get(entry.getKey()).substring(267,275) : "",
                            (data_3.get(entry.getKey())!=null) ?data_3.get(entry.getKey()).substring(223,243) : "",
                            (data_4.get(entry.getKey())!=null)? data_4.get(entry.getKey()).substring(244,277) : "",
                            (data_30.get(entry.getKey())!=null) ? data_30.get(entry.getKey()).substring(256,266) : "",
                            (data_30.get(entry.getKey())!=null) ? data_30.get(entry.getKey()).substring(372,382) : "",
                            (data_30.get(entry.getKey())!=null) ? data_30.get(entry.getKey()).substring(267,277) : "",
                            (data_5ED.get(entry.getKey())!=null) ? data_5ED.get(entry.getKey()).substring(272,280) : "",
                            (data_5ED.get(entry.getKey())!=null) ? data_5ED.get(entry.getKey()).substring(250,258) : ""
                            ));
                }
            }
        return result;
    }

    public Map<String, Pam>  extract_pam()  {
        Map<String, Pam> result=new HashMap<>();

        for (Map.Entry<String, String> entry : data_3.entrySet() ) {
            if(entry.getValue().startsWith("07", 131) ){
                result.put(entry.getKey(),new Pam( entry.getKey(),
                        (data_3.get(entry.getKey())!=null)  ?  data_3.get(entry.getKey()).substring(276,308) : "",
                        (data_3.get(entry.getKey())!=null ) ? data_3.get(entry.getKey()).substring(326,346) : "",
                        (data_1.get(entry.getKey())!=null)? data_1.get(entry.getKey()).substring(244,262) : "",
                        (data_1.get(entry.getKey())!=null) ? data_1.get(entry.getKey()).substring(223,228) : "",
                        (data_3.get(entry.getKey())!=null) ? data_3.get(entry.getKey()).substring(267,275) : "",
                        (data_3.get(entry.getKey())!=null) ?data_3.get(entry.getKey()).substring(223,243) : "",
                        (data_1.get(entry.getKey())!=null) ?data_1.get(entry.getKey()).substring(297,307) : "",
                        (data_1.get(entry.getKey())!=null) ?data_1.get(entry.getKey()).substring(275,285) : "",
                        (data_4.get(entry.getKey())!=null)? data_4.get(entry.getKey()).substring(244,277) : "",
                        (data_5IT.get(entry.getKey())!=null) ? data_5IT.get(entry.getKey()).substring(249,259) : "",
                        (data_5IT.get(entry.getKey())!=null) ? data_5IT.get(entry.getKey()).substring(225,249) : "",
                        (data_5CE.get(entry.getKey())!=null) ? data_5CE.get(entry.getKey()).substring(326,336) : "",
                        (data_5CE.get(entry.getKey())!=null) ? data_5CE.get(entry.getKey()).substring(316,326) : "",
                        (data_5CE.get(entry.getKey())!=null) ? data_5CE.get(entry.getKey()).substring(276,286) : "",
                        (data_5CE.get(entry.getKey())!=null) ? data_5CE.get(entry.getKey()).substring(267,277) : ""
                ));
            }
        }
        return result;
    }
}
